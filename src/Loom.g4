grammar Loom;

// STORY EXCLUSIVE GRAMMER
program: story section;

story: STORY LCURL title (section_assignment)? sections section_links RCURL;

section_assignment: identifier COLON component_id (section_assignment)?;

sections: SECTION (LBRAK (START|END) RBRAK)? LPAREN inner_component_id RPAREN COLON (component_id|identifier) (sections)? ;

section_links: LINK LBRAK inner_component_id ARROW inner_component_id RBRAK (section_links)?;


// SECTION EXCLUSIVE GRAMMER

section: SECTION LCURL title chapter_assignment chapters chapter_links RCURL;

chapter_assignment: identifier COLON component_id (chapter_assignment)?;

chapters: CHAPTER (LBRAK (START|END) RBRAK)? LPAREN inner_component_id RPAREN COLON (component_id|identifier) (chapters)?;

chapter_links: LINK LBRAK inner_component_id ARROW inner_component_id RBRAK;


// CHAPTER EXCLUSIVE GRAMMER

chapter: CHAPTER LCURL title file_assignment files file_links RCURL;

file_assignment: identifier COLON file (file_assignment)?;

files: FILE (LBRAK (START|END) RBRAK)? LPAREN inner_component_id RPAREN  COLON inner_component_id (files)?;

file_links: LINK LBRAK inner_component_id ARROW inner_component_id RBRAK;

file: QUOTE C COLON BKSLASH (NONWSSTR+ BKSLASH?)+ QUOTE;

// SHARED GRAMMER

title: TLE COLON string (RBRAK component_id LBRAK)?;

component_id: DOLLAR identifier;

inner_component_id: UNDRSCORE identifier;

identifier: NONWSSTR;

string: QUOTE (STR|NONWSSTR) QUOTE;

// TOKENS

C: 'C';

TLE: 'TITLE';

STORY: 'STORY';

START: 'START';

END: 'END';

SECTION: 'SECTION';

CHAPTER: 'CHAPTER';

FILE: 'FILE';

LINK: 'LINK';

ARROW: '->';

NONWSSTR: [a-z]+;

STR: ([a-z]+ (' ')*)+;

UNDRSCORE: '_';

COLON: ':';

LBRAK: '[';

RBRAK: ']';

LCURL: '{';

RCURL: '}';

LPAREN: '(';

RPAREN: ')';

BKSLASH: '\\' ;

QUOTE: '"';

SPC: ' ';

DOLLAR: '$';

WS:	[ \t\r\n]+ -> skip;

WSPC: ' '+ -> skip;