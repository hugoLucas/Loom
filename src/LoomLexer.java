// Generated from C:/Users/Hugo Lucas/IdeaProjects/Stock/src\Loom.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LoomLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		C=1, TLE=2, STORY=3, START=4, END=5, SECTION=6, CHAPTER=7, FILE=8, LINK=9, 
		ARROW=10, NONWSSTR=11, STR=12, UNDRSCORE=13, COLON=14, LBRAK=15, RBRAK=16, 
		LCURL=17, RCURL=18, LPAREN=19, RPAREN=20, BKSLASH=21, QUOTE=22, SPC=23, 
		DOLLAR=24, WS=25, WSPC=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"C", "TLE", "STORY", "START", "END", "SECTION", "CHAPTER", "FILE", "LINK", 
		"ARROW", "NONWSSTR", "STR", "UNDRSCORE", "COLON", "LBRAK", "RBRAK", "LCURL", 
		"RCURL", "LPAREN", "RPAREN", "BKSLASH", "QUOTE", "SPC", "DOLLAR", "WS", 
		"WSPC"
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


	public LoomLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Loom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\6\fn\n\f\r\f\16\fo\3\r\6\rs\n\r\r"+
		"\r\16\rt\3\r\7\rx\n\r\f\r\16\r{\13\r\6\r}\n\r\r\r\16\r~\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u009a\n\32\r\32\16\32\u009b"+
		"\3\32\3\32\3\33\6\33\u00a1\n\33\r\33\16\33\u00a2\3\33\3\33\2\2\34\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\4\3\2c|\5\2\13"+
		"\f\17\17\"\"\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\59\3\2\2\2\7?\3\2\2\2\tE\3\2\2\2\13K\3\2\2\2\rO\3\2\2\2\17W\3\2\2\2\21"+
		"_\3\2\2\2\23d\3\2\2\2\25i\3\2\2\2\27m\3\2\2\2\31|\3\2\2\2\33\u0080\3\2"+
		"\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%"+
		"\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0090\3\2\2\2-\u0092\3"+
		"\2\2\2/\u0094\3\2\2\2\61\u0096\3\2\2\2\63\u0099\3\2\2\2\65\u00a0\3\2\2"+
		"\2\678\7E\2\28\4\3\2\2\29:\7V\2\2:;\7K\2\2;<\7V\2\2<=\7N\2\2=>\7G\2\2"+
		">\6\3\2\2\2?@\7U\2\2@A\7V\2\2AB\7Q\2\2BC\7T\2\2CD\7[\2\2D\b\3\2\2\2EF"+
		"\7U\2\2FG\7V\2\2GH\7C\2\2HI\7T\2\2IJ\7V\2\2J\n\3\2\2\2KL\7G\2\2LM\7P\2"+
		"\2MN\7F\2\2N\f\3\2\2\2OP\7U\2\2PQ\7G\2\2QR\7E\2\2RS\7V\2\2ST\7K\2\2TU"+
		"\7Q\2\2UV\7P\2\2V\16\3\2\2\2WX\7E\2\2XY\7J\2\2YZ\7C\2\2Z[\7R\2\2[\\\7"+
		"V\2\2\\]\7G\2\2]^\7T\2\2^\20\3\2\2\2_`\7H\2\2`a\7K\2\2ab\7N\2\2bc\7G\2"+
		"\2c\22\3\2\2\2de\7N\2\2ef\7K\2\2fg\7P\2\2gh\7M\2\2h\24\3\2\2\2ij\7/\2"+
		"\2jk\7@\2\2k\26\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\30\3\2\2\2qs\t\2\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uy\3"+
		"\2\2\2vx\7\"\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3"+
		"\2\2\2|r\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\32\3\2\2\2\u0080"+
		"\u0081\7a\2\2\u0081\34\3\2\2\2\u0082\u0083\7<\2\2\u0083\36\3\2\2\2\u0084"+
		"\u0085\7]\2\2\u0085 \3\2\2\2\u0086\u0087\7_\2\2\u0087\"\3\2\2\2\u0088"+
		"\u0089\7}\2\2\u0089$\3\2\2\2\u008a\u008b\7\177\2\2\u008b&\3\2\2\2\u008c"+
		"\u008d\7*\2\2\u008d(\3\2\2\2\u008e\u008f\7+\2\2\u008f*\3\2\2\2\u0090\u0091"+
		"\7^\2\2\u0091,\3\2\2\2\u0092\u0093\7$\2\2\u0093.\3\2\2\2\u0094\u0095\7"+
		"\"\2\2\u0095\60\3\2\2\2\u0096\u0097\7&\2\2\u0097\62\3\2\2\2\u0098\u009a"+
		"\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\32\2\2\u009e\64\3\2\2"+
		"\2\u009f\u00a1\7\"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\33\2\2"+
		"\u00a5\66\3\2\2\2\t\2oty~\u009b\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}