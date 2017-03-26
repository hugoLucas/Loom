import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by Hugo on 3/23/2017.
 */
public class Page extends Section{

    private String pageTitle;
    private String pageIdentifier;
    private String pageText;

    private ArrayList<String> optionText;
    private ArrayList<String> optionIdentifier;
    private boolean duplicateIdentifers;

    public Page(){
        super();
        this.pageTitle = null;
        this.pageIdentifier = null;
        this.pageText = null;

        this.optionText = new ArrayList<>();
        this.optionIdentifier = new ArrayList<>();
        this.duplicateIdentifers = false;
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
            this.duplicateIdentifers = true;
    }

    public boolean hasDuplicateIdentifers(){
        return this.duplicateIdentifers;
    }

    public boolean checkCompleteness(){
        boolean a = this.getPageText() != null;
        boolean b = this.getPageTitle() != null;
        boolean c = this.getPageIdentifer() != null;

        return (a && b && c);
    }
}
