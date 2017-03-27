/**
 * Created by hugoj on 3/27/2017.
 */
public class AssignmentVisitor extends Loom2BaseVisitor<Assignment> {

    @Override
    public Assignment visitAssignment(Loom2Parser.AssignmentContext ctx) {
        String assignmentVariable = ctx.NONWSSTR().getText();
        ComponentID assignmentTarget = ctx.component_id().accept(new ComponentIDVisitor());

        return new Assignment(assignmentVariable, assignmentTarget, ctx.getStart().getLine());
    }

}
