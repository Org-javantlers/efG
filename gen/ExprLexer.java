// Generated from C:/Users/HelioSousa/Dropbox/Emprego/UAb-EI/2023-24-2S-21018-COMP/InteliJ/d-efG/Grammar/ExprLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ATRIB=1, DELIM=2, PLUS=3, TIMEs=4, VIRG=5, LPAR=6, RPAR=7, FOR=8, FIM=9, 
		TESTE=10, NUMBER=11, ID=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ATRIB", "DELIM", "PLUS", "TIMEs", "VIRG", "LPAR", "RPAR", "FOR", "FIM", 
			"TESTE", "NUMBER", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'+'", "'*'", "','", "'('", "')'", "'for'", "'fim'", 
			"'teste'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ATRIB", "DELIM", "PLUS", "TIMEs", "VIRG", "LPAR", "RPAR", "FOR", 
			"FIM", "TESTE", "NUMBER", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExprLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\rJ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n9\b\n\u000b\n"+
		"\f\n:\u0001\u000b\u0001\u000b\u0005\u000b?\b\u000b\n\u000b\f\u000bB\t"+
		"\u000b\u0001\f\u0004\fE\b\f\u000b\f\f\fF\u0001\f\u0001\f\u0000\u0000\r"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u0001\u0000"+
		"\u0004\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000"+
		"\t\n\f\r  L\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000"+
		"\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000"+
		"\u0007!\u0001\u0000\u0000\u0000\t#\u0001\u0000\u0000\u0000\u000b%\u0001"+
		"\u0000\u0000\u0000\r\'\u0001\u0000\u0000\u0000\u000f)\u0001\u0000\u0000"+
		"\u0000\u0011-\u0001\u0000\u0000\u0000\u00131\u0001\u0000\u0000\u0000\u0015"+
		"8\u0001\u0000\u0000\u0000\u0017<\u0001\u0000\u0000\u0000\u0019D\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005=\u0000\u0000\u001c\u0002\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005;\u0000\u0000\u001e\u0004\u0001\u0000\u0000"+
		"\u0000\u001f \u0005+\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!\"\u0005"+
		"*\u0000\u0000\"\b\u0001\u0000\u0000\u0000#$\u0005,\u0000\u0000$\n\u0001"+
		"\u0000\u0000\u0000%&\u0005(\u0000\u0000&\f\u0001\u0000\u0000\u0000\'("+
		"\u0005)\u0000\u0000(\u000e\u0001\u0000\u0000\u0000)*\u0005f\u0000\u0000"+
		"*+\u0005o\u0000\u0000+,\u0005r\u0000\u0000,\u0010\u0001\u0000\u0000\u0000"+
		"-.\u0005f\u0000\u0000./\u0005i\u0000\u0000/0\u0005m\u0000\u00000\u0012"+
		"\u0001\u0000\u0000\u000012\u0005t\u0000\u000023\u0005e\u0000\u000034\u0005"+
		"s\u0000\u000045\u0005t\u0000\u000056\u0005e\u0000\u00006\u0014\u0001\u0000"+
		"\u0000\u000079\u0007\u0000\u0000\u000087\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";\u0016\u0001\u0000\u0000\u0000<@\u0007\u0001\u0000\u0000=?\u0007\u0002"+
		"\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\u0018\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CE\u0007\u0003\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0006\f\u0000\u0000I\u001a"+
		"\u0001\u0000\u0000\u0000\u0004\u0000:@F\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}