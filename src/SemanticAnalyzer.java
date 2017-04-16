import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by Hugo on 4/3/2017.
 */
public class SemanticAnalyzer extends Loom2BaseListener{

    @Override
    public void enterProgram(Loom2Parser.ProgramContext ctx) {
        System.out.println("In program!");
    }

    @Override
    public void enterTitle(Loom2Parser.TitleContext ctx) {
        System.out.println("In title!");
    }


}
