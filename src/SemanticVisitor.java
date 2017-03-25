import com.sun.javafx.fxml.expression.Expression;
import org.antlr.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/**
 * Created by hugoj on 3/24/2017.
 */
public class SemanticVisitor extends Loom2BaseVisitor<Object> {

    private String PAGE = "PAGE";

    @Override
    public Object visitSections(Loom2Parser.SectionsContext ctx) {
        String sectionType = ctx.getStart().getText();

        if(sectionType.equals(PAGE)){
            for(Loom2Parser.StatementsContext stmt_ctx : ctx.statements())
                visit(stmt_ctx);
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitTitle(Loom2Parser.TitleContext ctx) {
        String titleContents = ctx.STRING().getText();
        print(titleContents.substring(1, titleContents.length()-1));
        return visitChildren(ctx);
    }

    public void print(Object o){
        System.out.println(o);
    }

    public class ValueTuple{

        private String valueTag;
        private Object valueObject;

        public ValueTuple(String valueTag, Object valueObject){
            this.valueTag = valueTag;
            this.valueObject = valueObject;
        }
    }
}
