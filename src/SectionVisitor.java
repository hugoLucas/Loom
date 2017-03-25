import java.util.ArrayList;
import java.util.List;

/**
 * Created by hugoj on 3/24/2017.
 */
public class SectionVisitor extends Loom2BaseVisitor<Section> {

    List<Statement> sectionStatements;

    @Override
    public Section visitSections(Loom2Parser.SectionsContext ctx) {
        List<Statement> sectionStatements = new ArrayList<>(ctx.statements().size());

        StatementVisitor stmtVisitor = new StatementVisitor();
        for(Loom2Parser.StatementsContext stmtCtx: ctx.statements()){
            Statement stmt = stmtCtx.accept(stmtVisitor);

            if(stmt.wasThereAnError())
                return new Section(stmt.returnErrorMessage());
            else if(!statementInCorrectSection(ctx, stmt))
                return new Section("STATEMENT ERROR: " + ctx.getStart().getLine());
            else
                sectionStatements.add(stmt);
        }

        constructSection(sectionStatements, ctx);

        return visitChildren(ctx);
    }

    public Section constructSection(List<Statement> stmts, Loom2Parser.SectionsContext ctx){
        String sectionName = ctx.getParent().getStart().getText();

        if(sectionName.equals("PAGE")){
            return constructPageSection(stmts);
        }

        return null;
    }

    public boolean statementInCorrectSection(Loom2Parser.SectionsContext ctx, Statement stmt){
        String sectionName = ctx.getParent().getStart().getText();

        if(sectionName.equals("PAGE"))
            if( stmt instanceof  Title || stmt instanceof Text || stmt instanceof Option)
                return true;

        return false;
    }

    public Section constructPageSection(List<Statement> stmts){
        return null;
    }
}
