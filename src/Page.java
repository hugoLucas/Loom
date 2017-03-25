import java.util.ArrayList;

/**
 * Created by Hugo on 3/23/2017.
 */
public class Page {

    private String pageTitle;
    private String pageIdentifier;
    private String pageText;
    private ArrayList<PageOption> pageOptions;

    public Page(){
        this.pageTitle = null;
        this.pageIdentifier = null;
        this.pageText = null;
        this.pageOptions = new ArrayList<>();
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

    public ArrayList<PageOption> getPageOptions() {
        return pageOptions;
    }

    public void addPageOptions(String optionText, String optionIdentifer) {
        this.pageOptions = pageOptions;
    }

    public boolean checkCompleteness(){
        boolean a = this.getPageText() != null;
        boolean b = this.getPageTitle() != null;
        boolean c = this.getPageIdentifer() != null;

        return (a && b && c);
    }

    private class PageOption{

        private String optionIdentifier;
        private String optionText;

        public PageOption(String identifier, String text){
            this.optionIdentifier = identifier;
            this.optionText = text;
        }
    }
}
