/**
 * Created by hugoj on 3/24/2017.
 */
public class Program extends ErrorObject{

    public Program(String errorMessage){
        super(errorMessage, true);
    }

    public Program(){
        super();
    }

    public String returnErrorMessage(){
        return this.getErrorMessage();
    }
}
