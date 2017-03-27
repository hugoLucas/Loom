import org.omg.PortableServer.LIFESPAN_POLICY_ID;

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
            boolean start = false;
            boolean end = false;

            if(ctx.TIME_IDENT() != null) {
                if (ctx.TIME_IDENT().getText().equals("END"))
                    end = true;
                else if (ctx.TIME_IDENT().getText().equals("START"))
                    start = true;
            }

            if(ctx.NONWSSTR() != null)
                return new Pg(ctx.NONWSSTR().getText(), start, end);
            else if(ctx.component_id() != null)
                return new Pg(ctx.component_id(0).accept(new ComponentIDVisitor()), start, end);
        }

        return null;
    }
}
