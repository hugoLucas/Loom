/**
 * Created by hugoj on 3/24/2017.
 */
public class ErrorObject {
    private String errorMessage;
    private boolean errorFlag;

    public ErrorObject(String errorMessage, boolean errorFlag){
        this.errorMessage = errorMessage;
        this.errorFlag = errorFlag;
    }

    public ErrorObject(){
        this.errorFlag = false;
        this.errorMessage = null;
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }

    public boolean wasThereAnError(){
        return this.errorFlag;
    }
}
