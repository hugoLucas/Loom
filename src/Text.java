/**
 * Created by hugoj on 3/25/2017.
 */
public class Text extends Statement {

    private String textString;

    public Text(String textString){
        super();
        this.textString = textString;
    }

    public String getTextString(){
        return this.textString;
    }
}
