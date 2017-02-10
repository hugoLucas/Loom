// Generated from C:/Users/Hugo Lucas/IdeaProjects/Stock/src\Loom.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LoomParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LoomVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LoomParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LoomParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#story}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStory(LoomParser.StoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(LoomParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LoomParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#chapters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChapters(LoomParser.ChaptersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(LoomParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#links}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinks(LoomParser.LinksContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#chapter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChapter(LoomParser.ChapterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(LoomParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoomParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LoomParser.StringContext ctx);
}