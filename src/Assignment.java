/**
 * Created by hugoj on 3/27/2017.
 */
public class Assignment extends Statement {

    public static String ASS = "ASS";

    private int assignmentLineNumber;
    private String assignmentVariable;
    private ComponentID assignmentComponentId;

    public Assignment(String var, ComponentID id, int line){
        this.assignmentVariable = var;
        this.assignmentComponentId = id;
        this.assignmentLineNumber = line;
    }

    @Override
    public String getStatementType() {
        return ASS;
    }
}
