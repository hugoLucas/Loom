import java.util.ArrayList;
import java.util.List;

/**
 * Created by hugoj on 3/24/2017.
 */
public class SectionVisitor extends Loom2BaseVisitor<Section> {

    @Override
    public Section visitSections(Loom2Parser.SectionsContext ctx) {
        List<Statement> sectionStatements = new ArrayList<>(ctx.statements().size());

        StatementVisitor stmtVisitor = new StatementVisitor();
        for(Loom2Parser.StatementsContext stmtCtx: ctx.statements()){
            Statement stmt = stmtCtx.accept(stmtVisitor);

            if(stmt.wasThereAnError())
                return new SectionError(stmt.returnErrorMessage());
            else if(!statementInCorrectSection(ctx, stmt))
                return new SectionError("STATEMENT ERROR: " + ctx.getStart().getLine());
            else
                sectionStatements.add(stmt);
        }

        return constructSection(sectionStatements, ctx);
    }

    public Section constructSection(List<Statement> stmts, Loom2Parser.SectionsContext ctx){
        String sectionName = ctx.getParent().getStart().getText();

        if(sectionName.equals("PAGE")){
            System.out.print("Constructing page... ");
            return constructPageSection(stmts, ctx);
        }

        return null;
    }

    public boolean statementInCorrectSection(Loom2Parser.SectionsContext ctx, Statement stmt){
        String sectionName = ctx.getParent().getStart().getText();

        if(sectionName.equals("PAGE"))
            if( stmt instanceof  Title || stmt instanceof Text || stmt instanceof Option || stmt instanceof IfStatement)
                return true;

        return false;
    }

    public Section constructPageSection(List<Statement> stmts, Loom2Parser.SectionsContext ctx){
        Page pg = new Page();

        for(Statement stmt : stmts){
            if(stmt.getStatementType().equals(Title.TITLE)){
                Title title = (Title) stmt;
                if(pg.getPageTitle() == null) {
                    pg.setPageTitle(title.getTitleContent());
                    pg.setPageIdentifer(title.getTitleIdentifier());
                }
                else
                    return new SectionError("DuplicateTitleException: " + ctx.getStart().getLine());
            }else if(stmt.getStatementType().equals(Text.TEXT)){
                Text text = (Text) stmt;
                if(pg.getPageText() == null)
                    pg.setPageText(text.getTextString());
                else
                    return new SectionError("DuplicateTextException: " + ctx.getStart().getLine());
            }
            else if(stmt.getStatementType().equals(Option.OPTION)){
                Option option = (Option) stmt;
                pg.addPageOptions(option.getOptionText(), option.getOptionIdentifier());
                if(pg.hasDuplicateIdentifers())
                    return new SectionError("DuplicateIdentifierException: " + ctx.getStart().getLine());
            }
        }

        System.out.println("Done!");
        return pg;
    }
}
