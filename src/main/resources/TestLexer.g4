lexer grammar TestLexer;
options { caseInsensitive = true; }

import Literal;

@header {
package tools;
}
@lexer::members {
  int depth = 0;
}

// ignore

SPACE:                               [ \t\r\n]+    -> skip;
SPEC_MYSQL_COMMENT:                  '/*!' .+? '*/' -> channel(HIDDEN);
COMMENT_INPUT:                       '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:                        (
                                       ('--' [ \t] | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                                       | '--' ('\r'? '\n' | EOF)
                                     ) -> channel(HIDDEN);

// keywords
WITH: 'WITH';
RECURSIVE:'RECURSIVE';
FROM: 'FROM';
EXISTS: 'EXISTS';
WHERE: 'WHERE';
DOTSTAR:'.*';
BINARY:'BINARY';
STARTING: 'STARTING';
MODE: 'MODE';
SKIP_: 'SKIP';
LOCKED: 'LOCKED';
NOWAIT: 'NOWAIT';
SHARE: 'SHARE';
QUESTION_MARK: '?';
TERMINATED: 'TERMINATED';
CHARACTER: 'CHARACTER';
COLUMNS: 'COLUMNS';
LINES: 'LINES';
OPTIONALLY: 'OPTIONALLY';
ENCLOSED: 'ENCLOSED';
ESCAPED: 'ESCAPED';
AS: 'AS';
USE: 'USE"';
IGNORE: 'IGNORE';
FORCE: 'FORCE';
INDEX: 'INDEX';
KEY: 'KEY';
JOIN: 'JOIN';
BY: 'BY';
WINDOW: 'WINDOW';
OFFSET: 'OFFSET';
OUTFILE: 'OUTFILE';
COLLATE: 'COLLATE';
MAX :'MAX';
MIN:'MIN';
SUM:'SUM';
COUNT:'COUNT';
AVG:'AVG';
BIT_XOR: 'BIT_XOR';
BIT_AND: 'BIT_AND';
BIT_OR: 'BIT_OR';
GROUP_CONCAT: 'GROUP_CONCAT';
JSON_ARRAYAGG: 'JSON_ARRAYAGG';
JSON_OBJECTAGG: 'JSON_OBJECTAGG';
STD: 'STD';
STDDEV: 'STDDEV';
STDDEV_POP: 'STDDEV_POP';
STDDEV_SAMP: 'STDDEV_SAMP';
VAR_POP: 'VAR_POP';
VAR_SAMP:'VAR_SAMP';
VARIANCE:'VARIANCE';

OVER:'OVER';

ROWS: 'ROWS';
ROW: 'ROW';
LANGUAGE: 'LANGUAGE';
QUERY: 'QUERY';
EXPANSION: 'EXPANSION';
MATCH: 'MATCH';
AGAINST: 'AGAINST';
BOOLEAN: 'BOOLEAN';
RANGE: 'RANGE';
CURRENT: 'CURRENT';
UNBOUNDED: 'UNBOUNDED';
PRECEDING: 'PRECEDING';
FOLLOWING: 'FOLLOWING';

ORDER: 'ORDER';
FOR: 'FOR';
LOCK: 'LOCK';
GROUP: 'GROUP' ;
HAVING: 'HAVING' ;
LIMIT: 'LIMIT';

INNER: 'INNER';
CROSS: 'CROSS';
LEFT: 'LEFT';
RIGHT: 'RIGHT';
ON: 'ON';
USING: 'USING';
STRAIGHT_JOIN:'STRAIGHT_JOIN';
OUTER:'OUTER';
NATURAL: 'NATURAL';
DISTINCT: 'DISTINCT';
DISTINCTROW: 'DISTINCTROW';

// symbols
AND: 'AND';
OR: 'OR';
XOR: 'XOR';
NULL: 'NULL';
NOT: 'NOT';
IS: 'IS';
IN: 'IN';
LIKE: 'LIKE';

TRUE: 'TRUE';
FALSE: 'FALSE';
UNKNOWN: 'UNKNOWN';

ALL: 'ALL';
ANY: 'ANY';
SOME: 'SOME';

BETWEEN: 'BETWEEN';
MEMBER: 'MEMBER';
ESCAPE: 'ESCAPE';
OF: 'OF';
UNION : 'UNION';

INSERT: 'INSERT';
LOW_PRIORITY: 'LOW_PRIORITY';
DELAYED: 'DELAYED';
HIGH_PRIORITY: 'HIGH_PRIORITY';
INTO: 'INTO';
SELECT : 'SELECT';
DELETE: 'DELETE';
VALUE: 'VALUE';
VALUES:'VALUES';
PARTITION: 'PARTITION';
TABLE: 'TABLE';
DUPLICATE: 'DUPLICATE';
DEFAULT: 'DEFAULT';
UPDATE: 'UPDATE';
SET: 'SET';
REGEXP: 'REGEXP';
RLIKE: 'RLIKE';
ASC: 'ASC';
DESC: 'DESC';

