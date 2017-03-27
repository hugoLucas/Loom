/**
 * Created by hugoj on 3/27/2017.
 */
public class Link extends Statement {

    public static String LINK = "LINK";

    private Reference linkReference;

    private String linkVariableReference;
    private ComponentID linkCompIdReference;

    public Link(Reference linkRef, String linkVariable){
        this.linkReference = linkRef;
        this.linkVariableReference = linkVariable;
    }

    public Link(Reference linkRef, ComponentID linkCompId){
        this.linkReference = linkRef;
        this.linkCompIdReference = linkCompId;
    }

    @Override
    public String getStatementType() {
        return LINK;
    }
}
