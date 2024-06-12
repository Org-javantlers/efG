parser grammar ExprParser;

options { tokenVocab=ExprLexer; }

prog
    : inst prog
    | 'fim' EOF
    ;

inst
    : atrib
    | forcicle
    ;

atrib: ID '=' expr ';'
    ;

forcicle : 'for' ID '(' NUMBER ',' NUMBER ',' NUMBER ')' ID '=' expr ';'
    ;

expr: expr '+' term
    | term
    ;

term: term '*' factor
    | factor
    ;

factor: '(' expr ')'
    | ID
    | NUMBER
    ;