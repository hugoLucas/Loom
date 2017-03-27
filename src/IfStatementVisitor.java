/**
 * Created by hugoj on 3/26/2017.
 */
public class IfStatementVisitor extends Loom2BaseVisitor<IfStatement> {

    @Override
    public IfStatement visitIf_statement(Loom2Parser.If_statementContext ctx) {
        Reference ref = ctx.reference().accept(new ReferenceVisitor());

        Definition def = ctx.definition().accept(new DefinitionVisitor());
        String definitionType = def.getStatementType();

        if(!definitionType.equals(Text.TEXT) && !definitionType.equals(Option.OPTION))
            return new IfStatement("Invalid statement in If: " + ctx.definition().getStart().getLine());

        return new IfStatement(ref, def);
    }

}
