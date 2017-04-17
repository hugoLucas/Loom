import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Hugo on 4/10/2017.
 */
public class CodeGenerator {

    private Program baseProgram;
    private StringBuffer buffer;

    private HashMap <String,Page> identifierToPageMap;
    private HashMap <String,String> identifierToNodeNameMap;

    public CodeGenerator(Program input){
        this.baseProgram = input;
        this.buffer = new StringBuffer();
        this.identifierToPageMap = new HashMap<>();
        this.identifierToNodeNameMap = new HashMap<>();
    }

    public void build(){
        this.extractAndBuildPages();
        this.bindAllPages();
    }

    private void bindAllPages() {
        ArrayList<Link> chapterLinkList = baseProgram.getAllChapterLinks();
        for(Link l: chapterLinkList){
            Reference currentLinkReference = l.getLinkReference();
            String sourcePage = currentLinkReference.getReferenceSource();
            String sourceOption = currentLinkReference.getReferenceOption();
            String targetPage = l.getLinkVariableReference();

            String sourcePageIC = this.identifierToNodeNameMap.get(sourcePage);
            String targetPageIC = this.identifierToNodeNameMap.get(targetPage);

            System.out.println("currentGame.addLinkToGame(\"" + sourcePageIC + "\", \"" + sourceOption
                    + "\", \"" + targetPageIC + "\");");
        }
    }

    public void extractAndBuildPages(){
        int nodeCounter = 0;
        ArrayList<Page> pageList = this.baseProgram.getAllPages();
        for(Page p: pageList){
            String nodeIdentifier = p.getSectionIdentifier();
            String nodeTextPrompt = p.getPageText();
            this.identifierToPageMap.put(nodeIdentifier, p);
            System.out.println("Game.Node node_" + nodeCounter + " = new Game.Node(\""
                    + nodeIdentifier + "\"," + nodeTextPrompt + ");");

            ArrayList<String> nodeOptionsId = p.getPageOptions();
            ArrayList<String> nodeOptionsTxt = p.getPageOptionText();
            this.identifierToNodeNameMap.put(nodeIdentifier, "node_" + nodeCounter);
            for(int i = 0; i < nodeOptionsId.size(); i ++)
                System.out.println("node_" + nodeCounter + ".addOption(\"" +
                        nodeOptionsId.get(i) + "\", " + nodeOptionsTxt.get(i) + ");");

            System.out.println("currentGame.addNodesToGame(node_" + nodeCounter + ", " +
                    "\"node_" + nodeCounter + "\");");
            nodeCounter++;
        }
    }
}
