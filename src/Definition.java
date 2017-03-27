/**
 * Created by hugoj on 3/27/2017.
 */
public abstract class Definition extends Statement {

    private String definitionKeyIndent;

    private boolean hasTimeIdent;
    private String definitionTimeIndent;

    private boolean hasSoureCoponentId;
    private String definitionSourceComponentId;

    private boolean hasTargetCoponentId;
    private String definitionTargetComponentId;

    private boolean hasTargetNONWSSTR;
    private String definitionTargetNONWSSTR;

    private boolean hasTargetString;
    private String definitionTargetString;


    public Definition(){
        super();

        this.definitionKeyIndent = null;

        this.hasTimeIdent = false;
        definitionTimeIndent = null;

        hasSoureCoponentId = false;
        definitionSourceComponentId = null;

        hasTargetCoponentId = false;
        definitionTargetComponentId = null;

        hasTargetNONWSSTR = false;
        definitionTargetNONWSSTR = null;

        hasTargetString = false;
        definitionTargetString = null;
    }

    public String getDefinitionKeyIndent(){
        return this.definitionKeyIndent;
    }

    public void setDefinitionKeyIndent(String str){
        this.definitionKeyIndent = str;
    }

    public String getDefinitionTimeIndent(){
        if(this.hasTimeIdent)
            return definitionTimeIndent;
        return null;
    }

    public void setDefinitionTimeIndent(String str){
        this.definitionTimeIndent = str;
        this.hasTimeIdent = true;
    }

    public String getDefinitionSourceComponentId(){
        if(this.hasSoureCoponentId)
            return this.definitionSourceComponentId;
        return null;
    }

    public void setDefinitionSourceComponentId(String str){
        this.definitionSourceComponentId = str;
        this.hasSoureCoponentId = true;
    }

    public String getDefinitionTargetComponentId(){
        if(this.hasTargetCoponentId)
            return this.definitionTargetComponentId;
        return null;
    }

    public void setDefinitionTargetComponentId(String str){
        this.definitionTargetComponentId = str;
        this.hasTargetCoponentId = true;
    }

    public String getDefinitionTargetNONWSSTR(){
        if(this.hasTargetNONWSSTR)
            return this.definitionTargetNONWSSTR;
        return null;
    }

    public void setDefinitionTargetNONWSSTR(String str){
        this.definitionTargetNONWSSTR = str;
        this.hasTargetNONWSSTR = true;
    }

    public String getDefinitionString(){
        if(this.hasTargetString)
            return this.definitionTargetString;
        return null;
    }

    public void setDefinitionString(String str){
        this.definitionTargetString = str;
        this.hasTargetString = true;
    }
}
