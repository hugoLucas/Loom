import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.HashMap;
import java.util.Map;

/**
 * Definitions and assignments in correct places !
 *
 */

/**
 * Created by Hugo on 3/23/2017.
 */
public class SyntaxAnalyzer extends Loom2BaseListener {

    private String STORY = "STORY";
    private String SECTION = "SECTION";
    private String CHAPTER = "CHAPTER";
    private String PAGE = "PAGE";
    private String TEXT = "TEXT";
    private String OPTION = "OPTION";

    /**
     * 1 = STORY, 2 = SECTION, 3 = CHAPTER, 4 = PAGE
     * Used to verify statements only appear in the correct context
     */
    private int currentSectionType;
    private Map<String, Page> pageTable = new HashMap<>();
    private Page currentPage;

    @Override public void enterDefinition(Loom2Parser.DefinitionContext ctx) {
        if(currentSectionType == 4){
            String rule = ctx.getStart().getText();
            if(rule.equals(TEXT)){
                this.currentPage.setPageText(ctx.getStop().getText());
            }else if(rule.equals(OPTION)){
                sop(ctx.getStop().getText());
            }else{
                sop("StatementMismatchException!");
            }
        }
    }


    @Override
    public void enterSections(Loom2Parser.SectionsContext ctx) {
        String sectionType = ctx.getStart().getText();
        if(sectionType.equals(STORY))
            currentSectionType = 1;
        else if(sectionType.equals(SECTION))
            currentSectionType = 2;
        else if(sectionType.equals(CHAPTER))
            currentSectionType = 3;
        else
            currentSectionType = 4;
    }

    @Override
    public void exitSections(Loom2Parser.SectionsContext ctx) {
        if(this.currentSectionType == 4){
            if(!this.currentPage.checkCompleteness()) {
                sop("Incomplete Page: " + ctx.getStart().getLine());
            }
        }
        currentSectionType = 0;
    }

    @Override
    public void enterTitle(Loom2Parser.TitleContext ctx) {
        if(currentSectionType == 4) { /* Page */
            this.currentPage = new Page();
            String pageTitle = ctx.getChild(2).getText();
            String pageIdentifer = ctx.getChild(4).getText();

            this.currentPage.setPageTitle(pageTitle.substring(1, pageTitle.length() - 1));
            this.currentPage.setPageIdentifer(pageIdentifer);

            if(this.pageTable.containsKey(pageIdentifer))
                sop("Identifier in use!");
            else
                this.pageTable.put(ctx.getChild(4).getText(), this.currentPage);
        }
    }

    public void sop(Object o){
        System.out.println(o);
    }
}