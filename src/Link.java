/**
 * Created by hugoj on 3/27/2017.
 */
public class Link extends Statement {

    public static String LINK = "LINK";

    private Reference linkReference;

    private String linkVariableReference;
    private ComponentID linkCompIdReference;

    private String linkChapterSource;
    private String linkChapterTarget;

    private int linkLineNumber;


    public Link(Reference linkRef, String linkVariable, int linkLineNumber){
        this.linkReference = linkRef;
        this.linkVariableReference = linkVariable;
        this.linkLineNumber = linkLineNumber;
    }

    public Link(Reference linkRef, ComponentID linkCompId, int linkLineNumber){
        this.linkReference = linkRef;
        this.linkCompIdReference = linkCompId;
        this.linkLineNumber = linkLineNumber;
    }

    public Link(String one, String two, int linkLineNumber){
        this.linkChapterSource = one;
        this.linkChapterTarget = two;
        this.linkLineNumber = linkLineNumber;
    }

    public boolean hasLinkVariableReference(){
        return this.linkVariableReference != null;
    }

    public String getLinkVariableReference(){
        return this.linkVariableReference;
    }

    public String getLinkCompIdReferenceAsString(){
        return this.linkCompIdReference.getComponentID();
    }

    public Reference getLinkReference(){
        return this.linkReference;
    }

    @Override
    public String getStatementType() {
        return LINK;
    }

    public String getLinkChapterSource() {
        return linkChapterSource;
    }

    public void setLinkChapterSource(String linkChapterSource) {
        this.linkChapterSource = linkChapterSource;
    }

    public String getLinkChapterTarget() {
        return linkChapterTarget;
    }

    public void setLinkChapterTarget(String linkChapterTarget) {
        this.linkChapterTarget = linkChapterTarget;
    }

    public boolean arrowLinkEquals(Link l){
        return (this.linkChapterSource.equals(l.getLinkChapterSource()) &&
                this.linkChapterTarget.equals(l.getLinkChapterTarget()));
    }

    public int getLinkLineNumber() {
        return linkLineNumber;
    }
}
