import java.util.ArrayList;

/**
 * Created by hugoj on 3/26/2017.
 */
public class ProgramSectionError extends ProgramSection {

    public ProgramSectionError(String message) {
        super(message);
    }

    @Override
    ArrayList<String> getAllIdentifiers() {
        return null;
    }

    @Override
    ArrayList<String> getAllVariableAssignments() {
        return null;
    }

    @Override
    ArrayList<String> getAllSectionalReferences() {
        return null;
    }
}
