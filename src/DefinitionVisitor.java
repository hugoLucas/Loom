/**
 * Created by hugoj on 3/27/2017.
 */
public class DefinitionVisitor extends Loom2BaseVisitor<Definition> {

    @Override
    public Definition visitDefinition(Loom2Parser.DefinitionContext ctx) {

        String definitionType = ctx.getStart().getText();

        if(definitionType.equals(Text.TEXT)){
            String textString = ctx.STRING().toString();
            return new Text(textString);
        }else if(definitionType.equals(Option.OPTION)){
            ComponentID optionComponentId = ctx.component_id(0).accept(new ComponentIDVisitor());
            String optionTextString = ctx.STRING().getText();
            return new Option(optionComponentId.getComponentID(), optionTextString);
        }else if(definitionType.equals(Pg.PG)){
            return constructPageOrChapter(ctx, handleChapterOrPageTimeLabels(ctx), 0);
        }else if(definitionType.equals(Chapt.CHAPT)){
            return constructPageOrChapter(ctx, handleChapterOrPageTimeLabels(ctx), 1);
        }

        return null;
    }

    private Definition constructPageOrChapter(Loom2Parser.DefinitionContext ctx, boolean [] timeIndents, int flag){

        if(flag == 0){
            if(ctx.NONWSSTR() != null)
                return new Pg(ctx.NONWSSTR().getText(), timeIndents[0], timeIndents[1]);
            else if(ctx.component_id() != null)
                return new Pg(ctx.component_id(0).accept(new ComponentIDVisitor()), timeIndents[0], timeIndents[1]);
        }else{
            if(ctx.NONWSSTR() != null)
                return new Chapt(ctx.NONWSSTR().getText(), timeIndents[0], timeIndents[1]);
            else if(ctx.component_id() != null)
                return new Chapt(ctx.component_id(0).accept(new ComponentIDVisitor()), timeIndents[0], timeIndents[1]);
        }

        return null;
    }

    private boolean[] handleChapterOrPageTimeLabels (Loom2Parser.DefinitionContext ctx){
        boolean start = false, end = false;

        if(ctx.TIME_IDENT() != null) {
            if (ctx.TIME_IDENT().getText().equals("END"))
                end = true;
            else if (ctx.TIME_IDENT().getText().equals("START"))
                start = true;
        }
        return new boolean[]{start, end};
    }
}
