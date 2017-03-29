import java.util.ArrayList;

/**
 * Created by Hugo on 3/23/2017.
 */
public class Page extends ProgramSection {

    private String pageTitle;
    private String pageIdentifier;
    private String pageText;

    private ArrayList<String> optionText;
    private ArrayList<String> optionIdentifier;
    private boolean duplicateIdentifiers;

    public Page(){
        super();
        this.pageTitle = null;
        this.pageIdentifier = null;
        this.pageText = null;

        this.optionText = new ArrayList<>();
        this.optionIdentifier = new ArrayList<>();
        this.duplicateIdentifiers = false;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getPageIdentifer() {
        return pageIdentifier;
    }

    public void setPageIdentifer(String pageIdentifer) {
        this.pageIdentifier = pageIdentifer;
    }

    public String getPageText() {
        return pageText;
    }

    public void setPageText(String pageText) {
        this.pageText = pageText;
    }

    public void addPageOptions(String optionText, String optionIdentifier) {
        this.optionText.add(optionText);

        if(!this.optionIdentifier.contains(optionIdentifier))
            this.optionIdentifier.add(optionIdentifier);
        else
            this.duplicateIdentifiers = true;
    }

    public boolean hasDuplicateIdentifiers(){
        return this.duplicateIdentifiers;
    }

    public boolean checkCompleteness(){
        boolean a = this.getPageText() != null;
        boolean b = this.getPageTitle() != null;
        boolean c = this.getPageIdentifer() != null;

        return (a && b && c);
    }
}
