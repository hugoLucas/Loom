// Generated from C:/Users/Hugo Lucas/IdeaProjects/Stock/src\Loom.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LoomParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		C=1, TLE=2, STORY=3, START=4, END=5, SECTION=6, CHAPTER=7, FILE=8, LINK=9, 
		ARROW=10, NONWSSTR=11, STR=12, UNDRSCORE=13, COLON=14, LBRAK=15, RBRAK=16, 
		LCURL=17, RCURL=18, LPAREN=19, RPAREN=20, BKSLASH=21, QUOTE=22, SPC=23, 
		DOLLAR=24, WS=25, WSPC=26;
	public static final int
		RULE_program = 0, RULE_story = 1, RULE_section_assignment = 2, RULE_sections = 3, 
		RULE_section_links = 4, RULE_section = 5, RULE_chapter_assignment = 6, 
		RULE_chapters = 7, RULE_chapter_links = 8, RULE_chapter = 9, RULE_file_assignment = 10, 
		RULE_files = 11, RULE_file_links = 12, RULE_file = 13, RULE_title = 14, 
		RULE_component_id = 15, RULE_inner_component_id = 16, RULE_identifier = 17, 
		RULE_string = 18;
	public static final String[] ruleNames = {
		"program", "story", "section_assignment", "sections", "section_links", 
		"section", "chapter_assignment", "chapters", "chapter_links", "chapter", 
		"file_assignment", "files", "file_links", "file", "title", "component_id", 
		"inner_component_id", "identifier", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'C'", "'TITLE'", "'STORY'", "'START'", "'END'", "'SECTION'", "'CHAPTER'", 
		"'FILE'", "'LINK'", "'->'", null, null, "'_'", "':'", "'['", "']'", "'{'", 
		"'}'", "'('", "')'", "'\\'", "'\"'", "' '", "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "C", "TLE", "STORY", "START", "END", "SECTION", "CHAPTER", "FILE", 
		"LINK", "ARROW", "NONWSSTR", "STR", "UNDRSCORE", "COLON", "LBRAK", "RBRAK", 
		"LCURL", "RCURL", "LPAREN", "RPAREN", "BKSLASH", "QUOTE", "SPC", "DOLLAR", 
		"WS", "WSPC"
	};
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
	public String getGrammarFileName() { return "Loom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LoomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StoryContext story() {
			return getRuleContext(StoryContext.class,0);
		}
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			story();
			setState(39);
			section();
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

	public static class StoryContext extends ParserRuleContext {
		public TerminalNode STORY() { return getToken(LoomParser.STORY, 0); }
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public Section_linksContext section_links() {
			return getRuleContext(Section_linksContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public Section_assignmentContext section_assignment() {
			return getRuleContext(Section_assignmentContext.class,0);
		}
		public StoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_story; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterStory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitStory(this);
		}
	}

	public final StoryContext story() throws RecognitionException {
		StoryContext _localctx = new StoryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_story);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(STORY);
			setState(42);
			match(LCURL);
			setState(43);
			title();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(44);
				section_assignment();
				}
			}

			setState(47);
			sections();
			setState(48);
			section_links();
			setState(49);
			match(RCURL);
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

	public static class Section_assignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public Section_assignmentContext section_assignment() {
			return getRuleContext(Section_assignmentContext.class,0);
		}
		public Section_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterSection_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitSection_assignment(this);
		}
	}

	public final Section_assignmentContext section_assignment() throws RecognitionException {
		Section_assignmentContext _localctx = new Section_assignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			identifier();
			setState(52);
			match(COLON);
			setState(53);
			component_id();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(54);
				section_assignment();
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

	public static class SectionsContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(LoomParser.SECTION, 0); }
		public TerminalNode LPAREN() { return getToken(LoomParser.LPAREN, 0); }
		public Inner_component_idContext inner_component_id() {
			return getRuleContext(Inner_component_idContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LoomParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public SectionsContext sections() {
			return getRuleContext(SectionsContext.class,0);
		}
		public TerminalNode START() { return getToken(LoomParser.START, 0); }
		public TerminalNode END() { return getToken(LoomParser.END, 0); }
		public SectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitSections(this);
		}
	}

	public final SectionsContext sections() throws RecognitionException {
		SectionsContext _localctx = new SectionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(SECTION);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(58);
				match(LBRAK);
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(60);
				match(RBRAK);
				}
			}

			setState(63);
			match(LPAREN);
			setState(64);
			inner_component_id();
			setState(65);
			match(RPAREN);
			setState(66);
			match(COLON);
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(67);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(68);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SECTION) {
				{
				setState(71);
				sections();
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

	public static class Section_linksContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(LoomParser.LINK, 0); }
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public List<Inner_component_idContext> inner_component_id() {
			return getRuleContexts(Inner_component_idContext.class);
		}
		public Inner_component_idContext inner_component_id(int i) {
			return getRuleContext(Inner_component_idContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(LoomParser.ARROW, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public Section_linksContext section_links() {
			return getRuleContext(Section_linksContext.class,0);
		}
		public Section_linksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterSection_links(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitSection_links(this);
		}
	}

	public final Section_linksContext section_links() throws RecognitionException {
		Section_linksContext _localctx = new Section_linksContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_section_links);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LINK);
			setState(75);
			match(LBRAK);
			setState(76);
			inner_component_id();
			setState(77);
			match(ARROW);
			setState(78);
			inner_component_id();
			setState(79);
			match(RBRAK);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINK) {
				{
				setState(80);
				section_links();
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

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(LoomParser.SECTION, 0); }
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public Chapter_assignmentContext chapter_assignment() {
			return getRuleContext(Chapter_assignmentContext.class,0);
		}
		public ChaptersContext chapters() {
			return getRuleContext(ChaptersContext.class,0);
		}
		public Chapter_linksContext chapter_links() {
			return getRuleContext(Chapter_linksContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(SECTION);
			setState(84);
			match(LCURL);
			setState(85);
			title();
			setState(86);
			chapter_assignment();
			setState(87);
			chapters();
			setState(88);
			chapter_links();
			setState(89);
			match(RCURL);
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

	public static class Chapter_assignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public Chapter_assignmentContext chapter_assignment() {
			return getRuleContext(Chapter_assignmentContext.class,0);
		}
		public Chapter_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapter_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterChapter_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitChapter_assignment(this);
		}
	}

	public final Chapter_assignmentContext chapter_assignment() throws RecognitionException {
		Chapter_assignmentContext _localctx = new Chapter_assignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chapter_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			identifier();
			setState(92);
			match(COLON);
			setState(93);
			component_id();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(94);
				chapter_assignment();
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

	public static class ChaptersContext extends ParserRuleContext {
		public TerminalNode CHAPTER() { return getToken(LoomParser.CHAPTER, 0); }
		public TerminalNode LPAREN() { return getToken(LoomParser.LPAREN, 0); }
		public Inner_component_idContext inner_component_id() {
			return getRuleContext(Inner_component_idContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LoomParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public ChaptersContext chapters() {
			return getRuleContext(ChaptersContext.class,0);
		}
		public TerminalNode START() { return getToken(LoomParser.START, 0); }
		public TerminalNode END() { return getToken(LoomParser.END, 0); }
		public ChaptersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterChapters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitChapters(this);
		}
	}

	public final ChaptersContext chapters() throws RecognitionException {
		ChaptersContext _localctx = new ChaptersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chapters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(CHAPTER);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(98);
				match(LBRAK);
				setState(99);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(100);
				match(RBRAK);
				}
			}

			setState(103);
			match(LPAREN);
			setState(104);
			inner_component_id();
			setState(105);
			match(RPAREN);
			setState(106);
			match(COLON);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				setState(107);
				component_id();
				}
				break;
			case NONWSSTR:
				{
				setState(108);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHAPTER) {
				{
				setState(111);
				chapters();
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

	public static class Chapter_linksContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(LoomParser.LINK, 0); }
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public List<Inner_component_idContext> inner_component_id() {
			return getRuleContexts(Inner_component_idContext.class);
		}
		public Inner_component_idContext inner_component_id(int i) {
			return getRuleContext(Inner_component_idContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(LoomParser.ARROW, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public Chapter_linksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapter_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterChapter_links(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitChapter_links(this);
		}
	}

	public final Chapter_linksContext chapter_links() throws RecognitionException {
		Chapter_linksContext _localctx = new Chapter_linksContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_chapter_links);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LINK);
			setState(115);
			match(LBRAK);
			setState(116);
			inner_component_id();
			setState(117);
			match(ARROW);
			setState(118);
			inner_component_id();
			setState(119);
			match(RBRAK);
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

	public static class ChapterContext extends ParserRuleContext {
		public TerminalNode CHAPTER() { return getToken(LoomParser.CHAPTER, 0); }
		public TerminalNode LCURL() { return getToken(LoomParser.LCURL, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public File_assignmentContext file_assignment() {
			return getRuleContext(File_assignmentContext.class,0);
		}
		public FilesContext files() {
			return getRuleContext(FilesContext.class,0);
		}
		public File_linksContext file_links() {
			return getRuleContext(File_linksContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(LoomParser.RCURL, 0); }
		public ChapterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterChapter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitChapter(this);
		}
	}

	public final ChapterContext chapter() throws RecognitionException {
		ChapterContext _localctx = new ChapterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_chapter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(CHAPTER);
			setState(122);
			match(LCURL);
			setState(123);
			title();
			setState(124);
			file_assignment();
			setState(125);
			files();
			setState(126);
			file_links();
			setState(127);
			match(RCURL);
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

	public static class File_assignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public File_assignmentContext file_assignment() {
			return getRuleContext(File_assignmentContext.class,0);
		}
		public File_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterFile_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitFile_assignment(this);
		}
	}

	public final File_assignmentContext file_assignment() throws RecognitionException {
		File_assignmentContext _localctx = new File_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_file_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			identifier();
			setState(130);
			match(COLON);
			setState(131);
			file();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NONWSSTR) {
				{
				setState(132);
				file_assignment();
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

	public static class FilesContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(LoomParser.FILE, 0); }
		public TerminalNode LPAREN() { return getToken(LoomParser.LPAREN, 0); }
		public List<Inner_component_idContext> inner_component_id() {
			return getRuleContexts(Inner_component_idContext.class);
		}
		public Inner_component_idContext inner_component_id(int i) {
			return getRuleContext(Inner_component_idContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LoomParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public FilesContext files() {
			return getRuleContext(FilesContext.class,0);
		}
		public TerminalNode START() { return getToken(LoomParser.START, 0); }
		public TerminalNode END() { return getToken(LoomParser.END, 0); }
		public FilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_files; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitFiles(this);
		}
	}

	public final FilesContext files() throws RecognitionException {
		FilesContext _localctx = new FilesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FILE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRAK) {
				{
				setState(136);
				match(LBRAK);
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==START || _la==END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				match(RBRAK);
				}
			}

			setState(141);
			match(LPAREN);
			setState(142);
			inner_component_id();
			setState(143);
			match(RPAREN);
			setState(144);
			match(COLON);
			setState(145);
			inner_component_id();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE) {
				{
				setState(146);
				files();
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

	public static class File_linksContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(LoomParser.LINK, 0); }
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public List<Inner_component_idContext> inner_component_id() {
			return getRuleContexts(Inner_component_idContext.class);
		}
		public Inner_component_idContext inner_component_id(int i) {
			return getRuleContext(Inner_component_idContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(LoomParser.ARROW, 0); }
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public File_linksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_links; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterFile_links(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitFile_links(this);
		}
	}

	public final File_linksContext file_links() throws RecognitionException {
		File_linksContext _localctx = new File_linksContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_file_links);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LINK);
			setState(150);
			match(LBRAK);
			setState(151);
			inner_component_id();
			setState(152);
			match(ARROW);
			setState(153);
			inner_component_id();
			setState(154);
			match(RBRAK);
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

	public static class FileContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(LoomParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(LoomParser.QUOTE, i);
		}
		public TerminalNode C() { return getToken(LoomParser.C, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public List<TerminalNode> BKSLASH() { return getTokens(LoomParser.BKSLASH); }
		public TerminalNode BKSLASH(int i) {
			return getToken(LoomParser.BKSLASH, i);
		}
		public List<TerminalNode> NONWSSTR() { return getTokens(LoomParser.NONWSSTR); }
		public TerminalNode NONWSSTR(int i) {
			return getToken(LoomParser.NONWSSTR, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(QUOTE);
			setState(157);
			match(C);
			setState(158);
			match(COLON);
			setState(159);
			match(BKSLASH);
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(160);
						match(NONWSSTR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(163); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BKSLASH) {
					{
					setState(165);
					match(BKSLASH);
					}
				}

				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NONWSSTR );
			setState(172);
			match(QUOTE);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TLE() { return getToken(LoomParser.TLE, 0); }
		public TerminalNode COLON() { return getToken(LoomParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode RBRAK() { return getToken(LoomParser.RBRAK, 0); }
		public Component_idContext component_id() {
			return getRuleContext(Component_idContext.class,0);
		}
		public TerminalNode LBRAK() { return getToken(LoomParser.LBRAK, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(TLE);
			setState(175);
			match(COLON);
			setState(176);
			string();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRAK) {
				{
				setState(177);
				match(RBRAK);
				setState(178);
				component_id();
				setState(179);
				match(LBRAK);
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

	public static class Component_idContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(LoomParser.DOLLAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Component_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterComponent_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitComponent_id(this);
		}
	}

	public final Component_idContext component_id() throws RecognitionException {
		Component_idContext _localctx = new Component_idContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_component_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(DOLLAR);
			setState(184);
			identifier();
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

	public static class Inner_component_idContext extends ParserRuleContext {
		public TerminalNode UNDRSCORE() { return getToken(LoomParser.UNDRSCORE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Inner_component_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_component_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterInner_component_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitInner_component_id(this);
		}
	}

	public final Inner_component_idContext inner_component_id() throws RecognitionException {
		Inner_component_idContext _localctx = new Inner_component_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inner_component_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(UNDRSCORE);
			setState(187);
			identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NONWSSTR() { return getToken(LoomParser.NONWSSTR, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NONWSSTR);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(LoomParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(LoomParser.QUOTE, i);
		}
		public TerminalNode STR() { return getToken(LoomParser.STR, 0); }
		public TerminalNode NONWSSTR() { return getToken(LoomParser.NONWSSTR, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LoomListener ) ((LoomListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(QUOTE);
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==NONWSSTR || _la==STR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			match(QUOTE);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\5\5@\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5H\n\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6T\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bb\n\b\3\t\3\t\3\t"+
		"\3\t\5\th\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\t\5\ts\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\5\f\u0088\n\f\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0096\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\6\17\u00a4\n\17\r\17\16\17\u00a5\3\17\5\17\u00a9\n\17\6\17\u00ab"+
		"\n\17\r\17\16\17\u00ac\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00b8\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2"+
		"\6\7\3\2\r\16\u00c3\2(\3\2\2\2\4+\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\nL\3"+
		"\2\2\2\fU\3\2\2\2\16]\3\2\2\2\20c\3\2\2\2\22t\3\2\2\2\24{\3\2\2\2\26\u0083"+
		"\3\2\2\2\30\u0089\3\2\2\2\32\u0097\3\2\2\2\34\u009e\3\2\2\2\36\u00b0\3"+
		"\2\2\2 \u00b9\3\2\2\2\"\u00bc\3\2\2\2$\u00bf\3\2\2\2&\u00c1\3\2\2\2()"+
		"\5\4\3\2)*\5\f\7\2*\3\3\2\2\2+,\7\5\2\2,-\7\23\2\2-/\5\36\20\2.\60\5\6"+
		"\4\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\5\b\5\2\62\63\5\n\6\2\63"+
		"\64\7\24\2\2\64\5\3\2\2\2\65\66\5$\23\2\66\67\7\20\2\2\679\5 \21\28:\5"+
		"\6\4\298\3\2\2\29:\3\2\2\2:\7\3\2\2\2;?\7\b\2\2<=\7\21\2\2=>\t\2\2\2>"+
		"@\7\22\2\2?<\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\25\2\2BC\5\"\22\2CD\7\26"+
		"\2\2DG\7\20\2\2EH\5 \21\2FH\5$\23\2GE\3\2\2\2GF\3\2\2\2HJ\3\2\2\2IK\5"+
		"\b\5\2JI\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LM\7\13\2\2MN\7\21\2\2NO\5\"\22\2"+
		"OP\7\f\2\2PQ\5\"\22\2QS\7\22\2\2RT\5\n\6\2SR\3\2\2\2ST\3\2\2\2T\13\3\2"+
		"\2\2UV\7\b\2\2VW\7\23\2\2WX\5\36\20\2XY\5\16\b\2YZ\5\20\t\2Z[\5\22\n\2"+
		"[\\\7\24\2\2\\\r\3\2\2\2]^\5$\23\2^_\7\20\2\2_a\5 \21\2`b\5\16\b\2a`\3"+
		"\2\2\2ab\3\2\2\2b\17\3\2\2\2cg\7\t\2\2de\7\21\2\2ef\t\2\2\2fh\7\22\2\2"+
		"gd\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\25\2\2jk\5\"\22\2kl\7\26\2\2lo\7\20"+
		"\2\2mp\5 \21\2np\5$\23\2om\3\2\2\2on\3\2\2\2pr\3\2\2\2qs\5\20\t\2rq\3"+
		"\2\2\2rs\3\2\2\2s\21\3\2\2\2tu\7\13\2\2uv\7\21\2\2vw\5\"\22\2wx\7\f\2"+
		"\2xy\5\"\22\2yz\7\22\2\2z\23\3\2\2\2{|\7\t\2\2|}\7\23\2\2}~\5\36\20\2"+
		"~\177\5\26\f\2\177\u0080\5\30\r\2\u0080\u0081\5\32\16\2\u0081\u0082\7"+
		"\24\2\2\u0082\25\3\2\2\2\u0083\u0084\5$\23\2\u0084\u0085\7\20\2\2\u0085"+
		"\u0087\5\34\17\2\u0086\u0088\5\26\f\2\u0087\u0086\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\27\3\2\2\2\u0089\u008d\7\n\2\2\u008a\u008b\7\21\2\2\u008b"+
		"\u008c\t\2\2\2\u008c\u008e\7\22\2\2\u008d\u008a\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\25\2\2\u0090\u0091\5\"\22\2\u0091"+
		"\u0092\7\26\2\2\u0092\u0093\7\20\2\2\u0093\u0095\5\"\22\2\u0094\u0096"+
		"\5\30\r\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\31\3\2\2\2\u0097"+
		"\u0098\7\13\2\2\u0098\u0099\7\21\2\2\u0099\u009a\5\"\22\2\u009a\u009b"+
		"\7\f\2\2\u009b\u009c\5\"\22\2\u009c\u009d\7\22\2\2\u009d\33\3\2\2\2\u009e"+
		"\u009f\7\30\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00aa\7"+
		"\27\2\2\u00a2\u00a4\7\r\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\7\27"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a3\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\30\2\2\u00af\35\3\2\2\2\u00b0\u00b1"+
		"\7\4\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b7\5&\24\2\u00b3\u00b4\7\22\2\2"+
		"\u00b4\u00b5\5 \21\2\u00b5\u00b6\7\21\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b3"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7\32\2\2\u00ba"+
		"\u00bb\5$\23\2\u00bb!\3\2\2\2\u00bc\u00bd\7\17\2\2\u00bd\u00be\5$\23\2"+
		"\u00be#\3\2\2\2\u00bf\u00c0\7\r\2\2\u00c0%\3\2\2\2\u00c1\u00c2\7\30\2"+
		"\2\u00c2\u00c3\t\3\2\2\u00c3\u00c4\7\30\2\2\u00c4\'\3\2\2\2\23/9?GJSa"+
		"gor\u0087\u008d\u0095\u00a5\u00a8\u00ac\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}