/**
 * Created by hugoj on 3/24/2017.
 */
public abstract class Section {

    private ErrorObject errorHandler;

    public Section(){ this.errorHandler = new ErrorObject(); }

    public Section(String message){
        this.errorHandler = new ErrorObject(message, true);
    }

    public boolean wasThereAnError(){
        return this.errorHandler.wasThereAnError();
    }

    public String returnErrorMessage(){
        return this.errorHandler.getErrorMessage();
    }
}
