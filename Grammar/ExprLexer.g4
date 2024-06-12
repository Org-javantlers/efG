lexer grammar ExprLexer;

ATRIB : '=' ;
DELIM : ';' ;
PLUS : '+' ;
TIMEs : '*' ;
VIRG : ',' ;
LPAR : '(' ;
RPAR : ')' ;
FOR: 'for' ;
FIM : 'fim' ;

NUMBER: [0-9]+ ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\n\r\f]+ -> skip ;