SOUNDS: 'SOUNDS';

CASE: 'CASE';
WHEN: 'WHEN';
THEN: 'THEN';
ELSE: 'ELSE';
END: 'END';
IF: 'IF';
LOCALTIME: 'LOCALTIME';
LOCALTIMESTAMP: 'LOCALTIMESTAMP';
REPLACE: 'REPLACE';
INTERVAL: 'INTERVAL';
DATABASE: 'DATABASE';
SCHEMA: 'SCHEMA';
DATE: 'DATE';
DAY: 'DAY';
GEOMETRYCOLLECTION: 'GEOMETRYCOLLECTION';
LINESTRING: 'LINESTRING';
MULTILINESTRING: 'MULTILINESTRING';
MULTIPOINT: 'MULTIPOINT';
MULTIPOLYGON: 'MULTIPOLYGON';
POINT: 'POINT';
POLYGON: 'POLYGON';
TIME: 'TIME';
TIMESTAMP: 'TIMESTAMP';
TIMESTAMP_ADD: 'TIMESTAMP_ADD';
TIMESTAMP_DIFF: 'TIMESTAMP_DIFF';
CURRENT_TIMESTAMP: 'CURRENT_TIMESTAMP';
CURRENT_DATE: 'CURRENT_DATE';
CURRENT_TIME: 'CURRENT_TIME';
UTC_TIMESTAMP: 'UTC_TIMESTAMP';
LAST_DAY: 'LAST_DAY';
MICROSECOND: 'MICROSECOND';
SECOND: 'SECOND';
MINUTE: 'MINUTE';
HOUR: 'HOUR';
WEEK: 'WEEK';
MONTH: 'MONTH';
QUARTER: 'QUARTER';
YEAR: 'YEAR';
SECOND_MICROSECOND: 'SECOND_MICROSECOND';
MINUTE_MICROSECOND: 'MINUTE_MICROSECOND';
MINUTE_SECOND: 'MINUTE_SECOND';
HOUR_MICROSECOND: 'HOUR_MICROSECOND';
HOUR_SECOND : 'HOUR_SECOND';
HOUR_MINUTE : 'HOUR_MINUTE';
DAY_MICROSECOND: 'DAY_MICROSECOND';
DAY_SECOND: 'DAY_SECOND';
DAY_MINUTE: 'DAY_MINUTE';
DAY_HOUR : 'DAY_HOUR';
YEAR_MONTH: 'YEAR_MONTH';
SEPARATOR: 'SEPARATOR';


VAR_ASSIGN:                          ':=';
PLUS_ASSIGN:                         '+=';
MINUS_ASSIGN:                        '-=';
MULT_ASSIGN:                         '*=';
DIV_ASSIGN:                          '/=';
MOD_ASSIGN:                          '%=';
AND_ASSIGN:                          '&=';
XOR_ASSIGN:                          '^=';
OR_ASSIGN:                           '|=';


// Operators. Arithmetics

STAR:                                '*';
DIVIDE:                              '/';
MODULE:                              '%';
PLUS:                                '+';
MINUS:                               '-';
DIV:                                 'DIV';
MOD:                                 'MOD';


// Operators. Comparation

EQUAL_SYMBOL:                        '=';
GREATER_SYMBOL:                      '>';
LESS_SYMBOL:                         '<';
EXCLAMATION_SYMBOL:                  '!';


// Operators. Bit

BIT_NOT_OP:                          '~';
BIT_OR_OP:                           '|';
BIT_AND_OP:                          '&';
BIT_XOR_OP:                          '^';


// Constructors symbols

DOT:                                 '.';
LP:                                  '('
{
  depth++;
  if(depth > 5) {
    throw new RuntimeException("sql too deep");
  }
};
RP:                                  ')'
{
  depth--;
};
COMMA:                               ',';
SEMI:                                ';';
AT_SIGN:                             '@';
SINGLE_QUOTE_SYMB:                   '\'';
DOUBLE_QUOTE_SYMB:                   '"';
REVERSE_QUOTE_SYMB:                  '`';
COLON_SYMB:                          ':';
UNDERSCORE:                          '_';

N_SYMB :                             'N';

ID:                 [A-Z_$0-9\u0080-\uFFFF]*?[A-Z_$\u0080-\uFFFF]+?[A-Z_$0-9\u0080-\uFFFF]*;

REVERSE_QUOTE_ID:                    '`' ~'`'+ '`';




