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
        }

        return null;
    }
}
