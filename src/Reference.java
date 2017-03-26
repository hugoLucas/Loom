/**
 * Created by hugoj on 3/26/2017.
 */
public class Reference {

    private String referencePageComponentID;
    private String referencPageIdentifier;
    private String referenceOption;

    private boolean usingComponentID;


    public Reference(String reference, String referenceOption, boolean usingComponentID){
        if(usingComponentID) {
            this.referencePageComponentID = reference;
            this.referencPageIdentifier = null;
        }else{
            this.referencePageComponentID = null;
            this.referencPageIdentifier = reference;
        }

        this.referenceOption = referenceOption;
    }
}
