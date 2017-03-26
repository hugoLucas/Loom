/**
 * Created by hugoj on 3/24/2017.
 */
public class Title extends Statement{

    private String titleContents;
    private String titleIdentifier;
    public static String TITLE = "TITLE";

    public Title(String titleContents, String titleIdentifier){
        super();
        this.titleContents = titleContents;
        this.titleIdentifier = titleIdentifier;
    }

    public Title(String message){
        super(message);
        this.titleContents = null;
        this.titleIdentifier = null;
    }

    public String getTitleContent(){
        return this.titleContents;
    }

    public String getTitleIdentifier(){
        return this.titleIdentifier;
    }

    public boolean hasIdentifier(){
        return this.titleIdentifier != null;
    }

    @Override
    public String getStatementType() {
        return TITLE;
    }
}
