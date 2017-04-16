import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Hugo on 4/10/2017.
 */
public class CodeGenerator {

    private Program baseProgram;
    private StringBuffer buffer;

    private HashMap<String, Page> identifierToPageMap;
    private HashMap<String, String> identifierToNodeNameMap;

    public CodeGenerator(Program input){
        this.baseProgram = input;
        this.buffer = new StringBuffer();
        this.identifierToPageMap = new HashMap<>();
        this.identifierToNodeNameMap = new HashMap<>();
    }

    public void build(){
        this.extractAndBuildPages();
        this.extractChaptersLinkPages();
    }

    private void extractChaptersLinkPages() {

    }

    public void extractAndBuildPages(){
        int nodeCounter = 0;
        ArrayList<Page> pageList = this.baseProgram.getAllPages();
        for(Page p: pageList){
            String nodeIdentifier = p.getSectionIdentifier();
            String nodeTextPrompt = p.getPageText();
            this.identifierToPageMap.put(nodeIdentifier, p);
            System.out.println("Node node_" + nodeCounter + " = new Node(\""
                    + nodeIdentifier + "\"," + nodeTextPrompt + ");");

            ArrayList<String> nodeOptionsId = p.getPageOptions();
            ArrayList<String> nodeOptionsTxt = p.getPageOptionText();
            this.identifierToNodeNameMap.put(nodeIdentifier, "node_" + nodeCounter);
            for(int i = 0; i < nodeOptionsId.size(); i ++)
                System.out.println("node_" + nodeCounter + ".addOption(\"" +
                        nodeOptionsId.get(i) + "\", " + nodeOptionsTxt.get(i) + ");");
            nodeCounter++;
        }
    }
}
