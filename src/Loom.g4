grammar Loom;

// STORY EXCLUSIVE GRAMMER
<<<<<<< HEAD

program: story section chapter+ page+;

story: STORY LCURL title (section_assignment)? sections link? RCURL;

=======
program: story section chapter+ page+;

story: STORY LCURL title (section_assignment)? sections link? RCURL;

>>>>>>> acf9fbafd8c646e003257ed1fb37bfd1c493e5bb
section_assignment: identifier COLON component_id (section_assignment)?;

sections: SECTION (LBRAK (START|END) RBRAK)? COLON (component_id|identifier) (sections)? ;

// SECTION EXCLUSIVE GRAMMER

section: SECTION LCURL title (chapter_assignment)? chapters link? RCURL;

chapter_assignment: identifier COLON component_id (chapter_assignment)?;

chapters: CHAPTER (LBRAK (START|END) RBRAK)? COLON (component_id|identifier) (chapters)?;
<<<<<<< HEAD

// CHAPTER EXCLUSIVE GRAMMER

chapter: CHAPTER LCURL title (page_assignment)? pages* page_links* RCURL;

page_assignment: identifier COLON component_id (page_assignment)?;

pages: PAGE (LBRAK (START|END) RBRAK)? COLON (component_id|identifier);

page_links: LINK LBRAK (component_id|identifier) DOT (component_id|identifier) RBRAK LBRAK (component_id|identifier) RBRAK;
=======

// CHAPTER EXCLUSIVE GRAMMER

chapter: CHAPTER LCURL title (page_assignment)? pages page_links? RCURL;

page_assignment: identifier COLON component_id (page_assignment)?;

pages: PAGE (LBRAK (START|END) RBRAK)? COLON (component_id|identifier) (pages)?;

page_links: LINK LBRAK (component_id|identifier) DOT (component_id|identifier) RBRAK LBRAK (component_id|identifier) RBRAK (page_links)?;
>>>>>>> acf9fbafd8c646e003257ed1fb37bfd1c493e5bb

// PAGE EXCLUSIVE GRAMMER

page: PAGE LCURL title text option? RCURL;

text: TEXT COLON string;

option: OPT LBRAK component_id RBRAK COLON string (option)?;

// SHARED GRAMMER

title: TLE COLON string (LBRAK component_id RBRAK)?;

link: LINK LBRAK (component_id|identifier) ARROW (component_id|identifier) RBRAK (link)?;

component_id: DOLLAR identifier;

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

PAGE: 'PAGE';

TEXT: 'TEXT';

LINK: 'LINK';

OPT: 'OPTION';

ARROW: '->';

NONWSSTR: ([a-z]+ (UNDRSCORE)?)+;

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

DOT: '.';

WS:	[ \t\r\n]+ -> skip;

WSPC: ' '+ -> skip;