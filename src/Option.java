/**
 * Created by hugoj on 3/25/2017.
 */
public class Option extends Definition {

    public static String OPTION = "OPTION";

    public Option(String optionIdentifier, String optionText){
        super();
        this.setDefinitionKeyIndent(OPTION);
        this.setDefinitionSourceComponentId(optionIdentifier);
        this.setDefinitionString(optionText);
    }

    public String getOptionIdentifier() {
        return this.getDefinitionSourceComponentId();
    }

    public String getOptionText() {
        return this.getDefinitionString();
    }

    @Override
    public String getStatementType() {
        return OPTION;
    }
}
