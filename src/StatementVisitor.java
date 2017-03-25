/**
 * Created by hugoj on 3/24/2017.
 */
public class StatementVisitor extends Loom2BaseVisitor<Statement> {

    private int KEY_INDENT = 2;
    private int NONWSSTR = 30;
    private int TITLE = 27;
    private int LINK = 18;
    private int IF = 17;


    @Override
    public Statement visitStatements(Loom2Parser.StatementsContext ctx) {
        if(ctx.getStart().getType() == TITLE){
            TitleVisitor tlVisitor = new TitleVisitor();
            Title stmt = ctx.title().accept(tlVisitor);

            if(!titleInStory(ctx) && !stmt.hasIdentifier())
                return new Statement("TITLE W/O IDENTIFIER: " + ctx.getStart().getLine());
            return new Statement(stmt);
        }
        return null;
    }

    public boolean titleInStory(Loom2Parser.StatementsContext ctx){
        return ctx.getParent().getStart().getText().equals("STORY");
    }
}
