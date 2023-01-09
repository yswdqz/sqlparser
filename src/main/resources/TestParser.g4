parser grammar TestParser;

options { tokenVocab= TestLexer; }

@header {
package tools;
import java.util.*;
}

@parser::members {
  public StringBuilder result;
  public List<String> tables = new ArrayList<>();
  public int literalCount = 0;

  private void addLiteralCount() {
    literalCount++;
    if (literalCount > 5) {
      throw new RuntimeException("Too many literals");
    }
  }
}

dmlStatement:
    select { result = $select.v; }
    |
    selectWithUnion {result = $selectWithUnion.v;}
    |
    insert {result = $insert.v;}
    |
    update {result = $update.v;}
    |
    delete {result = $delete.v;}
    ;


// select statement
select returns [StringBuilder v]:
  withClause? (selectWithFrom | selectWithoutFrom)
   {
         if($withClause.ctx != null){
             $v = $withClause.v;
             $v.append(",");
         } else {
             $v = new StringBuilder();
         }
         $v.append($selectWithFrom.v);
   }
  ;
selectWithUnion returns [StringBuilder v]:
    main=select UNION (describe=(ALL|DISTINCT)? right+=select)*
    {
        $v = $main.v;
        $v.append(" UNION ");
        if ($describe != null) {
            $v.append($describe.text);
        }
        for (int i = 0; i < $right.size(); i++) {
            $v.append($right.get(i).v);
            if (i < $right.size() - 1) {
                $v.append(" UNION ");
            }
        }
        $v.append(" ");
    }
;
withClause returns [StringBuilder v]
    : WITH RECURSIVE?
    cteName=uid (LP? uidList RP?)? skip_code
    (COMMA otherCteName += uid  (LP? uidList RP?)? skip_code)*
    {
        $v = new StringBuilder("WITH ");
        $v.append($cteName.text);
        for (UidContext o : $otherCteName){
            $v.append(",");
            $v.append(o.v);
        }
    }
    ;
selectWithoutFrom:
SELECT exprs
{
  throw new RuntimeException("Invalid select statement, maybe without a FROM clause");
};
selectWithFrom returns [StringBuilder v]:
  select_from
  tableSources
  whereClause?
  groupByClause?
  havingClause?
  windowClause?
  orderByClause?
  limitClause?
 // intoClause?
  lockClause?
 // intoClause?
  {
      $v= new StringBuilder("SELECT ");
      $v.append($tableSources.v);
      if($whereClause.ctx != null){
            $v.append(" ");
            $v.append($whereClause.v);
      }
      if($groupByClause.ctx != null){
            $v.append(" ");
            $v.append($groupByClause.v);
      }
      if($havingClause.ctx != null){
            $v.append(" ");
            $v.append($havingClause.v);
      }
      if($orderByClause.ctx != null){
            $v.append(" ");
            $v.append($orderByClause.v);
      }
      if($limitClause.ctx != null){
            $v.append(" ");
            $v.append($limitClause.v);
      }
      $v.append(" ");
  }
  ;

// table sources
tableSources returns [StringBuilder v]
    : first=tableSource (COMMA others+=tableSource)*
    {
        $v = $first.v;
        for (TableSourceContext o : $others){
            $v.append(",");
            $v.append(o.v);
            $v.append(" ");
        }
    }
    ;
tableSource returns [StringBuilder v]
    : tableSourceItem joins+=joinPart*
    {
        $v = $tableSourceItem.v ;
        for (JoinPartContext o : $joins){
             $v.append(" ");
             $v.append(o.v);
        }
    }
    | LP tableSourceItem joins+=joinPart* RP
    {
        $v = $tableSourceItem.v;
        for (JoinPartContext o : $joins){
             $v.append(" ");
             $v.append(o.v);
        }
        $v.append(")");
        $v.insert(0,"(");
    }
    ;

tableSourceItem returns [StringBuilder v]
    : main=ID (AS? ID)?
    {
      $v = new StringBuilder($main.text);
    }
  //  todo:  (PARTITION lr idList (RR | RR_) )? (AS? ID)?
   //  todo: (indexHint (COMMA indexHint)* )?
    |
    subquery AS? ID
    {
         $v = $subquery.v ;
    }
    |
    LP tableSources RP
    {
        $v = $tableSources.v;
        $v.append(")");
        $v.insert(0,"(");
    }
    ;

