/**
 * Created by hugoj on 3/24/2017.
 */
public class ComponentIDVisitor extends Loom2BaseVisitor<ComponentID>{

    @Override public ComponentID visitComponent_id(Loom2Parser.Component_idContext ctx) {
        ComponentID compID = new ComponentID(ctx.DOLLAR().toString() + ctx.NONWSSTR().toString());
        return compID;
    }
}
