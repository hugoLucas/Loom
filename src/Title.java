/**
 * Created by hugoj on 3/24/2017.
 */
public class Title extends Statement{

    private String titleContents;
    private String titleIdentifier;
    private int titleLineNumber;
    public static String TITLE = "TITLE";

    public Title(String titleContents, String titleIdentifier, int titleLineNumber){
        super();
        this.titleContents = titleContents;
        this.titleIdentifier = titleIdentifier;
        this.titleLineNumber = titleLineNumber;
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

    public int getTitleLineNumber(){ return this.titleLineNumber; }

    public boolean hasIdentifier(){
        return this.titleIdentifier != null;
    }

    @Override
    public String getStatementType() {
        return TITLE;
    }
}