joinPart returns [StringBuilder v]
    : condition=(INNER | CROSS)? JOIN tableSourceItem ( ON expr | USING LP uidList RP)?
    {
        $v = new StringBuilder();
        $v.append($condition.text);
        $v.append(" JOIN ");
        $v.append($tableSourceItem.v);
        if ($ON != null) {
            $v.append(" ON ");
            $v.append($expr.v);
        } else if ($USING != null) {
            $v.append(" USING (");
            $v.append($uidList.v);
            $v.append(")");
        }
    }
    | STRAIGHT_JOIN tableSourceItem (ON expr)?
    {
        $v.append("STRAIGHT_JOIN ");
        $v.append($tableSourceItem.v);
    }
    | condition=(LEFT | RIGHT) OUTER? JOIN tableSourceItem ( ON expr | USING LP uidList RP)
    {
        $v = new StringBuilder($condition.text);
        if ($OUTER != null) {
            $v.append(" OUTER");
        }
        $v.append(" JOIN ");
        $v.append($tableSourceItem.v);
        if ($ON != null) {
            $v.append(" ON ");
            $v.append($expr.v);
        } else if ($USING != null) {
            $v.append(" USING (");
            $v.append($uidList.v);
            $v.append(")");
        }
    }
    | NATURAL (condition=(LEFT | RIGHT) OUTER?)? JOIN tableSourceItem
    {
        $v = new StringBuilder("NATURAL ");
        if ($condition != null) {
            $v.append($condition.text);
            if ($OUTER != null) {
                $v.append($OUTER.text);
            }
        }
        $v.append(" JOIN ");
        $v.append($tableSourceItem.v);
    }
    ;

// where clause
whereClause returns [StringBuilder v]:
    WHERE expr
    {
        $v = new StringBuilder("WHERE ");
        $v.append($expr.v);
    }
    ;

// group by clause
groupByClause returns [StringBuilder v]:
    GROUP BY g1 =groupByItem (COMMA g2 +=groupByItem)*
    {
        $v = new StringBuilder("GROUP BY ");
        $v.append($g1.c);
        for(GroupByItemContext o : $g2){
            $v.append(",");
            $v.append(o.c);
        }
    }
    ;
groupByItem returns [StringBuilder c]
    : simpleExpr order=(ASC | DESC)?
    {
        $c = $simpleExpr.c;
    }
    ;

// having clause
havingClause returns [StringBuilder v]
    :  HAVING expr
    {
        $v = new StringBuilder("HAVING ");
        if ($expr.c != null){
            $v.append($expr.c);
        }
    }
    ;
// windows clause
windowClause
    :  WINDOW windowName=uid skip_code  (COMMA uid skip_code)*
    ;

// order by clause
orderByClause returns [StringBuilder v]:
    ORDER BY orderByExpression (COMMA orderByExpression)*
    {
        $v= new StringBuilder("ORDER BY");
    }
    ;
orderByExpression
    : expr order=(ASC | DESC)?
    ;

// limit clause
limitClause returns [StringBuilder v]:
    LIMIT ((. COMMA)?. | . OFFSET .)
    {
      $v= new StringBuilder("LIMIT ?");
    }
    ;
subquery returns [StringBuilder v]
: LP select RP
{
    $v = $select.v;
    $v.append(")");
    $v.insert(0,"(");
};
// lock clause
lockClause
    : FOR (UPDATE | SHARE) (OF (uid DOTSTAR?)(COMMA uid DOTSTAR?)* )? (SKIP_ LOCKED | NOWAIT)?
    | LOCK IN SHARE MODE
    ;
//  MySQL expression

expr returns [StringBuilder v,StringBuilder c = new StringBuilder()]
  : left=expr exprOperator right=expr
    {
        $v = $left.v;
        $v.append(" ");
        $v.append($exprOperator.text);
        $v.append(" ");
        $v.append($right.v);
    }
  | NOT expr
    {
        $v = new StringBuilder("NOT ");
        $v.append($expr.v);
    }
  | EXCLAMATION_SYMBOL expr
    {
        $v = new StringBuilder("!");
        $v.append($expr.v);
    }
  | booleanPrimary IS NOT? value=(TRUE | FALSE | UNKNOWN)
    {
        $v = $booleanPrimary.v;
        $v.append(" IS ");
        if ($NOT != null) {
            $v.append("NOT ");
        }
        $v.append($value.text);
    }
  | booleanPrimary
    {
        $v = $booleanPrimary.v;
        $c = $booleanPrimary.c;
    }
  ;

