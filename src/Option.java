/**
 * Created by hugoj on 3/25/2017.
 */
public class Option extends Statement {
    private String optionIdentifier;
    private String optionText;

    public Option(String optionIdentifier, String optionText){
        super();
        this.optionIdentifier = optionIdentifier;
        this.optionText = optionText;
    }

    public String getOptionIdentifier() {
        return optionIdentifier;
    }

    public String getOptionText() {
        return optionText;
    }
}
