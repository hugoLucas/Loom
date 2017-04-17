/**
 * Created by hugoj on 3/26/2017.
 */
public class Reference {

    private String referencePageComponentID;
    private String referencePageIdentifier;
    private String referenceOption;
    private int referenceLine;

    private boolean usingComponentID;


    public Reference(String reference, String referenceOption, boolean usingComponentID, int lineNum){
        if(usingComponentID) {
            this.referencePageComponentID = reference;
            this.referencePageIdentifier = null;
        }else{
            this.referencePageComponentID = null;
            this.referencePageIdentifier = reference;
        }

        this.referenceOption = referenceOption;
        this.referenceLine = lineNum;
    }

    public String getReferenceSource(){
        if(referencePageComponentID != null)
            return this.referencePageComponentID;
        else if(referencePageIdentifier != null)
            return this.referencePageIdentifier;
        else
            return null;
    }

    public boolean hasComponentId(){
        return this.referencePageComponentID != null;
    }

    public String getReferenceOption(){
        return this.referenceOption;
    }

    public void setReferenceSource(String newSource, boolean usingComponentID){
        if(usingComponentID) {
            this.referencePageComponentID = newSource;
            this.referencePageIdentifier = null;
        }else{
            this.referencePageComponentID = null;
            this.referencePageIdentifier = newSource;
        }
    }

    public boolean equalTo(Reference ref){
        if(this.getReferenceSource().equals(ref.getReferenceSource()))
            if(this.getReferenceOption().equals(ref.getReferenceOption()))
                return true;

        return false;
    }

    public String toString(){
        return this.getReferenceSource() + ", "
                + this.getReferenceOption();
    }

    public int getLineNumber(){
        return this.referenceLine;
    }
}
