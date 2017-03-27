/**
 * Created by hugoj on 3/27/2017.
 */
public class AssignmentVisitor extends Loom2BaseVisitor<Assignment> {

    @Override
    public Assignment visitAssignment(Loom2Parser.AssignmentContext ctx) {
        return visitChildren(ctx);
    }

}
