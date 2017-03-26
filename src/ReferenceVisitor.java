/**
 * Created by hugoj on 3/26/2017.
 */
public class ReferenceVisitor extends Loom2BaseVisitor<Reference>  {

    @Override
    public Reference visitReference(Loom2Parser.ReferenceContext ctx) {

        ComponentIDVisitor vis = new ComponentIDVisitor();

        if(ctx.component_id().size() == 2) {
            ComponentID pageId = ctx.component_id(0).accept(vis);
            ComponentID optionId = ctx.component_id(1).accept(vis);

            return new Reference(pageId.getComponentID(), optionId.getComponentID(), true);
        }else{
            String variableRef = ctx.NONWSSTR().getText();
            ComponentID optionId = ctx.component_id(0).accept(vis);

            return new Reference(variableRef, optionId.getComponentID(), false);
        }
    }
}
