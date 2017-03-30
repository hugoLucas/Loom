/**
 * Created by hugoj on 3/25/2017.
 */
public class Option extends Definition {

    public static String OPTION = "OPTION";

    public Option(String optionIdentifier, String optionText, int optionLineNumber){
        super();
        this.setDefinitionKeyIndent(OPTION);
        this.setDefinitionSourceComponentId(optionIdentifier);
        this.setDefinitionString(optionText);
        this.setDefinitionLineNumber(optionLineNumber);
    }

    public String getOptionIdentifier() {
        return this.getDefinitionSourceComponentId();
    }

    public String getOptionText() {
        return this.getDefinitionString();
    }

    public int getOptionLineNumber(){
        return this.getDefinitionLineNumber();
    }

    @Override
    public String getStatementType() {
        return OPTION;
    }
}