exprs returns [StringBuilder v] :
  first=expr (COMMA others+=expr)*
    {
        $v = $first.v;
        for (ExprContext o : $others){
            $v.append(",");
            $v.append(o.v);
        }
    }
  ;

exprOperator :
  OR | XOR | AND | BIT_OR_OP BIT_OR_OP | BIT_AND_OP BIT_AND_OP
  ;


booleanPrimary returns [StringBuilder v,StringBuilder c]
  : left=booleanPrimary IS NOT? NULL
    {
        $v = $left.v;
        $v.append(" IS ");
        if ($NOT != null) {
            $v.append("NOT ");
        }
        $v.append("NULL");
    }
  | left=booleanPrimary comparisonOperator predicate
    {
        $v = $left.v;
        $v.append(" ");
        $v.append($comparisonOperator.text);
        $v.append(" ");
        $v.append($predicate.v);
    }
  | left=booleanPrimary comparisonOperator describe=(ALL | ANY)? subquery
    {
        $v = $left.v;
        $v.append(" ");
        $v.append($comparisonOperator.text);
        $v.append(" ");
        if($describe != null){
            $v.append($describe.text);
            $v.append(" ");
        }
        $v.append($subquery.v);
    }
  | predicate
    {
        $v = $predicate.v;
        $c = $predicate.c;
    }
  ;

comparisonOperator
  : EQUAL_SYMBOL | GREATER_SYMBOL EQUAL_SYMBOL | GREATER_SYMBOL
  | LESS_SYMBOL EQUAL_SYMBOL | LESS_SYMBOL | LESS_SYMBOL GREATER_SYMBOL | EXCLAMATION_SYMBOL EQUAL_SYMBOL
  | LESS_SYMBOL EQUAL_SYMBOL GREATER_SYMBOL
  ;

predicate returns [StringBuilder v,StringBuilder c]
  : bitExpr NOT? IN subquery
    {
        $v = $bitExpr.v;
        if($NOT != null){
          $v.append(" NOT");
        }
        $v.append(" IN ");
        $v.append($subquery.v);
    }
  | bitExpr NOT? IN LP exprs RP
    {
        $v = $bitExpr.v;
        if($NOT != null){
          $v.append(" NOT");
        }
        $v.append(" IN (");
        $v.append($exprs.v);
        $v.append(")");
    }
  | bitExpr NOT? BETWEEN bitExpr AND predicate
    {
        $v = $bitExpr.v;
        if($NOT != null){
          $v.append(" NOT");
        }
        $v.append(" BETWEEN ");
        $v.append($bitExpr.v);
        $v.append(" AND ");
        $v.append($predicate.v);
    }
  | bitExpr SOUNDS LIKE bitExpr
    {
        $v = $bitExpr.v;
        $v.append(" SOUNDS LIKE ");
        $v.append($bitExpr.v);
    }
  | bitExpr NOT? LIKE simpleExpr (ESCAPE escapeExpr=simpleExpr)?
    {
        $v = $bitExpr.v;
        if($NOT != null) {
          $v.append(" NOT");
        }
        $v.append(" LIKE ");
        $v.append($simpleExpr.v);
        if ($ESCAPE != null) {
          $v.append(" ESCAPE ");
          $v.append($escapeExpr.v);
        }
    }
  | left=bitExpr NOT? REGEXP right=bitExpr
  {
        $v = $left.v;
        if($NOT != null) {
            $v.append(" NOT");
        }
        $v.append(" REGEXP ");
        $v.append($right.v);
  }
  | bitExpr
    {
        $v = $bitExpr.v;
        $c = $bitExpr.c;
    }
  ;
bitExpr returns [StringBuilder v,StringBuilder c]:
    left=bitExpr bitExprOperator right=bitExpr
    {
        $v = $left.v;
        $v.append(" ");
        $v.append($bitExprOperator.text);
        $v.append(" ");
        $v.append($right.v);
    }
  | left=bitExpr PLUS intervalExpression
    {
        $v = $left.v;
        $v.append(" + ");
        $v.append($intervalExpression.v);
    }
  | bitExpr MINUS intervalExpression
    {
        $v = $bitExpr.v;
        $v.append(" - ");
        $v.append($intervalExpression.v);
    }
  | simpleExpr
    {
        $v = $simpleExpr.v;
        $c = $simpleExpr.c;
    }
  ;
