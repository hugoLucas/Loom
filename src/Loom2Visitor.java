// Generated from Loom2.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Loom2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Loom2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Loom2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSections(Loom2Parser.SectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(Loom2Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(Loom2Parser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(Loom2Parser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Loom2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(Loom2Parser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(Loom2Parser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#component_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_id(Loom2Parser.Component_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link Loom2Parser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(Loom2Parser.ReferenceContext ctx);
}