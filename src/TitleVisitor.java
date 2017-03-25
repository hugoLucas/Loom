/**
 * Created by hugoj on 3/24/2017.
 */
public class TitleVisitor extends Loom2BaseVisitor<Title> {

    @Override
    public Title visitTitle(Loom2Parser.TitleContext ctx) {
        String titleContents = ctx.STRING().getText();

        ComponentIDVisitor compVisitor = new ComponentIDVisitor();

        String titleComponentID;
        try {
            titleComponentID = ctx.component_id().accept(compVisitor).getComponentID();
        }catch (NullPointerException e){
            titleComponentID = null;
        }

        return new Title(titleContents.substring(1, titleContents.length() - 1), titleComponentID);
    }
}
