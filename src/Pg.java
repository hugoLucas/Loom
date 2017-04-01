import java.util.InputMismatchException;

/**
 * Created by hugoj on 3/27/2017.
 */
public class Pg extends Definition {

    public static String PG = "PG";

    public Pg (String var, boolean beginningPage, boolean endPage, int lineNumber){
        super();
        if(beginningPage)
            this.setDefinitionTimeIndent("START");
        else if(endPage)
            this.setDefinitionTimeIndent("END");

        this.setDefinitionTargetNONWSSTR(var);
        this.setDefinitionLineNumber(lineNumber);
    }

    public Pg (ComponentID compId, boolean beginningPage, boolean endPage, int lineNumber){
        super();
        if(beginningPage)
            this.setDefinitionTimeIndent("START");
        else if(endPage)
            this.setDefinitionTimeIndent("END");

        this.setDefinitionTargetComponentId(compId.getComponentID());
        this.setDefinitionLineNumber(lineNumber);
    }

    public Pg(String errorMessage){
        super(errorMessage);
    }

    public String returnPgTarget(){
        if(this.getDefinitionTargetComponentId() != null)
            return this.getDefinitionTargetComponentId();
        else
            return this.getDefinitionTargetNONWSSTR();
    }

    public String returnPgTimeIdent(){
        return this.getDefinitionTimeIndent();
    }

    public int getPgLineNumber(){
        return this.getDefinitionLineNumber();
    }

    @Override
    public String getStatementType() {
        return PG;
    }
}
