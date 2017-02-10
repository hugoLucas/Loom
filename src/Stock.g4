grammar Stock;


program
  :	START LCURL period  assignments picks RCURL
  ;


period
  :	PERIOD COLON date COMMA date
  ;


assignments
  :	identifier COLON (INT | string) assignments*
  ;


picks
  :	PICK LCURL pick RCURL (picks)*
  ;


pick
  :	symbol buy (sell)? (hedge)?
  ;


symbol
  :	SYM COLON (string | identifier)
  ;


buy
  :	BUY COLON (INT | identifier) (condition)?
  ;


sell
  :	SELL COLON ( INT | identifier) (condition)?
  ;


hedge
  :	HEDGE LCURL option buy strike RCURL
  ;


option
  :	(PUT | CALL)
  ;


strike
  :	STRIKE COLON (INT | PRICE | identifier)
  ;


condition
  :	WHEN COLON attribute logical (INT | identifier)
  ;


attribute
  :	(OPEN | HIGH | LOW | CLOSE)
  ;


logical
  :	( GREAT | GREQ | LESS | LEQ | EQ )
  ;


date
  :	INT FRWSLASH INT FRWSLASH INT
  ;


string
  :	QUOTE STR QUOTE
  ;


identifier
  :	STR
  ;


STR
  :	[a-z]+
  ;


INT
  :	[0-9]+
  ;


WS
  :	[ \t\r\n]+ -> skip
  ;


START
  :	'START'
  ;


PERIOD
  :	'PERIOD'
  ;


PICK
  :	'PICK'
  ;


SYM
  :	'SYM'
  ;


BUY
  :	'BUY'
  ;


SELL
  :	'SELL'
  ;


HEDGE
  :	'HEDGE'
  ;

PUT
  :	'PUT'
  ;


CALL
  :	'CALL'
  ;

STRIKE
  :	'STRIKE'
  ;

PRICE
  :	'PRICE'
  ;

WHEN
  :	'WHEN'
  ;

OPEN
  :	'OPEN'
  ;

HIGH
  :	'HIGH'
  ;

LOW
  :	'LOW'
  ;

CLOSE
  :	'CLOSE'
  ;

COLON
  :	':'
  ;

COMMA
  :	','
  ;

QUOTE
  :	'"'
  ;

LCURL
  :	'{'
  ;

RCURL
  :	'}'
  ;

FRWSLASH
  :	'/'
  ;

LESS
  : 	'<'
  ;

LEQ
  :	'<='
  ;

GREAT
  :	'>'
  ;

GREQ
  :	'>='
  ;

EQ
  :	'=='
  ;