// Generated from Loom2.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Loom2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEC_IDENT=1, KEY_IDENT=2, TIME_IDENT=3, DOLLAR=4, COLON=5, QUOTE=6, RBRAK=7, 
		LBRAK=8, RCURL=9, LCURL=10, ARROW=11, CHAPTER=12, CHAPT=13, DOT=14, END=15, 
		ENDIF=16, IF=17, LINK=18, OPTION=19, PAGE=20, PG=21, SECTION=22, SEC=23, 
		START=24, STORY=25, TEXT=26, TITLE=27, SEMICOLON=28, UNDERSCORE=29, NONWSSTR=30, 
		STRING=31, WS=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEC_IDENT", "KEY_IDENT", "TIME_IDENT", "DOLLAR", "COLON", "QUOTE", "RBRAK", 
		"LBRAK", "RCURL", "LCURL", "ARROW", "CHAPTER", "CHAPT", "DOT", "END", 
		"ENDIF", "IF", "LINK", "OPTION", "PAGE", "PG", "SECTION", "SEC", "START", 
		"STORY", "TEXT", "TITLE", "SEMICOLON", "UNDERSCORE", "NONWSSTR", "STRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'$'", "':'", "'\"'", "'['", "']'", "'{'", "'}'", 
		"'->'", "'CHAPTER'", "'CHAPT'", "'.'", "'END'", "'ENDIF'", "'IF'", "'LINK'", 
		"'OPTION'", "'PAGE'", "'PG'", "'SECTION'", "'SEC'", "'START'", "'STORY'", 
		"'TEXT'", "'TITLE'", "';'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEC_IDENT", "KEY_IDENT", "TIME_IDENT", "DOLLAR", "COLON", "QUOTE", 
		"RBRAK", "LBRAK", "RCURL", "LCURL", "ARROW", "CHAPTER", "CHAPT", "DOT", 
		"END", "ENDIF", "IF", "LINK", "OPTION", "PAGE", "PG", "SECTION", "SEC", 
		"START", "STORY", "TEXT", "TITLE", "SEMICOLON", "UNDERSCORE", "NONWSSTR", 
		"STRING", "WS"
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


	public Loom2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Loom2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u00db\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\5\2H\n\2\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4\5\4"+
		"S\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\6\37\u00bf\n\37\r\37\16\37\u00c0\3\37\5\37\u00c4"+
		"\n\37\6\37\u00c6\n\37\r\37\16\37\u00c7\3 \3 \3 \3 \7 \u00ce\n \f \16 "+
		"\u00d1\13 \3 \3 \3!\6!\u00d6\n!\r!\16!\u00d7\3!\3!\2\2\"\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\6"+
		"\4\2C\\c|\4\2$$^^\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\"\u00e8\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3G\3\2\2\2\5N\3\2\2\2\7R\3\2\2\2\tT\3\2\2"+
		"\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21\\\3\2\2\2\23^\3\2\2\2\25`\3\2"+
		"\2\2\27b\3\2\2\2\31e\3\2\2\2\33m\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2!y\3\2"+
		"\2\2#\177\3\2\2\2%\u0082\3\2\2\2\'\u0087\3\2\2\2)\u008e\3\2\2\2+\u0093"+
		"\3\2\2\2-\u0096\3\2\2\2/\u009e\3\2\2\2\61\u00a2\3\2\2\2\63\u00a8\3\2\2"+
		"\2\65\u00ae\3\2\2\2\67\u00b3\3\2\2\29\u00b9\3\2\2\2;\u00bb\3\2\2\2=\u00c5"+
		"\3\2\2\2?\u00c9\3\2\2\2A\u00d5\3\2\2\2CH\5\63\32\2DH\5-\27\2EH\5\31\r"+
		"\2FH\5)\25\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\4\3\2\2\2IO\5/\30"+
		"\2JO\5\33\16\2KO\5+\26\2LO\5\65\33\2MO\5\'\24\2NI\3\2\2\2NJ\3\2\2\2NK"+
		"\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\6\3\2\2\2PS\5\61\31\2QS\5\37\20\2RP\3\2"+
		"\2\2RQ\3\2\2\2S\b\3\2\2\2TU\7&\2\2U\n\3\2\2\2VW\7<\2\2W\f\3\2\2\2XY\7"+
		"$\2\2Y\16\3\2\2\2Z[\7]\2\2[\20\3\2\2\2\\]\7_\2\2]\22\3\2\2\2^_\7}\2\2"+
		"_\24\3\2\2\2`a\7\177\2\2a\26\3\2\2\2bc\7/\2\2cd\7@\2\2d\30\3\2\2\2ef\7"+
		"E\2\2fg\7J\2\2gh\7C\2\2hi\7R\2\2ij\7V\2\2jk\7G\2\2kl\7T\2\2l\32\3\2\2"+
		"\2mn\7E\2\2no\7J\2\2op\7C\2\2pq\7R\2\2qr\7V\2\2r\34\3\2\2\2st\7\60\2\2"+
		"t\36\3\2\2\2uv\7G\2\2vw\7P\2\2wx\7F\2\2x \3\2\2\2yz\7G\2\2z{\7P\2\2{|"+
		"\7F\2\2|}\7K\2\2}~\7H\2\2~\"\3\2\2\2\177\u0080\7K\2\2\u0080\u0081\7H\2"+
		"\2\u0081$\3\2\2\2\u0082\u0083\7N\2\2\u0083\u0084\7K\2\2\u0084\u0085\7"+
		"P\2\2\u0085\u0086\7M\2\2\u0086&\3\2\2\2\u0087\u0088\7Q\2\2\u0088\u0089"+
		"\7R\2\2\u0089\u008a\7V\2\2\u008a\u008b\7K\2\2\u008b\u008c\7Q\2\2\u008c"+
		"\u008d\7P\2\2\u008d(\3\2\2\2\u008e\u008f\7R\2\2\u008f\u0090\7C\2\2\u0090"+
		"\u0091\7I\2\2\u0091\u0092\7G\2\2\u0092*\3\2\2\2\u0093\u0094\7R\2\2\u0094"+
		"\u0095\7I\2\2\u0095,\3\2\2\2\u0096\u0097\7U\2\2\u0097\u0098\7G\2\2\u0098"+
		"\u0099\7E\2\2\u0099\u009a\7V\2\2\u009a\u009b\7K\2\2\u009b\u009c\7Q\2\2"+
		"\u009c\u009d\7P\2\2\u009d.\3\2\2\2\u009e\u009f\7U\2\2\u009f\u00a0\7G\2"+
		"\2\u00a0\u00a1\7E\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4"+
		"\7V\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7T\2\2\u00a6\u00a7\7V\2\2\u00a7"+
		"\62\3\2\2\2\u00a8\u00a9\7U\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab\7Q\2\2\u00ab"+
		"\u00ac\7T\2\2\u00ac\u00ad\7[\2\2\u00ad\64\3\2\2\2\u00ae\u00af\7V\2\2\u00af"+
		"\u00b0\7G\2\2\u00b0\u00b1\7Z\2\2\u00b1\u00b2\7V\2\2\u00b2\66\3\2\2\2\u00b3"+
		"\u00b4\7V\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6\7V\2\2\u00b6\u00b7\7N\2\2"+
		"\u00b7\u00b8\7G\2\2\u00b88\3\2\2\2\u00b9\u00ba\7=\2\2\u00ba:\3\2\2\2\u00bb"+
		"\u00bc\7a\2\2\u00bc<\3\2\2\2\u00bd\u00bf\t\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2"+
		"\2\2\u00c2\u00c4\5;\36\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00be\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8>\3\2\2\2\u00c9\u00cf\7$\2\2\u00ca\u00cb"+
		"\7^\2\2\u00cb\u00ce\t\3\2\2\u00cc\u00ce\n\4\2\2\u00cd\u00ca\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7$\2\2\u00d3"+
		"@\3\2\2\2\u00d4\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\b!\2\2\u00daB\3\2\2\2\f\2GNR\u00c0\u00c3\u00c7\u00cd\u00cf\u00d7\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}