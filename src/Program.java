/**
 * Created by hugoj on 3/24/2017.
 */
public class Program {

    private ErrorObject errorHandler;

    public Program(String message){
        this.errorHandler = new ErrorObject(message, true);
    }

    public boolean wasThereAnError(){
        return this.errorHandler.wasThereAnError();
    }

    public String returnErrorMessage(){
        return this.errorHandler.getErrorMessage();
    }
}
