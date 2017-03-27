import java.util.InputMismatchException;

/**
 * Created by hugoj on 3/27/2017.
 */
public class Pg extends Definition {

    public static String PG = "PG";

    public Pg (String var, boolean beginingPage, boolean endPage){
        super();
        if(beginingPage)
            this.setDefinitionTimeIndent("START");
        else if(endPage)
            this.setDefinitionTimeIndent("END");

        this.setDefinitionTargetNONWSSTR(var);
    }

    public Pg (ComponentID compId, boolean beginingPage, boolean endPage){
        super();
        if(beginingPage)
            this.setDefinitionTimeIndent("START");
        else if(endPage)
            this.setDefinitionTimeIndent("END");

        this.setDefinitionTargetComponentId(compId.getComponentID());
    }

    @Override
    public String getStatementType() {
        return PG;
    }
}
