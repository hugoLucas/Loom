import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.omg.CORBA.portable.InputStream;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
=======
import java.io.*;
>>>>>>> acf9fbafd8c646e003257ed1fb37bfd1c493e5bb

public class Main {
        public static void main(String[] args) throws Exception {
            String inputString = fileToString("C:\\Users\\Hugo\\IdeaProjects\\Loom\\LoomInput_Chapter");
            ANTLRInputStream input = new ANTLRInputStream(inputString);
            LoomLexer lexer = new LoomLexer(input);

<<<<<<< HEAD
            for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken())
                System.out.println(token.toString());
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
=======
        String inputString = fileToString("C:\\Users\\Hugo Lucas\\IdeaProjects\\Loom\\LoomInput_Chapter");
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        LoomLexer lexer = new LoomLexer(input);

        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken())
            System.out.println(token.toString());
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
>>>>>>> acf9fbafd8c646e003257ed1fb37bfd1c493e5bb
