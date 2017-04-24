import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*
 * Created by Hugo on 4/10/2017.
 */

class CodeGenerator {

    private Program baseProgram;
    private StringBuffer buffer;

    private HashMap<String, Page> identifierToPageMap;
    private HashMap<String, String> identifierToNodeNameMap;

    CodeGenerator(Program input) {
        this.baseProgram = input;
        this.buffer = new StringBuffer();
        this.identifierToPageMap = new HashMap<>();
        this.identifierToNodeNameMap = new HashMap<>();
    }

    void build() {
        this.extractAndBuildPages()
                .bindAllPages()
                .bindAllSections()
                .assembleStory()
                .makeFiles()
                .run();
    }

    private CodeGenerator assembleStory() {
        String startSection = baseProgram.returnStorySection().getStartIdentifier();
        //String startChapter = ((Section) baseProgram.getProgramSection(startSection)).getSectionStartChapter();
        Section s = (Section) baseProgram.getProgramSection(startSection);
        String startChapter = s.getSectionStartChapter();
        String startPage = ((Chapter) baseProgram.getProgramSection(startChapter)).getChapterStartPage();


        buffer.append("currentGame.setStart(\"").append(startPage).append("\");").append("\n");
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
                    .append("\", \"").append(chapterTargetStart).append("\");").append("\n");
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
                    .append("\", \"").append(sourceOption).append("\", \"")
                    .append(targetPageIC).append("\");").append("\n");
        }
        return this;
    }

    private CodeGenerator extractAndBuildPages() {
        int nodeCounter = 0;
        ArrayList<Page> pageList = this.baseProgram.getAllPages();
        for (Page p : pageList) {
            String nodeIdentifier = p.getSectionIdentifier();
            String nodeTextPrompt = p.getPageText();
            this.identifierToPageMap.put(nodeIdentifier, p);
            buffer.append("Game.Node node_").append(nodeCounter).append(" = new Game.Node(\"")
                    .append(nodeIdentifier).append("\",").append(nodeTextPrompt).append(");").append("\n");

            ArrayList<String> nodeOptionsId = p.getPageOptions();
            ArrayList<String> nodeOptionsTxt = p.getPageOptionText();
            this.identifierToNodeNameMap.put(nodeIdentifier, "node_" + nodeCounter);
            for (int i = 0; i < nodeOptionsId.size(); i++)
                buffer.append("node_").append(nodeCounter).append(".addOption(\"")
                        .append(nodeOptionsId.get(i)).append("\", ").append(nodeOptionsTxt.get(i))
                        .append(");").append("\n");
            this.addIfStatementOptions(p, nodeCounter);

            buffer.append("currentGame.addNodesToGame(node_").append(nodeCounter).append(", ")
                    .append("\"node_").append(nodeCounter).append("\");").append("\n");
            nodeCounter++;
        }

        return this;
    }

    private void addIfStatementOptions(Page p, int nodeCounter) {
        if (p.hasIfStatement()) {
            ArrayList<String> nodeIfOptionsId = p.getIfStatementPageOptions();
            ArrayList<String> nodeIfOptionsTxt = p.getIfStatementPageText();
            ArrayList<Reference> refs = p.getIfStatementReferences();

            for (int i = 0; i < nodeIfOptionsId.size(); i++)
                buffer.append("node_").append(nodeCounter).append(".addIfOption(\"")
                        .append(nodeIfOptionsId.get(i)).append("\", ")
                        .append(nodeIfOptionsTxt.get(i)).append(", \"")
                        .append(refs.get(i).getReferenceOption()).append("\", \"")
                        .append(refs.get(i).getReferenceSource()).append("\");").append("\n");
        }
    }

    private CodeGenerator makeFiles() {
        try {
            File programFile = new File("LoomRunFile.java");
            boolean fileAlreadyExists = programFile.createNewFile();

            FileWriter programFileWriter;
            if (fileAlreadyExists)
                programFileWriter = new FileWriter(programFile);
            else
                programFileWriter = new FileWriter(programFile, false);

            programFileWriter.write(MAIN_DOT_JAVA_START);
            programFileWriter.write(this.buffer.toString());
            programFileWriter.write(MAIN_DOT_JAVA_END);
            programFileWriter.close();
        } catch (IOException e) {
            System.out.println("An unexpected error has occurred.");
            e.printStackTrace();
        }

        return this;
    }

    private void run() {
        try {
            Process compile = Runtime.getRuntime().exec("javac LoomRunFile.java");
            compile.waitFor();
            int compileExitValue = compile.exitValue();

            if (compileExitValue == 0)
                System.out.println("Compilation successful...");
            else {
                System.out.println("Compilation Failed!");
                return;
            }

            System.out.println("Running.... \n \n");
            runProcess("java LoomRunFile");
        } catch (Exception c) {
            System.out.println("An unexpected error has occurred.");
            c.printStackTrace();
        }

    }

    /* Taken from:
    *   http://stackoverflow.com/questions/4842684/how-to-compile-run-java-program-in-another-java-program
    * */
    private static void runProcess(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(pro.getOutputStream()));
        // BufferedReader in = new BufferedReader(new InputStreamReader(pro.getInputStream()));

        new Thread(() -> {
            BufferedReader in = new BufferedReader(new InputStreamReader(pro.getInputStream()));
            int character;
            try {
                while ((character = in.read()) > 0) {
                    String read = Character.toString((char) character);
                    System.out.print(read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        while (pro.isAlive()) {
            pro.waitFor(1, TimeUnit.SECONDS);
            String inputString = new Scanner(System.in).nextLine();
            writer.write(inputString + "\n");
            writer.flush();
            pro.waitFor(1, TimeUnit.SECONDS);
        }
        pro.waitFor();
    }

    private static final String MAIN_DOT_JAVA_START = "import java.util.ArrayList;\n" +
            "import java.util.HashMap;\n" +
            "import java.util.InputMismatchException;\n" +
            "import java.util.Scanner;\n" +
            "\n" +
            "/*\n" +
            " * Main class for Loom intermediate code generation. In final product, Main.java will be replaced by LoomRunFile.java\n" +
            " * and GameDriver.java and Game.java will be included as inner classes. Code generated by Loom is stored below.\n" +
            " *\n" +
            " * Created by Hugo on 4/10/2017.\n" +
            " */\n" +
            "public class LoomRunFile {\n" +
            "    public static void main(String [] args){\n" +
            "        Game currentGame = new Game();\n" +
            "\n" +
            "        /**********************************************************************************************************\n" +
            "         ***********************************Intermediate Code Goes Here********************************************\n" +
            "         **********************************************************************************************************/" +
            "\n";

    private static final String MAIN_DOT_JAVA_END =
            "/**********************************************************************************************************\n" +
            "***********************************Intermediate Code Goes Here********************************************\n" +
            "**********************************************************************************************************/\n" +
            "\n" +
            "        GameDriver driver = new GameDriver(currentGame);\n" +
            "        driver.start();\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "/*\n" +
            " * Object that binds together all the intermediate code generated by Loom. Also provides functionality\n" +
            " * for GameDriver class.\n" +
            " *\n" +
            " * Created by hugoj on 4/21/2017.\n" +
            " */\n" +
            "class Game {\n" +
            "\n" +
            "    /* String = \"node_n\" where n is the number of the node, identifier in intermediate code\n" +
            "    *  Node = reference to node that has this identifier to intermediate code */\n" +
            "    private HashMap<String, Node> gameNodes;\n" +
            "\n" +
            "    /* A history of nodes traversed thus far */\n" +
            "    private GameHistory currentGamePath;\n" +
            "\n" +
            "    /* The identifier of the first node in game */\n" +
            "    private String setStartSection;\n" +
            "\n" +
            "    Game(){\n" +
            "        gameNodes = new HashMap<>();\n" +
            "        currentGamePath = new GameHistory();\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Adds the given node to the Game object. Stores reference to Node object as well as the Node's identifier\n" +
            "     * as written in Loom code.\n" +
            "     *\n" +
            "     * @param newNode           reference to Node object generated by Loom\n" +
            "     * @param nodeIdentifier    component id of node as written in Loom code\n" +
            "     */\n" +
            "    void addNodesToGame(Node newNode, String nodeIdentifier){\n" +
            "        gameNodes.put(nodeIdentifier, newNode);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Adds a reference to node that points to the target node given a certain option.\n" +
            "     *\n" +
            "     * @param nodeIntermediateIdentifier        the identifier of the source node\n" +
            "     * @param nodeOptionIdentifier              the option of the source node that will point to the taget node\n" +
            "     * @param nodeSourceIntermediateIdentifier  the target node\n" +
            "     */\n" +
            "    void addLinkToGame(String nodeIntermediateIdentifier, String nodeOptionIdentifier,\n" +
            "                       String nodeSourceIntermediateIdentifier){\n" +
            "        gameNodes.get(nodeIntermediateIdentifier).addLink(nodeOptionIdentifier, nodeSourceIntermediateIdentifier);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Stores the current Game's path. Used to make sure If-Statement conditions are true.\n" +
            "     *\n" +
            "     * @param currentNode   the current node the GameDriver is using\n" +
            "     * @param op            the option selected by the user\n" +
            "     * @return              the option identifier of the option selected by the user\n" +
            "     */\n" +
            "    String trackHistory(Node currentNode, int op){\n" +
            "        String optionId = currentNode.nThOption(op);\n" +
            "        this.currentGamePath.add(currentNode, optionId);\n" +
            "        return optionId;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Connects the end node of the source section to the start node of the target section as written in Loom code.\n" +
            "     *\n" +
            "     * @param nodeIntermediateIdentifier        identifier of source section\n" +
            "     * @param nodeSourceIntermediateIdentifier  identifier of target section\n" +
            "     */\n" +
            "    void connectSections(String nodeIntermediateIdentifier, String nodeSourceIntermediateIdentifier){\n" +
            "        gameNodes.get(nodeIntermediateIdentifier).connectToOtherSection(nodeSourceIntermediateIdentifier);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Sets the game start node as written in Loom code.\n" +
            "     *\n" +
            "     * @param id    the identifier of the start node as written in Loom code.\n" +
            "     */\n" +
            "    void setStart(String id){\n" +
            "        this.setStartSection = id;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Returns the Node designated as the start node by Loom\n" +
            "     *\n" +
            "     * @return      Node game will start at\n" +
            "     */\n" +
            "    Node getStart(){\n" +
            "        return this.getNodeByID(this.setStartSection);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Returns the node text prompt and option Strings.\n" +
            "     *\n" +
            "     * @param currentNode   the node the GameDriver is current at\n" +
            "     * @return              a String to display the contents to the user\n" +
            "     */\n" +
            "    String getNodeContents(Node currentNode){\n" +
            "        return currentNode.getNodeTextPrompt() + \"\\n\" +\n" +
            "                currentNode.getNodeOptions(currentGamePath) + \"\\n\";\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Returns the number of options the given node has.\n" +
            "     *\n" +
            "     * @param currentNode   the node the GameDriver is current at\n" +
            "     * @return              the number of options the current node has\n" +
            "     */\n" +
            "    int getCurrentNodeNumberOfOptions(Node currentNode){\n" +
            "        return currentNode.getNumberOfOptions();\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Returns the Node object with the given identifier\n" +
            "     *\n" +
            "     * @param id    the identifier the requested Node will have\n" +
            "     * @return      a Node object if the identifier is valid, Null if otherwise\n" +
            "     */\n" +
            "    private Node getNodeByID(String id){\n" +
            "        for(Node n: gameNodes.values())\n" +
            "            if(id.equals(n.getNodeIdentifier()))\n" +
            "                return n;\n" +
            "        return null;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Given a Node and an option, method will return the target Node the current Node references with the given\n" +
            "     * option.\n" +
            "     *\n" +
            "     * @param currentNode       the Node the GameDriver is currently at\n" +
            "     * @param optionSelected    the option selected by the user\n" +
            "     * @return                  the Node the current node references given the option selected\n" +
            "     */\n" +
            "    Node nextNode(Node currentNode, String optionSelected){\n" +
            "        if(optionSelected != null)\n" +
            "            return this.gameNodes.get(currentNode.traverseLink(optionSelected));\n" +
            "        return this.gameNodes.get(currentNode.getTransferLink());\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Class represents a Loom PAGE and holds references to other Nodes in order run Game.\n" +
            "     */\n" +
            "    static class Node{\n" +
            "\n" +
            "        /* The Loom identifier of the current Node */\n" +
            "        private String nodeIdentifier;\n" +
            "\n" +
            "        /* The Loom TEXT section contents */\n" +
            "        private String nodeTextPrompt;\n" +
            "\n" +
            "        /* Identifier of a node this node points to if this node is the end of a Loom SECTION, null otherwise */\n" +
            "        private String transferLink;\n" +
            "\n" +
            "        /* Map that stores all the Node's options and their text prompts\n" +
            "        * <OptionIdentifier, OptionTextPrompt> */\n" +
            "        private HashMap<String, String> optionMap;\n" +
            "\n" +
            "        /* Map that stores all the Node's references to other nodes as written in Loom code\n" +
            "        * <OptionIdentifier, NodeIdentifier> */\n" +
            "        private HashMap<String, String> nodeLinks;\n" +
            "\n" +
            "        /* Determines whether a given option is an If-Statement option\n" +
            "        * <OptionIdentifier, Reference> */\n" +
            "        private HashMap<String, String> ifOption;\n" +
            "\n" +
            "        /* The number of options a user was shown */\n" +
            "        private int optionsDisplayToUser;\n" +
            "\n" +
            "        Node(String id, String text){\n" +
            "            this.nodeIdentifier = id;\n" +
            "            this.nodeTextPrompt = text;\n" +
            "\n" +
            "            this.transferLink = null;\n" +
            "            this.optionMap = new HashMap<>();\n" +
            "            this.nodeLinks = new HashMap<>();\n" +
            "            this.ifOption = new HashMap<>();\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Interprets a Loom PAGE option and stores it in option map. For backwards comparability, assumes by default\n" +
            "         * given option is not If-Statement dependant.\n" +
            "         *\n" +
            "         * @param id        the option identifier of the option to add\n" +
            "         * @param text      the text of the option to add\n" +
            "         */\n" +
            "        void addOption(String id, String text){\n" +
            "            this.optionMap.put(id, text);\n" +
            "            this.ifOption.put(id, null);\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Interprets a Loom IF_STATEMENT and stores it in option map.\n" +
            "         *\n" +
            "         * @param id                        the option identifier\n" +
            "         * @param text                      the option text\n" +
            "         * @param conditionalOption         the option needed in GameHistory for statement to be true\n" +
            "         * @param conditionalOptionSource   the identifier of the page the conditional option above is in\n" +
            "         */\n" +
            "        void addIfOption(String id, String text, String conditionalOption, String conditionalOptionSource){\n" +
            "            this.addOption(id, text);\n" +
            "            this.ifOption.put(id, conditionalOption + \",\" + conditionalOptionSource);\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Interprets a Loom CHAPTER LINK\n" +
            "         *\n" +
            "         * @param opId      the option identifier to associate with the given node\n" +
            "         * @param nodeId    given the option above is selected, user should see this node\n" +
            "         */\n" +
            "        void addLink(String opId, String nodeId){\n" +
            "            this.nodeLinks.put(opId, nodeId);\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Jumps from current node to the node associated with the given option identifier\n" +
            "         *\n" +
            "         * @param opId      identifier of option selected\n" +
            "         * @return          the node associated with that option\n" +
            "         */\n" +
            "        String traverseLink(String opId){\n" +
            "            return this.nodeLinks.get(opId);\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Links this node with another node without the need of an option being selected. Used to link END and START\n" +
            "         * sections of Loom SECTIONs.\n" +
            "         *\n" +
            "         * @param sectionStart      the start node of the section this section should lead to\n" +
            "         */\n" +
            "        void connectToOtherSection(String sectionStart){\n" +
            "            this.transferLink = sectionStart;\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Returns node text prompt\n" +
            "         *\n" +
            "         * @return      String of text prompt to display to user\n" +
            "         */\n" +
            "        String getNodeTextPrompt(){\n" +
            "            return this.nodeTextPrompt;\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Prints all options a user should have access to. Determines if a given option's conditional statement is\n" +
            "         * true.\n" +
            "         *\n" +
            "         * @param currentGamePath   the options and nodes traversed by the current Game\n" +
            "         * @return                  a String to display to the user of all options available\n" +
            "         */\n" +
            "        String getNodeOptions(GameHistory currentGamePath){\n" +
            "            StringBuilder gen = new StringBuilder();\n" +
            "\n" +
            "            int index = 1;\n" +
            "            for(String optionKey : this.optionMap.keySet()) {\n" +
            "                String optionText = this.optionMap.get(optionKey);\n" +
            "                String conditionals = this.ifOption.get(optionKey);\n" +
            "                if(conditionals == null) {\n" +
            "                    String header = \"(\" + index + \") \";\n" +
            "                    gen.append(header).append(optionText).append(\"\\n\");\n" +
            "                    index++;\n" +
            "                }else{\n" +
            "                    String args [] = conditionals.split(\",\");\n" +
            "                    if(currentGamePath.inHistory(args[1], args[0])){\n" +
            "                        String header = \"(\" + index + \") \";\n" +
            "                        gen.append(header).append(optionText).append(\"\\n\");\n" +
            "                        index++;\n" +
            "                    }\n" +
            "                }\n" +
            "            }\n" +
            "\n" +
            "            this.optionsDisplayToUser = index - 1;\n" +
            "            return gen.toString();\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Getter method.\n" +
            "         *\n" +
            "         * @return      value of node identifier\n" +
            "         */\n" +
            "        String getNodeIdentifier(){\n" +
            "            return this.nodeIdentifier;\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Getter method.\n" +
            "         *\n" +
            "         * @return      number of options node has\n" +
            "         */\n" +
            "        int getNumberOfOptions(){\n" +
            "            return this.optionsDisplayToUser;\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Given the number of the option selected by the user, this method will return that option's identifier\n" +
            "         *\n" +
            "         * @param n     index of option selected\n" +
            "         * @return      the identifier of the option selected\n" +
            "         */\n" +
            "        String nThOption(int n){\n" +
            "            int i = 1;\n" +
            "            for(String key: this.optionMap.keySet()){\n" +
            "                if(i == n)\n" +
            "                    return key;\n" +
            "                i++;\n" +
            "            }\n" +
            "            return null;\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * @return      True if this node is an END node, false otherwise\n" +
            "         */\n" +
            "        boolean hasTransferLink(){\n" +
            "            return this.transferLink != null;\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * @return      returns value of transferLink\n" +
            "         */\n" +
            "        String getTransferLink(){\n" +
            "            return this.transferLink;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Class used to track all the options and Nodes traversed by a user in for a given Game.\n" +
            "     */\n" +
            "    private static class GameHistory{\n" +
            "\n" +
            "        /* List of identifiers of Nodes traversed */\n" +
            "        private ArrayList<String> listOfNodeIdentifiers;\n" +
            "\n" +
            "        /* List of options selected at the nodes stored in listOfNodeIdentifiers*/\n" +
            "        private ArrayList<String> optionSelected;\n" +
            "\n" +
            "        GameHistory(){\n" +
            "            this.listOfNodeIdentifiers = new ArrayList<>();\n" +
            "            this.optionSelected = new ArrayList<>();\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Adds to game history.\n" +
            "         *\n" +
            "         * @param currentNode   the Node the GameDriver is currently at\n" +
            "         * @param op            the option at the current Node the user selected\n" +
            "         */\n" +
            "        void add(Node currentNode, String op){\n" +
            "            this.listOfNodeIdentifiers.add(currentNode.getNodeIdentifier());\n" +
            "            this.optionSelected.add(op);\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Determines if a given Node and option were traversed/selected by the user.\n" +
            "         *\n" +
            "         * @param id        identifier of node\n" +
            "         * @param op        identifier of option\n" +
            "         * @return          True if the inputs are in the game history, false otherwise\n" +
            "         */\n" +
            "        boolean inHistory(String id, String op){\n" +
            "            return this.listOfNodeIdentifiers.contains(id) && this.optionSelected.contains(op);\n" +
            "        }\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "/*\n" +
            " * Using a Game object, this class will handle the output to the terminal as well as the user's input.\n" +
            " *\n" +
            " * Created by hugoj on 4/21/2017.\n" +
            " */\n" +
            "class GameDriver {\n" +
            "\n" +
            "    /* Game object to run */\n" +
            "    private Game baseGame;\n" +
            "\n" +
            "    GameDriver(Game input){\n" +
            "        this.baseGame = input;\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Method continuously loops until the game provided to GameDriver is over. Game is over when current Game.Node\n" +
            "     * has no valid out-going links.\n" +
            "     */\n" +
            "    void start(){\n" +
            "        /* Reference to start node of Game object */\n" +
            "        Game.Node currentNode = baseGame.getStart();\n" +
            "\n" +
            "        while(currentNode != null){\n" +
            "            /* Displays the nodes text prompt as well as possible options */\n" +
            "            System.out.print(\"\\n\" + baseGame.getNodeContents(currentNode));\n" +
            "\n" +
            "            /* If the node has options, listen for user input. Else if this node points to another\n" +
            "             * section, print the divider to separate sections. Else, the end of the game has been reached. */\n" +
            "            String optionId = null;\n" +
            "            if(!currentNode.hasTransferLink() && currentNode.getNumberOfOptions() > 0) {\n" +
            "                int opNum = this.listenForResponse(baseGame.getCurrentNodeNumberOfOptions(currentNode));\n" +
            "                optionId = baseGame.trackHistory(currentNode, opNum);\n" +
            "            }else if(currentNode.hasTransferLink())\n" +
            "                System.out.println(DIVIDER + \"\\n\" + DIVIDER + \"\\n\");\n" +
            "            else\n" +
            "                System.out.println(\"END OF GAME\");\n" +
            "\n" +
            "            /* Finds the next node in the game if there is one */\n" +
            "            currentNode = baseGame.nextNode(currentNode, optionId);\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * Listens for user input, makes sure user input is a valid option.\n" +
            "     *\n" +
            "     * @param numOptions    the total amount of options this node has\n" +
            "     * @return              the number of the option selected by the user\n" +
            "     */\n" +
            "    private int listenForResponse(int numOptions){\n" +
            "        boolean validInput = false;\n" +
            "        int optionSelected = -1;\n" +
            "\n" +
            "        Scanner input = new Scanner(System.in);\n" +
            "        while(!validInput){\n" +
            "            try {\n" +
            "                System.out.print(\"Select Option: \");\n" +
            "                optionSelected = input.nextInt();\n" +
            "                if(optionSelected <= numOptions)\n" +
            "                    validInput = true;\n" +
            "                else\n" +
            "                    System.out.println(\"Please enter an option from 1 to \" + numOptions);\n" +
            "            }catch(InputMismatchException e){\n" +
            "                System.out.println(\"Please enter an option from 1 to \" + numOptions);\n" +
            "                input = new Scanner(System.in);\n" +
            "            }\n" +
            "        }\n" +
            "\n" +
            "        return optionSelected;\n" +
            "    }\n" +
            "\n" +
            "    /* String constant used to divide chapters */\n" +
            "    private static final String DIVIDER = \"---------------------------------------------------------------------------\";\n" +
            "}";

}