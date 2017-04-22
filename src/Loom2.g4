grammar Loom2;

program: sections+ ;

sections: SEC_IDENT RCURL (statements)* LCURL ;

statements: title | definition | assignment | link | if_statement ;

title: TITLE COLON STRING (RBRAK component_id LBRAK)? ;

definition: KEY_IDENT (RBRAK ( TIME_IDENT | component_id ) LBRAK)? COLON
            (component_id | NONWSSTR | STRING);

assignment: NONWSSTR COLON component_id ;

link: LINK RBRAK (component_id | NONWSSTR ) ARROW ( component_id | NONWSSTR ) LBRAK |
      LINK RBRAK reference LBRAK RBRAK (NONWSSTR | component_id) LBRAK;

if_statement: IF RBRAK reference LBRAK COLON definition ENDIF;

component_id: DOLLAR NONWSSTR ;

reference: (component_id | NONWSSTR) DOT component_id ;

SEC_IDENT: (STORY | SECTION | CHAPTER | PAGE) ;

KEY_IDENT: (SEC | CHAPT | PG | TEXT | OPTION) ;

TIME_IDENT: START | END ;

DOLLAR: '$';

COLON: ':';

QUOTE: '"';

RBRAK: '[';

LBRAK: ']';

RCURL: '{';

LCURL: '}';

ARROW: '->' ;

CHAPTER: 'CHAPTER' ;

CHAPT: 'CHAPT' ;

DOT: '.';

END: 'END';

ENDIF: 'ENDIF' ;

IF: 'IF';

LINK: 'LINK';

OPTION: 'OPTION' ;

PAGE: 'PAGE' ;

PG: 'PG' ;

SECTION: 'SECTION';

SEC: 'SEC';

START: 'START';

STORY: 'STORY';

TEXT: 'TEXT' ;

TITLE: 'TITLE';

SEMICOLON: ';';

UNDERSCORE: '_';

FSLASH: '/';

STAR: '*';

NONWSSTR: ([a-zA-Z]+ (UNDERSCORE)?)+;

STRING : '"' ( '\\' [\\"] | ~[\\"\r\n] )* '"';

WS : [ \t\r\n]+ -> skip ;