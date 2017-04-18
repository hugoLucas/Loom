// Generated from Loom2.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Loom2Parser}.
 */
public interface Loom2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Loom2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Loom2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(Loom2Parser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(Loom2Parser.SectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Loom2Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Loom2Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(Loom2Parser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(Loom2Parser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(Loom2Parser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(Loom2Parser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Loom2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Loom2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(Loom2Parser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(Loom2Parser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Loom2Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Loom2Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#component_id}.
	 * @param ctx the parse tree
	 */
	void enterComponent_id(Loom2Parser.Component_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#component_id}.
	 * @param ctx the parse tree
	 */
	void exitComponent_id(Loom2Parser.Component_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link Loom2Parser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(Loom2Parser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Loom2Parser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(Loom2Parser.ReferenceContext ctx);
}