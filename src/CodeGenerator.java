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

    public CodeGenerator(Program input) {
        this.baseProgram = input;
        this.buffer = new StringBuffer();
        this.identifierToPageMap = new HashMap<>();
        this.identifierToNodeNameMap = new HashMap<>();
    }

    public void build() {
        this.extractAndBuildPages().bindAllPages().bindAllSections().assembleStory();
    }

    public CodeGenerator assembleStory() {
        String startSection = baseProgram.returnStorySection().getStartIdentifier();
        //String startChapter = ((Section) baseProgram.getProgramSection(startSection)).getSectionStartChapter();
        Section s = (Section) baseProgram.getProgramSection(startSection);
        String startChapter = s.getSectionStartChapter();
        String startPage = ((Chapter) baseProgram.getProgramSection(startChapter)).getChapterStartPage();


        buffer.append("currentGame.setStart(\"").append(startPage).append("\");");
        return this;
    }

    private CodeGenerator bindAllSections() {
        ArrayList<Link> sectionLinkList = baseProgram.getAllSectionLinks();
        for (Link l : sectionLinkList) {
            Chapter chapterSource = (Chapter) baseProgram.getProgramSection(l.getLinkChapterSource());
            String chapterSourceEnd = this.identifierToNodeNameMap.get(chapterSource.getChapterEndPage());

            Chapter chapterTarget = (Chapter) baseProgram.getProgramSection(l.getLinkChapterTarget());
            String chapterTargetStart = this.identifierToNodeNameMap.get(chapterTarget.getChapterStartPage());

            buffer.append("currentGame.connectSections(\"").append(chapterSourceEnd)
                    .append("\", \"").append(chapterTargetStart).append("\");");
        }
        return this;
    }

    private CodeGenerator bindAllPages() {
        ArrayList<Link> chapterLinkList = baseProgram.getAllChapterLinks();
        for (Link l : chapterLinkList) {
            Reference currentLinkReference = l.getLinkReference();
            String sourcePage = currentLinkReference.getReferenceSource();
            String sourceOption = currentLinkReference.getReferenceOption();
            String targetPage = l.getLinkVariableReference();

            String sourcePageIC = this.identifierToNodeNameMap.get(sourcePage);
            String targetPageIC = this.identifierToNodeNameMap.get(targetPage);

            buffer.append("currentGame.addLinkToGame(\"").append(sourcePageIC)
                    .append("\", \"").append(sourceOption).append("\", \"").append(targetPageIC).append("\");");
        }
        return this;
    }

    public CodeGenerator extractAndBuildPages() {
        int nodeCounter = 0;
        ArrayList<Page> pageList = this.baseProgram.getAllPages();
        for (Page p : pageList) {
            String nodeIdentifier = p.getSectionIdentifier();
            String nodeTextPrompt = p.getPageText();
            this.identifierToPageMap.put(nodeIdentifier, p);
            buffer.append("Game.Node node_").append(nodeCounter).append(" = new Game.Node(\"")
                    .append(nodeIdentifier).append("\",").append(nodeTextPrompt).append(");");

            ArrayList<String> nodeOptionsId = p.getPageOptions();
            ArrayList<String> nodeOptionsTxt = p.getPageOptionText();
            this.identifierToNodeNameMap.put(nodeIdentifier, "node_" + nodeCounter);
            for (int i = 0; i < nodeOptionsId.size(); i++)
                buffer.append("node_").append(nodeCounter).append(".addOption(\"")
                        .append(nodeOptionsId.get(i)).append("\", ").append(nodeOptionsTxt.get(i))
                        .append(");");
            this.addIfStatementOptions(p, nodeCounter);

            buffer.append("currentGame.addNodesToGame(node_").append(nodeCounter).append(", ")
                    .append("\"node_").append(nodeCounter).append("\");").append("\n");
            nodeCounter++;
        }

        return this;
    }

    public void addIfStatementOptions(Page p, int nodeCounter) {
        if (p.hasIfStatement()) {
            ArrayList<String> nodeIfOptionsId = p.getIfStatementPageOptions();
            ArrayList<String> nodeIfOptionsTxt = p.getIfStatementPageText();
            ArrayList<Reference> refs = p.getIfStatementReferences();

            for (int i = 0; i < nodeIfOptionsId.size(); i++)
                buffer.append("node_").append(nodeCounter).append(".addIfOption(\"")
                        .append(nodeIfOptionsId.get(i)).append("\", ")
                        .append(nodeIfOptionsTxt.get(i)).append(", \"")
                        .append(refs.get(i).getReferenceOption()).append("\", \"")
                        .append(refs.get(i).getReferenceSource()).append("\");");
        }
    }

    private static final String MAIN_DOT_JAVA_START = "public class Main { public static void main(String [] args){ " +
            "Game currentGame = new Game(); ";
    private static final String MAIN_DOT_JAVA_END = "GameDriver driver = new GameDriver(currentGame); " +
            "driver.start(); } }";
    private static final String GAMEDRIVER_DOT_JAVA = "import java.util.InputMismatchException; " +
            "import java.util.Scanner; /** * Created by hugoj on 4/21/2017. */ public class GameDriver { private " +
            "Game baseGame; private static final String DIVIDER = \"---------------------------------------------------------------------------\"; " +
            "public GameDriver (Game input){ this.baseGame = input; } public void start(){ int stop = 10; Game.Node " +
            "currentNode = baseGame.getStart(); // Game.Node currentNode = this.testNode; while(currentNode != null)" +
            "{ System.out.print(baseGame.getNodeContents(currentNode)); String optionId = null; " +
            "if(!currentNode.hasTransferLink() && currentNode.getNumberOfOptions() > 0) { " +
            "int opNum = this.listenForResponse(baseGame.getCurrentNodeNumberOfOptions(currentNode)); " +
            "optionId = baseGame.trackHistory(currentNode, opNum); }else if(currentNode.hasTransferLink()) " +
            "System.out.println(DIVIDER + \"\\n\" + DIVIDER + \"\\n\"); else System.out.println(\"END OF GAME\"); " +
            "currentNode = baseGame.nextNode(currentNode, optionId); } } public int listenForResponse(int numOptions)" +
            "{ boolean validInput = false; int optionSelected = -1; Scanner input = new Scanner(System.in); " +
            "while(!validInput){ try { System.out.print(\"Select Option: \"); optionSelected = input.nextInt(); " +
            "validInput = true; }catch(InputMismatchException e){ System.out.println(\"Please enter an option from 1 to \" + numOptions); " +
            "input = new Scanner(System.in); } } return optionSelected; } } ";
    private static final String AME_DOT_JAVA = "import java.util.ArrayList; import java.util.HashMap; public class Game " +
            "{ /* String = \"node_n\" where n is the number of the node, identifier in intermediate code * Node = refer" +
            "ence to node that has this identifier to intermediate code */ private HashMap<String, Node> gameNodes; /* " +
            "A history of nodes traversed thus far */ private GameHistory currentGamePath; private String setStartSecti" +
            "on; public Game(){ gameNodes = new HashMap<>(); currentGamePath = new GameHistory(); } public void addNodes" +
            "ToGame(Node newNode, String nodeIdentifier){ gameNodes.put(nodeIdentifier, newNode); } public void addLinkT" +
            "oGame(String nodeIntermediateIdentifier, String nodeOptionIdentifier, String nodeSourceIntermediateIdentifi" +
            "er){ gameNodes.get(nodeIntermediateIdentifier).addLink(nodeOptionIdentifier, nodeSourceIntermediateIdentifi" +
            "er); } public String trackHistory(Node currentNode, int op){ String optionId = currentNode.nThOption(op); t" +
            "his.currentGamePath.add(currentNode, optionId); return optionId; } public void connectSections(String nodeI" +
            "ntermediateIdentifier, String nodeSourceIntermediateIdentifier){ gameNodes.get(nodeIntermediateIdentifier)." +
            "connectToOtherSection(nodeSourceIntermediateIdentifier); } public void setStart(String id){ this.setStartSe" +
            "ction = id; } public Node getStart(){ return this.getNodeByID(this.setStartSection); } public String getNod" +
            "eContents(Node currentNode){ return currentNode.getNodeTextPrompt() + \"\\n\" + currentNode.getNodeOptions(" +
            "currentGamePath) + \"\\n\"; } public int getCurrentNodeNumberOfOptions(Node currentNode){ return currentNod" +
            "e.getNumberOfOptions(); } public Node getNodeByID(String id){ for(Node n: gameNodes.values()) if(id.equals(" +
            "n.getNodeIdentifier())) return n; return null; } public Node nextNode(Node currentNode, String optionSelect" +
            "ed){ if(optionSelected != null) return this.gameNodes.get(currentNode.traverseLink(optionSelected)); return" +
            " this.gameNodes.get(currentNode.getTransferLink()); } public static class Node{ private String nodeIdentifi" +
            "er; private String nodeTextPrompt; private String transferLink; /* <OptionIdentifier, OptionTextPrompt> */ " +
            "private HashMap<String, String> optionMap; /* <OptionIdentifier, NodeIdentifier> */ private HashMap<String," +
            " String> nodeLinks; private HashMap<String, String> ifOption; public Node(String id, String text){ this.nod" +
            "eIdentifier = id; this.nodeTextPrompt = text; this.transferLink = null; this.optionMap = new HashMap<>(); t" +
            "his.nodeLinks = new HashMap<>(); this.ifOption = new HashMap<>(); } public void addOption(String id, String" +
            " text){ this.optionMap.put(id, text); this.ifOption.put(id, null); } public void addIfOption(String id, Str" +
            "ing text, String conditionalOption, String conditionalOptionSource){ this.addOption(id, text); this.ifOptio" +
            "n.put(id, conditionalOption + \",\" + conditionalOptionSource); } public void addLink(String opId, String n" +
            "odeId){ this.nodeLinks.put(opId, nodeId); } public String traverseLink(String opId){ return this.nodeLinks." +
            "get(opId); } public void connectToOtherSection(String sectionStart){ this.transferLink = sectionStart; } pu" +
            "blic String getNodeTextPrompt(){ return this.nodeTextPrompt; } public String getNodeOptions(GameHistory cur" +
            "rentGamePath){ StringBuilder gen = new StringBuilder(); int index = 1; for(String optionKey : this.optionMa" +
            "p.keySet()) { String optionText = this.optionMap.get(optionKey); String conditionals = this.ifOption.get(op" +
            "tionKey); if(conditionals == null) { String header = \"(\" + index + \") \"; gen.append(header).append(opti" +
            "onText).append(\"\\n\"); index++; }else{ String args [] = conditionals.split(\",\"); if(currentGamePath.inH" +
            "istory(args[1], args[0])){ String header = \"(\" + index + \") \"; gen.append(header).append(optionText).ap" +
            "pend(\"\\n\"); index++; } } } return gen.toString(); } public String getNodeIdentifier(){ return this.nodeI" +
            "dentifier; } public int getNumberOfOptions(){ return this.optionMap.size(); } public String nThOption(int n" +
            "){ int i = 1; for(String key: this.optionMap.keySet()){ if(i == n) return key; i++; } return null; } public" +
            " boolean hasTransferLink(){ return this.transferLink != null; } public String getTransferLink(){ return thi" +
            "s.transferLink; } } public static class GameHistory{ private ArrayList<String> listOfNodeIdentifiers; priva" +
            "te ArrayList<String> optionSelected; public GameHistory(){ this.listOfNodeIdentifiers = new ArrayList<>(); " +
            ".optionSelected = new ArrayList<>(); } public void add(Node currentNode, String op){ this.listOfNodeIdentif" +
            "iers.add(currentNode.getNodeIdentifier()); this.optionSelected.add(op); } public boolean inHistory(String i" +
            "d, String op){ return this.listOfNodeIdentifiers.contains(id) && this.optionSelected.contains(op); } } } ";
}