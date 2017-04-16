/**
 * Created by hugoj on 3/29/2017.
 */
public class Chapt extends Definition {

    public static String CHAPT = "CHAPT";

    public Chapt(String var, boolean beginningPage, boolean endPage){
        super();
        if(beginningPage)
            this.setDefinitionTimeIndent("START");
        else if(endPage)
            this.setDefinitionTimeIndent("END");

        this.setDefinitionTargetNONWSSTR(var);
    }

    public Chapt(ComponentID compId, boolean beginningPage, boolean endPage){
        super();
        if(beginningPage)
            this.setDefinitionTimeIndent("START");
        else if(endPage)
            this.setDefinitionTimeIndent("END");

        this.setDefinitionTargetComponentId(compId.getComponentID());
    }

    public boolean endChapter(){
        if(this.getDefinitionTimeIndent().equals("START"))
            return false;
        return true;
    }

    public boolean startChapter(){
        if(this.getDefinitionTimeIndent().equals("END"))
            return false;
        return true;
    }

    public String returnChaptTarget(){
        if(this.getDefinitionTargetComponentId() != null)
            return this.getDefinitionTargetComponentId();
        else
            return this.getDefinitionTargetNONWSSTR();
    }

    @Override
    String getStatementType() {
        return CHAPT;
    }
}
