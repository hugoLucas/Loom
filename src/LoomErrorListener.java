import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

/**
 * Created by hugoj on 4/24/2017.
 */
public class LoomErrorListener extends BaseErrorListener {

    private boolean syntaxError;

    public LoomErrorListener(){
        this.syntaxError = false;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        this.syntaxError = true;
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("rule stack: "+stack);
        System.err.println("line "+ line + ":" + charPositionInLine + " at " + offendingSymbol + ": " + msg);
    }

    public boolean wasThereAnError(){
        return this.syntaxError;
    }
}
