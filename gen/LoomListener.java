// Generated from C:/Users/Hugo Lucas/IdeaProjects/Stock/src\Loom.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LoomParser}.
 */
public interface LoomListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LoomParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LoomParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LoomParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#story}.
	 * @param ctx the parse tree
	 */
	void enterStory(LoomParser.StoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#story}.
	 * @param ctx the parse tree
	 */
	void exitStory(LoomParser.StoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(LoomParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(LoomParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LoomParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LoomParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#chapters}.
	 * @param ctx the parse tree
	 */
	void enterChapters(LoomParser.ChaptersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#chapters}.
	 * @param ctx the parse tree
	 */
	void exitChapters(LoomParser.ChaptersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(LoomParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(LoomParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#links}.
	 * @param ctx the parse tree
	 */
	void enterLinks(LoomParser.LinksContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#links}.
	 * @param ctx the parse tree
	 */
	void exitLinks(LoomParser.LinksContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#chapter}.
	 * @param ctx the parse tree
	 */
	void enterChapter(LoomParser.ChapterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#chapter}.
	 * @param ctx the parse tree
	 */
	void exitChapter(LoomParser.ChapterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(LoomParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(LoomParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LoomParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LoomParser.StringContext ctx);
}