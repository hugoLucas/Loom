/**
 * Created by hugoj on 3/26/2017.
 */
public class IfStatement extends Statement {

    private Reference ifStatementReference;
    private Definition ifStatementDefinition;
    private int lineNumber;

    public static String IFSTMT = "IFSTMT";

    public IfStatement(String errorMessage){
        super(errorMessage);
    }

    public IfStatement(Reference ref, Definition def, int lineNum){
        this.ifStatementDefinition = def;
        this.ifStatementReference = ref;
        this.lineNumber = lineNum;
    }

    public Definition getIfStatementDefinition() { return this.ifStatementDefinition; }

    public Reference getIfStatementReference(){
        return this.ifStatementReference;
    }

    public boolean equals(IfStatement ifStmt){
        return this.ifStatementReference.equals(ifStmt.getIfStatementReference());
    }

    public int getLineNumber(){
        return this.lineNumber;
    }

    @Override
    public String getStatementType() {
        return IFSTMT;
    }
}
