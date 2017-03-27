/**
 * Created by hugoj on 3/27/2017.
 */
public class LinkVisitor extends Loom2BaseVisitor<Link> {

    @Override
    public Link visitLink(Loom2Parser.LinkContext ctx) {
        if(ctx.ARROW() != null){

        }else{
            Reference linkRef = ctx.reference().accept(new ReferenceVisitor());
            String child = ctx.getChild(5).getText();
            if(!child.startsWith("$"))
                return new Link(linkRef, child);
            else if(ctx.component_id().size() > 1)
                return new Link(linkRef, new ComponentID(child));
        }
        return visitChildren(ctx);
    }

}
