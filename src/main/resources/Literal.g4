lexer grammar Literal;
SINGLE_QUOTED_TEXT
    : '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\''
    ;

DOUBLE_QUOTED_TEXT
    : '"' ( '\\'. | '""' | ~('"'| '\\') )* '"'
    ;

// number literals
NUMBER_LITERAL
: INTEGER_LITERAL
| FLOAT_LITERAL
| BINARY_LITERAL
| OCTAL_LITERAL
| HEX_LITERAL
;

INTEGER_LITERAL
: ('0' | '1'..'9' ('0'..'9')*)
;

FLOAT_LITERAL
: ('0'..'9')+ ('.' ('0'..'9')*)? EXPONENT?
| '.' ('0'..'9')+ EXPONENT?
| ('0'..'9')+ EXPONENT
;

EXPONENT
: 'E' ('+' | '-')? ('0'..'9')+
;

BINARY_LITERAL
: 'b' '\'' ('0' | '1')* '\''
;

OCTAL_LITERAL
: '0' ('0'..'7')+
;

HEX_LITERAL
: '0'  'X' ('0'..'9' | 'A'..'F')+
;


// date and time
DATE_AND_TIME_LITERAL
: DATE_LITERAL
| TIME_LITERAL
| TIMESTAMP_LITERAL
| DATETIME_LITERAL
| YEAR_LITERAL
;
DATE_LITERAL
: '\'' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT '\''
;

DATETIME_LITERAL
: '\'' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT
  ' ' DIGIT DIGIT ':' DIGIT DIGIT ':' DIGIT DIGIT '\''
;

TIMESTAMP_LITERAL
: '\'' DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT
  ' ' DIGIT DIGIT ':' DIGIT DIGIT ':' DIGIT DIGIT '.' DIGIT+ '\''
;

TIME_LITERAL
: '\'' DIGIT DIGIT ':' DIGIT DIGIT ':' DIGIT DIGIT '\''
;

YEAR_LITERAL
: '\'' DIGIT DIGIT DIGIT DIGIT '\''
;

DIGIT
: '0'..'9'
;