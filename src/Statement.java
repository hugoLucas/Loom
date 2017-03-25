import javax.swing.plaf.nimbus.State;

/**
 * Created by hugoj on 3/24/2017.
 */
public class Statement {

    private Object statementContainer;
    private ErrorObject errorHandler;

    public Statement(Object statement){
        this.statementContainer = statement;
        this.errorHandler = new ErrorObject();
    }

    public Statement(String message){
        this.statementContainer = null;
        this.errorHandler = new ErrorObject(message, true);
    }

    public Object getStatementContainer(){
        return this.statementContainer;
    }

    public boolean wasThereAnError(){
        return this.errorHandler.wasThereAnError();
    }

    public String returnErrorMessage(){
        return this.errorHandler.getErrorMessage();
    }
}
