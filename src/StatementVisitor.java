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

            TitleVisitor tlVisitor = new TitleVisitor();
            Title stmt = ctx.title().accept(tlVisitor);

            if(!titleInStory(ctx) && !stmt.hasIdentifier())
                return new Title("TITLE W/O IDENTIFIER: " + ctx.getStart().getLine());
            return stmt;

        }else if(ctx.getStart().getType() == KEY_INDENT){ /* Definition */

            String keyWord = ctx.getStart().getText();
            Loom2Parser.DefinitionContext def = ctx.definition();

            if(keyWord.equals("TEXT")){
                return new Text(def.STRING().getText());
            }else if(keyWord.equals("OPTION")){
                ComponentIDVisitor vis = new ComponentIDVisitor();
                ComponentID compID = def.component_id(0).accept(vis);

                return new Option(
                        compID.getComponentID(),
                        def.STRING().getText()
                );
            }

        }else if(ctx.getStart().getType() == NONWSSTR){ /* Assignment  */
            System.out.println(ctx.getStart().getText());
        }else if(ctx.getStart().getType() == LINK){ /* Link  */
            System.out.println(ctx.getStart().getText());
        }else{ /* If Statement  */
            System.out.println(ctx.getStart().getText());
            IfStatementVisitor vis = new IfStatementVisitor();
            IfStatement ifStmt = ctx.accept(vis);
        }
        return null;
    }

    public boolean titleInStory(Loom2Parser.StatementsContext ctx){
        return ctx.getParent().getStart().getText().equals("STORY");
    }
}
