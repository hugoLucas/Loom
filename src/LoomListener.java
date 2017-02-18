// Generated from Loom.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link LoomParser#section_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSection_assignment(LoomParser.Section_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#section_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSection_assignment(LoomParser.Section_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(LoomParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(LoomParser.SectionsContext ctx);
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
	 * Enter a parse tree produced by {@link LoomParser#chapter_assignment}.
	 * @param ctx the parse tree
	 */
	void enterChapter_assignment(LoomParser.Chapter_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#chapter_assignment}.
	 * @param ctx the parse tree
	 */
	void exitChapter_assignment(LoomParser.Chapter_assignmentContext ctx);
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
	 * Enter a parse tree produced by {@link LoomParser#page_assignment}.
	 * @param ctx the parse tree
	 */
	void enterPage_assignment(LoomParser.Page_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#page_assignment}.
	 * @param ctx the parse tree
	 */
	void exitPage_assignment(LoomParser.Page_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#pages}.
	 * @param ctx the parse tree
	 */
	void enterPages(LoomParser.PagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#pages}.
	 * @param ctx the parse tree
	 */
	void exitPages(LoomParser.PagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#page_links}.
	 * @param ctx the parse tree
	 */
	void enterPage_links(LoomParser.Page_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#page_links}.
	 * @param ctx the parse tree
	 */
	void exitPage_links(LoomParser.Page_linksContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(LoomParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(LoomParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(LoomParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(LoomParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(LoomParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(LoomParser.OptionContext ctx);
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
	 * Enter a parse tree produced by {@link LoomParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(LoomParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(LoomParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#component_id}.
	 * @param ctx the parse tree
	 */
	void enterComponent_id(LoomParser.Component_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#component_id}.
	 * @param ctx the parse tree
	 */
	void exitComponent_id(LoomParser.Component_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LoomParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LoomParser.IdentifierContext ctx);
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