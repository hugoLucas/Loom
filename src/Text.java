/**
 * Created by hugoj on 3/25/2017.
 */
public class Text extends Definition {

    public static String TEXT = "TEXT";

    public Text(String textString){
        super();
        this.setDefinitionKeyIndent(TEXT);
        this.setDefinitionString(textString);
    }

    public String getTextString(){
        return this.getDefinitionString();
    }

    @Override
    public String getStatementType() {
        return TEXT;
    }
}
