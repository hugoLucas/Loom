/**
 * Created by hugoj on 3/26/2017.
 */
public class IfStatementVisitor extends Loom2BaseVisitor<IfStatement> {

    @Override
    public IfStatement visitIf_statement(Loom2Parser.If_statementContext ctx) {
        ReferenceVisitor vis = new ReferenceVisitor();
        Reference ref = ctx.reference().accept(vis);

        return visitChildren(ctx);
    }

}
