import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.omg.CORBA.portable.InputStream;

import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        File inputFile = new File("C:\\Users\\Hugo Lucas\\IdeaProjects\\Stock\\input");

        ANTLRInputStream input = new ANTLRInputStream(System.in);

        StockLexer lexer = new StockLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            System.out.println(token.toString());
        }
        // StockParser parser = new StockParser(tokens);
        // ParseTree tree = parser.program(); // begin parsing at init rule
        // System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}