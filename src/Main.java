import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputString;
        try {
            inputString = fileToString(args[0]);
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Please specify a Loom text file!");
            return;
        }
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        Loom2Lexer lexer = new Loom2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LoomErrorListener listener = new LoomErrorListener();
        Loom2Parser parser = new Loom2Parser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(listener);
        ParseTree tree = parser.program();

        if(!listener.wasThereAnError()) {
            ProgramVisitor vis = new ProgramVisitor();

            System.out.println("Parsing input file...");
            Program program = vis.visit(tree);

            if (program.wasThereAnError())
                System.out.println(program.returnErrorMessage());
            else {
            /* Code generation goes in here ! */
                System.out.println("Generating code...");
                CodeGenerator gen = new CodeGenerator(program);
                gen.build();
            }
        }
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

