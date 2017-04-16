
/**
 * Created by hugoj on 3/24/2017.
 */
public abstract class Statement {

    private ErrorObject errorHandler;

    public Statement (){
        this.errorHandler = new ErrorObject();
    }

    public Statement(String message){
        this.errorHandler = new ErrorObject(message, true);
    }

    public boolean wasThereAnError(){
        return this.errorHandler.wasThereAnError();
    }

    public String returnErrorMessage(){
        return this.errorHandler.getErrorMessage();
    }

    abstract String getStatementType();
}
