/**
 * Created by hugoj on 3/26/2017.
 */
public class IfStatement extends Statement {

    private Reference ifStatementReference;
    private Definition ifStatementDefinition;

    public static String IFSTMT = "IFSTMT";

    public IfStatement(String errorMessage){
        super(errorMessage);
    }

    public IfStatement(Reference ref, Definition def){
        this.ifStatementDefinition = def;
        this.ifStatementReference = ref;
    }

    @Override
    public String getStatementType() {
        return IFSTMT;
    }
}
