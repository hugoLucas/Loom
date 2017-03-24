import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.pattern.TokenTagToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputString = fileToString("C:\\Users\\Hugo\\IdeaProjects\\Loom2\\input.txt");
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        Loom2Lexer lexer = new Loom2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        /*Vocabulary v = lexer.getVocabulary();
        for(Token t = lexer.nextToken(); t.getType() != Token.EOF; t = lexer.nextToken()) {
            System.out.println(v.getSymbolicName(t.getType()) + " \'" + t.getText() + "\'");
            //System.out.println(" --> " + t.toString());
        }*/

        Loom2Parser parser = new Loom2Parser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new SyntaxAnalyzer(), tree);
    }

    public static String fileToString(String path) throws IOException {
        FileInputStream is = new FileInputStream(path);
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));

        String line = buf.readLine();
        StringBuilder sb = new StringBuilder();

        while(line != null){
            sb.append(line).append("\n");
            line = buf.readLine();
        }

        return sb.toString();
    }
}