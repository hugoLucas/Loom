/**
 * Created by hugoj on 3/24/2017.
 */
public class StatementVisitor extends Loom2BaseVisitor<Statement> {

    private int KEY_INDENT = 2;
    private int NONWSSTR = 30;
    private int TITLE = 27;
    private int LINK = 18;


    @Override
    public Statement visitStatements(Loom2Parser.StatementsContext ctx) {
        if(ctx.getStart().getType() == TITLE){ /* Title */
            Title stmt = ctx.title().accept(new TitleVisitor());
            if(!titleInStory(ctx) && !stmt.hasIdentifier())
                return new Title("TITLE W/O IDENTIFIER: " + ctx.getStart().getLine());
            return stmt;
        }else if(ctx.getStart().getType() == KEY_INDENT){ /* Definition */
            return ctx.definition().accept( new DefinitionVisitor());
        }else if(ctx.getStart().getType() == NONWSSTR){ /* Assignment  */
            System.out.println(ctx.getStart().getText());

        }else if(ctx.getStart().getType() == LINK){ /* Link  */
            System.out.println(ctx.getStart().getText());
        }else{ /* If Statement  */
            return ctx.accept(new IfStatementVisitor());
        }

        return null;
    }

    public boolean titleInStory(Loom2Parser.StatementsContext ctx){
        return ctx.getParent().getStart().getText().equals("STORY");
    }
}
