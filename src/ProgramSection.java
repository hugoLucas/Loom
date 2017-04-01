import java.util.ArrayList;

/**
 * Created by hugoj on 3/24/2017.
 */
public abstract class ProgramSection {

    private ErrorObject errorHandler;

    public ProgramSection(){ this.errorHandler = new ErrorObject(); }

    public ProgramSection(String message){
        this.errorHandler = new ErrorObject(message, true);
    }

    public boolean wasThereAnError(){
        return this.errorHandler.wasThereAnError();
    }

    public String returnErrorMessage(){
        return this.errorHandler.getErrorMessage();
    }

    abstract ArrayList<String> getAllIdentifiers();

    abstract ArrayList<String> getAllVariableAssignments();

    abstract ArrayList<String> getAllSectionalReferences();
}