bitExprOperator:
  BIT_OR_OP | BIT_AND_OP | LESS_SYMBOL LESS_SYMBOL | GREATER_SYMBOL GREATER_SYMBOL
  PLUS | MINUS | STAR | DIVIDE | DIV | MOD | MODULE  | BIT_XOR_OP
;
simpleExpr returns [StringBuilder v,StringBuilder c = new StringBuilder()]
  : literal
    {
        $v = new StringBuilder($literal.text);
    }
  | fullColumnName
    {
        $v = $fullColumnName.v;
        $c = $fullColumnName.v;
    }
  | functionCall
    {
        $v = $functionCall.v;
    }
  | simpleExpr COLLATE collationName
    {
        $v = $simpleExpr.v;
        $v.append(" COLLATE ");
        $v.append($collationName.text);
    }
  | QUESTION_MARK
    {
        $v = new StringBuilder("?");
    }
  | variable
    {
        $v = new StringBuilder($variable.text);
    }
  | simpleExpr BIT_OR_OP BIT_OR_OP simpleExpr
    {
        $v = $simpleExpr.v;
        $v.append(" || ");
        $v.append($simpleExpr.v);
    }
  | simpleExprOperator simpleExpr
    {
        $v = new StringBuilder($simpleExprOperator.text);
        $v.append(" ");
        $v.append($simpleExpr.v);
    }
  | LP exprs RP
    {
        $v = new StringBuilder("(");
        $v.append($exprs.v);
        $v.append(")");
    }
  | ROW LP expr COMMA exprs RP
    {
        $v = new StringBuilder("ROW(");
        $v.append($expr.v);
        $v.append(",");
        $v.append($exprs.v);
        $v.append(")");
    }
  | subquery
    {
        $v = $subquery.v;
    }
  | EXISTS subquery
    {
        $v = new StringBuilder("EXISTS ");
        $v.append($subquery.v);
    }
  //| uid expr
  | matchExpression
    {
        $v = $matchExpression.v;
    }
  | caseExpression
    {
        $v = new StringBuilder();
    }
  | intervalExpression
    {
        $v = $intervalExpression.v;
    }
  ;

simpleExprOperator
  : PLUS | MINUS | BIT_NOT_OP | BINARY | EXCLAMATION_SYMBOL
  ;
functionCall returns [StringBuilder v]
: ( uid | aggregationFunctionName) LP exprs? RP
  {
      if ($uid.ctx != null) {
          $v = new StringBuilder($uid.text);
      } else {
          $v = new StringBuilder($aggregationFunctionName.text);
      }
      $v.append("(");
        if($exprs.ctx != null){
            $v.append($exprs.v);
        }
      $v.append(")");
  }
;
aggregationFunctionName
    : MAX | MIN | SUM | COUNT | AVG | BIT_XOR
    ;

collationName
: uid UNDERSCORE uid
;

variable
: AT_SIGN uid | AT_SIGN AT_SIGN uid;

matchExpression returns [StringBuilder v]
  : MATCH LP fullColumnNameList RP AGAINST expr searchModifier?
    {
        $v = new StringBuilder("MATCH(");
        $v.append($fullColumnNameList.v);
        $v.append(") AGAINST ");
        $v.append($expr.v);
        if($searchModifier.ctx != null){
            $v.append(" ");
            $v.append($searchModifier.text);
        }
    }
;

searchModifier:
       IN NATURAL LANGUAGE MODE
     | IN NATURAL LANGUAGE MODE WITH QUERY EXPANSION
     | IN BOOLEAN MODE
     | WITH QUERY EXPANSION
;

caseExpression
  : CASE (~(CASE | END))+ END
  ;

intervalExpression returns [StringBuilder v]
  : INTERVAL expr interval=.
  {
        $v = new StringBuilder("INTERVAL ");
        $v.append($expr.v);
        $v.append(" ");
        $v.append($interval.text);
  }
  ;

// insert statement
insert returns [StringBuilder v]
    :
    INSERT
    (LOW_PRIORITY | DELAYED | HIGH_PRIORITY)?
    IGNORE?
    INTO?
    fullId
    partitionClause?
    ( LP columns = uidList RP)?
    insertResultClause
    (AS uidList)?
    onDuplicateKeyUpdateStatement?
    {
        $v = new StringBuilder("INSERT ");
        $v.append($fullId.text);
    }
    ;
