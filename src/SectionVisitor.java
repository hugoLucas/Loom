import java.util.List;

/**
 * Created by hugoj on 3/24/2017.
 */
public class SectionVisitor extends Loom2BaseVisitor<Section> {

    @Override
    public Section visitSections(Loom2Parser.SectionsContext ctx) {

        StatementVisitor stmtVisitor = new StatementVisitor();
        for(Loom2Parser.StatementsContext stmtCtx: ctx.statements()){
            Statement stmt = stmtCtx.accept(stmtVisitor);

            if(stmt.wasThereAnError())
                return new Section(stmt.returnErrorMessage());
        }
        return visitChildren(ctx);
    }

    public boolean statementInCorrectSection(Statement stmt){
        return true;
    }
}
