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
	 * Enter a parse tree produced by {@link LoomParser#section_links}.
	 * @param ctx the parse tree
	 */
	void enterSection_links(LoomParser.Section_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#section_links}.
	 * @param ctx the parse tree
	 */
	void exitSection_links(LoomParser.Section_linksContext ctx);
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
	 * Enter a parse tree produced by {@link LoomParser#chapter_links}.
	 * @param ctx the parse tree
	 */
	void enterChapter_links(LoomParser.Chapter_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#chapter_links}.
	 * @param ctx the parse tree
	 */
	void exitChapter_links(LoomParser.Chapter_linksContext ctx);
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
	 * Enter a parse tree produced by {@link LoomParser#file_assignment}.
	 * @param ctx the parse tree
	 */
	void enterFile_assignment(LoomParser.File_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#file_assignment}.
	 * @param ctx the parse tree
	 */
	void exitFile_assignment(LoomParser.File_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#files}.
	 * @param ctx the parse tree
	 */
	void enterFiles(LoomParser.FilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#files}.
	 * @param ctx the parse tree
	 */
	void exitFiles(LoomParser.FilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoomParser#file_links}.
	 * @param ctx the parse tree
	 */
	void enterFile_links(LoomParser.File_linksContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#file_links}.
	 * @param ctx the parse tree
	 */
	void exitFile_links(LoomParser.File_linksContext ctx);
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
	 * Enter a parse tree produced by {@link LoomParser#inner_component_id}.
	 * @param ctx the parse tree
	 */
	void enterInner_component_id(LoomParser.Inner_component_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoomParser#inner_component_id}.
	 * @param ctx the parse tree
	 */
	void exitInner_component_id(LoomParser.Inner_component_idContext ctx);
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