/**
 * Created by hugoj on 3/30/2017.
 */
public class Sec extends Definition {

    public static String SEC = "SEC";

    private boolean sectionStart;
    private boolean sectionEnd;
    private ComponentID sectionComponentId;
    private String sectionIdentifier;

    public Sec(ComponentID secId, boolean secStart, boolean secEnd){
        this.sectionStart = secStart;
        this.sectionEnd = secEnd;

        this.sectionComponentId = secId;
        this.sectionIdentifier = null;
    }

    public Sec(String secIdent, boolean secStart, boolean secEnd){
        this.sectionStart = secStart;
        this.sectionEnd = secEnd;

        this.sectionComponentId = null;
        this.sectionIdentifier = secIdent;
    }

    public String getSectionIdentifier(){
        return this.sectionIdentifier;
    }

    public String getSectionIdAsString(){
        return this.sectionComponentId.getComponentID();
    }

    @Override
    public String getStatementType() {
        return SEC;
    }

    public boolean getSectionStart(){
        return this.sectionStart;
    }

    public boolean getSectionEnd(){
        return this.sectionEnd;
    }

    public boolean equals(Sec o) {
        if(o.getSectionIdAsString() != null && this.getSectionIdAsString() != null)
            return o.getSectionIdAsString().equals(this.getSectionIdAsString());
        else if(o.getSectionIdentifier() != null && this.getSectionIdentifier() != null)
            return o.getSectionIdentifier().equals(this.getSectionIdentifier());
        return false;
    }
}