onDuplicateKeyUpdateStatement
    :
     ON DUPLICATE KEY UPDATE
             assignmentList
    ;
insertResultClause returns [StringBuilder v]:
    select
    {
        $v = $select.v;
    }
    |
    (TABLE fullId)
    {
      $v = new StringBuilder("TABLE ");
      $v.append($fullId.text) ;
    }
    |
    skip_code
    |
    SET assignmentList
    ;
assignmentList:
    duplicatedFirst=updatedElement
                 (COMMA duplicatedElements+=updatedElement)*;
updatedElement
    : fullColumnName EQUAL_SYMBOL (expr | DEFAULT)
    ;
// partition clause

partitionClause: PARTITION BY exprs;

// update statement

update returns [StringBuilder v]:
    withClause?
    UPDATE LOW_PRIORITY? IGNORE?
    tableSources
    SET assignmentList
    whereClause?
    orderByClause?
    limitClause?
    {
        if($withClause.ctx != null){
           $v = $withClause.v;
           $v.append(",");
        } else {
           $v = new StringBuilder();
        }
        $v.append("UPDATE ") ;
        $v.append($tableSources.v);
        if($whereClause.ctx != null){
           $v.append(" ");
           $v.append($whereClause.v);
        }
        if($orderByClause.ctx != null){
           $v.append(" ");
           $v.append($orderByClause.v);
        }
        if($limitClause.ctx != null){
           $v.append(" ");
           $v.append($limitClause.v);
        }
    }
    ;
// delete statement
delete returns [StringBuilder v]:
    DELETE (~DELETE | ~FROM)* FROM
    ( case1=tableSources | uids+=uid DOTSTAR (COMMA uids+=uid DOTSTAR)* USING tableSources )
    partitionClause?
    whereClause?
    orderByClause?
    limitClause?
    {
        $v = new StringBuilder("DELETE ");
        if ($case1.ctx != null) {
            $v.append($case1.v);
        } else {
            for (UidContext o : $uids) {
                $v.append(o.v);
                $v.append(".*,");
            }
            $v.deleteCharAt($v.length() - 2);
        }

        if($limitClause.ctx != null){
            $v.append(" ");
            $v.append($limitClause.v);
        }
        if($whereClause.ctx != null){
            $v.append(" ");
            $v.append($whereClause.v);
        }
        if($orderByClause.ctx != null){
            $v.append(" ");
            $v.append($orderByClause.v);
        }
    }
    ;
// Base
uid returns [StringBuilder v]:
    simpleId
    {
        $v = new StringBuilder($simpleId.text);
    }
    |
    REVERSE_QUOTE_ID
    {
        $v = new StringBuilder($REVERSE_QUOTE_ID.text);
    };
uidList returns [StringBuilder v]
    : first=uid (COMMA others+=uid)*
    {
        $v = new StringBuilder($first.text);
        for (UidContext o : $others) {
            $v.append(",");
            $v.append(o.v);
        }
    }
    ;
simpleId: ID;
fullId: ID (DOT ID)*;
dottedId: DOT uid;
fullColumnName returns [StringBuilder v]
    : uid ( d1=dottedId d2=dottedId?)?
    {
      $v = new StringBuilder($uid.text);
      if ($d1.ctx != null) {
        $v.append($d1.text);
        if ($d2.ctx != null) {
          $v.append($d2.text);
        }
      }
    }
    ;
fullColumnNameList returns [StringBuilder v]
    : fullColumnName (COMMA fullColumnName)*;
nullNotnull
    : NOT? (NULL)
    ;

stringLiteral
    : (UNDERSCORE charsetName=uid | N_SYMB )? SINGLE_QUOTED_TEXT // todo:add collate clause
    | DOUBLE_QUOTED_TEXT
    ;
literal
  : stringLiteral
  {
     addLiteralCount();
  }
  | NUMBER_LITERAL
  {
     addLiteralCount();
  }
  | DATE_AND_TIME_LITERAL
  {
     addLiteralCount();
  }
  | NULL
  | TRUE
  | FALSE
  ;
skip_code: (AS | VALUE |VALUES) block;

select_from: SELECT (~(SELECT | FROM))* FROM;

block: LP (~(RP | LP) | block)* RP;