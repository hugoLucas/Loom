/**
 * Created by hugoj on 3/27/2017.
 */
public abstract class Definition extends Statement {

    private String definitionKeyIndent;

    private boolean hasTimeIDENT;
    private String definitionTimeIndent;

    private boolean hasSourceComponentId;
    private String definitionSourceComponentId;

    private boolean hasTargetComponentId;
    private String definitionTargetComponentId;

    private boolean hasTargetNONWSSTR;
    private String definitionTargetNONWSSTR;

    private boolean hasTargetString;
    private String definitionTargetString;

    private int lineNumber;

    public Definition(){
        super();

        this.definitionKeyIndent = null;

        this.hasTimeIDENT = false;
        definitionTimeIndent = null;

        hasSourceComponentId = false;
        definitionSourceComponentId = null;

        hasTargetComponentId = false;
        definitionTargetComponentId = null;

        hasTargetNONWSSTR = false;
        definitionTargetNONWSSTR = null;

        hasTargetString = false;
        definitionTargetString = null;
    }

    public Definition(String errorMessage){
        super(errorMessage);
    }

    public String getDefinitionKeyIndent(){
        return this.definitionKeyIndent;
    }

    public void setDefinitionKeyIndent(String str){
        this.definitionKeyIndent = str;
    }

    public String getDefinitionTimeIndent(){
        if(this.hasTimeIDENT)
            return definitionTimeIndent;
        return null;
    }

    public void setDefinitionTimeIndent(String str){
        this.definitionTimeIndent = str;
        this.hasTimeIDENT = true;
    }

    public String getDefinitionSourceComponentId(){
        if(this.hasSourceComponentId)
            return this.definitionSourceComponentId;
        return null;
    }

    public void setDefinitionSourceComponentId(String str){
        this.definitionSourceComponentId = str;
        this.hasSourceComponentId = true;
    }

    public String getDefinitionTargetComponentId(){
        if(this.hasTargetComponentId)
            return this.definitionTargetComponentId;
        return null;
    }

    public void setDefinitionTargetComponentId(String str){
        this.definitionTargetComponentId = str;
        this.hasTargetComponentId = true;
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

    public void setDefinitionLineNumber(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public int getDefinitionLineNumber(){
        return this.lineNumber;
    }
}
