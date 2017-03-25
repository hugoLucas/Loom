/**
 * Created by hugoj on 3/24/2017.
 */
public class Title {

    private String titleContents;
    private String titleIdentifier;

    public Title(String titleContents, String titleIdentifier){
        this.titleContents = titleContents;
        this.titleIdentifier = titleIdentifier;
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
}
