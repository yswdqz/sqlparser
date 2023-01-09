// Generated from E:/gitee/SqlParser/src/main/resources\TestParser.g4 by ANTLR 4.10.1

package tools;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, WITH=5, 
		RECURSIVE=6, FROM=7, EXISTS=8, WHERE=9, DOTSTAR=10, BINARY=11, STARTING=12, 
		MODE=13, SKIP_=14, LOCKED=15, NOWAIT=16, SHARE=17, QUESTION_MARK=18, TERMINATED=19, 
		CHARACTER=20, COLUMNS=21, LINES=22, OPTIONALLY=23, ENCLOSED=24, ESCAPED=25, 
		AS=26, USE=27, IGNORE=28, FORCE=29, INDEX=30, KEY=31, JOIN=32, BY=33, 
		WINDOW=34, OFFSET=35, OUTFILE=36, COLLATE=37, MAX=38, MIN=39, SUM=40, 
		COUNT=41, AVG=42, BIT_XOR=43, BIT_AND=44, BIT_OR=45, GROUP_CONCAT=46, 
		JSON_ARRAYAGG=47, JSON_OBJECTAGG=48, STD=49, STDDEV=50, STDDEV_POP=51, 
		STDDEV_SAMP=52, VAR_POP=53, VAR_SAMP=54, VARIANCE=55, OVER=56, ROWS=57, 
		ROW=58, LANGUAGE=59, QUERY=60, EXPANSION=61, MATCH=62, AGAINST=63, BOOLEAN=64, 
		RANGE=65, CURRENT=66, UNBOUNDED=67, PRECEDING=68, FOLLOWING=69, ORDER=70, 
		FOR=71, LOCK=72, GROUP=73, HAVING=74, LIMIT=75, INNER=76, CROSS=77, LEFT=78, 
		RIGHT=79, ON=80, USING=81, STRAIGHT_JOIN=82, OUTER=83, NATURAL=84, DISTINCT=85, 
		DISTINCTROW=86, AND=87, OR=88, XOR=89, NULL=90, NOT=91, IS=92, IN=93, 
		LIKE=94, TRUE=95, FALSE=96, UNKNOWN=97, ALL=98, ANY=99, SOME=100, BETWEEN=101, 
		MEMBER=102, ESCAPE=103, OF=104, UNION=105, INSERT=106, LOW_PRIORITY=107, 
		DELAYED=108, HIGH_PRIORITY=109, INTO=110, SELECT=111, DELETE=112, VALUE=113, 
		VALUES=114, PARTITION=115, TABLE=116, DUPLICATE=117, DEFAULT=118, UPDATE=119, 
		SET=120, REGEXP=121, RLIKE=122, ASC=123, DESC=124, SOUNDS=125, CASE=126, 
		WHEN=127, THEN=128, ELSE=129, END=130, IF=131, LOCALTIME=132, LOCALTIMESTAMP=133, 
		REPLACE=134, INTERVAL=135, DATABASE=136, SCHEMA=137, DATE=138, DAY=139, 
		GEOMETRYCOLLECTION=140, LINESTRING=141, MULTILINESTRING=142, MULTIPOINT=143, 
		MULTIPOLYGON=144, POINT=145, POLYGON=146, TIME=147, TIMESTAMP=148, TIMESTAMP_ADD=149, 
		TIMESTAMP_DIFF=150, CURRENT_TIMESTAMP=151, CURRENT_DATE=152, CURRENT_TIME=153, 
		UTC_TIMESTAMP=154, LAST_DAY=155, MICROSECOND=156, SECOND=157, MINUTE=158, 
		HOUR=159, WEEK=160, MONTH=161, QUARTER=162, YEAR=163, SECOND_MICROSECOND=164, 
		MINUTE_MICROSECOND=165, MINUTE_SECOND=166, HOUR_MICROSECOND=167, HOUR_SECOND=168, 
		HOUR_MINUTE=169, DAY_MICROSECOND=170, DAY_SECOND=171, DAY_MINUTE=172, 
		DAY_HOUR=173, YEAR_MONTH=174, SEPARATOR=175, VAR_ASSIGN=176, PLUS_ASSIGN=177, 
		MINUS_ASSIGN=178, MULT_ASSIGN=179, DIV_ASSIGN=180, MOD_ASSIGN=181, AND_ASSIGN=182, 
		XOR_ASSIGN=183, OR_ASSIGN=184, STAR=185, DIVIDE=186, MODULE=187, PLUS=188, 
		MINUS=189, DIV=190, MOD=191, EQUAL_SYMBOL=192, GREATER_SYMBOL=193, LESS_SYMBOL=194, 
		EXCLAMATION_SYMBOL=195, BIT_NOT_OP=196, BIT_OR_OP=197, BIT_AND_OP=198, 
		BIT_XOR_OP=199, DOT=200, LP=201, RP=202, COMMA=203, SEMI=204, AT_SIGN=205, 
		SINGLE_QUOTE_SYMB=206, DOUBLE_QUOTE_SYMB=207, REVERSE_QUOTE_SYMB=208, 
		COLON_SYMB=209, UNDERSCORE=210, N_SYMB=211, ID=212, REVERSE_QUOTE_ID=213, 
		SINGLE_QUOTED_TEXT=214, DOUBLE_QUOTED_TEXT=215, NUMBER_LITERAL=216, INTEGER_LITERAL=217, 
		FLOAT_LITERAL=218, EXPONENT=219, BINARY_LITERAL=220, OCTAL_LITERAL=221, 
		HEX_LITERAL=222, DATE_AND_TIME_LITERAL=223, DATE_LITERAL=224, DATETIME_LITERAL=225, 
		TIMESTAMP_LITERAL=226, TIME_LITERAL=227, YEAR_LITERAL=228, DIGIT=229;
	public static final int
		RULE_dmlStatement = 0, RULE_select = 1, RULE_selectWithUnion = 2, RULE_withClause = 3, 
		RULE_selectWithoutFrom = 4, RULE_selectWithFrom = 5, RULE_tableSources = 6, 
		RULE_tableSource = 7, RULE_tableSourceItem = 8, RULE_joinPart = 9, RULE_whereClause = 10, 
		RULE_groupByClause = 11, RULE_groupByItem = 12, RULE_havingClause = 13, 
		RULE_windowClause = 14, RULE_orderByClause = 15, RULE_orderByExpression = 16, 
		RULE_limitClause = 17, RULE_subquery = 18, RULE_lockClause = 19, RULE_expr = 20, 
		RULE_exprs = 21, RULE_exprOperator = 22, RULE_booleanPrimary = 23, RULE_comparisonOperator = 24, 
		RULE_predicate = 25, RULE_bitExpr = 26, RULE_bitExprOperator = 27, RULE_simpleExpr = 28, 
		RULE_simpleExprOperator = 29, RULE_functionCall = 30, RULE_aggregationFunctionName = 31, 
		RULE_collationName = 32, RULE_variable = 33, RULE_matchExpression = 34, 
		RULE_searchModifier = 35, RULE_caseExpression = 36, RULE_intervalExpression = 37, 
		RULE_insert = 38, RULE_onDuplicateKeyUpdateStatement = 39, RULE_insertResultClause = 40, 
		RULE_assignmentList = 41, RULE_updatedElement = 42, RULE_partitionClause = 43, 
		RULE_update = 44, RULE_delete = 45, RULE_uid = 46, RULE_uidList = 47, 
		RULE_simpleId = 48, RULE_fullId = 49, RULE_dottedId = 50, RULE_fullColumnName = 51, 
		RULE_fullColumnNameList = 52, RULE_nullNotnull = 53, RULE_stringLiteral = 54, 
		RULE_literal = 55, RULE_skip_code = 56, RULE_select_from = 57, RULE_block = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"dmlStatement", "select", "selectWithUnion", "withClause", "selectWithoutFrom", 
			"selectWithFrom", "tableSources", "tableSource", "tableSourceItem", "joinPart", 
			"whereClause", "groupByClause", "groupByItem", "havingClause", "windowClause", 
			"orderByClause", "orderByExpression", "limitClause", "subquery", "lockClause", 
			"expr", "exprs", "exprOperator", "booleanPrimary", "comparisonOperator", 
			"predicate", "bitExpr", "bitExprOperator", "simpleExpr", "simpleExprOperator", 
			"functionCall", "aggregationFunctionName", "collationName", "variable", 
			"matchExpression", "searchModifier", "caseExpression", "intervalExpression", 
			"insert", "onDuplicateKeyUpdateStatement", "insertResultClause", "assignmentList", 
			"updatedElement", "partitionClause", "update", "delete", "uid", "uidList", 
			"simpleId", "fullId", "dottedId", "fullColumnName", "fullColumnNameList", 
			"nullNotnull", "stringLiteral", "literal", "skip_code", "select_from", 
			"block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'WITH'", "'RECURSIVE'", "'FROM'", "'EXISTS'", 
			"'WHERE'", "'.*'", "'BINARY'", "'STARTING'", "'MODE'", "'SKIP'", "'LOCKED'", 
			"'NOWAIT'", "'SHARE'", "'?'", "'TERMINATED'", "'CHARACTER'", "'COLUMNS'", 
			"'LINES'", "'OPTIONALLY'", "'ENCLOSED'", "'ESCAPED'", "'AS'", "'USE\"'", 
			"'IGNORE'", "'FORCE'", "'INDEX'", "'KEY'", "'JOIN'", "'BY'", "'WINDOW'", 
			"'OFFSET'", "'OUTFILE'", "'COLLATE'", "'MAX'", "'MIN'", "'SUM'", "'COUNT'", 
			"'AVG'", "'BIT_XOR'", "'BIT_AND'", "'BIT_OR'", "'GROUP_CONCAT'", "'JSON_ARRAYAGG'", 
			"'JSON_OBJECTAGG'", "'STD'", "'STDDEV'", "'STDDEV_POP'", "'STDDEV_SAMP'", 
			"'VAR_POP'", "'VAR_SAMP'", "'VARIANCE'", "'OVER'", "'ROWS'", "'ROW'", 
			"'LANGUAGE'", "'QUERY'", "'EXPANSION'", "'MATCH'", "'AGAINST'", "'BOOLEAN'", 
			"'RANGE'", "'CURRENT'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", 
			"'ORDER'", "'FOR'", "'LOCK'", "'GROUP'", "'HAVING'", "'LIMIT'", "'INNER'", 
			"'CROSS'", "'LEFT'", "'RIGHT'", "'ON'", "'USING'", "'STRAIGHT_JOIN'", 
			"'OUTER'", "'NATURAL'", "'DISTINCT'", "'DISTINCTROW'", "'AND'", "'OR'", 
			"'XOR'", "'NULL'", "'NOT'", "'IS'", "'IN'", "'LIKE'", "'TRUE'", "'FALSE'", 
			"'UNKNOWN'", "'ALL'", "'ANY'", "'SOME'", "'BETWEEN'", "'MEMBER'", "'ESCAPE'", 
			"'OF'", "'UNION'", "'INSERT'", "'LOW_PRIORITY'", "'DELAYED'", "'HIGH_PRIORITY'", 
			"'INTO'", "'SELECT'", "'DELETE'", "'VALUE'", "'VALUES'", "'PARTITION'", 
			"'TABLE'", "'DUPLICATE'", "'DEFAULT'", "'UPDATE'", "'SET'", "'REGEXP'", 
			"'RLIKE'", "'ASC'", "'DESC'", "'SOUNDS'", "'CASE'", "'WHEN'", "'THEN'", 
			"'ELSE'", "'END'", "'IF'", "'LOCALTIME'", "'LOCALTIMESTAMP'", "'REPLACE'", 
			"'INTERVAL'", "'DATABASE'", "'SCHEMA'", "'DATE'", "'DAY'", "'GEOMETRYCOLLECTION'", 
			"'LINESTRING'", "'MULTILINESTRING'", "'MULTIPOINT'", "'MULTIPOLYGON'", 
			"'POINT'", "'POLYGON'", "'TIME'", "'TIMESTAMP'", "'TIMESTAMP_ADD'", "'TIMESTAMP_DIFF'", 
			"'CURRENT_TIMESTAMP'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'UTC_TIMESTAMP'", 
			"'LAST_DAY'", "'MICROSECOND'", "'SECOND'", "'MINUTE'", "'HOUR'", "'WEEK'", 
			"'MONTH'", "'QUARTER'", "'YEAR'", "'SECOND_MICROSECOND'", "'MINUTE_MICROSECOND'", 
			"'MINUTE_SECOND'", "'HOUR_MICROSECOND'", "'HOUR_SECOND'", "'HOUR_MINUTE'", 
			"'DAY_MICROSECOND'", "'DAY_SECOND'", "'DAY_MINUTE'", "'DAY_HOUR'", "'YEAR_MONTH'", 
			"'SEPARATOR'", "':='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", 
			"'^='", "'|='", "'*'", "'/'", "'%'", "'+'", "'-'", "'DIV'", "'MOD'", 
			"'='", "'>'", "'<'", "'!'", "'~'", "'|'", "'&'", "'^'", "'.'", "'('", 
			"')'", "','", "';'", "'@'", "'''", "'\"'", "'`'", "':'", "'_'", "'N'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"WITH", "RECURSIVE", "FROM", "EXISTS", "WHERE", "DOTSTAR", "BINARY", 
			"STARTING", "MODE", "SKIP_", "LOCKED", "NOWAIT", "SHARE", "QUESTION_MARK", 
			"TERMINATED", "CHARACTER", "COLUMNS", "LINES", "OPTIONALLY", "ENCLOSED", 
			"ESCAPED", "AS", "USE", "IGNORE", "FORCE", "INDEX", "KEY", "JOIN", "BY", 
			"WINDOW", "OFFSET", "OUTFILE", "COLLATE", "MAX", "MIN", "SUM", "COUNT", 
			"AVG", "BIT_XOR", "BIT_AND", "BIT_OR", "GROUP_CONCAT", "JSON_ARRAYAGG", 
			"JSON_OBJECTAGG", "STD", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "VAR_POP", 
			"VAR_SAMP", "VARIANCE", "OVER", "ROWS", "ROW", "LANGUAGE", "QUERY", "EXPANSION", 
			"MATCH", "AGAINST", "BOOLEAN", "RANGE", "CURRENT", "UNBOUNDED", "PRECEDING", 
			"FOLLOWING", "ORDER", "FOR", "LOCK", "GROUP", "HAVING", "LIMIT", "INNER", 
			"CROSS", "LEFT", "RIGHT", "ON", "USING", "STRAIGHT_JOIN", "OUTER", "NATURAL", 
			"DISTINCT", "DISTINCTROW", "AND", "OR", "XOR", "NULL", "NOT", "IS", "IN", 
			"LIKE", "TRUE", "FALSE", "UNKNOWN", "ALL", "ANY", "SOME", "BETWEEN", 
			"MEMBER", "ESCAPE", "OF", "UNION", "INSERT", "LOW_PRIORITY", "DELAYED", 
			"HIGH_PRIORITY", "INTO", "SELECT", "DELETE", "VALUE", "VALUES", "PARTITION", 
			"TABLE", "DUPLICATE", "DEFAULT", "UPDATE", "SET", "REGEXP", "RLIKE", 
			"ASC", "DESC", "SOUNDS", "CASE", "WHEN", "THEN", "ELSE", "END", "IF", 
			"LOCALTIME", "LOCALTIMESTAMP", "REPLACE", "INTERVAL", "DATABASE", "SCHEMA", 
			"DATE", "DAY", "GEOMETRYCOLLECTION", "LINESTRING", "MULTILINESTRING", 
			"MULTIPOINT", "MULTIPOLYGON", "POINT", "POLYGON", "TIME", "TIMESTAMP", 
			"TIMESTAMP_ADD", "TIMESTAMP_DIFF", "CURRENT_TIMESTAMP", "CURRENT_DATE", 
			"CURRENT_TIME", "UTC_TIMESTAMP", "LAST_DAY", "MICROSECOND", "SECOND", 
			"MINUTE", "HOUR", "WEEK", "MONTH", "QUARTER", "YEAR", "SECOND_MICROSECOND", 
			"MINUTE_MICROSECOND", "MINUTE_SECOND", "HOUR_MICROSECOND", "HOUR_SECOND", 
			"HOUR_MINUTE", "DAY_MICROSECOND", "DAY_SECOND", "DAY_MINUTE", "DAY_HOUR", 
			"YEAR_MONTH", "SEPARATOR", "VAR_ASSIGN", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "XOR_ASSIGN", 
			"OR_ASSIGN", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "DIV", "MOD", 
			"EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
			"BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LP", "RP", 
			"COMMA", "SEMI", "AT_SIGN", "SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", 
			"REVERSE_QUOTE_SYMB", "COLON_SYMB", "UNDERSCORE", "N_SYMB", "ID", "REVERSE_QUOTE_ID", 
			"SINGLE_QUOTED_TEXT", "DOUBLE_QUOTED_TEXT", "NUMBER_LITERAL", "INTEGER_LITERAL", 
			"FLOAT_LITERAL", "EXPONENT", "BINARY_LITERAL", "OCTAL_LITERAL", "HEX_LITERAL", 
			"DATE_AND_TIME_LITERAL", "DATE_LITERAL", "DATETIME_LITERAL", "TIMESTAMP_LITERAL", 
			"TIME_LITERAL", "YEAR_LITERAL", "DIGIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TestParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  public StringBuilder result;
	  public List<String> tables = new ArrayList<>();
	  public int literalCount = 0;

	  private void addLiteralCount() {
	    literalCount++;
	    if (literalCount > 5) {
	      throw new RuntimeException("Too many literals");
	    }
	  }

	public TestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DmlStatementContext extends ParserRuleContext {
		public SelectContext select;
		public SelectWithUnionContext selectWithUnion;
		public InsertContext insert;
		public UpdateContext update;
		public DeleteContext delete;
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public SelectWithUnionContext selectWithUnion() {
			return getRuleContext(SelectWithUnionContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dmlStatement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((DmlStatementContext)_localctx).select = select();
				 result = ((DmlStatementContext)_localctx).select.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((DmlStatementContext)_localctx).selectWithUnion = selectWithUnion();
				result = ((DmlStatementContext)_localctx).selectWithUnion.v;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((DmlStatementContext)_localctx).insert = insert();
				result = ((DmlStatementContext)_localctx).insert.v;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				((DmlStatementContext)_localctx).update = update();
				result = ((DmlStatementContext)_localctx).update.v;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				((DmlStatementContext)_localctx).delete = delete();
				result = ((DmlStatementContext)_localctx).delete.v;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public StringBuilder v;
		public WithClauseContext withClause;
		public SelectWithFromContext selectWithFrom;
		public SelectWithFromContext selectWithFrom() {
			return getRuleContext(SelectWithFromContext.class,0);
		}
		public SelectWithoutFromContext selectWithoutFrom() {
			return getRuleContext(SelectWithoutFromContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(135);
				((SelectContext)_localctx).withClause = withClause();
				}
			}

			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(138);
				((SelectContext)_localctx).selectWithFrom = selectWithFrom();
				}
				break;
			case 2:
				{
				setState(139);
				selectWithoutFrom();
				}
				break;
			}

			         if(((SelectContext)_localctx).withClause != null){
			             ((SelectContext)_localctx).v =  ((SelectContext)_localctx).withClause.v;
			             _localctx.v.append(",");
			         } else {
			             ((SelectContext)_localctx).v =  new StringBuilder();
			         }
			         _localctx.v.append(((SelectContext)_localctx).selectWithFrom.v);
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectWithUnionContext extends ParserRuleContext {
		public StringBuilder v;
		public SelectContext main;
		public Token describe;
		public SelectContext select;
		public List<SelectContext> right = new ArrayList<SelectContext>();
		public TerminalNode UNION() { return getToken(TestParser.UNION, 0); }
		public List<SelectContext> select() {
			return getRuleContexts(SelectContext.class);
		}
		public SelectContext select(int i) {
			return getRuleContext(SelectContext.class,i);
		}
		public List<TerminalNode> ALL() { return getTokens(TestParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(TestParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(TestParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(TestParser.DISTINCT, i);
		}
		public SelectWithUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectWithUnion; }
	}

	public final SelectWithUnionContext selectWithUnion() throws RecognitionException {
		SelectWithUnionContext _localctx = new SelectWithUnionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectWithUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((SelectWithUnionContext)_localctx).main = select();
			setState(145);
			match(UNION);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (DISTINCT - 85)) | (1L << (ALL - 85)) | (1L << (SELECT - 85)))) != 0)) {
				{
				{
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DISTINCT || _la==ALL) {
					{
					setState(146);
					((SelectWithUnionContext)_localctx).describe = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==DISTINCT || _la==ALL) ) {
						((SelectWithUnionContext)_localctx).describe = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(149);
				((SelectWithUnionContext)_localctx).select = select();
				((SelectWithUnionContext)_localctx).right.add(((SelectWithUnionContext)_localctx).select);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((SelectWithUnionContext)_localctx).v =  ((SelectWithUnionContext)_localctx).main.v;
			        _localctx.v.append(" UNION ");
			        if (((SelectWithUnionContext)_localctx).describe != null) {
			            _localctx.v.append((((SelectWithUnionContext)_localctx).describe!=null?((SelectWithUnionContext)_localctx).describe.getText():null));
			        }
			        for (int i = 0; i < ((SelectWithUnionContext)_localctx).right.size(); i++) {
			            _localctx.v.append(((SelectWithUnionContext)_localctx).right.get(i).v);
			            if (i < ((SelectWithUnionContext)_localctx).right.size() - 1) {
			                _localctx.v.append(" UNION ");
			            }
			        }
			        _localctx.v.append(" ");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public StringBuilder v;
		public UidContext cteName;
		public UidContext uid;
		public List<UidContext> otherCteName = new ArrayList<UidContext>();
		public TerminalNode WITH() { return getToken(TestParser.WITH, 0); }
		public List<Skip_codeContext> skip_code() {
			return getRuleContexts(Skip_codeContext.class);
		}
		public Skip_codeContext skip_code(int i) {
			return getRuleContext(Skip_codeContext.class,i);
		}
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(TestParser.RECURSIVE, 0); }
		public List<UidListContext> uidList() {
			return getRuleContexts(UidListContext.class);
		}
		public UidListContext uidList(int i) {
			return getRuleContext(UidListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public List<TerminalNode> LP() { return getTokens(TestParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(TestParser.LP, i);
		}
		public List<TerminalNode> RP() { return getTokens(TestParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(TestParser.RP, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(WITH);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(158);
				match(RECURSIVE);
				}
			}

			setState(161);
			((WithClauseContext)_localctx).cteName = uid();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (LP - 201)) | (1L << (ID - 201)) | (1L << (REVERSE_QUOTE_ID - 201)))) != 0)) {
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(162);
					match(LP);
					}
				}

				setState(165);
				uidList();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP) {
					{
					setState(166);
					match(RP);
					}
				}

				}
			}

			setState(171);
			skip_code();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				((WithClauseContext)_localctx).uid = uid();
				((WithClauseContext)_localctx).otherCteName.add(((WithClauseContext)_localctx).uid);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (LP - 201)) | (1L << (ID - 201)) | (1L << (REVERSE_QUOTE_ID - 201)))) != 0)) {
					{
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LP) {
						{
						setState(174);
						match(LP);
						}
					}

					setState(177);
					uidList();
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RP) {
						{
						setState(178);
						match(RP);
						}
					}

					}
				}

				setState(183);
				skip_code();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((WithClauseContext)_localctx).v =  new StringBuilder("WITH ");
			        _localctx.v.append((((WithClauseContext)_localctx).cteName!=null?_input.getText(((WithClauseContext)_localctx).cteName.start,((WithClauseContext)_localctx).cteName.stop):null));
			        for (UidContext o : ((WithClauseContext)_localctx).otherCteName){
			            _localctx.v.append(",");
			            _localctx.v.append(o.v);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectWithoutFromContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(TestParser.SELECT, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public SelectWithoutFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectWithoutFrom; }
	}

	public final SelectWithoutFromContext selectWithoutFrom() throws RecognitionException {
		SelectWithoutFromContext _localctx = new SelectWithoutFromContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectWithoutFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(SELECT);
			setState(193);
			exprs();

			  throw new RuntimeException("Invalid select statement, maybe without a FROM clause");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectWithFromContext extends ParserRuleContext {
		public StringBuilder v;
		public TableSourcesContext tableSources;
		public WhereClauseContext whereClause;
		public GroupByClauseContext groupByClause;
		public HavingClauseContext havingClause;
		public OrderByClauseContext orderByClause;
		public LimitClauseContext limitClause;
		public Select_fromContext select_from() {
			return getRuleContext(Select_fromContext.class,0);
		}
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public LockClauseContext lockClause() {
			return getRuleContext(LockClauseContext.class,0);
		}
		public SelectWithFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectWithFrom; }
	}

	public final SelectWithFromContext selectWithFrom() throws RecognitionException {
		SelectWithFromContext _localctx = new SelectWithFromContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectWithFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			select_from();
			setState(197);
			((SelectWithFromContext)_localctx).tableSources = tableSources();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(198);
				((SelectWithFromContext)_localctx).whereClause = whereClause();
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(201);
				((SelectWithFromContext)_localctx).groupByClause = groupByClause();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(204);
				((SelectWithFromContext)_localctx).havingClause = havingClause();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(207);
				windowClause();
				}
			}

			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(210);
				((SelectWithFromContext)_localctx).orderByClause = orderByClause();
				}
			}

			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(213);
				((SelectWithFromContext)_localctx).limitClause = limitClause();
				}
			}

			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR || _la==LOCK) {
				{
				setState(216);
				lockClause();
				}
			}


			      ((SelectWithFromContext)_localctx).v =  new StringBuilder("SELECT ");
			      _localctx.v.append(((SelectWithFromContext)_localctx).tableSources.v);
			      if(((SelectWithFromContext)_localctx).whereClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((SelectWithFromContext)_localctx).whereClause.v);
			      }
			      if(((SelectWithFromContext)_localctx).groupByClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((SelectWithFromContext)_localctx).groupByClause.v);
			      }
			      if(((SelectWithFromContext)_localctx).havingClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((SelectWithFromContext)_localctx).havingClause.v);
			      }
			      if(((SelectWithFromContext)_localctx).orderByClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((SelectWithFromContext)_localctx).orderByClause.v);
			      }
			      if(((SelectWithFromContext)_localctx).limitClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((SelectWithFromContext)_localctx).limitClause.v);
			      }
			      _localctx.v.append(" ");
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSourcesContext extends ParserRuleContext {
		public StringBuilder v;
		public TableSourceContext first;
		public TableSourceContext tableSource;
		public List<TableSourceContext> others = new ArrayList<TableSourceContext>();
		public List<TableSourceContext> tableSource() {
			return getRuleContexts(TableSourceContext.class);
		}
		public TableSourceContext tableSource(int i) {
			return getRuleContext(TableSourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public TableSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources; }
	}

	public final TableSourcesContext tableSources() throws RecognitionException {
		TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((TableSourcesContext)_localctx).first = tableSource();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(222);
				match(COMMA);
				setState(223);
				((TableSourcesContext)_localctx).tableSource = tableSource();
				((TableSourcesContext)_localctx).others.add(((TableSourcesContext)_localctx).tableSource);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((TableSourcesContext)_localctx).v =  ((TableSourcesContext)_localctx).first.v;
			        for (TableSourceContext o : ((TableSourcesContext)_localctx).others){
			            _localctx.v.append(",");
			            _localctx.v.append(o.v);
			            _localctx.v.append(" ");
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSourceContext extends ParserRuleContext {
		public StringBuilder v;
		public TableSourceItemContext tableSourceItem;
		public JoinPartContext joinPart;
		public List<JoinPartContext> joins = new ArrayList<JoinPartContext>();
		public TableSourceItemContext tableSourceItem() {
			return getRuleContext(TableSourceItemContext.class,0);
		}
		public List<JoinPartContext> joinPart() {
			return getRuleContexts(JoinPartContext.class);
		}
		public JoinPartContext joinPart(int i) {
			return getRuleContext(JoinPartContext.class,i);
		}
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableSource);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((TableSourceContext)_localctx).tableSourceItem = tableSourceItem();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (JOIN - 32)) | (1L << (INNER - 32)) | (1L << (CROSS - 32)) | (1L << (LEFT - 32)) | (1L << (RIGHT - 32)) | (1L << (STRAIGHT_JOIN - 32)) | (1L << (NATURAL - 32)))) != 0)) {
					{
					{
					setState(232);
					((TableSourceContext)_localctx).joinPart = joinPart();
					((TableSourceContext)_localctx).joins.add(((TableSourceContext)_localctx).joinPart);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				        ((TableSourceContext)_localctx).v =  ((TableSourceContext)_localctx).tableSourceItem.v ;
				        for (JoinPartContext o : ((TableSourceContext)_localctx).joins){
				             _localctx.v.append(" ");
				             _localctx.v.append(o.v);
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(LP);
				setState(241);
				((TableSourceContext)_localctx).tableSourceItem = tableSourceItem();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (JOIN - 32)) | (1L << (INNER - 32)) | (1L << (CROSS - 32)) | (1L << (LEFT - 32)) | (1L << (RIGHT - 32)) | (1L << (STRAIGHT_JOIN - 32)) | (1L << (NATURAL - 32)))) != 0)) {
					{
					{
					setState(242);
					((TableSourceContext)_localctx).joinPart = joinPart();
					((TableSourceContext)_localctx).joins.add(((TableSourceContext)_localctx).joinPart);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(RP);

				        ((TableSourceContext)_localctx).v =  ((TableSourceContext)_localctx).tableSourceItem.v;
				        for (JoinPartContext o : ((TableSourceContext)_localctx).joins){
				             _localctx.v.append(" ");
				             _localctx.v.append(o.v);
				        }
				        _localctx.v.append(")");
				        _localctx.v.insert(0,"(");
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSourceItemContext extends ParserRuleContext {
		public StringBuilder v;
		public Token main;
		public SubqueryContext subquery;
		public TableSourcesContext tableSources;
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public TerminalNode AS() { return getToken(TestParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public TableSourceItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSourceItem; }
	}

	public final TableSourceItemContext tableSourceItem() throws RecognitionException {
		TableSourceItemContext _localctx = new TableSourceItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableSourceItem);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((TableSourceItemContext)_localctx).main = match(ID);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(254);
						match(AS);
						}
					}

					setState(257);
					match(ID);
					}
					break;
				}

				      ((TableSourceItemContext)_localctx).v =  new StringBuilder((((TableSourceItemContext)_localctx).main!=null?((TableSourceItemContext)_localctx).main.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((TableSourceItemContext)_localctx).subquery = subquery();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(262);
					match(AS);
					}
				}

				setState(265);
				match(ID);

				         ((TableSourceItemContext)_localctx).v =  ((TableSourceItemContext)_localctx).subquery.v ;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(LP);
				setState(269);
				((TableSourceItemContext)_localctx).tableSources = tableSources();
				setState(270);
				match(RP);

				        ((TableSourceItemContext)_localctx).v =  ((TableSourceItemContext)_localctx).tableSources.v;
				        _localctx.v.append(")");
				        _localctx.v.insert(0,"(");
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinPartContext extends ParserRuleContext {
		public StringBuilder v;
		public Token condition;
		public TableSourceItemContext tableSourceItem;
		public Token ON;
		public ExprContext expr;
		public Token USING;
		public UidListContext uidList;
		public Token OUTER;
		public TerminalNode JOIN() { return getToken(TestParser.JOIN, 0); }
		public TableSourceItemContext tableSourceItem() {
			return getRuleContext(TableSourceItemContext.class,0);
		}
		public TerminalNode ON() { return getToken(TestParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(TestParser.USING, 0); }
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public UidListContext uidList() {
			return getRuleContext(UidListContext.class,0);
		}
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public TerminalNode INNER() { return getToken(TestParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(TestParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(TestParser.STRAIGHT_JOIN, 0); }
		public TerminalNode LEFT() { return getToken(TestParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(TestParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(TestParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(TestParser.NATURAL, 0); }
		public JoinPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinPart; }
	}

	public final JoinPartContext joinPart() throws RecognitionException {
		JoinPartContext _localctx = new JoinPartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_joinPart);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
			case CROSS:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(275);
					((JoinPartContext)_localctx).condition = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
						((JoinPartContext)_localctx).condition = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(278);
				match(JOIN);
				setState(279);
				((JoinPartContext)_localctx).tableSourceItem = tableSourceItem();
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(280);
					((JoinPartContext)_localctx).ON = match(ON);
					setState(281);
					((JoinPartContext)_localctx).expr = expr(0);
					}
					break;
				case 2:
					{
					setState(282);
					((JoinPartContext)_localctx).USING = match(USING);
					setState(283);
					match(LP);
					setState(284);
					((JoinPartContext)_localctx).uidList = uidList();
					setState(285);
					match(RP);
					}
					break;
				}

				        ((JoinPartContext)_localctx).v =  new StringBuilder();
				        _localctx.v.append((((JoinPartContext)_localctx).condition!=null?((JoinPartContext)_localctx).condition.getText():null));
				        _localctx.v.append(" JOIN ");
				        _localctx.v.append(((JoinPartContext)_localctx).tableSourceItem.v);
				        if (((JoinPartContext)_localctx).ON != null) {
				            _localctx.v.append(" ON ");
				            _localctx.v.append(((JoinPartContext)_localctx).expr.v);
				        } else if (((JoinPartContext)_localctx).USING != null) {
				            _localctx.v.append(" USING (");
				            _localctx.v.append(((JoinPartContext)_localctx).uidList.v);
				            _localctx.v.append(")");
				        }
				    
				}
				break;
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(STRAIGHT_JOIN);
				setState(292);
				((JoinPartContext)_localctx).tableSourceItem = tableSourceItem();
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(293);
					match(ON);
					setState(294);
					expr(0);
					}
					break;
				}

				        _localctx.v.append("STRAIGHT_JOIN ");
				        _localctx.v.append(((JoinPartContext)_localctx).tableSourceItem.v);
				    
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((JoinPartContext)_localctx).condition = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
					((JoinPartContext)_localctx).condition = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(300);
					((JoinPartContext)_localctx).OUTER = match(OUTER);
					}
				}

				setState(303);
				match(JOIN);
				setState(304);
				((JoinPartContext)_localctx).tableSourceItem = tableSourceItem();
				setState(312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(305);
					((JoinPartContext)_localctx).ON = match(ON);
					setState(306);
					((JoinPartContext)_localctx).expr = expr(0);
					}
					break;
				case USING:
					{
					setState(307);
					((JoinPartContext)_localctx).USING = match(USING);
					setState(308);
					match(LP);
					setState(309);
					((JoinPartContext)_localctx).uidList = uidList();
					setState(310);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

				        ((JoinPartContext)_localctx).v =  new StringBuilder((((JoinPartContext)_localctx).condition!=null?((JoinPartContext)_localctx).condition.getText():null));
				        if (((JoinPartContext)_localctx).OUTER != null) {
				            _localctx.v.append(" OUTER");
				        }
				        _localctx.v.append(" JOIN ");
				        _localctx.v.append(((JoinPartContext)_localctx).tableSourceItem.v);
				        if (((JoinPartContext)_localctx).ON != null) {
				            _localctx.v.append(" ON ");
				            _localctx.v.append(((JoinPartContext)_localctx).expr.v);
				        } else if (((JoinPartContext)_localctx).USING != null) {
				            _localctx.v.append(" USING (");
				            _localctx.v.append(((JoinPartContext)_localctx).uidList.v);
				            _localctx.v.append(")");
				        }
				    
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				match(NATURAL);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(317);
					((JoinPartContext)_localctx).condition = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
						((JoinPartContext)_localctx).condition = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(318);
						((JoinPartContext)_localctx).OUTER = match(OUTER);
						}
					}

					}
				}

				setState(323);
				match(JOIN);
				setState(324);
				((JoinPartContext)_localctx).tableSourceItem = tableSourceItem();

				        ((JoinPartContext)_localctx).v =  new StringBuilder("NATURAL ");
				        if (((JoinPartContext)_localctx).condition != null) {
				            _localctx.v.append((((JoinPartContext)_localctx).condition!=null?((JoinPartContext)_localctx).condition.getText():null));
				            if (((JoinPartContext)_localctx).OUTER != null) {
				                _localctx.v.append((((JoinPartContext)_localctx).OUTER!=null?((JoinPartContext)_localctx).OUTER.getText():null));
				            }
				        }
				        _localctx.v.append(" JOIN ");
				        _localctx.v.append(((JoinPartContext)_localctx).tableSourceItem.v);
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public StringBuilder v;
		public ExprContext expr;
		public TerminalNode WHERE() { return getToken(TestParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(WHERE);
			setState(330);
			((WhereClauseContext)_localctx).expr = expr(0);

			        ((WhereClauseContext)_localctx).v =  new StringBuilder("WHERE ");
			        _localctx.v.append(((WhereClauseContext)_localctx).expr.v);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public StringBuilder v;
		public GroupByItemContext g1;
		public GroupByItemContext groupByItem;
		public List<GroupByItemContext> g2 = new ArrayList<GroupByItemContext>();
		public TerminalNode GROUP() { return getToken(TestParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(TestParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(GROUP);
			setState(334);
			match(BY);
			setState(335);
			((GroupByClauseContext)_localctx).g1 = groupByItem();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(336);
				match(COMMA);
				setState(337);
				((GroupByClauseContext)_localctx).groupByItem = groupByItem();
				((GroupByClauseContext)_localctx).g2.add(((GroupByClauseContext)_localctx).groupByItem);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((GroupByClauseContext)_localctx).v =  new StringBuilder("GROUP BY ");
			        _localctx.v.append(((GroupByClauseContext)_localctx).g1.c);
			        for(GroupByItemContext o : ((GroupByClauseContext)_localctx).g2){
			            _localctx.v.append(",");
			            _localctx.v.append(o.c);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByItemContext extends ParserRuleContext {
		public StringBuilder c;
		public SimpleExprContext simpleExpr;
		public Token order;
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(TestParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TestParser.DESC, 0); }
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			((GroupByItemContext)_localctx).simpleExpr = simpleExpr(0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(346);
				((GroupByItemContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GroupByItemContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}


			        ((GroupByItemContext)_localctx).c =  ((GroupByItemContext)_localctx).simpleExpr.c;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public StringBuilder v;
		public ExprContext expr;
		public TerminalNode HAVING() { return getToken(TestParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(HAVING);
			setState(352);
			((HavingClauseContext)_localctx).expr = expr(0);

			        ((HavingClauseContext)_localctx).v =  new StringBuilder("HAVING ");
			        if (((HavingClauseContext)_localctx).expr.c != null){
			            _localctx.v.append(((HavingClauseContext)_localctx).expr.c);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public UidContext windowName;
		public TerminalNode WINDOW() { return getToken(TestParser.WINDOW, 0); }
		public List<Skip_codeContext> skip_code() {
			return getRuleContexts(Skip_codeContext.class);
		}
		public Skip_codeContext skip_code(int i) {
			return getRuleContext(Skip_codeContext.class,i);
		}
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_windowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(WINDOW);
			setState(356);
			((WindowClauseContext)_localctx).windowName = uid();
			setState(357);
			skip_code();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(358);
				match(COMMA);
				setState(359);
				uid();
				setState(360);
				skip_code();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public StringBuilder v;
		public TerminalNode ORDER() { return getToken(TestParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(TestParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ORDER);
			setState(368);
			match(BY);
			setState(369);
			orderByExpression();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(370);
				match(COMMA);
				setState(371);
				orderByExpression();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((OrderByClauseContext)_localctx).v =  new StringBuilder("ORDER BY");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByExpressionContext extends ParserRuleContext {
		public Token order;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(TestParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(TestParser.DESC, 0); }
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orderByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			expr(0);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(380);
				((OrderByExpressionContext)_localctx).order = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderByExpressionContext)_localctx).order = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public StringBuilder v;
		public TerminalNode LIMIT() { return getToken(TestParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(TestParser.OFFSET, 0); }
		public TerminalNode COMMA() { return getToken(TestParser.COMMA, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LIMIT);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(384);
					matchWildcard();
					setState(385);
					match(COMMA);
					}
					break;
				}
				setState(388);
				matchWildcard();
				}
				break;
			case 2:
				{
				setState(389);
				matchWildcard();
				setState(390);
				match(OFFSET);
				setState(391);
				matchWildcard();
				}
				break;
			}

			      ((LimitClauseContext)_localctx).v =  new StringBuilder("LIMIT ?");
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public StringBuilder v;
		public SelectContext select;
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(LP);
			setState(397);
			((SubqueryContext)_localctx).select = select();
			setState(398);
			match(RP);

			    ((SubqueryContext)_localctx).v =  ((SubqueryContext)_localctx).select.v;
			    _localctx.v.append(")");
			    _localctx.v.insert(0,"(");

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TestParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(TestParser.UPDATE, 0); }
		public TerminalNode SHARE() { return getToken(TestParser.SHARE, 0); }
		public TerminalNode OF() { return getToken(TestParser.OF, 0); }
		public TerminalNode SKIP_() { return getToken(TestParser.SKIP_, 0); }
		public TerminalNode LOCKED() { return getToken(TestParser.LOCKED, 0); }
		public TerminalNode NOWAIT() { return getToken(TestParser.NOWAIT, 0); }
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public List<TerminalNode> DOTSTAR() { return getTokens(TestParser.DOTSTAR); }
		public TerminalNode DOTSTAR(int i) {
			return getToken(TestParser.DOTSTAR, i);
		}
		public TerminalNode LOCK() { return getToken(TestParser.LOCK, 0); }
		public TerminalNode IN() { return getToken(TestParser.IN, 0); }
		public TerminalNode MODE() { return getToken(TestParser.MODE, 0); }
		public LockClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockClause; }
	}

	public final LockClauseContext lockClause() throws RecognitionException {
		LockClauseContext _localctx = new LockClauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lockClause);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(FOR);
				setState(402);
				_la = _input.LA(1);
				if ( !(_la==SHARE || _la==UPDATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF) {
					{
					setState(403);
					match(OF);
					{
					setState(404);
					uid();
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOTSTAR) {
						{
						setState(405);
						match(DOTSTAR);
						}
					}

					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(408);
						match(COMMA);
						setState(409);
						uid();
						setState(411);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DOTSTAR) {
							{
							setState(410);
							match(DOTSTAR);
							}
						}

						}
						}
						setState(417);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(423);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SKIP_:
					{
					setState(420);
					match(SKIP_);
					setState(421);
					match(LOCKED);
					}
					break;
				case NOWAIT:
					{
					setState(422);
					match(NOWAIT);
					}
					break;
				case EOF:
				case WITH:
				case AS:
				case ON:
				case DISTINCT:
				case ALL:
				case UNION:
				case SELECT:
				case RP:
					break;
				default:
					break;
				}
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				match(LOCK);
				setState(426);
				match(IN);
				setState(427);
				match(SHARE);
				setState(428);
				match(MODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public StringBuilder v;
		public StringBuilder c = new StringBuilder();
		public ExprContext left;
		public Token NOT;
		public ExprContext expr;
		public BooleanPrimaryContext booleanPrimary;
		public Token value;
		public ExprOperatorContext exprOperator;
		public ExprContext right;
		public TerminalNode NOT() { return getToken(TestParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(TestParser.EXCLAMATION_SYMBOL, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(TestParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(TestParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TestParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(TestParser.UNKNOWN, 0); }
		public ExprOperatorContext exprOperator() {
			return getRuleContext(ExprOperatorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(432);
				((ExprContext)_localctx).NOT = match(NOT);
				setState(433);
				((ExprContext)_localctx).expr = expr(4);

				        ((ExprContext)_localctx).v =  new StringBuilder("NOT ");
				        _localctx.v.append(((ExprContext)_localctx).expr.v);
				    
				}
				break;
			case 2:
				{
				setState(436);
				match(EXCLAMATION_SYMBOL);
				setState(437);
				((ExprContext)_localctx).expr = expr(3);

				        ((ExprContext)_localctx).v =  new StringBuilder("!");
				        _localctx.v.append(((ExprContext)_localctx).expr.v);
				    
				}
				break;
			case 3:
				{
				setState(440);
				((ExprContext)_localctx).booleanPrimary = booleanPrimary(0);
				setState(441);
				match(IS);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(442);
					((ExprContext)_localctx).NOT = match(NOT);
					}
				}

				setState(445);
				((ExprContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (TRUE - 95)) | (1L << (FALSE - 95)) | (1L << (UNKNOWN - 95)))) != 0)) ) {
					((ExprContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

				        ((ExprContext)_localctx).v =  ((ExprContext)_localctx).booleanPrimary.v;
				        _localctx.v.append(" IS ");
				        if (((ExprContext)_localctx).NOT != null) {
				            _localctx.v.append("NOT ");
				        }
				        _localctx.v.append((((ExprContext)_localctx).value!=null?((ExprContext)_localctx).value.getText():null));
				    
				}
				break;
			case 4:
				{
				setState(448);
				((ExprContext)_localctx).booleanPrimary = booleanPrimary(0);

				        ((ExprContext)_localctx).v =  ((ExprContext)_localctx).booleanPrimary.v;
				        ((ExprContext)_localctx).c =  ((ExprContext)_localctx).booleanPrimary.c;
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(453);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(454);
					((ExprContext)_localctx).exprOperator = exprOperator();
					setState(455);
					((ExprContext)_localctx).right = ((ExprContext)_localctx).expr = expr(6);

					                  ((ExprContext)_localctx).v =  ((ExprContext)_localctx).left.v;
					                  _localctx.v.append(" ");
					                  _localctx.v.append((((ExprContext)_localctx).exprOperator!=null?_input.getText(((ExprContext)_localctx).exprOperator.start,((ExprContext)_localctx).exprOperator.stop):null));
					                  _localctx.v.append(" ");
					                  _localctx.v.append(((ExprContext)_localctx).right.v);
					              
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public StringBuilder v;
		public ExprContext first;
		public ExprContext expr;
		public List<ExprContext> others = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			((ExprsContext)_localctx).first = expr(0);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(464);
				match(COMMA);
				setState(465);
				((ExprsContext)_localctx).expr = expr(0);
				((ExprsContext)_localctx).others.add(((ExprsContext)_localctx).expr);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((ExprsContext)_localctx).v =  ((ExprsContext)_localctx).first.v;
			        for (ExprContext o : ((ExprsContext)_localctx).others){
			            _localctx.v.append(",");
			            _localctx.v.append(o.v);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(TestParser.OR, 0); }
		public TerminalNode XOR() { return getToken(TestParser.XOR, 0); }
		public TerminalNode AND() { return getToken(TestParser.AND, 0); }
		public List<TerminalNode> BIT_OR_OP() { return getTokens(TestParser.BIT_OR_OP); }
		public TerminalNode BIT_OR_OP(int i) {
			return getToken(TestParser.BIT_OR_OP, i);
		}
		public List<TerminalNode> BIT_AND_OP() { return getTokens(TestParser.BIT_AND_OP); }
		public TerminalNode BIT_AND_OP(int i) {
			return getToken(TestParser.BIT_AND_OP, i);
		}
		public ExprOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOperator; }
	}

	public final ExprOperatorContext exprOperator() throws RecognitionException {
		ExprOperatorContext _localctx = new ExprOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exprOperator);
		try {
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(OR);
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(XOR);
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				match(AND);
				}
				break;
			case BIT_OR_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(BIT_OR_OP);
				setState(477);
				match(BIT_OR_OP);
				}
				break;
			case BIT_AND_OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(478);
				match(BIT_AND_OP);
				setState(479);
				match(BIT_AND_OP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public StringBuilder v;
		public StringBuilder c;
		public BooleanPrimaryContext left;
		public PredicateContext predicate;
		public Token NOT;
		public ComparisonOperatorContext comparisonOperator;
		public Token describe;
		public SubqueryContext subquery;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(TestParser.IS, 0); }
		public TerminalNode NULL() { return getToken(TestParser.NULL, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TestParser.NOT, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(TestParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(TestParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(483);
			((BooleanPrimaryContext)_localctx).predicate = predicate();

			        ((BooleanPrimaryContext)_localctx).v =  ((BooleanPrimaryContext)_localctx).predicate.v;
			        ((BooleanPrimaryContext)_localctx).c =  ((BooleanPrimaryContext)_localctx).predicate.c;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(506);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(486);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(487);
						match(IS);
						setState(489);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(488);
							((BooleanPrimaryContext)_localctx).NOT = match(NOT);
							}
						}

						setState(491);
						match(NULL);

						                  ((BooleanPrimaryContext)_localctx).v =  ((BooleanPrimaryContext)_localctx).left.v;
						                  _localctx.v.append(" IS ");
						                  if (((BooleanPrimaryContext)_localctx).NOT != null) {
						                      _localctx.v.append("NOT ");
						                  }
						                  _localctx.v.append("NULL");
						              
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(493);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(494);
						((BooleanPrimaryContext)_localctx).comparisonOperator = comparisonOperator();
						setState(495);
						((BooleanPrimaryContext)_localctx).predicate = predicate();

						                  ((BooleanPrimaryContext)_localctx).v =  ((BooleanPrimaryContext)_localctx).left.v;
						                  _localctx.v.append(" ");
						                  _localctx.v.append((((BooleanPrimaryContext)_localctx).comparisonOperator!=null?_input.getText(((BooleanPrimaryContext)_localctx).comparisonOperator.start,((BooleanPrimaryContext)_localctx).comparisonOperator.stop):null));
						                  _localctx.v.append(" ");
						                  _localctx.v.append(((BooleanPrimaryContext)_localctx).predicate.v);
						              
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(498);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(499);
						((BooleanPrimaryContext)_localctx).comparisonOperator = comparisonOperator();
						setState(501);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==ANY) {
							{
							setState(500);
							((BooleanPrimaryContext)_localctx).describe = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==ALL || _la==ANY) ) {
								((BooleanPrimaryContext)_localctx).describe = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(503);
						((BooleanPrimaryContext)_localctx).subquery = subquery();

						                  ((BooleanPrimaryContext)_localctx).v =  ((BooleanPrimaryContext)_localctx).left.v;
						                  _localctx.v.append(" ");
						                  _localctx.v.append((((BooleanPrimaryContext)_localctx).comparisonOperator!=null?_input.getText(((BooleanPrimaryContext)_localctx).comparisonOperator.start,((BooleanPrimaryContext)_localctx).comparisonOperator.stop):null));
						                  _localctx.v.append(" ");
						                  if(((BooleanPrimaryContext)_localctx).describe != null){
						                      _localctx.v.append((((BooleanPrimaryContext)_localctx).describe!=null?((BooleanPrimaryContext)_localctx).describe.getText():null));
						                      _localctx.v.append(" ");
						                  }
						                  _localctx.v.append(((BooleanPrimaryContext)_localctx).subquery.v);
						              
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL_SYMBOL() { return getToken(TestParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(TestParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(TestParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(TestParser.EXCLAMATION_SYMBOL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparisonOperator);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(EQUAL_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(GREATER_SYMBOL);
				setState(513);
				match(EQUAL_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(GREATER_SYMBOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				match(LESS_SYMBOL);
				setState(516);
				match(EQUAL_SYMBOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				match(LESS_SYMBOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
				match(LESS_SYMBOL);
				setState(519);
				match(GREATER_SYMBOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(520);
				match(EXCLAMATION_SYMBOL);
				setState(521);
				match(EQUAL_SYMBOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(522);
				match(LESS_SYMBOL);
				setState(523);
				match(EQUAL_SYMBOL);
				setState(524);
				match(GREATER_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public StringBuilder v;
		public StringBuilder c;
		public BitExprContext bitExpr;
		public Token NOT;
		public SubqueryContext subquery;
		public ExprsContext exprs;
		public PredicateContext predicate;
		public SimpleExprContext simpleExpr;
		public Token ESCAPE;
		public SimpleExprContext escapeExpr;
		public BitExprContext left;
		public BitExprContext right;
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(TestParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TestParser.NOT, 0); }
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public TerminalNode BETWEEN() { return getToken(TestParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(TestParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(TestParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(TestParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(TestParser.ESCAPE, 0); }
		public TerminalNode REGEXP() { return getToken(TestParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_predicate);
		int _la;
		try {
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(528);
					((PredicateContext)_localctx).NOT = match(NOT);
					}
				}

				setState(531);
				match(IN);
				setState(532);
				((PredicateContext)_localctx).subquery = subquery();

				        ((PredicateContext)_localctx).v =  ((PredicateContext)_localctx).bitExpr.v;
				        if(((PredicateContext)_localctx).NOT != null){
				          _localctx.v.append(" NOT");
				        }
				        _localctx.v.append(" IN ");
				        _localctx.v.append(((PredicateContext)_localctx).subquery.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(536);
					((PredicateContext)_localctx).NOT = match(NOT);
					}
				}

				setState(539);
				match(IN);
				setState(540);
				match(LP);
				setState(541);
				((PredicateContext)_localctx).exprs = exprs();
				setState(542);
				match(RP);

				        ((PredicateContext)_localctx).v =  ((PredicateContext)_localctx).bitExpr.v;
				        if(((PredicateContext)_localctx).NOT != null){
				          _localctx.v.append(" NOT");
				        }
				        _localctx.v.append(" IN (");
				        _localctx.v.append(((PredicateContext)_localctx).exprs.v);
				        _localctx.v.append(")");
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(546);
					((PredicateContext)_localctx).NOT = match(NOT);
					}
				}

				setState(549);
				match(BETWEEN);
				setState(550);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);
				setState(551);
				match(AND);
				setState(552);
				((PredicateContext)_localctx).predicate = predicate();

				        ((PredicateContext)_localctx).v =  ((PredicateContext)_localctx).bitExpr.v;
				        if(((PredicateContext)_localctx).NOT != null){
				          _localctx.v.append(" NOT");
				        }
				        _localctx.v.append(" BETWEEN ");
				        _localctx.v.append(((PredicateContext)_localctx).bitExpr.v);
				        _localctx.v.append(" AND ");
				        _localctx.v.append(((PredicateContext)_localctx).predicate.v);
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);
				setState(556);
				match(SOUNDS);
				setState(557);
				match(LIKE);
				setState(558);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);

				        ((PredicateContext)_localctx).v =  ((PredicateContext)_localctx).bitExpr.v;
				        _localctx.v.append(" SOUNDS LIKE ");
				        _localctx.v.append(((PredicateContext)_localctx).bitExpr.v);
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(562);
					((PredicateContext)_localctx).NOT = match(NOT);
					}
				}

				setState(565);
				match(LIKE);
				setState(566);
				((PredicateContext)_localctx).simpleExpr = simpleExpr(0);
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(567);
					((PredicateContext)_localctx).ESCAPE = match(ESCAPE);
					setState(568);
					((PredicateContext)_localctx).escapeExpr = ((PredicateContext)_localctx).simpleExpr = simpleExpr(0);
					}
					break;
				}

				        ((PredicateContext)_localctx).v =  ((PredicateContext)_localctx).bitExpr.v;
				        if(((PredicateContext)_localctx).NOT != null) {
				          _localctx.v.append(" NOT");
				        }
				        _localctx.v.append(" LIKE ");
				        _localctx.v.append(((PredicateContext)_localctx).simpleExpr.v);
				        if (((PredicateContext)_localctx).ESCAPE != null) {
				          _localctx.v.append(" ESCAPE ");
				          _localctx.v.append(((PredicateContext)_localctx).escapeExpr.v);
				        }
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(573);
				((PredicateContext)_localctx).left = bitExpr(0);
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(574);
					((PredicateContext)_localctx).NOT = match(NOT);
					}
				}

				setState(577);
				match(REGEXP);
				setState(578);
				((PredicateContext)_localctx).right = bitExpr(0);

				        ((PredicateContext)_localctx).v =  ((PredicateContext)_localctx).left.v;
				        if(((PredicateContext)_localctx).NOT != null) {
				            _localctx.v.append(" NOT");
				        }
				        _localctx.v.append(" REGEXP ");
				        _localctx.v.append(((PredicateContext)_localctx).right.v);
				  
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(581);
				((PredicateContext)_localctx).bitExpr = bitExpr(0);

				        ((PredicateContext)_localctx).v =  ((PredicateContext)_localctx).bitExpr.v;
				        ((PredicateContext)_localctx).c =  ((PredicateContext)_localctx).bitExpr.c;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public StringBuilder v;
		public StringBuilder c;
		public BitExprContext left;
		public SimpleExprContext simpleExpr;
		public BitExprOperatorContext bitExprOperator;
		public BitExprContext right;
		public BitExprContext bitExpr;
		public IntervalExpressionContext intervalExpression;
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public BitExprOperatorContext bitExprOperator() {
			return getRuleContext(BitExprOperatorContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(TestParser.PLUS, 0); }
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(TestParser.MINUS, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(587);
			((BitExprContext)_localctx).simpleExpr = simpleExpr(0);

			        ((BitExprContext)_localctx).v =  ((BitExprContext)_localctx).simpleExpr.v;
			        ((BitExprContext)_localctx).c =  ((BitExprContext)_localctx).simpleExpr.c;
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(605);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(590);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(591);
						((BitExprContext)_localctx).bitExprOperator = bitExprOperator();
						setState(592);
						((BitExprContext)_localctx).right = ((BitExprContext)_localctx).bitExpr = bitExpr(5);

						                  ((BitExprContext)_localctx).v =  ((BitExprContext)_localctx).left.v;
						                  _localctx.v.append(" ");
						                  _localctx.v.append((((BitExprContext)_localctx).bitExprOperator!=null?_input.getText(((BitExprContext)_localctx).bitExprOperator.start,((BitExprContext)_localctx).bitExprOperator.stop):null));
						                  _localctx.v.append(" ");
						                  _localctx.v.append(((BitExprContext)_localctx).right.v);
						              
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(595);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(596);
						match(PLUS);
						setState(597);
						((BitExprContext)_localctx).intervalExpression = intervalExpression();

						                  ((BitExprContext)_localctx).v =  ((BitExprContext)_localctx).left.v;
						                  _localctx.v.append(" + ");
						                  _localctx.v.append(((BitExprContext)_localctx).intervalExpression.v);
						              
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(600);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(601);
						match(MINUS);
						setState(602);
						((BitExprContext)_localctx).intervalExpression = intervalExpression();

						                  ((BitExprContext)_localctx).v =  ((BitExprContext)_localctx).bitExpr.v;
						                  _localctx.v.append(" - ");
						                  _localctx.v.append(((BitExprContext)_localctx).intervalExpression.v);
						              
						}
						break;
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitExprOperatorContext extends ParserRuleContext {
		public TerminalNode BIT_OR_OP() { return getToken(TestParser.BIT_OR_OP, 0); }
		public TerminalNode BIT_AND_OP() { return getToken(TestParser.BIT_AND_OP, 0); }
		public List<TerminalNode> LESS_SYMBOL() { return getTokens(TestParser.LESS_SYMBOL); }
		public TerminalNode LESS_SYMBOL(int i) {
			return getToken(TestParser.LESS_SYMBOL, i);
		}
		public List<TerminalNode> GREATER_SYMBOL() { return getTokens(TestParser.GREATER_SYMBOL); }
		public TerminalNode GREATER_SYMBOL(int i) {
			return getToken(TestParser.GREATER_SYMBOL, i);
		}
		public TerminalNode PLUS() { return getToken(TestParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TestParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(TestParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(TestParser.DIVIDE, 0); }
		public TerminalNode DIV() { return getToken(TestParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TestParser.MOD, 0); }
		public TerminalNode MODULE() { return getToken(TestParser.MODULE, 0); }
		public TerminalNode BIT_XOR_OP() { return getToken(TestParser.BIT_XOR_OP, 0); }
		public BitExprOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExprOperator; }
	}

	public final BitExprOperatorContext bitExprOperator() throws RecognitionException {
		BitExprOperatorContext _localctx = new BitExprOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bitExprOperator);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIT_OR_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(BIT_OR_OP);
				}
				break;
			case BIT_AND_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(BIT_AND_OP);
				}
				break;
			case LESS_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				match(LESS_SYMBOL);
				setState(613);
				match(LESS_SYMBOL);
				}
				break;
			case GREATER_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				match(GREATER_SYMBOL);
				setState(615);
				match(GREATER_SYMBOL);
				setState(616);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(617);
				match(MINUS);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(618);
				match(STAR);
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 7);
				{
				setState(619);
				match(DIVIDE);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 8);
				{
				setState(620);
				match(DIV);
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 9);
				{
				setState(621);
				match(MOD);
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 10);
				{
				setState(622);
				match(MODULE);
				}
				break;
			case BIT_XOR_OP:
				enterOuterAlt(_localctx, 11);
				{
				setState(623);
				match(BIT_XOR_OP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public StringBuilder v;
		public StringBuilder c = new StringBuilder();
		public LiteralContext literal;
		public FullColumnNameContext fullColumnName;
		public FunctionCallContext functionCall;
		public VariableContext variable;
		public SimpleExprOperatorContext simpleExprOperator;
		public SimpleExprContext simpleExpr;
		public ExprsContext exprs;
		public ExprContext expr;
		public SubqueryContext subquery;
		public MatchExpressionContext matchExpression;
		public IntervalExpressionContext intervalExpression;
		public CollationNameContext collationName;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode QUESTION_MARK() { return getToken(TestParser.QUESTION_MARK, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SimpleExprOperatorContext simpleExprOperator() {
			return getRuleContext(SimpleExprOperatorContext.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public TerminalNode ROW() { return getToken(TestParser.ROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(TestParser.COMMA, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(TestParser.EXISTS, 0); }
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public List<TerminalNode> BIT_OR_OP() { return getTokens(TestParser.BIT_OR_OP); }
		public TerminalNode BIT_OR_OP(int i) {
			return getToken(TestParser.BIT_OR_OP, i);
		}
		public TerminalNode COLLATE() { return getToken(TestParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(627);
				((SimpleExprContext)_localctx).literal = literal();

				        ((SimpleExprContext)_localctx).v =  new StringBuilder((((SimpleExprContext)_localctx).literal!=null?_input.getText(((SimpleExprContext)_localctx).literal.start,((SimpleExprContext)_localctx).literal.stop):null));
				    
				}
				break;
			case 2:
				{
				setState(630);
				((SimpleExprContext)_localctx).fullColumnName = fullColumnName();

				        ((SimpleExprContext)_localctx).v =  ((SimpleExprContext)_localctx).fullColumnName.v;
				        ((SimpleExprContext)_localctx).c =  ((SimpleExprContext)_localctx).fullColumnName.v;
				    
				}
				break;
			case 3:
				{
				setState(633);
				((SimpleExprContext)_localctx).functionCall = functionCall();

				        ((SimpleExprContext)_localctx).v =  ((SimpleExprContext)_localctx).functionCall.v;
				    
				}
				break;
			case 4:
				{
				setState(636);
				match(QUESTION_MARK);

				        ((SimpleExprContext)_localctx).v =  new StringBuilder("?");
				    
				}
				break;
			case 5:
				{
				setState(638);
				((SimpleExprContext)_localctx).variable = variable();

				        ((SimpleExprContext)_localctx).v =  new StringBuilder((((SimpleExprContext)_localctx).variable!=null?_input.getText(((SimpleExprContext)_localctx).variable.start,((SimpleExprContext)_localctx).variable.stop):null));
				    
				}
				break;
			case 6:
				{
				setState(641);
				((SimpleExprContext)_localctx).simpleExprOperator = simpleExprOperator();
				setState(642);
				((SimpleExprContext)_localctx).simpleExpr = simpleExpr(8);

				        ((SimpleExprContext)_localctx).v =  new StringBuilder((((SimpleExprContext)_localctx).simpleExprOperator!=null?_input.getText(((SimpleExprContext)_localctx).simpleExprOperator.start,((SimpleExprContext)_localctx).simpleExprOperator.stop):null));
				        _localctx.v.append(" ");
				        _localctx.v.append(((SimpleExprContext)_localctx).simpleExpr.v);
				    
				}
				break;
			case 7:
				{
				setState(645);
				match(LP);
				setState(646);
				((SimpleExprContext)_localctx).exprs = exprs();
				setState(647);
				match(RP);

				        ((SimpleExprContext)_localctx).v =  new StringBuilder("(");
				        _localctx.v.append(((SimpleExprContext)_localctx).exprs.v);
				        _localctx.v.append(")");
				    
				}
				break;
			case 8:
				{
				setState(650);
				match(ROW);
				setState(651);
				match(LP);
				setState(652);
				((SimpleExprContext)_localctx).expr = expr(0);
				setState(653);
				match(COMMA);
				setState(654);
				((SimpleExprContext)_localctx).exprs = exprs();
				setState(655);
				match(RP);

				        ((SimpleExprContext)_localctx).v =  new StringBuilder("ROW(");
				        _localctx.v.append(((SimpleExprContext)_localctx).expr.v);
				        _localctx.v.append(",");
				        _localctx.v.append(((SimpleExprContext)_localctx).exprs.v);
				        _localctx.v.append(")");
				    
				}
				break;
			case 9:
				{
				setState(658);
				((SimpleExprContext)_localctx).subquery = subquery();

				        ((SimpleExprContext)_localctx).v =  ((SimpleExprContext)_localctx).subquery.v;
				    
				}
				break;
			case 10:
				{
				setState(661);
				match(EXISTS);
				setState(662);
				((SimpleExprContext)_localctx).subquery = subquery();

				        ((SimpleExprContext)_localctx).v =  new StringBuilder("EXISTS ");
				        _localctx.v.append(((SimpleExprContext)_localctx).subquery.v);
				    
				}
				break;
			case 11:
				{
				setState(665);
				((SimpleExprContext)_localctx).matchExpression = matchExpression();

				        ((SimpleExprContext)_localctx).v =  ((SimpleExprContext)_localctx).matchExpression.v;
				    
				}
				break;
			case 12:
				{
				setState(668);
				caseExpression();

				        ((SimpleExprContext)_localctx).v =  new StringBuilder();
				    
				}
				break;
			case 13:
				{
				setState(671);
				((SimpleExprContext)_localctx).intervalExpression = intervalExpression();

				        ((SimpleExprContext)_localctx).v =  ((SimpleExprContext)_localctx).intervalExpression.v;
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(687);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(676);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(677);
						match(BIT_OR_OP);
						setState(678);
						match(BIT_OR_OP);
						setState(679);
						((SimpleExprContext)_localctx).simpleExpr = simpleExpr(10);

						                  ((SimpleExprContext)_localctx).v =  ((SimpleExprContext)_localctx).simpleExpr.v;
						                  _localctx.v.append(" || ");
						                  _localctx.v.append(((SimpleExprContext)_localctx).simpleExpr.v);
						              
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(682);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(683);
						match(COLLATE);
						setState(684);
						((SimpleExprContext)_localctx).collationName = collationName();

						                  ((SimpleExprContext)_localctx).v =  ((SimpleExprContext)_localctx).simpleExpr.v;
						                  _localctx.v.append(" COLLATE ");
						                  _localctx.v.append((((SimpleExprContext)_localctx).collationName!=null?_input.getText(((SimpleExprContext)_localctx).collationName.start,((SimpleExprContext)_localctx).collationName.stop):null));
						              
						}
						break;
					}
					} 
				}
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TestParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TestParser.MINUS, 0); }
		public TerminalNode BIT_NOT_OP() { return getToken(TestParser.BIT_NOT_OP, 0); }
		public TerminalNode BINARY() { return getToken(TestParser.BINARY, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(TestParser.EXCLAMATION_SYMBOL, 0); }
		public SimpleExprOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprOperator; }
	}

	public final SimpleExprOperatorContext simpleExprOperator() throws RecognitionException {
		SimpleExprOperatorContext _localctx = new SimpleExprOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleExprOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_la = _input.LA(1);
			if ( !(_la==BINARY || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (PLUS - 188)) | (1L << (MINUS - 188)) | (1L << (EXCLAMATION_SYMBOL - 188)) | (1L << (BIT_NOT_OP - 188)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public StringBuilder v;
		public UidContext uid;
		public AggregationFunctionNameContext aggregationFunctionName;
		public ExprsContext exprs;
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case REVERSE_QUOTE_ID:
				{
				setState(694);
				((FunctionCallContext)_localctx).uid = uid();
				}
				break;
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_XOR:
				{
				setState(695);
				((FunctionCallContext)_localctx).aggregationFunctionName = aggregationFunctionName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(698);
			match(LP);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXISTS) | (1L << BINARY) | (1L << QUESTION_MARK) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << COUNT) | (1L << AVG) | (1L << BIT_XOR) | (1L << ROW) | (1L << MATCH))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (NULL - 90)) | (1L << (NOT - 90)) | (1L << (TRUE - 90)) | (1L << (FALSE - 90)) | (1L << (CASE - 90)) | (1L << (INTERVAL - 90)))) != 0) || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (PLUS - 188)) | (1L << (MINUS - 188)) | (1L << (EXCLAMATION_SYMBOL - 188)) | (1L << (BIT_NOT_OP - 188)) | (1L << (LP - 188)) | (1L << (AT_SIGN - 188)) | (1L << (UNDERSCORE - 188)) | (1L << (N_SYMB - 188)) | (1L << (ID - 188)) | (1L << (REVERSE_QUOTE_ID - 188)) | (1L << (SINGLE_QUOTED_TEXT - 188)) | (1L << (DOUBLE_QUOTED_TEXT - 188)) | (1L << (NUMBER_LITERAL - 188)) | (1L << (DATE_AND_TIME_LITERAL - 188)))) != 0)) {
				{
				setState(699);
				((FunctionCallContext)_localctx).exprs = exprs();
				}
			}

			setState(702);
			match(RP);

			      if (((FunctionCallContext)_localctx).uid != null) {
			          ((FunctionCallContext)_localctx).v =  new StringBuilder((((FunctionCallContext)_localctx).uid!=null?_input.getText(((FunctionCallContext)_localctx).uid.start,((FunctionCallContext)_localctx).uid.stop):null));
			      } else {
			          ((FunctionCallContext)_localctx).v =  new StringBuilder((((FunctionCallContext)_localctx).aggregationFunctionName!=null?_input.getText(((FunctionCallContext)_localctx).aggregationFunctionName.start,((FunctionCallContext)_localctx).aggregationFunctionName.stop):null));
			      }
			      _localctx.v.append("(");
			        if(((FunctionCallContext)_localctx).exprs != null){
			            _localctx.v.append(((FunctionCallContext)_localctx).exprs.v);
			        }
			      _localctx.v.append(")");
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(TestParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(TestParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(TestParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(TestParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(TestParser.AVG, 0); }
		public TerminalNode BIT_XOR() { return getToken(TestParser.BIT_XOR, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << COUNT) | (1L << AVG) | (1L << BIT_XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollationNameContext extends ParserRuleContext {
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TerminalNode UNDERSCORE() { return getToken(TestParser.UNDERSCORE, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_collationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			uid();
			setState(708);
			match(UNDERSCORE);
			setState(709);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> AT_SIGN() { return getTokens(TestParser.AT_SIGN); }
		public TerminalNode AT_SIGN(int i) {
			return getToken(TestParser.AT_SIGN, i);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variable);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				match(AT_SIGN);
				setState(712);
				uid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				match(AT_SIGN);
				setState(714);
				match(AT_SIGN);
				setState(715);
				uid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchExpressionContext extends ParserRuleContext {
		public StringBuilder v;
		public FullColumnNameListContext fullColumnNameList;
		public ExprContext expr;
		public SearchModifierContext searchModifier;
		public TerminalNode MATCH() { return getToken(TestParser.MATCH, 0); }
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public FullColumnNameListContext fullColumnNameList() {
			return getRuleContext(FullColumnNameListContext.class,0);
		}
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public TerminalNode AGAINST() { return getToken(TestParser.AGAINST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SearchModifierContext searchModifier() {
			return getRuleContext(SearchModifierContext.class,0);
		}
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_matchExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(MATCH);
			setState(719);
			match(LP);
			setState(720);
			((MatchExpressionContext)_localctx).fullColumnNameList = fullColumnNameList();
			setState(721);
			match(RP);
			setState(722);
			match(AGAINST);
			setState(723);
			((MatchExpressionContext)_localctx).expr = expr(0);
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(724);
				((MatchExpressionContext)_localctx).searchModifier = searchModifier();
				}
				break;
			}

			        ((MatchExpressionContext)_localctx).v =  new StringBuilder("MATCH(");
			        _localctx.v.append(((MatchExpressionContext)_localctx).fullColumnNameList.v);
			        _localctx.v.append(") AGAINST ");
			        _localctx.v.append(((MatchExpressionContext)_localctx).expr.v);
			        if(((MatchExpressionContext)_localctx).searchModifier != null){
			            _localctx.v.append(" ");
			            _localctx.v.append((((MatchExpressionContext)_localctx).searchModifier!=null?_input.getText(((MatchExpressionContext)_localctx).searchModifier.start,((MatchExpressionContext)_localctx).searchModifier.stop):null));
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchModifierContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(TestParser.IN, 0); }
		public TerminalNode NATURAL() { return getToken(TestParser.NATURAL, 0); }
		public TerminalNode LANGUAGE() { return getToken(TestParser.LANGUAGE, 0); }
		public TerminalNode MODE() { return getToken(TestParser.MODE, 0); }
		public TerminalNode WITH() { return getToken(TestParser.WITH, 0); }
		public TerminalNode QUERY() { return getToken(TestParser.QUERY, 0); }
		public TerminalNode EXPANSION() { return getToken(TestParser.EXPANSION, 0); }
		public TerminalNode BOOLEAN() { return getToken(TestParser.BOOLEAN, 0); }
		public SearchModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchModifier; }
	}

	public final SearchModifierContext searchModifier() throws RecognitionException {
		SearchModifierContext _localctx = new SearchModifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_searchModifier);
		try {
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(IN);
				setState(730);
				match(NATURAL);
				setState(731);
				match(LANGUAGE);
				setState(732);
				match(MODE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				match(IN);
				setState(734);
				match(NATURAL);
				setState(735);
				match(LANGUAGE);
				setState(736);
				match(MODE);
				setState(737);
				match(WITH);
				setState(738);
				match(QUERY);
				setState(739);
				match(EXPANSION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				match(IN);
				setState(741);
				match(BOOLEAN);
				setState(742);
				match(MODE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(743);
				match(WITH);
				setState(744);
				match(QUERY);
				setState(745);
				match(EXPANSION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpressionContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(TestParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(TestParser.CASE, i);
		}
		public List<TerminalNode> END() { return getTokens(TestParser.END); }
		public TerminalNode END(int i) {
			return getToken(TestParser.END, i);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(CASE);
			setState(750); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(749);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==CASE || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(752); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << SPEC_MYSQL_COMMENT) | (1L << COMMENT_INPUT) | (1L << LINE_COMMENT) | (1L << WITH) | (1L << RECURSIVE) | (1L << FROM) | (1L << EXISTS) | (1L << WHERE) | (1L << DOTSTAR) | (1L << BINARY) | (1L << STARTING) | (1L << MODE) | (1L << SKIP_) | (1L << LOCKED) | (1L << NOWAIT) | (1L << SHARE) | (1L << QUESTION_MARK) | (1L << TERMINATED) | (1L << CHARACTER) | (1L << COLUMNS) | (1L << LINES) | (1L << OPTIONALLY) | (1L << ENCLOSED) | (1L << ESCAPED) | (1L << AS) | (1L << USE) | (1L << IGNORE) | (1L << FORCE) | (1L << INDEX) | (1L << KEY) | (1L << JOIN) | (1L << BY) | (1L << WINDOW) | (1L << OFFSET) | (1L << OUTFILE) | (1L << COLLATE) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << COUNT) | (1L << AVG) | (1L << BIT_XOR) | (1L << BIT_AND) | (1L << BIT_OR) | (1L << GROUP_CONCAT) | (1L << JSON_ARRAYAGG) | (1L << JSON_OBJECTAGG) | (1L << STD) | (1L << STDDEV) | (1L << STDDEV_POP) | (1L << STDDEV_SAMP) | (1L << VAR_POP) | (1L << VAR_SAMP) | (1L << VARIANCE) | (1L << OVER) | (1L << ROWS) | (1L << ROW) | (1L << LANGUAGE) | (1L << QUERY) | (1L << EXPANSION) | (1L << MATCH) | (1L << AGAINST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOLEAN - 64)) | (1L << (RANGE - 64)) | (1L << (CURRENT - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (ORDER - 64)) | (1L << (FOR - 64)) | (1L << (LOCK - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (LIMIT - 64)) | (1L << (INNER - 64)) | (1L << (CROSS - 64)) | (1L << (LEFT - 64)) | (1L << (RIGHT - 64)) | (1L << (ON - 64)) | (1L << (USING - 64)) | (1L << (STRAIGHT_JOIN - 64)) | (1L << (OUTER - 64)) | (1L << (NATURAL - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTINCTROW - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (XOR - 64)) | (1L << (NULL - 64)) | (1L << (NOT - 64)) | (1L << (IS - 64)) | (1L << (IN - 64)) | (1L << (LIKE - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNKNOWN - 64)) | (1L << (ALL - 64)) | (1L << (ANY - 64)) | (1L << (SOME - 64)) | (1L << (BETWEEN - 64)) | (1L << (MEMBER - 64)) | (1L << (ESCAPE - 64)) | (1L << (OF - 64)) | (1L << (UNION - 64)) | (1L << (INSERT - 64)) | (1L << (LOW_PRIORITY - 64)) | (1L << (DELAYED - 64)) | (1L << (HIGH_PRIORITY - 64)) | (1L << (INTO - 64)) | (1L << (SELECT - 64)) | (1L << (DELETE - 64)) | (1L << (VALUE - 64)) | (1L << (VALUES - 64)) | (1L << (PARTITION - 64)) | (1L << (TABLE - 64)) | (1L << (DUPLICATE - 64)) | (1L << (DEFAULT - 64)) | (1L << (UPDATE - 64)) | (1L << (SET - 64)) | (1L << (REGEXP - 64)) | (1L << (RLIKE - 64)) | (1L << (ASC - 64)) | (1L << (DESC - 64)) | (1L << (SOUNDS - 64)) | (1L << (WHEN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (IF - 128)) | (1L << (LOCALTIME - 128)) | (1L << (LOCALTIMESTAMP - 128)) | (1L << (REPLACE - 128)) | (1L << (INTERVAL - 128)) | (1L << (DATABASE - 128)) | (1L << (SCHEMA - 128)) | (1L << (DATE - 128)) | (1L << (DAY - 128)) | (1L << (GEOMETRYCOLLECTION - 128)) | (1L << (LINESTRING - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TIMESTAMP_ADD - 128)) | (1L << (TIMESTAMP_DIFF - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (UTC_TIMESTAMP - 128)) | (1L << (LAST_DAY - 128)) | (1L << (MICROSECOND - 128)) | (1L << (SECOND - 128)) | (1L << (MINUTE - 128)) | (1L << (HOUR - 128)) | (1L << (WEEK - 128)) | (1L << (MONTH - 128)) | (1L << (QUARTER - 128)) | (1L << (YEAR - 128)) | (1L << (SECOND_MICROSECOND - 128)) | (1L << (MINUTE_MICROSECOND - 128)) | (1L << (MINUTE_SECOND - 128)) | (1L << (HOUR_MICROSECOND - 128)) | (1L << (HOUR_SECOND - 128)) | (1L << (HOUR_MINUTE - 128)) | (1L << (DAY_MICROSECOND - 128)) | (1L << (DAY_SECOND - 128)) | (1L << (DAY_MINUTE - 128)) | (1L << (DAY_HOUR - 128)) | (1L << (YEAR_MONTH - 128)) | (1L << (SEPARATOR - 128)) | (1L << (VAR_ASSIGN - 128)) | (1L << (PLUS_ASSIGN - 128)) | (1L << (MINUS_ASSIGN - 128)) | (1L << (MULT_ASSIGN - 128)) | (1L << (DIV_ASSIGN - 128)) | (1L << (MOD_ASSIGN - 128)) | (1L << (AND_ASSIGN - 128)) | (1L << (XOR_ASSIGN - 128)) | (1L << (OR_ASSIGN - 128)) | (1L << (STAR - 128)) | (1L << (DIVIDE - 128)) | (1L << (MODULE - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (DIV - 128)) | (1L << (MOD - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EQUAL_SYMBOL - 192)) | (1L << (GREATER_SYMBOL - 192)) | (1L << (LESS_SYMBOL - 192)) | (1L << (EXCLAMATION_SYMBOL - 192)) | (1L << (BIT_NOT_OP - 192)) | (1L << (BIT_OR_OP - 192)) | (1L << (BIT_AND_OP - 192)) | (1L << (BIT_XOR_OP - 192)) | (1L << (DOT - 192)) | (1L << (LP - 192)) | (1L << (RP - 192)) | (1L << (COMMA - 192)) | (1L << (SEMI - 192)) | (1L << (AT_SIGN - 192)) | (1L << (SINGLE_QUOTE_SYMB - 192)) | (1L << (DOUBLE_QUOTE_SYMB - 192)) | (1L << (REVERSE_QUOTE_SYMB - 192)) | (1L << (COLON_SYMB - 192)) | (1L << (UNDERSCORE - 192)) | (1L << (N_SYMB - 192)) | (1L << (ID - 192)) | (1L << (REVERSE_QUOTE_ID - 192)) | (1L << (SINGLE_QUOTED_TEXT - 192)) | (1L << (DOUBLE_QUOTED_TEXT - 192)) | (1L << (NUMBER_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (FLOAT_LITERAL - 192)) | (1L << (EXPONENT - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (DATE_AND_TIME_LITERAL - 192)) | (1L << (DATE_LITERAL - 192)) | (1L << (DATETIME_LITERAL - 192)) | (1L << (TIMESTAMP_LITERAL - 192)) | (1L << (TIME_LITERAL - 192)) | (1L << (YEAR_LITERAL - 192)) | (1L << (DIGIT - 192)))) != 0) );
			setState(754);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalExpressionContext extends ParserRuleContext {
		public StringBuilder v;
		public ExprContext expr;
		public Token interval;
		public TerminalNode INTERVAL() { return getToken(TestParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_intervalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(INTERVAL);
			setState(757);
			((IntervalExpressionContext)_localctx).expr = expr(0);
			setState(758);
			((IntervalExpressionContext)_localctx).interval = matchWildcard();

			        ((IntervalExpressionContext)_localctx).v =  new StringBuilder("INTERVAL ");
			        _localctx.v.append(((IntervalExpressionContext)_localctx).expr.v);
			        _localctx.v.append(" ");
			        _localctx.v.append((((IntervalExpressionContext)_localctx).interval!=null?((IntervalExpressionContext)_localctx).interval.getText():null));
			  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public StringBuilder v;
		public FullIdContext fullId;
		public UidListContext columns;
		public TerminalNode INSERT() { return getToken(TestParser.INSERT, 0); }
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public InsertResultClauseContext insertResultClause() {
			return getRuleContext(InsertResultClauseContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(TestParser.IGNORE, 0); }
		public TerminalNode INTO() { return getToken(TestParser.INTO, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public TerminalNode LP() { return getToken(TestParser.LP, 0); }
		public TerminalNode RP() { return getToken(TestParser.RP, 0); }
		public TerminalNode AS() { return getToken(TestParser.AS, 0); }
		public List<UidListContext> uidList() {
			return getRuleContexts(UidListContext.class);
		}
		public UidListContext uidList(int i) {
			return getRuleContext(UidListContext.class,i);
		}
		public OnDuplicateKeyUpdateStatementContext onDuplicateKeyUpdateStatement() {
			return getRuleContext(OnDuplicateKeyUpdateStatementContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(TestParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(TestParser.DELAYED, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(TestParser.HIGH_PRIORITY, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(INSERT);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (LOW_PRIORITY - 107)) | (1L << (DELAYED - 107)) | (1L << (HIGH_PRIORITY - 107)))) != 0)) {
				{
				setState(762);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & ((1L << (LOW_PRIORITY - 107)) | (1L << (DELAYED - 107)) | (1L << (HIGH_PRIORITY - 107)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(765);
				match(IGNORE);
				}
			}

			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(768);
				match(INTO);
				}
			}

			setState(771);
			((InsertContext)_localctx).fullId = fullId();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(772);
				partitionClause();
				}
			}

			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(775);
				match(LP);
				setState(776);
				((InsertContext)_localctx).columns = uidList();
				setState(777);
				match(RP);
				}
			}

			setState(781);
			insertResultClause();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(782);
				match(AS);
				setState(783);
				uidList();
				}
			}

			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(786);
				onDuplicateKeyUpdateStatement();
				}
			}


			        ((InsertContext)_localctx).v =  new StringBuilder("INSERT ");
			        _localctx.v.append((((InsertContext)_localctx).fullId!=null?_input.getText(((InsertContext)_localctx).fullId.start,((InsertContext)_localctx).fullId.stop):null));
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnDuplicateKeyUpdateStatementContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(TestParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(TestParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(TestParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(TestParser.UPDATE, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public OnDuplicateKeyUpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDuplicateKeyUpdateStatement; }
	}

	public final OnDuplicateKeyUpdateStatementContext onDuplicateKeyUpdateStatement() throws RecognitionException {
		OnDuplicateKeyUpdateStatementContext _localctx = new OnDuplicateKeyUpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_onDuplicateKeyUpdateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(ON);
			setState(792);
			match(DUPLICATE);
			setState(793);
			match(KEY);
			setState(794);
			match(UPDATE);
			setState(795);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertResultClauseContext extends ParserRuleContext {
		public StringBuilder v;
		public SelectContext select;
		public FullIdContext fullId;
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(TestParser.TABLE, 0); }
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public Skip_codeContext skip_code() {
			return getRuleContext(Skip_codeContext.class,0);
		}
		public TerminalNode SET() { return getToken(TestParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public InsertResultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertResultClause; }
	}

	public final InsertResultClauseContext insertResultClause() throws RecognitionException {
		InsertResultClauseContext _localctx = new InsertResultClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_insertResultClause);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				((InsertResultClauseContext)_localctx).select = select();

				        ((InsertResultClauseContext)_localctx).v =  ((InsertResultClauseContext)_localctx).select.v;
				    
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(800);
				match(TABLE);
				setState(801);
				((InsertResultClauseContext)_localctx).fullId = fullId();
				}

				      ((InsertResultClauseContext)_localctx).v =  new StringBuilder("TABLE ");
				      _localctx.v.append((((InsertResultClauseContext)_localctx).fullId!=null?_input.getText(((InsertResultClauseContext)_localctx).fullId.start,((InsertResultClauseContext)_localctx).fullId.stop):null)) ;
				    
				}
				break;
			case AS:
			case VALUE:
			case VALUES:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				skip_code();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				match(SET);
				setState(807);
				assignmentList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public UpdatedElementContext duplicatedFirst;
		public UpdatedElementContext updatedElement;
		public List<UpdatedElementContext> duplicatedElements = new ArrayList<UpdatedElementContext>();
		public List<UpdatedElementContext> updatedElement() {
			return getRuleContexts(UpdatedElementContext.class);
		}
		public UpdatedElementContext updatedElement(int i) {
			return getRuleContext(UpdatedElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			((AssignmentListContext)_localctx).duplicatedFirst = updatedElement();
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(811);
				match(COMMA);
				setState(812);
				((AssignmentListContext)_localctx).updatedElement = updatedElement();
				((AssignmentListContext)_localctx).duplicatedElements.add(((AssignmentListContext)_localctx).updatedElement);
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdatedElementContext extends ParserRuleContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode EQUAL_SYMBOL() { return getToken(TestParser.EQUAL_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(TestParser.DEFAULT, 0); }
		public UpdatedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatedElement; }
	}

	public final UpdatedElementContext updatedElement() throws RecognitionException {
		UpdatedElementContext _localctx = new UpdatedElementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_updatedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			fullColumnName();
			setState(819);
			match(EQUAL_SYMBOL);
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXISTS:
			case BINARY:
			case QUESTION_MARK:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_XOR:
			case ROW:
			case MATCH:
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case CASE:
			case INTERVAL:
			case PLUS:
			case MINUS:
			case EXCLAMATION_SYMBOL:
			case BIT_NOT_OP:
			case LP:
			case AT_SIGN:
			case UNDERSCORE:
			case N_SYMB:
			case ID:
			case REVERSE_QUOTE_ID:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case NUMBER_LITERAL:
			case DATE_AND_TIME_LITERAL:
				{
				setState(820);
				expr(0);
				}
				break;
			case DEFAULT:
				{
				setState(821);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(TestParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(TestParser.BY, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(PARTITION);
			setState(825);
			match(BY);
			setState(826);
			exprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public StringBuilder v;
		public WithClauseContext withClause;
		public TableSourcesContext tableSources;
		public WhereClauseContext whereClause;
		public OrderByClauseContext orderByClause;
		public LimitClauseContext limitClause;
		public TerminalNode UPDATE() { return getToken(TestParser.UPDATE, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public TerminalNode SET() { return getToken(TestParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode LOW_PRIORITY() { return getToken(TestParser.LOW_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(TestParser.IGNORE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(828);
				((UpdateContext)_localctx).withClause = withClause();
				}
			}

			setState(831);
			match(UPDATE);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(832);
				match(LOW_PRIORITY);
				}
			}

			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(835);
				match(IGNORE);
				}
			}

			setState(838);
			((UpdateContext)_localctx).tableSources = tableSources();
			setState(839);
			match(SET);
			setState(840);
			assignmentList();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(841);
				((UpdateContext)_localctx).whereClause = whereClause();
				}
			}

			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(844);
				((UpdateContext)_localctx).orderByClause = orderByClause();
				}
			}

			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(847);
				((UpdateContext)_localctx).limitClause = limitClause();
				}
			}


			        if(((UpdateContext)_localctx).withClause != null){
			           ((UpdateContext)_localctx).v =  ((UpdateContext)_localctx).withClause.v;
			           _localctx.v.append(",");
			        } else {
			           ((UpdateContext)_localctx).v =  new StringBuilder();
			        }
			        _localctx.v.append("UPDATE ") ;
			        _localctx.v.append(((UpdateContext)_localctx).tableSources.v);
			        if(((UpdateContext)_localctx).whereClause != null){
			           _localctx.v.append(" ");
			           _localctx.v.append(((UpdateContext)_localctx).whereClause.v);
			        }
			        if(((UpdateContext)_localctx).orderByClause != null){
			           _localctx.v.append(" ");
			           _localctx.v.append(((UpdateContext)_localctx).orderByClause.v);
			        }
			        if(((UpdateContext)_localctx).limitClause != null){
			           _localctx.v.append(" ");
			           _localctx.v.append(((UpdateContext)_localctx).limitClause.v);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public StringBuilder v;
		public TableSourcesContext case1;
		public UidContext uid;
		public List<UidContext> uids = new ArrayList<UidContext>();
		public WhereClauseContext whereClause;
		public OrderByClauseContext orderByClause;
		public LimitClauseContext limitClause;
		public List<TerminalNode> DELETE() { return getTokens(TestParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(TestParser.DELETE, i);
		}
		public List<TerminalNode> FROM() { return getTokens(TestParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(TestParser.FROM, i);
		}
		public List<TerminalNode> DOTSTAR() { return getTokens(TestParser.DOTSTAR); }
		public TerminalNode DOTSTAR(int i) {
			return getToken(TestParser.DOTSTAR, i);
		}
		public TerminalNode USING() { return getToken(TestParser.USING, 0); }
		public TableSourcesContext tableSources() {
			return getRuleContext(TableSourcesContext.class,0);
		}
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_delete);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(DELETE);
			setState(857);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(855);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						setState(853);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==DELETE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(854);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==FROM) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(859);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(860);
			match(FROM);
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(861);
				((DeleteContext)_localctx).case1 = tableSources();
				}
				break;
			case 2:
				{
				setState(862);
				((DeleteContext)_localctx).uid = uid();
				((DeleteContext)_localctx).uids.add(((DeleteContext)_localctx).uid);
				setState(863);
				match(DOTSTAR);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(864);
					match(COMMA);
					setState(865);
					((DeleteContext)_localctx).uid = uid();
					((DeleteContext)_localctx).uids.add(((DeleteContext)_localctx).uid);
					setState(866);
					match(DOTSTAR);
					}
					}
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(873);
				match(USING);
				setState(874);
				tableSources();
				}
				break;
			}
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(878);
				partitionClause();
				}
			}

			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(881);
				((DeleteContext)_localctx).whereClause = whereClause();
				}
			}

			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(884);
				((DeleteContext)_localctx).orderByClause = orderByClause();
				}
			}

			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(887);
				((DeleteContext)_localctx).limitClause = limitClause();
				}
			}


			        ((DeleteContext)_localctx).v =  new StringBuilder("DELETE ");
			        if (((DeleteContext)_localctx).case1 != null) {
			            _localctx.v.append(((DeleteContext)_localctx).case1.v);
			        } else {
			            for (UidContext o : ((DeleteContext)_localctx).uids) {
			                _localctx.v.append(o.v);
			                _localctx.v.append(".*,");
			            }
			            _localctx.v.deleteCharAt(_localctx.v.length() - 2);
			        }

			        if(((DeleteContext)_localctx).limitClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((DeleteContext)_localctx).limitClause.v);
			        }
			        if(((DeleteContext)_localctx).whereClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((DeleteContext)_localctx).whereClause.v);
			        }
			        if(((DeleteContext)_localctx).orderByClause != null){
			            _localctx.v.append(" ");
			            _localctx.v.append(((DeleteContext)_localctx).orderByClause.v);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UidContext extends ParserRuleContext {
		public StringBuilder v;
		public SimpleIdContext simpleId;
		public Token REVERSE_QUOTE_ID;
		public SimpleIdContext simpleId() {
			return getRuleContext(SimpleIdContext.class,0);
		}
		public TerminalNode REVERSE_QUOTE_ID() { return getToken(TestParser.REVERSE_QUOTE_ID, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_uid);
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				((UidContext)_localctx).simpleId = simpleId();

				        ((UidContext)_localctx).v =  new StringBuilder((((UidContext)_localctx).simpleId!=null?_input.getText(((UidContext)_localctx).simpleId.start,((UidContext)_localctx).simpleId.stop):null));
				    
				}
				break;
			case REVERSE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				((UidContext)_localctx).REVERSE_QUOTE_ID = match(REVERSE_QUOTE_ID);

				        ((UidContext)_localctx).v =  new StringBuilder((((UidContext)_localctx).REVERSE_QUOTE_ID!=null?((UidContext)_localctx).REVERSE_QUOTE_ID.getText():null));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UidListContext extends ParserRuleContext {
		public StringBuilder v;
		public UidContext first;
		public UidContext uid;
		public List<UidContext> others = new ArrayList<UidContext>();
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public UidListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uidList; }
	}

	public final UidListContext uidList() throws RecognitionException {
		UidListContext _localctx = new UidListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_uidList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			((UidListContext)_localctx).first = uid();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(900);
				match(COMMA);
				setState(901);
				((UidListContext)_localctx).uid = uid();
				((UidListContext)_localctx).others.add(((UidListContext)_localctx).uid);
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        ((UidListContext)_localctx).v =  new StringBuilder((((UidListContext)_localctx).first!=null?_input.getText(((UidListContext)_localctx).first.start,((UidListContext)_localctx).first.stop):null));
			        for (UidContext o : ((UidListContext)_localctx).others) {
			            _localctx.v.append(",");
			            _localctx.v.append(o.v);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TestParser.ID, 0); }
		public SimpleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleId; }
	}

	public final SimpleIdContext simpleId() throws RecognitionException {
		SimpleIdContext _localctx = new SimpleIdContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_simpleId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullIdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TestParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TestParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(TestParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TestParser.DOT, i);
		}
		public FullIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullId; }
	}

	public final FullIdContext fullId() throws RecognitionException {
		FullIdContext _localctx = new FullIdContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fullId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(ID);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(912);
				match(DOT);
				setState(913);
				match(ID);
				}
				}
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DottedIdContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(TestParser.DOT, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public DottedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedId; }
	}

	public final DottedIdContext dottedId() throws RecognitionException {
		DottedIdContext _localctx = new DottedIdContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dottedId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(DOT);
			setState(920);
			uid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullColumnNameContext extends ParserRuleContext {
		public StringBuilder v;
		public UidContext uid;
		public DottedIdContext d1;
		public DottedIdContext d2;
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public List<DottedIdContext> dottedId() {
			return getRuleContexts(DottedIdContext.class);
		}
		public DottedIdContext dottedId(int i) {
			return getRuleContext(DottedIdContext.class,i);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fullColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			((FullColumnNameContext)_localctx).uid = uid();
			setState(927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(923);
				((FullColumnNameContext)_localctx).d1 = dottedId();
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(924);
					((FullColumnNameContext)_localctx).d2 = dottedId();
					}
					break;
				}
				}
				break;
			}

			      ((FullColumnNameContext)_localctx).v =  new StringBuilder((((FullColumnNameContext)_localctx).uid!=null?_input.getText(((FullColumnNameContext)_localctx).uid.start,((FullColumnNameContext)_localctx).uid.stop):null));
			      if (((FullColumnNameContext)_localctx).d1 != null) {
			        _localctx.v.append((((FullColumnNameContext)_localctx).d1!=null?_input.getText(((FullColumnNameContext)_localctx).d1.start,((FullColumnNameContext)_localctx).d1.stop):null));
			        if (((FullColumnNameContext)_localctx).d2 != null) {
			          _localctx.v.append((((FullColumnNameContext)_localctx).d2!=null?_input.getText(((FullColumnNameContext)_localctx).d2.start,((FullColumnNameContext)_localctx).d2.stop):null));
			        }
			      }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullColumnNameListContext extends ParserRuleContext {
		public StringBuilder v;
		public List<FullColumnNameContext> fullColumnName() {
			return getRuleContexts(FullColumnNameContext.class);
		}
		public FullColumnNameContext fullColumnName(int i) {
			return getRuleContext(FullColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TestParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TestParser.COMMA, i);
		}
		public FullColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnNameList; }
	}

	public final FullColumnNameListContext fullColumnNameList() throws RecognitionException {
		FullColumnNameListContext _localctx = new FullColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fullColumnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			fullColumnName();
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(932);
				match(COMMA);
				setState(933);
				fullColumnName();
				}
				}
				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullNotnullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(TestParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(TestParser.NOT, 0); }
		public NullNotnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullNotnull; }
	}

	public final NullNotnullContext nullNotnull() throws RecognitionException {
		NullNotnullContext _localctx = new NullNotnullContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nullNotnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(939);
				match(NOT);
				}
			}

			{
			setState(942);
			match(NULL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public UidContext charsetName;
		public TerminalNode SINGLE_QUOTED_TEXT() { return getToken(TestParser.SINGLE_QUOTED_TEXT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(TestParser.UNDERSCORE, 0); }
		public TerminalNode N_SYMB() { return getToken(TestParser.N_SYMB, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_TEXT() { return getToken(TestParser.DOUBLE_QUOTED_TEXT, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_stringLiteral);
		try {
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case N_SYMB:
			case SINGLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNDERSCORE:
					{
					setState(944);
					match(UNDERSCORE);
					setState(945);
					((StringLiteralContext)_localctx).charsetName = uid();
					}
					break;
				case N_SYMB:
					{
					setState(946);
					match(N_SYMB);
					}
					break;
				case SINGLE_QUOTED_TEXT:
					break;
				default:
					break;
				}
				setState(949);
				match(SINGLE_QUOTED_TEXT);
				}
				break;
			case DOUBLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				match(DOUBLE_QUOTED_TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode NUMBER_LITERAL() { return getToken(TestParser.NUMBER_LITERAL, 0); }
		public TerminalNode DATE_AND_TIME_LITERAL() { return getToken(TestParser.DATE_AND_TIME_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(TestParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(TestParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TestParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_literal);
		try {
			setState(963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE:
			case N_SYMB:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				stringLiteral();

				     addLiteralCount();
				  
				}
				break;
			case NUMBER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(NUMBER_LITERAL);

				     addLiteralCount();
				  
				}
				break;
			case DATE_AND_TIME_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(DATE_AND_TIME_LITERAL);

				     addLiteralCount();
				  
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(960);
				match(NULL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(961);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(962);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_codeContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AS() { return getToken(TestParser.AS, 0); }
		public TerminalNode VALUE() { return getToken(TestParser.VALUE, 0); }
		public TerminalNode VALUES() { return getToken(TestParser.VALUES, 0); }
		public Skip_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_code; }
	}

	public final Skip_codeContext skip_code() throws RecognitionException {
		Skip_codeContext _localctx = new Skip_codeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_skip_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_la = _input.LA(1);
			if ( !(_la==AS || _la==VALUE || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(966);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_fromContext extends ParserRuleContext {
		public List<TerminalNode> SELECT() { return getTokens(TestParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(TestParser.SELECT, i);
		}
		public List<TerminalNode> FROM() { return getTokens(TestParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(TestParser.FROM, i);
		}
		public Select_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_from; }
	}

	public final Select_fromContext select_from() throws RecognitionException {
		Select_fromContext _localctx = new Select_fromContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_select_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(SELECT);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << SPEC_MYSQL_COMMENT) | (1L << COMMENT_INPUT) | (1L << LINE_COMMENT) | (1L << WITH) | (1L << RECURSIVE) | (1L << EXISTS) | (1L << WHERE) | (1L << DOTSTAR) | (1L << BINARY) | (1L << STARTING) | (1L << MODE) | (1L << SKIP_) | (1L << LOCKED) | (1L << NOWAIT) | (1L << SHARE) | (1L << QUESTION_MARK) | (1L << TERMINATED) | (1L << CHARACTER) | (1L << COLUMNS) | (1L << LINES) | (1L << OPTIONALLY) | (1L << ENCLOSED) | (1L << ESCAPED) | (1L << AS) | (1L << USE) | (1L << IGNORE) | (1L << FORCE) | (1L << INDEX) | (1L << KEY) | (1L << JOIN) | (1L << BY) | (1L << WINDOW) | (1L << OFFSET) | (1L << OUTFILE) | (1L << COLLATE) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << COUNT) | (1L << AVG) | (1L << BIT_XOR) | (1L << BIT_AND) | (1L << BIT_OR) | (1L << GROUP_CONCAT) | (1L << JSON_ARRAYAGG) | (1L << JSON_OBJECTAGG) | (1L << STD) | (1L << STDDEV) | (1L << STDDEV_POP) | (1L << STDDEV_SAMP) | (1L << VAR_POP) | (1L << VAR_SAMP) | (1L << VARIANCE) | (1L << OVER) | (1L << ROWS) | (1L << ROW) | (1L << LANGUAGE) | (1L << QUERY) | (1L << EXPANSION) | (1L << MATCH) | (1L << AGAINST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOLEAN - 64)) | (1L << (RANGE - 64)) | (1L << (CURRENT - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (ORDER - 64)) | (1L << (FOR - 64)) | (1L << (LOCK - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (LIMIT - 64)) | (1L << (INNER - 64)) | (1L << (CROSS - 64)) | (1L << (LEFT - 64)) | (1L << (RIGHT - 64)) | (1L << (ON - 64)) | (1L << (USING - 64)) | (1L << (STRAIGHT_JOIN - 64)) | (1L << (OUTER - 64)) | (1L << (NATURAL - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTINCTROW - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (XOR - 64)) | (1L << (NULL - 64)) | (1L << (NOT - 64)) | (1L << (IS - 64)) | (1L << (IN - 64)) | (1L << (LIKE - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNKNOWN - 64)) | (1L << (ALL - 64)) | (1L << (ANY - 64)) | (1L << (SOME - 64)) | (1L << (BETWEEN - 64)) | (1L << (MEMBER - 64)) | (1L << (ESCAPE - 64)) | (1L << (OF - 64)) | (1L << (UNION - 64)) | (1L << (INSERT - 64)) | (1L << (LOW_PRIORITY - 64)) | (1L << (DELAYED - 64)) | (1L << (HIGH_PRIORITY - 64)) | (1L << (INTO - 64)) | (1L << (DELETE - 64)) | (1L << (VALUE - 64)) | (1L << (VALUES - 64)) | (1L << (PARTITION - 64)) | (1L << (TABLE - 64)) | (1L << (DUPLICATE - 64)) | (1L << (DEFAULT - 64)) | (1L << (UPDATE - 64)) | (1L << (SET - 64)) | (1L << (REGEXP - 64)) | (1L << (RLIKE - 64)) | (1L << (ASC - 64)) | (1L << (DESC - 64)) | (1L << (SOUNDS - 64)) | (1L << (CASE - 64)) | (1L << (WHEN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (IF - 128)) | (1L << (LOCALTIME - 128)) | (1L << (LOCALTIMESTAMP - 128)) | (1L << (REPLACE - 128)) | (1L << (INTERVAL - 128)) | (1L << (DATABASE - 128)) | (1L << (SCHEMA - 128)) | (1L << (DATE - 128)) | (1L << (DAY - 128)) | (1L << (GEOMETRYCOLLECTION - 128)) | (1L << (LINESTRING - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TIMESTAMP_ADD - 128)) | (1L << (TIMESTAMP_DIFF - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (UTC_TIMESTAMP - 128)) | (1L << (LAST_DAY - 128)) | (1L << (MICROSECOND - 128)) | (1L << (SECOND - 128)) | (1L << (MINUTE - 128)) | (1L << (HOUR - 128)) | (1L << (WEEK - 128)) | (1L << (MONTH - 128)) | (1L << (QUARTER - 128)) | (1L << (YEAR - 128)) | (1L << (SECOND_MICROSECOND - 128)) | (1L << (MINUTE_MICROSECOND - 128)) | (1L << (MINUTE_SECOND - 128)) | (1L << (HOUR_MICROSECOND - 128)) | (1L << (HOUR_SECOND - 128)) | (1L << (HOUR_MINUTE - 128)) | (1L << (DAY_MICROSECOND - 128)) | (1L << (DAY_SECOND - 128)) | (1L << (DAY_MINUTE - 128)) | (1L << (DAY_HOUR - 128)) | (1L << (YEAR_MONTH - 128)) | (1L << (SEPARATOR - 128)) | (1L << (VAR_ASSIGN - 128)) | (1L << (PLUS_ASSIGN - 128)) | (1L << (MINUS_ASSIGN - 128)) | (1L << (MULT_ASSIGN - 128)) | (1L << (DIV_ASSIGN - 128)) | (1L << (MOD_ASSIGN - 128)) | (1L << (AND_ASSIGN - 128)) | (1L << (XOR_ASSIGN - 128)) | (1L << (OR_ASSIGN - 128)) | (1L << (STAR - 128)) | (1L << (DIVIDE - 128)) | (1L << (MODULE - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (DIV - 128)) | (1L << (MOD - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EQUAL_SYMBOL - 192)) | (1L << (GREATER_SYMBOL - 192)) | (1L << (LESS_SYMBOL - 192)) | (1L << (EXCLAMATION_SYMBOL - 192)) | (1L << (BIT_NOT_OP - 192)) | (1L << (BIT_OR_OP - 192)) | (1L << (BIT_AND_OP - 192)) | (1L << (BIT_XOR_OP - 192)) | (1L << (DOT - 192)) | (1L << (LP - 192)) | (1L << (RP - 192)) | (1L << (COMMA - 192)) | (1L << (SEMI - 192)) | (1L << (AT_SIGN - 192)) | (1L << (SINGLE_QUOTE_SYMB - 192)) | (1L << (DOUBLE_QUOTE_SYMB - 192)) | (1L << (REVERSE_QUOTE_SYMB - 192)) | (1L << (COLON_SYMB - 192)) | (1L << (UNDERSCORE - 192)) | (1L << (N_SYMB - 192)) | (1L << (ID - 192)) | (1L << (REVERSE_QUOTE_ID - 192)) | (1L << (SINGLE_QUOTED_TEXT - 192)) | (1L << (DOUBLE_QUOTED_TEXT - 192)) | (1L << (NUMBER_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (FLOAT_LITERAL - 192)) | (1L << (EXPONENT - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (DATE_AND_TIME_LITERAL - 192)) | (1L << (DATE_LITERAL - 192)) | (1L << (DATETIME_LITERAL - 192)) | (1L << (TIMESTAMP_LITERAL - 192)) | (1L << (TIME_LITERAL - 192)) | (1L << (YEAR_LITERAL - 192)) | (1L << (DIGIT - 192)))) != 0)) {
				{
				{
				setState(969);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==FROM || _la==SELECT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975);
			match(FROM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> LP() { return getTokens(TestParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(TestParser.LP, i);
		}
		public List<TerminalNode> RP() { return getTokens(TestParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(TestParser.RP, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(LP);
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << SPEC_MYSQL_COMMENT) | (1L << COMMENT_INPUT) | (1L << LINE_COMMENT) | (1L << WITH) | (1L << RECURSIVE) | (1L << FROM) | (1L << EXISTS) | (1L << WHERE) | (1L << DOTSTAR) | (1L << BINARY) | (1L << STARTING) | (1L << MODE) | (1L << SKIP_) | (1L << LOCKED) | (1L << NOWAIT) | (1L << SHARE) | (1L << QUESTION_MARK) | (1L << TERMINATED) | (1L << CHARACTER) | (1L << COLUMNS) | (1L << LINES) | (1L << OPTIONALLY) | (1L << ENCLOSED) | (1L << ESCAPED) | (1L << AS) | (1L << USE) | (1L << IGNORE) | (1L << FORCE) | (1L << INDEX) | (1L << KEY) | (1L << JOIN) | (1L << BY) | (1L << WINDOW) | (1L << OFFSET) | (1L << OUTFILE) | (1L << COLLATE) | (1L << MAX) | (1L << MIN) | (1L << SUM) | (1L << COUNT) | (1L << AVG) | (1L << BIT_XOR) | (1L << BIT_AND) | (1L << BIT_OR) | (1L << GROUP_CONCAT) | (1L << JSON_ARRAYAGG) | (1L << JSON_OBJECTAGG) | (1L << STD) | (1L << STDDEV) | (1L << STDDEV_POP) | (1L << STDDEV_SAMP) | (1L << VAR_POP) | (1L << VAR_SAMP) | (1L << VARIANCE) | (1L << OVER) | (1L << ROWS) | (1L << ROW) | (1L << LANGUAGE) | (1L << QUERY) | (1L << EXPANSION) | (1L << MATCH) | (1L << AGAINST))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BOOLEAN - 64)) | (1L << (RANGE - 64)) | (1L << (CURRENT - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (ORDER - 64)) | (1L << (FOR - 64)) | (1L << (LOCK - 64)) | (1L << (GROUP - 64)) | (1L << (HAVING - 64)) | (1L << (LIMIT - 64)) | (1L << (INNER - 64)) | (1L << (CROSS - 64)) | (1L << (LEFT - 64)) | (1L << (RIGHT - 64)) | (1L << (ON - 64)) | (1L << (USING - 64)) | (1L << (STRAIGHT_JOIN - 64)) | (1L << (OUTER - 64)) | (1L << (NATURAL - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTINCTROW - 64)) | (1L << (AND - 64)) | (1L << (OR - 64)) | (1L << (XOR - 64)) | (1L << (NULL - 64)) | (1L << (NOT - 64)) | (1L << (IS - 64)) | (1L << (IN - 64)) | (1L << (LIKE - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (UNKNOWN - 64)) | (1L << (ALL - 64)) | (1L << (ANY - 64)) | (1L << (SOME - 64)) | (1L << (BETWEEN - 64)) | (1L << (MEMBER - 64)) | (1L << (ESCAPE - 64)) | (1L << (OF - 64)) | (1L << (UNION - 64)) | (1L << (INSERT - 64)) | (1L << (LOW_PRIORITY - 64)) | (1L << (DELAYED - 64)) | (1L << (HIGH_PRIORITY - 64)) | (1L << (INTO - 64)) | (1L << (SELECT - 64)) | (1L << (DELETE - 64)) | (1L << (VALUE - 64)) | (1L << (VALUES - 64)) | (1L << (PARTITION - 64)) | (1L << (TABLE - 64)) | (1L << (DUPLICATE - 64)) | (1L << (DEFAULT - 64)) | (1L << (UPDATE - 64)) | (1L << (SET - 64)) | (1L << (REGEXP - 64)) | (1L << (RLIKE - 64)) | (1L << (ASC - 64)) | (1L << (DESC - 64)) | (1L << (SOUNDS - 64)) | (1L << (CASE - 64)) | (1L << (WHEN - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (THEN - 128)) | (1L << (ELSE - 128)) | (1L << (END - 128)) | (1L << (IF - 128)) | (1L << (LOCALTIME - 128)) | (1L << (LOCALTIMESTAMP - 128)) | (1L << (REPLACE - 128)) | (1L << (INTERVAL - 128)) | (1L << (DATABASE - 128)) | (1L << (SCHEMA - 128)) | (1L << (DATE - 128)) | (1L << (DAY - 128)) | (1L << (GEOMETRYCOLLECTION - 128)) | (1L << (LINESTRING - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TIMESTAMP_ADD - 128)) | (1L << (TIMESTAMP_DIFF - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (UTC_TIMESTAMP - 128)) | (1L << (LAST_DAY - 128)) | (1L << (MICROSECOND - 128)) | (1L << (SECOND - 128)) | (1L << (MINUTE - 128)) | (1L << (HOUR - 128)) | (1L << (WEEK - 128)) | (1L << (MONTH - 128)) | (1L << (QUARTER - 128)) | (1L << (YEAR - 128)) | (1L << (SECOND_MICROSECOND - 128)) | (1L << (MINUTE_MICROSECOND - 128)) | (1L << (MINUTE_SECOND - 128)) | (1L << (HOUR_MICROSECOND - 128)) | (1L << (HOUR_SECOND - 128)) | (1L << (HOUR_MINUTE - 128)) | (1L << (DAY_MICROSECOND - 128)) | (1L << (DAY_SECOND - 128)) | (1L << (DAY_MINUTE - 128)) | (1L << (DAY_HOUR - 128)) | (1L << (YEAR_MONTH - 128)) | (1L << (SEPARATOR - 128)) | (1L << (VAR_ASSIGN - 128)) | (1L << (PLUS_ASSIGN - 128)) | (1L << (MINUS_ASSIGN - 128)) | (1L << (MULT_ASSIGN - 128)) | (1L << (DIV_ASSIGN - 128)) | (1L << (MOD_ASSIGN - 128)) | (1L << (AND_ASSIGN - 128)) | (1L << (XOR_ASSIGN - 128)) | (1L << (OR_ASSIGN - 128)) | (1L << (STAR - 128)) | (1L << (DIVIDE - 128)) | (1L << (MODULE - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (DIV - 128)) | (1L << (MOD - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EQUAL_SYMBOL - 192)) | (1L << (GREATER_SYMBOL - 192)) | (1L << (LESS_SYMBOL - 192)) | (1L << (EXCLAMATION_SYMBOL - 192)) | (1L << (BIT_NOT_OP - 192)) | (1L << (BIT_OR_OP - 192)) | (1L << (BIT_AND_OP - 192)) | (1L << (BIT_XOR_OP - 192)) | (1L << (DOT - 192)) | (1L << (LP - 192)) | (1L << (COMMA - 192)) | (1L << (SEMI - 192)) | (1L << (AT_SIGN - 192)) | (1L << (SINGLE_QUOTE_SYMB - 192)) | (1L << (DOUBLE_QUOTE_SYMB - 192)) | (1L << (REVERSE_QUOTE_SYMB - 192)) | (1L << (COLON_SYMB - 192)) | (1L << (UNDERSCORE - 192)) | (1L << (N_SYMB - 192)) | (1L << (ID - 192)) | (1L << (REVERSE_QUOTE_ID - 192)) | (1L << (SINGLE_QUOTED_TEXT - 192)) | (1L << (DOUBLE_QUOTED_TEXT - 192)) | (1L << (NUMBER_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (FLOAT_LITERAL - 192)) | (1L << (EXPONENT - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (OCTAL_LITERAL - 192)) | (1L << (HEX_LITERAL - 192)) | (1L << (DATE_AND_TIME_LITERAL - 192)) | (1L << (DATE_LITERAL - 192)) | (1L << (DATETIME_LITERAL - 192)) | (1L << (TIMESTAMP_LITERAL - 192)) | (1L << (TIME_LITERAL - 192)) | (1L << (YEAR_LITERAL - 192)) | (1L << (DIGIT - 192)))) != 0)) {
				{
				setState(980);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
				case SPEC_MYSQL_COMMENT:
				case COMMENT_INPUT:
				case LINE_COMMENT:
				case WITH:
				case RECURSIVE:
				case FROM:
				case EXISTS:
				case WHERE:
				case DOTSTAR:
				case BINARY:
				case STARTING:
				case MODE:
				case SKIP_:
				case LOCKED:
				case NOWAIT:
				case SHARE:
				case QUESTION_MARK:
				case TERMINATED:
				case CHARACTER:
				case COLUMNS:
				case LINES:
				case OPTIONALLY:
				case ENCLOSED:
				case ESCAPED:
				case AS:
				case USE:
				case IGNORE:
				case FORCE:
				case INDEX:
				case KEY:
				case JOIN:
				case BY:
				case WINDOW:
				case OFFSET:
				case OUTFILE:
				case COLLATE:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_XOR:
				case BIT_AND:
				case BIT_OR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case OVER:
				case ROWS:
				case ROW:
				case LANGUAGE:
				case QUERY:
				case EXPANSION:
				case MATCH:
				case AGAINST:
				case BOOLEAN:
				case RANGE:
				case CURRENT:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case ORDER:
				case FOR:
				case LOCK:
				case GROUP:
				case HAVING:
				case LIMIT:
				case INNER:
				case CROSS:
				case LEFT:
				case RIGHT:
				case ON:
				case USING:
				case STRAIGHT_JOIN:
				case OUTER:
				case NATURAL:
				case DISTINCT:
				case DISTINCTROW:
				case AND:
				case OR:
				case XOR:
				case NULL:
				case NOT:
				case IS:
				case IN:
				case LIKE:
				case TRUE:
				case FALSE:
				case UNKNOWN:
				case ALL:
				case ANY:
				case SOME:
				case BETWEEN:
				case MEMBER:
				case ESCAPE:
				case OF:
				case UNION:
				case INSERT:
				case LOW_PRIORITY:
				case DELAYED:
				case HIGH_PRIORITY:
				case INTO:
				case SELECT:
				case DELETE:
				case VALUE:
				case VALUES:
				case PARTITION:
				case TABLE:
				case DUPLICATE:
				case DEFAULT:
				case UPDATE:
				case SET:
				case REGEXP:
				case RLIKE:
				case ASC:
				case DESC:
				case SOUNDS:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case IF:
				case LOCALTIME:
				case LOCALTIMESTAMP:
				case REPLACE:
				case INTERVAL:
				case DATABASE:
				case SCHEMA:
				case DATE:
				case DAY:
				case GEOMETRYCOLLECTION:
				case LINESTRING:
				case MULTILINESTRING:
				case MULTIPOINT:
				case MULTIPOLYGON:
				case POINT:
				case POLYGON:
				case TIME:
				case TIMESTAMP:
				case TIMESTAMP_ADD:
				case TIMESTAMP_DIFF:
				case CURRENT_TIMESTAMP:
				case CURRENT_DATE:
				case CURRENT_TIME:
				case UTC_TIMESTAMP:
				case LAST_DAY:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case SECOND_MICROSECOND:
				case MINUTE_MICROSECOND:
				case MINUTE_SECOND:
				case HOUR_MICROSECOND:
				case HOUR_SECOND:
				case HOUR_MINUTE:
				case DAY_MICROSECOND:
				case DAY_SECOND:
				case DAY_MINUTE:
				case DAY_HOUR:
				case YEAR_MONTH:
				case SEPARATOR:
				case VAR_ASSIGN:
				case PLUS_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSIGN:
				case MOD_ASSIGN:
				case AND_ASSIGN:
				case XOR_ASSIGN:
				case OR_ASSIGN:
				case STAR:
				case DIVIDE:
				case MODULE:
				case PLUS:
				case MINUS:
				case DIV:
				case MOD:
				case EQUAL_SYMBOL:
				case GREATER_SYMBOL:
				case LESS_SYMBOL:
				case EXCLAMATION_SYMBOL:
				case BIT_NOT_OP:
				case BIT_OR_OP:
				case BIT_AND_OP:
				case BIT_XOR_OP:
				case DOT:
				case COMMA:
				case SEMI:
				case AT_SIGN:
				case SINGLE_QUOTE_SYMB:
				case DOUBLE_QUOTE_SYMB:
				case REVERSE_QUOTE_SYMB:
				case COLON_SYMB:
				case UNDERSCORE:
				case N_SYMB:
				case ID:
				case REVERSE_QUOTE_ID:
				case SINGLE_QUOTED_TEXT:
				case DOUBLE_QUOTED_TEXT:
				case NUMBER_LITERAL:
				case INTEGER_LITERAL:
				case FLOAT_LITERAL:
				case EXPONENT:
				case BINARY_LITERAL:
				case OCTAL_LITERAL:
				case HEX_LITERAL:
				case DATE_AND_TIME_LITERAL:
				case DATE_LITERAL:
				case DATETIME_LITERAL:
				case TIMESTAMP_LITERAL:
				case TIME_LITERAL:
				case YEAR_LITERAL:
				case DIGIT:
					{
					setState(978);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LP || _la==RP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LP:
					{
					setState(979);
					block();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(985);
			match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 23:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 26:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 28:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00e5\u03dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u0086\b\u0000\u0001\u0001\u0003\u0001"+
		"\u0089\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008d\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0094"+
		"\b\u0002\u0001\u0002\u0005\u0002\u0097\b\u0002\n\u0002\f\u0002\u009a\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00a0"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a4\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00a8\b\u0003\u0003\u0003\u00aa\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b0\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00b4\b\u0003\u0003\u0003\u00b6\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00ba\b\u0003\n\u0003\f\u0003\u00bd"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c8\b\u0005\u0001"+
		"\u0005\u0003\u0005\u00cb\b\u0005\u0001\u0005\u0003\u0005\u00ce\b\u0005"+
		"\u0001\u0005\u0003\u0005\u00d1\b\u0005\u0001\u0005\u0003\u0005\u00d4\b"+
		"\u0005\u0001\u0005\u0003\u0005\u00d7\b\u0005\u0001\u0005\u0003\u0005\u00da"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00e1\b\u0006\n\u0006\f\u0006\u00e4\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00ea\b\u0007\n\u0007\f\u0007\u00ed"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00f4\b\u0007\n\u0007\f\u0007\u00f7\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00fc\b\u0007\u0001\b\u0001\b\u0003\b\u0100\b"+
		"\b\u0001\b\u0003\b\u0103\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0108\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u0112\b\b\u0001\t\u0003\t\u0115\b\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0120\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0128\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u012e\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0139\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0140\b\t\u0003\t\u0142\b\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0148\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0153\b\u000b"+
		"\n\u000b\f\u000b\u0156\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0003\f\u015c\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u016b\b\u000e\n\u000e\f\u000e\u016e\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0175\b\u000f"+
		"\n\u000f\f\u000f\u0178\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u017e\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0183\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0189\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0197\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u019c\b\u0013\u0005\u0013\u019e\b\u0013\n\u0013\f\u0013"+
		"\u01a1\t\u0013\u0003\u0013\u01a3\b\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01a8\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01ae\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01bc\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01c4"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01cb\b\u0014\n\u0014\f\u0014\u01ce\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u01d3\b\u0015\n\u0015\f\u0015\u01d6\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01e1\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01ea\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01f6\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01fb"+
		"\b\u0017\n\u0017\f\u0017\u01fe\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u020e\b\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0212\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u021a\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0224\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0234\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u023a\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0240\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0249"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u025e\b\u001a\n\u001a\f\u001a\u0261\t\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0271\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u02a3\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u02b0\b\u001c\n\u001c\f\u001c\u02b3\t\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u02b9\b\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u02bd\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!"+
		"\u0003!\u02cd\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u02d6\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u02eb\b#\u0001$\u0001$\u0004$\u02ef\b$\u000b$\f"+
		"$\u02f0\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0003&\u02fc\b&\u0001&\u0003&\u02ff\b&\u0001&\u0003&\u0302\b&\u0001"+
		"&\u0001&\u0003&\u0306\b&\u0001&\u0001&\u0001&\u0001&\u0003&\u030c\b&\u0001"+
		"&\u0001&\u0001&\u0003&\u0311\b&\u0001&\u0003&\u0314\b&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0329\b(\u0001"+
		")\u0001)\u0001)\u0005)\u032e\b)\n)\f)\u0331\t)\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u0337\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0003,\u033e\b,\u0001"+
		",\u0001,\u0003,\u0342\b,\u0001,\u0003,\u0345\b,\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u034b\b,\u0001,\u0003,\u034e\b,\u0001,\u0003,\u0351\b,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0005-\u0358\b-\n-\f-\u035b\t-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u0365\b-\n-\f-\u0368"+
		"\t-\u0001-\u0001-\u0001-\u0003-\u036d\b-\u0001-\u0003-\u0370\b-\u0001"+
		"-\u0003-\u0373\b-\u0001-\u0003-\u0376\b-\u0001-\u0003-\u0379\b-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0382\b.\u0001/\u0001"+
		"/\u0001/\u0005/\u0387\b/\n/\f/\u038a\t/\u0001/\u0001/\u00010\u00010\u0001"+
		"1\u00011\u00011\u00051\u0393\b1\n1\f1\u0396\t1\u00012\u00012\u00012\u0001"+
		"3\u00013\u00013\u00033\u039e\b3\u00033\u03a0\b3\u00013\u00013\u00014\u0001"+
		"4\u00014\u00054\u03a7\b4\n4\f4\u03aa\t4\u00015\u00035\u03ad\b5\u00015"+
		"\u00015\u00016\u00016\u00016\u00036\u03b4\b6\u00016\u00016\u00036\u03b8"+
		"\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00037\u03c4\b7\u00018\u00018\u00018\u00019\u00019\u00059\u03cb\b9\n"+
		"9\f9\u03ce\t9\u00019\u00019\u0001:\u0001:\u0001:\u0005:\u03d5\b:\n:\f"+
		":\u03d8\t:\u0001:\u0001:\u0001:\u0000\u0004(.48;\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\u0000\u0010\u0002\u0000UUbb\u0001"+
		"\u0000LM\u0001\u0000NO\u0001\u0000{|\u0002\u0000\u0011\u0011ww\u0001\u0000"+
		"_a\u0001\u0000bc\u0003\u0000\u000b\u000b\u00bc\u00bd\u00c3\u00c4\u0001"+
		"\u0000&+\u0002\u0000~~\u0082\u0082\u0001\u0000km\u0001\u0000pp\u0001\u0000"+
		"\u0007\u0007\u0002\u0000\u001a\u001aqr\u0002\u0000\u0007\u0007oo\u0001"+
		"\u0000\u00c9\u00ca\u044a\u0000\u0085\u0001\u0000\u0000\u0000\u0002\u0088"+
		"\u0001\u0000\u0000\u0000\u0004\u0090\u0001\u0000\u0000\u0000\u0006\u009d"+
		"\u0001\u0000\u0000\u0000\b\u00c0\u0001\u0000\u0000\u0000\n\u00c4\u0001"+
		"\u0000\u0000\u0000\f\u00dd\u0001\u0000\u0000\u0000\u000e\u00fb\u0001\u0000"+
		"\u0000\u0000\u0010\u0111\u0001\u0000\u0000\u0000\u0012\u0147\u0001\u0000"+
		"\u0000\u0000\u0014\u0149\u0001\u0000\u0000\u0000\u0016\u014d\u0001\u0000"+
		"\u0000\u0000\u0018\u0159\u0001\u0000\u0000\u0000\u001a\u015f\u0001\u0000"+
		"\u0000\u0000\u001c\u0163\u0001\u0000\u0000\u0000\u001e\u016f\u0001\u0000"+
		"\u0000\u0000 \u017b\u0001\u0000\u0000\u0000\"\u017f\u0001\u0000\u0000"+
		"\u0000$\u018c\u0001\u0000\u0000\u0000&\u01ad\u0001\u0000\u0000\u0000("+
		"\u01c3\u0001\u0000\u0000\u0000*\u01cf\u0001\u0000\u0000\u0000,\u01e0\u0001"+
		"\u0000\u0000\u0000.\u01e2\u0001\u0000\u0000\u00000\u020d\u0001\u0000\u0000"+
		"\u00002\u0248\u0001\u0000\u0000\u00004\u024a\u0001\u0000\u0000\u00006"+
		"\u0270\u0001\u0000\u0000\u00008\u02a2\u0001\u0000\u0000\u0000:\u02b4\u0001"+
		"\u0000\u0000\u0000<\u02b8\u0001\u0000\u0000\u0000>\u02c1\u0001\u0000\u0000"+
		"\u0000@\u02c3\u0001\u0000\u0000\u0000B\u02cc\u0001\u0000\u0000\u0000D"+
		"\u02ce\u0001\u0000\u0000\u0000F\u02ea\u0001\u0000\u0000\u0000H\u02ec\u0001"+
		"\u0000\u0000\u0000J\u02f4\u0001\u0000\u0000\u0000L\u02f9\u0001\u0000\u0000"+
		"\u0000N\u0317\u0001\u0000\u0000\u0000P\u0328\u0001\u0000\u0000\u0000R"+
		"\u032a\u0001\u0000\u0000\u0000T\u0332\u0001\u0000\u0000\u0000V\u0338\u0001"+
		"\u0000\u0000\u0000X\u033d\u0001\u0000\u0000\u0000Z\u0354\u0001\u0000\u0000"+
		"\u0000\\\u0381\u0001\u0000\u0000\u0000^\u0383\u0001\u0000\u0000\u0000"+
		"`\u038d\u0001\u0000\u0000\u0000b\u038f\u0001\u0000\u0000\u0000d\u0397"+
		"\u0001\u0000\u0000\u0000f\u039a\u0001\u0000\u0000\u0000h\u03a3\u0001\u0000"+
		"\u0000\u0000j\u03ac\u0001\u0000\u0000\u0000l\u03b7\u0001\u0000\u0000\u0000"+
		"n\u03c3\u0001\u0000\u0000\u0000p\u03c5\u0001\u0000\u0000\u0000r\u03c8"+
		"\u0001\u0000\u0000\u0000t\u03d1\u0001\u0000\u0000\u0000vw\u0003\u0002"+
		"\u0001\u0000wx\u0006\u0000\uffff\uffff\u0000x\u0086\u0001\u0000\u0000"+
		"\u0000yz\u0003\u0004\u0002\u0000z{\u0006\u0000\uffff\uffff\u0000{\u0086"+
		"\u0001\u0000\u0000\u0000|}\u0003L&\u0000}~\u0006\u0000\uffff\uffff\u0000"+
		"~\u0086\u0001\u0000\u0000\u0000\u007f\u0080\u0003X,\u0000\u0080\u0081"+
		"\u0006\u0000\uffff\uffff\u0000\u0081\u0086\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0003Z-\u0000\u0083\u0084\u0006\u0000\uffff\uffff\u0000\u0084\u0086"+
		"\u0001\u0000\u0000\u0000\u0085v\u0001\u0000\u0000\u0000\u0085y\u0001\u0000"+
		"\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000"+
		"\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086\u0001\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0003\u0006\u0003\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0003\n\u0005\u0000\u008b\u008d\u0003\b\u0004\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0001\uffff\uffff"+
		"\u0000\u008f\u0003\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u0002\u0001"+
		"\u0000\u0091\u0098\u0005i\u0000\u0000\u0092\u0094\u0007\u0000\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0002\u0001\u0000"+
		"\u0096\u0093\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0006\u0002\uffff\uffff\u0000\u009c\u0005\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0005\u0005\u0000\u0000\u009e\u00a0\u0005\u0006\u0000"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a9\u0003\\.\u0000"+
		"\u00a2\u00a4\u0005\u00c9\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0003^/\u0000\u00a6\u00a8\u0005\u00ca\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00bb"+
		"\u0003p8\u0000\u00ac\u00ad\u0005\u00cb\u0000\u0000\u00ad\u00b5\u0003\\"+
		".\u0000\u00ae\u00b0\u0005\u00c9\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0003^/\u0000\u00b2\u00b4\u0005\u00ca\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0003p8\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0006"+
		"\u0003\uffff\uffff\u0000\u00bf\u0007\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005o\u0000\u0000\u00c1\u00c2\u0003*\u0015\u0000\u00c2\u00c3\u0006\u0004"+
		"\uffff\uffff\u0000\u00c3\t\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003r"+
		"9\u0000\u00c5\u00c7\u0003\f\u0006\u0000\u00c6\u00c8\u0003\u0014\n\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u0016\u000b\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ce\u0003\u001a\r\u0000\u00cd"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d0\u0001\u0000\u0000\u0000\u00cf\u00d1\u0003\u001c\u000e\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003\u001e\u000f\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d7\u0003\"\u0011\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0003&\u0013\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0006\u0005\uffff\uffff\u0000\u00dc\u000b"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e2\u0003\u000e\u0007\u0000\u00de\u00df"+
		"\u0005\u00cb\u0000\u0000\u00df\u00e1\u0003\u000e\u0007\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0006\u0006\uffff\uffff\u0000\u00e6\r\u0001\u0000\u0000\u0000\u00e7\u00eb"+
		"\u0003\u0010\b\u0000\u00e8\u00ea\u0003\u0012\t\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ef\u0006"+
		"\u0007\uffff\uffff\u0000\u00ef\u00fc\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005\u00c9\u0000\u0000\u00f1\u00f5\u0003\u0010\b\u0000\u00f2\u00f4\u0003"+
		"\u0012\t\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0005\u00ca\u0000\u0000\u00f9\u00fa\u0006\u0007"+
		"\uffff\uffff\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00e7\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f0\u0001\u0000\u0000\u0000\u00fc\u000f\u0001"+
		"\u0000\u0000\u0000\u00fd\u0102\u0005\u00d4\u0000\u0000\u00fe\u0100\u0005"+
		"\u001a\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0005"+
		"\u00d4\u0000\u0000\u0102\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0112\u0006"+
		"\b\uffff\uffff\u0000\u0105\u0107\u0003$\u0012\u0000\u0106\u0108\u0005"+
		"\u001a\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0005"+
		"\u00d4\u0000\u0000\u010a\u010b\u0006\b\uffff\uffff\u0000\u010b\u0112\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0005\u00c9\u0000\u0000\u010d\u010e\u0003"+
		"\f\u0006\u0000\u010e\u010f\u0005\u00ca\u0000\u0000\u010f\u0110\u0006\b"+
		"\uffff\uffff\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u00fd\u0001"+
		"\u0000\u0000\u0000\u0111\u0105\u0001\u0000\u0000\u0000\u0111\u010c\u0001"+
		"\u0000\u0000\u0000\u0112\u0011\u0001\u0000\u0000\u0000\u0113\u0115\u0007"+
		"\u0001\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		" \u0000\u0000\u0117\u011f\u0003\u0010\b\u0000\u0118\u0119\u0005P\u0000"+
		"\u0000\u0119\u0120\u0003(\u0014\u0000\u011a\u011b\u0005Q\u0000\u0000\u011b"+
		"\u011c\u0005\u00c9\u0000\u0000\u011c\u011d\u0003^/\u0000\u011d\u011e\u0005"+
		"\u00ca\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0118\u0001"+
		"\u0000\u0000\u0000\u011f\u011a\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0006"+
		"\t\uffff\uffff\u0000\u0122\u0148\u0001\u0000\u0000\u0000\u0123\u0124\u0005"+
		"R\u0000\u0000\u0124\u0127\u0003\u0010\b\u0000\u0125\u0126\u0005P\u0000"+
		"\u0000\u0126\u0128\u0003(\u0014\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0006\t\uffff\uffff\u0000\u012a\u0148\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0007\u0002\u0000\u0000\u012c\u012e\u0005S\u0000\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005 \u0000\u0000\u0130\u0138"+
		"\u0003\u0010\b\u0000\u0131\u0132\u0005P\u0000\u0000\u0132\u0139\u0003"+
		"(\u0014\u0000\u0133\u0134\u0005Q\u0000\u0000\u0134\u0135\u0005\u00c9\u0000"+
		"\u0000\u0135\u0136\u0003^/\u0000\u0136\u0137\u0005\u00ca\u0000\u0000\u0137"+
		"\u0139\u0001\u0000\u0000\u0000\u0138\u0131\u0001\u0000\u0000\u0000\u0138"+
		"\u0133\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0006\t\uffff\uffff\u0000\u013b\u0148\u0001\u0000\u0000\u0000\u013c"+
		"\u0141\u0005T\u0000\u0000\u013d\u013f\u0007\u0002\u0000\u0000\u013e\u0140"+
		"\u0005S\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013d\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005 \u0000\u0000\u0144\u0145\u0003\u0010"+
		"\b\u0000\u0145\u0146\u0006\t\uffff\uffff\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0114\u0001\u0000\u0000\u0000\u0147\u0123\u0001\u0000"+
		"\u0000\u0000\u0147\u012b\u0001\u0000\u0000\u0000\u0147\u013c\u0001\u0000"+
		"\u0000\u0000\u0148\u0013\u0001\u0000\u0000\u0000\u0149\u014a\u0005\t\u0000"+
		"\u0000\u014a\u014b\u0003(\u0014\u0000\u014b\u014c\u0006\n\uffff\uffff"+
		"\u0000\u014c\u0015\u0001\u0000\u0000\u0000\u014d\u014e\u0005I\u0000\u0000"+
		"\u014e\u014f\u0005!\u0000\u0000\u014f\u0154\u0003\u0018\f\u0000\u0150"+
		"\u0151\u0005\u00cb\u0000\u0000\u0151\u0153\u0003\u0018\f\u0000\u0152\u0150"+
		"\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0006\u000b\uffff\uffff\u0000\u0158\u0017\u0001\u0000\u0000\u0000\u0159"+
		"\u015b\u00038\u001c\u0000\u015a\u015c\u0007\u0003\u0000\u0000\u015b\u015a"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0006\f\uffff\uffff\u0000\u015e\u0019"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u0005J\u0000\u0000\u0160\u0161\u0003"+
		"(\u0014\u0000\u0161\u0162\u0006\r\uffff\uffff\u0000\u0162\u001b\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005\"\u0000\u0000\u0164\u0165\u0003\\"+
		".\u0000\u0165\u016c\u0003p8\u0000\u0166\u0167\u0005\u00cb\u0000\u0000"+
		"\u0167\u0168\u0003\\.\u0000\u0168\u0169\u0003p8\u0000\u0169\u016b\u0001"+
		"\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000\u0000\u016b\u016e\u0001"+
		"\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001"+
		"\u0000\u0000\u0000\u016d\u001d\u0001\u0000\u0000\u0000\u016e\u016c\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0005F\u0000\u0000\u0170\u0171\u0005!\u0000"+
		"\u0000\u0171\u0176\u0003 \u0010\u0000\u0172\u0173\u0005\u00cb\u0000\u0000"+
		"\u0173\u0175\u0003 \u0010\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175"+
		"\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0179\u017a\u0006\u000f\uffff\uffff\u0000"+
		"\u017a\u001f\u0001\u0000\u0000\u0000\u017b\u017d\u0003(\u0014\u0000\u017c"+
		"\u017e\u0007\u0003\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017e!\u0001\u0000\u0000\u0000\u017f\u0188"+
		"\u0005K\u0000\u0000\u0180\u0181\t\u0000\u0000\u0000\u0181\u0183\u0005"+
		"\u00cb\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0189\t\u0000"+
		"\u0000\u0000\u0185\u0186\t\u0000\u0000\u0000\u0186\u0187\u0005#\u0000"+
		"\u0000\u0187\u0189\t\u0000\u0000\u0000\u0188\u0182\u0001\u0000\u0000\u0000"+
		"\u0188\u0185\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0006\u0011\uffff\uffff\u0000\u018b#\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0005\u00c9\u0000\u0000\u018d\u018e\u0003\u0002\u0001\u0000"+
		"\u018e\u018f\u0005\u00ca\u0000\u0000\u018f\u0190\u0006\u0012\uffff\uffff"+
		"\u0000\u0190%\u0001\u0000\u0000\u0000\u0191\u0192\u0005G\u0000\u0000\u0192"+
		"\u01a2\u0007\u0004\u0000\u0000\u0193\u0194\u0005h\u0000\u0000\u0194\u0196"+
		"\u0003\\.\u0000\u0195\u0197\u0005\n\u0000\u0000\u0196\u0195\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u019f\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0005\u00cb\u0000\u0000\u0199\u019b\u0003\\."+
		"\u0000\u019a\u019c\u0005\n\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000"+
		"\u019d\u0198\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
		"\u01a2\u0193\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a7\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u000e\u0000\u0000"+
		"\u01a5\u01a8\u0005\u000f\u0000\u0000\u01a6\u01a8\u0005\u0010\u0000\u0000"+
		"\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01ae\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0005H\u0000\u0000\u01aa\u01ab\u0005]\u0000\u0000\u01ab\u01ac"+
		"\u0005\u0011\u0000\u0000\u01ac\u01ae\u0005\r\u0000\u0000\u01ad\u0191\u0001"+
		"\u0000\u0000\u0000\u01ad\u01a9\u0001\u0000\u0000\u0000\u01ae\'\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0006\u0014\uffff\uffff\u0000\u01b0\u01b1\u0005"+
		"[\u0000\u0000\u01b1\u01b2\u0003(\u0014\u0004\u01b2\u01b3\u0006\u0014\uffff"+
		"\uffff\u0000\u01b3\u01c4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u00c3"+
		"\u0000\u0000\u01b5\u01b6\u0003(\u0014\u0003\u01b6\u01b7\u0006\u0014\uffff"+
		"\uffff\u0000\u01b7\u01c4\u0001\u0000\u0000\u0000\u01b8\u01b9\u0003.\u0017"+
		"\u0000\u01b9\u01bb\u0005\\\u0000\u0000\u01ba\u01bc\u0005[\u0000\u0000"+
		"\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0007\u0005\u0000\u0000"+
		"\u01be\u01bf\u0006\u0014\uffff\uffff\u0000\u01bf\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0003.\u0017\u0000\u01c1\u01c2\u0006\u0014\uffff\uffff"+
		"\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01af\u0001\u0000\u0000"+
		"\u0000\u01c3\u01b4\u0001\u0000\u0000\u0000\u01c3\u01b8\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000\u01c4\u01cc\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\n\u0005\u0000\u0000\u01c6\u01c7\u0003,\u0016\u0000"+
		"\u01c7\u01c8\u0003(\u0014\u0006\u01c8\u01c9\u0006\u0014\uffff\uffff\u0000"+
		"\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c5\u0001\u0000\u0000\u0000"+
		"\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd)\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d4\u0003(\u0014\u0000\u01d0\u01d1"+
		"\u0005\u00cb\u0000\u0000\u01d1\u01d3\u0003(\u0014\u0000\u01d2\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0006"+
		"\u0015\uffff\uffff\u0000\u01d8+\u0001\u0000\u0000\u0000\u01d9\u01e1\u0005"+
		"X\u0000\u0000\u01da\u01e1\u0005Y\u0000\u0000\u01db\u01e1\u0005W\u0000"+
		"\u0000\u01dc\u01dd\u0005\u00c5\u0000\u0000\u01dd\u01e1\u0005\u00c5\u0000"+
		"\u0000\u01de\u01df\u0005\u00c6\u0000\u0000\u01df\u01e1\u0005\u00c6\u0000"+
		"\u0000\u01e0\u01d9\u0001\u0000\u0000\u0000\u01e0\u01da\u0001\u0000\u0000"+
		"\u0000\u01e0\u01db\u0001\u0000\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000"+
		"\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1-\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e3\u0006\u0017\uffff\uffff\u0000\u01e3\u01e4\u00032\u0019\u0000"+
		"\u01e4\u01e5\u0006\u0017\uffff\uffff\u0000\u01e5\u01fc\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\n\u0004\u0000\u0000\u01e7\u01e9\u0005\\\u0000\u0000"+
		"\u01e8\u01ea\u0005[\u0000\u0000\u01e9\u01e8\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0005Z\u0000\u0000\u01ec\u01fb\u0006\u0017\uffff\uffff\u0000\u01ed"+
		"\u01ee\n\u0003\u0000\u0000\u01ee\u01ef\u00030\u0018\u0000\u01ef\u01f0"+
		"\u00032\u0019\u0000\u01f0\u01f1\u0006\u0017\uffff\uffff\u0000\u01f1\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\n\u0002\u0000\u0000\u01f3\u01f5\u0003"+
		"0\u0018\u0000\u01f4\u01f6\u0007\u0006\u0000\u0000\u01f5\u01f4\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0003$\u0012\u0000\u01f8\u01f9\u0006\u0017\uffff"+
		"\uffff\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000\u01fa\u01e6\u0001\u0000"+
		"\u0000\u0000\u01fa\u01ed\u0001\u0000\u0000\u0000\u01fa\u01f2\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd/\u0001\u0000\u0000"+
		"\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01ff\u020e\u0005\u00c0\u0000"+
		"\u0000\u0200\u0201\u0005\u00c1\u0000\u0000\u0201\u020e\u0005\u00c0\u0000"+
		"\u0000\u0202\u020e\u0005\u00c1\u0000\u0000\u0203\u0204\u0005\u00c2\u0000"+
		"\u0000\u0204\u020e\u0005\u00c0\u0000\u0000\u0205\u020e\u0005\u00c2\u0000"+
		"\u0000\u0206\u0207\u0005\u00c2\u0000\u0000\u0207\u020e\u0005\u00c1\u0000"+
		"\u0000\u0208\u0209\u0005\u00c3\u0000\u0000\u0209\u020e\u0005\u00c0\u0000"+
		"\u0000\u020a\u020b\u0005\u00c2\u0000\u0000\u020b\u020c\u0005\u00c0\u0000"+
		"\u0000\u020c\u020e\u0005\u00c1\u0000\u0000\u020d\u01ff\u0001\u0000\u0000"+
		"\u0000\u020d\u0200\u0001\u0000\u0000\u0000\u020d\u0202\u0001\u0000\u0000"+
		"\u0000\u020d\u0203\u0001\u0000\u0000\u0000\u020d\u0205\u0001\u0000\u0000"+
		"\u0000\u020d\u0206\u0001\u0000\u0000\u0000\u020d\u0208\u0001\u0000\u0000"+
		"\u0000\u020d\u020a\u0001\u0000\u0000\u0000\u020e1\u0001\u0000\u0000\u0000"+
		"\u020f\u0211\u00034\u001a\u0000\u0210\u0212\u0005[\u0000\u0000\u0211\u0210"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213\u0214\u0005]\u0000\u0000\u0214\u0215\u0003"+
		"$\u0012\u0000\u0215\u0216\u0006\u0019\uffff\uffff\u0000\u0216\u0249\u0001"+
		"\u0000\u0000\u0000\u0217\u0219\u00034\u001a\u0000\u0218\u021a\u0005[\u0000"+
		"\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0005]\u0000\u0000"+
		"\u021c\u021d\u0005\u00c9\u0000\u0000\u021d\u021e\u0003*\u0015\u0000\u021e"+
		"\u021f\u0005\u00ca\u0000\u0000\u021f\u0220\u0006\u0019\uffff\uffff\u0000"+
		"\u0220\u0249\u0001\u0000\u0000\u0000\u0221\u0223\u00034\u001a\u0000\u0222"+
		"\u0224\u0005[\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224"+
		"\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u0005e\u0000\u0000\u0226\u0227\u00034\u001a\u0000\u0227\u0228\u0005W"+
		"\u0000\u0000\u0228\u0229\u00032\u0019\u0000\u0229\u022a\u0006\u0019\uffff"+
		"\uffff\u0000\u022a\u0249\u0001\u0000\u0000\u0000\u022b\u022c\u00034\u001a"+
		"\u0000\u022c\u022d\u0005}\u0000\u0000\u022d\u022e\u0005^\u0000\u0000\u022e"+
		"\u022f\u00034\u001a\u0000\u022f\u0230\u0006\u0019\uffff\uffff\u0000\u0230"+
		"\u0249\u0001\u0000\u0000\u0000\u0231\u0233\u00034\u001a\u0000\u0232\u0234"+
		"\u0005[\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0005"+
		"^\u0000\u0000\u0236\u0239\u00038\u001c\u0000\u0237\u0238\u0005g\u0000"+
		"\u0000\u0238\u023a\u00038\u001c\u0000\u0239\u0237\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0006\u0019\uffff\uffff\u0000\u023c\u0249\u0001\u0000\u0000"+
		"\u0000\u023d\u023f\u00034\u001a\u0000\u023e\u0240\u0005[\u0000\u0000\u023f"+
		"\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240"+
		"\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0005y\u0000\u0000\u0242\u0243"+
		"\u00034\u001a\u0000\u0243\u0244\u0006\u0019\uffff\uffff\u0000\u0244\u0249"+
		"\u0001\u0000\u0000\u0000\u0245\u0246\u00034\u001a\u0000\u0246\u0247\u0006"+
		"\u0019\uffff\uffff\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u020f"+
		"\u0001\u0000\u0000\u0000\u0248\u0217\u0001\u0000\u0000\u0000\u0248\u0221"+
		"\u0001\u0000\u0000\u0000\u0248\u022b\u0001\u0000\u0000\u0000\u0248\u0231"+
		"\u0001\u0000\u0000\u0000\u0248\u023d\u0001\u0000\u0000\u0000\u0248\u0245"+
		"\u0001\u0000\u0000\u0000\u02493\u0001\u0000\u0000\u0000\u024a\u024b\u0006"+
		"\u001a\uffff\uffff\u0000\u024b\u024c\u00038\u001c\u0000\u024c\u024d\u0006"+
		"\u001a\uffff\uffff\u0000\u024d\u025f\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\n\u0004\u0000\u0000\u024f\u0250\u00036\u001b\u0000\u0250\u0251\u0003"+
		"4\u001a\u0005\u0251\u0252\u0006\u001a\uffff\uffff\u0000\u0252\u025e\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\n\u0003\u0000\u0000\u0254\u0255\u0005\u00bc"+
		"\u0000\u0000\u0255\u0256\u0003J%\u0000\u0256\u0257\u0006\u001a\uffff\uffff"+
		"\u0000\u0257\u025e\u0001\u0000\u0000\u0000\u0258\u0259\n\u0002\u0000\u0000"+
		"\u0259\u025a\u0005\u00bd\u0000\u0000\u025a\u025b\u0003J%\u0000\u025b\u025c"+
		"\u0006\u001a\uffff\uffff\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d"+
		"\u024e\u0001\u0000\u0000\u0000\u025d\u0253\u0001\u0000\u0000\u0000\u025d"+
		"\u0258\u0001\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000\u025f"+
		"\u025d\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260"+
		"5\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0271"+
		"\u0005\u00c5\u0000\u0000\u0263\u0271\u0005\u00c6\u0000\u0000\u0264\u0265"+
		"\u0005\u00c2\u0000\u0000\u0265\u0271\u0005\u00c2\u0000\u0000\u0266\u0267"+
		"\u0005\u00c1\u0000\u0000\u0267\u0268\u0005\u00c1\u0000\u0000\u0268\u0271"+
		"\u0005\u00bc\u0000\u0000\u0269\u0271\u0005\u00bd\u0000\u0000\u026a\u0271"+
		"\u0005\u00b9\u0000\u0000\u026b\u0271\u0005\u00ba\u0000\u0000\u026c\u0271"+
		"\u0005\u00be\u0000\u0000\u026d\u0271\u0005\u00bf\u0000\u0000\u026e\u0271"+
		"\u0005\u00bb\u0000\u0000\u026f\u0271\u0005\u00c7\u0000\u0000\u0270\u0262"+
		"\u0001\u0000\u0000\u0000\u0270\u0263\u0001\u0000\u0000\u0000\u0270\u0264"+
		"\u0001\u0000\u0000\u0000\u0270\u0266\u0001\u0000\u0000\u0000\u0270\u0269"+
		"\u0001\u0000\u0000\u0000\u0270\u026a\u0001\u0000\u0000\u0000\u0270\u026b"+
		"\u0001\u0000\u0000\u0000\u0270\u026c\u0001\u0000\u0000\u0000\u0270\u026d"+
		"\u0001\u0000\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u026f"+
		"\u0001\u0000\u0000\u0000\u02717\u0001\u0000\u0000\u0000\u0272\u0273\u0006"+
		"\u001c\uffff\uffff\u0000\u0273\u0274\u0003n7\u0000\u0274\u0275\u0006\u001c"+
		"\uffff\uffff\u0000\u0275\u02a3\u0001\u0000\u0000\u0000\u0276\u0277\u0003"+
		"f3\u0000\u0277\u0278\u0006\u001c\uffff\uffff\u0000\u0278\u02a3\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0003<\u001e\u0000\u027a\u027b\u0006\u001c\uffff"+
		"\uffff\u0000\u027b\u02a3\u0001\u0000\u0000\u0000\u027c\u027d\u0005\u0012"+
		"\u0000\u0000\u027d\u02a3\u0006\u001c\uffff\uffff\u0000\u027e\u027f\u0003"+
		"B!\u0000\u027f\u0280\u0006\u001c\uffff\uffff\u0000\u0280\u02a3\u0001\u0000"+
		"\u0000\u0000\u0281\u0282\u0003:\u001d\u0000\u0282\u0283\u00038\u001c\b"+
		"\u0283\u0284\u0006\u001c\uffff\uffff\u0000\u0284\u02a3\u0001\u0000\u0000"+
		"\u0000\u0285\u0286\u0005\u00c9\u0000\u0000\u0286\u0287\u0003*\u0015\u0000"+
		"\u0287\u0288\u0005\u00ca\u0000\u0000\u0288\u0289\u0006\u001c\uffff\uffff"+
		"\u0000\u0289\u02a3\u0001\u0000\u0000\u0000\u028a\u028b\u0005:\u0000\u0000"+
		"\u028b\u028c\u0005\u00c9\u0000\u0000\u028c\u028d\u0003(\u0014\u0000\u028d"+
		"\u028e\u0005\u00cb\u0000\u0000\u028e\u028f\u0003*\u0015\u0000\u028f\u0290"+
		"\u0005\u00ca\u0000\u0000\u0290\u0291\u0006\u001c\uffff\uffff\u0000\u0291"+
		"\u02a3\u0001\u0000\u0000\u0000\u0292\u0293\u0003$\u0012\u0000\u0293\u0294"+
		"\u0006\u001c\uffff\uffff\u0000\u0294\u02a3\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0005\b\u0000\u0000\u0296\u0297\u0003$\u0012\u0000\u0297\u0298"+
		"\u0006\u001c\uffff\uffff\u0000\u0298\u02a3\u0001\u0000\u0000\u0000\u0299"+
		"\u029a\u0003D\"\u0000\u029a\u029b\u0006\u001c\uffff\uffff\u0000\u029b"+
		"\u02a3\u0001\u0000\u0000\u0000\u029c\u029d\u0003H$\u0000\u029d\u029e\u0006"+
		"\u001c\uffff\uffff\u0000\u029e\u02a3\u0001\u0000\u0000\u0000\u029f\u02a0"+
		"\u0003J%\u0000\u02a0\u02a1\u0006\u001c\uffff\uffff\u0000\u02a1\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a2\u0272\u0001\u0000\u0000\u0000\u02a2\u0276\u0001"+
		"\u0000\u0000\u0000\u02a2\u0279\u0001\u0000\u0000\u0000\u02a2\u027c\u0001"+
		"\u0000\u0000\u0000\u02a2\u027e\u0001\u0000\u0000\u0000\u02a2\u0281\u0001"+
		"\u0000\u0000\u0000\u02a2\u0285\u0001\u0000\u0000\u0000\u02a2\u028a\u0001"+
		"\u0000\u0000\u0000\u02a2\u0292\u0001\u0000\u0000\u0000\u02a2\u0295\u0001"+
		"\u0000\u0000\u0000\u02a2\u0299\u0001\u0000\u0000\u0000\u02a2\u029c\u0001"+
		"\u0000\u0000\u0000\u02a2\u029f\u0001\u0000\u0000\u0000\u02a3\u02b1\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a5\n\t\u0000\u0000\u02a5\u02a6\u0005\u00c5"+
		"\u0000\u0000\u02a6\u02a7\u0005\u00c5\u0000\u0000\u02a7\u02a8\u00038\u001c"+
		"\n\u02a8\u02a9\u0006\u001c\uffff\uffff\u0000\u02a9\u02b0\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ab\n\f\u0000\u0000\u02ab\u02ac\u0005%\u0000\u0000\u02ac"+
		"\u02ad\u0003@ \u0000\u02ad\u02ae\u0006\u001c\uffff\uffff\u0000\u02ae\u02b0"+
		"\u0001\u0000\u0000\u0000\u02af\u02a4\u0001\u0000\u0000\u0000\u02af\u02aa"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b3\u0001\u0000\u0000\u0000\u02b1\u02af"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b29\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b4\u02b5\u0007"+
		"\u0007\u0000\u0000\u02b5;\u0001\u0000\u0000\u0000\u02b6\u02b9\u0003\\"+
		".\u0000\u02b7\u02b9\u0003>\u001f\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bc\u0005\u00c9\u0000\u0000\u02bb\u02bd\u0003*\u0015\u0000\u02bc"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd"+
		"\u02be\u0001\u0000\u0000\u0000\u02be\u02bf\u0005\u00ca\u0000\u0000\u02bf"+
		"\u02c0\u0006\u001e\uffff\uffff\u0000\u02c0=\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c2\u0007\b\u0000\u0000\u02c2?\u0001\u0000\u0000\u0000\u02c3\u02c4"+
		"\u0003\\.\u0000\u02c4\u02c5\u0005\u00d2\u0000\u0000\u02c5\u02c6\u0003"+
		"\\.\u0000\u02c6A\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005\u00cd\u0000"+
		"\u0000\u02c8\u02cd\u0003\\.\u0000\u02c9\u02ca\u0005\u00cd\u0000\u0000"+
		"\u02ca\u02cb\u0005\u00cd\u0000\u0000\u02cb\u02cd\u0003\\.\u0000\u02cc"+
		"\u02c7\u0001\u0000\u0000\u0000\u02cc\u02c9\u0001\u0000\u0000\u0000\u02cd"+
		"C\u0001\u0000\u0000\u0000\u02ce\u02cf\u0005>\u0000\u0000\u02cf\u02d0\u0005"+
		"\u00c9\u0000\u0000\u02d0\u02d1\u0003h4\u0000\u02d1\u02d2\u0005\u00ca\u0000"+
		"\u0000\u02d2\u02d3\u0005?\u0000\u0000\u02d3\u02d5\u0003(\u0014\u0000\u02d4"+
		"\u02d6\u0003F#\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8\u0006"+
		"\"\uffff\uffff\u0000\u02d8E\u0001\u0000\u0000\u0000\u02d9\u02da\u0005"+
		"]\u0000\u0000\u02da\u02db\u0005T\u0000\u0000\u02db\u02dc\u0005;\u0000"+
		"\u0000\u02dc\u02eb\u0005\r\u0000\u0000\u02dd\u02de\u0005]\u0000\u0000"+
		"\u02de\u02df\u0005T\u0000\u0000\u02df\u02e0\u0005;\u0000\u0000\u02e0\u02e1"+
		"\u0005\r\u0000\u0000\u02e1\u02e2\u0005\u0005\u0000\u0000\u02e2\u02e3\u0005"+
		"<\u0000\u0000\u02e3\u02eb\u0005=\u0000\u0000\u02e4\u02e5\u0005]\u0000"+
		"\u0000\u02e5\u02e6\u0005@\u0000\u0000\u02e6\u02eb\u0005\r\u0000\u0000"+
		"\u02e7\u02e8\u0005\u0005\u0000\u0000\u02e8\u02e9\u0005<\u0000\u0000\u02e9"+
		"\u02eb\u0005=\u0000\u0000\u02ea\u02d9\u0001\u0000\u0000\u0000\u02ea\u02dd"+
		"\u0001\u0000\u0000\u0000\u02ea\u02e4\u0001\u0000\u0000\u0000\u02ea\u02e7"+
		"\u0001\u0000\u0000\u0000\u02ebG\u0001\u0000\u0000\u0000\u02ec\u02ee\u0005"+
		"~\u0000\u0000\u02ed\u02ef\b\t\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0005\u0082\u0000\u0000\u02f3I\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f5\u0005\u0087\u0000\u0000\u02f5\u02f6\u0003(\u0014\u0000\u02f6"+
		"\u02f7\t\u0000\u0000\u0000\u02f7\u02f8\u0006%\uffff\uffff\u0000\u02f8"+
		"K\u0001\u0000\u0000\u0000\u02f9\u02fb\u0005j\u0000\u0000\u02fa\u02fc\u0007"+
		"\n\u0000\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02ff\u0005\u001c"+
		"\u0000\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000"+
		"\u0000\u0000\u02ff\u0301\u0001\u0000\u0000\u0000\u0300\u0302\u0005n\u0000"+
		"\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000"+
		"\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0305\u0003b1\u0000\u0304"+
		"\u0306\u0003V+\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306\u0001"+
		"\u0000\u0000\u0000\u0306\u030b\u0001\u0000\u0000\u0000\u0307\u0308\u0005"+
		"\u00c9\u0000\u0000\u0308\u0309\u0003^/\u0000\u0309\u030a\u0005\u00ca\u0000"+
		"\u0000\u030a\u030c\u0001\u0000\u0000\u0000\u030b\u0307\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000"+
		"\u0000\u030d\u0310\u0003P(\u0000\u030e\u030f\u0005\u001a\u0000\u0000\u030f"+
		"\u0311\u0003^/\u0000\u0310\u030e\u0001\u0000\u0000\u0000\u0310\u0311\u0001"+
		"\u0000\u0000\u0000\u0311\u0313\u0001\u0000\u0000\u0000\u0312\u0314\u0003"+
		"N\'\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0006&\uffff"+
		"\uffff\u0000\u0316M\u0001\u0000\u0000\u0000\u0317\u0318\u0005P\u0000\u0000"+
		"\u0318\u0319\u0005u\u0000\u0000\u0319\u031a\u0005\u001f\u0000\u0000\u031a"+
		"\u031b\u0005w\u0000\u0000\u031b\u031c\u0003R)\u0000\u031cO\u0001\u0000"+
		"\u0000\u0000\u031d\u031e\u0003\u0002\u0001\u0000\u031e\u031f\u0006(\uffff"+
		"\uffff\u0000\u031f\u0329\u0001\u0000\u0000\u0000\u0320\u0321\u0005t\u0000"+
		"\u0000\u0321\u0322\u0003b1\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"\u0324\u0006(\uffff\uffff\u0000\u0324\u0329\u0001\u0000\u0000\u0000\u0325"+
		"\u0329\u0003p8\u0000\u0326\u0327\u0005x\u0000\u0000\u0327\u0329\u0003"+
		"R)\u0000\u0328\u031d\u0001\u0000\u0000\u0000\u0328\u0320\u0001\u0000\u0000"+
		"\u0000\u0328\u0325\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000"+
		"\u0000\u0329Q\u0001\u0000\u0000\u0000\u032a\u032f\u0003T*\u0000\u032b"+
		"\u032c\u0005\u00cb\u0000\u0000\u032c\u032e\u0003T*\u0000\u032d\u032b\u0001"+
		"\u0000\u0000\u0000\u032e\u0331\u0001\u0000\u0000\u0000\u032f\u032d\u0001"+
		"\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330S\u0001\u0000"+
		"\u0000\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0332\u0333\u0003f3\u0000"+
		"\u0333\u0336\u0005\u00c0\u0000\u0000\u0334\u0337\u0003(\u0014\u0000\u0335"+
		"\u0337\u0005v\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0335"+
		"\u0001\u0000\u0000\u0000\u0337U\u0001\u0000\u0000\u0000\u0338\u0339\u0005"+
		"s\u0000\u0000\u0339\u033a\u0005!\u0000\u0000\u033a\u033b\u0003*\u0015"+
		"\u0000\u033bW\u0001\u0000\u0000\u0000\u033c\u033e\u0003\u0006\u0003\u0000"+
		"\u033d\u033c\u0001\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0341\u0005w\u0000\u0000\u0340"+
		"\u0342\u0005k\u0000\u0000\u0341\u0340\u0001\u0000\u0000\u0000\u0341\u0342"+
		"\u0001\u0000\u0000\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u0345"+
		"\u0005\u001c\u0000\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344\u0345"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0003\f\u0006\u0000\u0347\u0348\u0005x\u0000\u0000\u0348\u034a\u0003"+
		"R)\u0000\u0349\u034b\u0003\u0014\n\u0000\u034a\u0349\u0001\u0000\u0000"+
		"\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d\u0001\u0000\u0000"+
		"\u0000\u034c\u034e\u0003\u001e\u000f\u0000\u034d\u034c\u0001\u0000\u0000"+
		"\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0350\u0001\u0000\u0000"+
		"\u0000\u034f\u0351\u0003\"\u0011\u0000\u0350\u034f\u0001\u0000\u0000\u0000"+
		"\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000"+
		"\u0352\u0353\u0006,\uffff\uffff\u0000\u0353Y\u0001\u0000\u0000\u0000\u0354"+
		"\u0359\u0005p\u0000\u0000\u0355\u0358\b\u000b\u0000\u0000\u0356\u0358"+
		"\b\f\u0000\u0000\u0357\u0355\u0001\u0000\u0000\u0000\u0357\u0356\u0001"+
		"\u0000\u0000\u0000\u0358\u035b\u0001\u0000\u0000\u0000\u0359\u0357\u0001"+
		"\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035c\u0001"+
		"\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u036c\u0005"+
		"\u0007\u0000\u0000\u035d\u036d\u0003\f\u0006\u0000\u035e\u035f\u0003\\"+
		".\u0000\u035f\u0366\u0005\n\u0000\u0000\u0360\u0361\u0005\u00cb\u0000"+
		"\u0000\u0361\u0362\u0003\\.\u0000\u0362\u0363\u0005\n\u0000\u0000\u0363"+
		"\u0365\u0001\u0000\u0000\u0000\u0364\u0360\u0001\u0000\u0000\u0000\u0365"+
		"\u0368\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0001\u0000\u0000\u0000\u0367\u0369\u0001\u0000\u0000\u0000\u0368"+
		"\u0366\u0001\u0000\u0000\u0000\u0369\u036a\u0005Q\u0000\u0000\u036a\u036b"+
		"\u0003\f\u0006\u0000\u036b\u036d\u0001\u0000\u0000\u0000\u036c\u035d\u0001"+
		"\u0000\u0000\u0000\u036c\u035e\u0001\u0000\u0000\u0000\u036d\u036f\u0001"+
		"\u0000\u0000\u0000\u036e\u0370\u0003V+\u0000\u036f\u036e\u0001\u0000\u0000"+
		"\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0372\u0001\u0000\u0000"+
		"\u0000\u0371\u0373\u0003\u0014\n\u0000\u0372\u0371\u0001\u0000\u0000\u0000"+
		"\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0375\u0001\u0000\u0000\u0000"+
		"\u0374\u0376\u0003\u001e\u000f\u0000\u0375\u0374\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0378\u0001\u0000\u0000\u0000"+
		"\u0377\u0379\u0003\"\u0011\u0000\u0378\u0377\u0001\u0000\u0000\u0000\u0378"+
		"\u0379\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a"+
		"\u037b\u0006-\uffff\uffff\u0000\u037b[\u0001\u0000\u0000\u0000\u037c\u037d"+
		"\u0003`0\u0000\u037d\u037e\u0006.\uffff\uffff\u0000\u037e\u0382\u0001"+
		"\u0000\u0000\u0000\u037f\u0380\u0005\u00d5\u0000\u0000\u0380\u0382\u0006"+
		".\uffff\uffff\u0000\u0381\u037c\u0001\u0000\u0000\u0000\u0381\u037f\u0001"+
		"\u0000\u0000\u0000\u0382]\u0001\u0000\u0000\u0000\u0383\u0388\u0003\\"+
		".\u0000\u0384\u0385\u0005\u00cb\u0000\u0000\u0385\u0387\u0003\\.\u0000"+
		"\u0386\u0384\u0001\u0000\u0000\u0000\u0387\u038a\u0001\u0000\u0000\u0000"+
		"\u0388\u0386\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000"+
		"\u0389\u038b\u0001\u0000\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000"+
		"\u038b\u038c\u0006/\uffff\uffff\u0000\u038c_\u0001\u0000\u0000\u0000\u038d"+
		"\u038e\u0005\u00d4\u0000\u0000\u038ea\u0001\u0000\u0000\u0000\u038f\u0394"+
		"\u0005\u00d4\u0000\u0000\u0390\u0391\u0005\u00c8\u0000\u0000\u0391\u0393"+
		"\u0005\u00d4\u0000\u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0393\u0396"+
		"\u0001\u0000\u0000\u0000\u0394\u0392\u0001\u0000\u0000\u0000\u0394\u0395"+
		"\u0001\u0000\u0000\u0000\u0395c\u0001\u0000\u0000\u0000\u0396\u0394\u0001"+
		"\u0000\u0000\u0000\u0397\u0398\u0005\u00c8\u0000\u0000\u0398\u0399\u0003"+
		"\\.\u0000\u0399e\u0001\u0000\u0000\u0000\u039a\u039f\u0003\\.\u0000\u039b"+
		"\u039d\u0003d2\u0000\u039c\u039e\u0003d2\u0000\u039d\u039c\u0001\u0000"+
		"\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u03a0\u0001\u0000"+
		"\u0000\u0000\u039f\u039b\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a2\u00063\uffff"+
		"\uffff\u0000\u03a2g\u0001\u0000\u0000\u0000\u03a3\u03a8\u0003f3\u0000"+
		"\u03a4\u03a5\u0005\u00cb\u0000\u0000\u03a5\u03a7\u0003f3\u0000\u03a6\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a7\u03aa\u0001\u0000\u0000\u0000\u03a8\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9i\u0001"+
		"\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03ab\u03ad\u0005"+
		"[\u0000\u0000\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000"+
		"\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03af\u0005Z\u0000"+
		"\u0000\u03afk\u0001\u0000\u0000\u0000\u03b0\u03b1\u0005\u00d2\u0000\u0000"+
		"\u03b1\u03b4\u0003\\.\u0000\u03b2\u03b4\u0005\u00d3\u0000\u0000\u03b3"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b2\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b8\u0005\u00d6\u0000\u0000\u03b6\u03b8\u0005\u00d7\u0000\u0000\u03b7"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b8"+
		"m\u0001\u0000\u0000\u0000\u03b9\u03ba\u0003l6\u0000\u03ba\u03bb\u0006"+
		"7\uffff\uffff\u0000\u03bb\u03c4\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005"+
		"\u00d8\u0000\u0000\u03bd\u03c4\u00067\uffff\uffff\u0000\u03be\u03bf\u0005"+
		"\u00df\u0000\u0000\u03bf\u03c4\u00067\uffff\uffff\u0000\u03c0\u03c4\u0005"+
		"Z\u0000\u0000\u03c1\u03c4\u0005_\u0000\u0000\u03c2\u03c4\u0005`\u0000"+
		"\u0000\u03c3\u03b9\u0001\u0000\u0000\u0000\u03c3\u03bc\u0001\u0000\u0000"+
		"\u0000\u03c3\u03be\u0001\u0000\u0000\u0000\u03c3\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c2\u0001\u0000\u0000"+
		"\u0000\u03c4o\u0001\u0000\u0000\u0000\u03c5\u03c6\u0007\r\u0000\u0000"+
		"\u03c6\u03c7\u0003t:\u0000\u03c7q\u0001\u0000\u0000\u0000\u03c8\u03cc"+
		"\u0005o\u0000\u0000\u03c9\u03cb\b\u000e\u0000\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03cb\u03ce\u0001\u0000\u0000\u0000\u03cc\u03ca\u0001"+
		"\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03cf\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cc\u0001\u0000\u0000\u0000\u03cf\u03d0\u0005"+
		"\u0007\u0000\u0000\u03d0s\u0001\u0000\u0000\u0000\u03d1\u03d6\u0005\u00c9"+
		"\u0000\u0000\u03d2\u03d5\b\u000f\u0000\u0000\u03d3\u03d5\u0003t:\u0000"+
		"\u03d4\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000\u0000"+
		"\u03d5\u03d8\u0001\u0000\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000"+
		"\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u03d9\u0001\u0000\u0000\u0000"+
		"\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d9\u03da\u0005\u00ca\u0000\u0000"+
		"\u03dau\u0001\u0000\u0000\u0000s\u0085\u0088\u008c\u0093\u0098\u009f\u00a3"+
		"\u00a7\u00a9\u00af\u00b3\u00b5\u00bb\u00c7\u00ca\u00cd\u00d0\u00d3\u00d6"+
		"\u00d9\u00e2\u00eb\u00f5\u00fb\u00ff\u0102\u0107\u0111\u0114\u011f\u0127"+
		"\u012d\u0138\u013f\u0141\u0147\u0154\u015b\u016c\u0176\u017d\u0182\u0188"+
		"\u0196\u019b\u019f\u01a2\u01a7\u01ad\u01bb\u01c3\u01cc\u01d4\u01e0\u01e9"+
		"\u01f5\u01fa\u01fc\u020d\u0211\u0219\u0223\u0233\u0239\u023f\u0248\u025d"+
		"\u025f\u0270\u02a2\u02af\u02b1\u02b8\u02bc\u02cc\u02d5\u02ea\u02f0\u02fb"+
		"\u02fe\u0301\u0305\u030b\u0310\u0313\u0328\u032f\u0336\u033d\u0341\u0344"+
		"\u034a\u034d\u0350\u0357\u0359\u0366\u036c\u036f\u0372\u0375\u0378\u0381"+
		"\u0388\u0394\u039d\u039f\u03a8\u03ac\u03b3\u03b7\u03c3\u03cc\u03d4\u03d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}