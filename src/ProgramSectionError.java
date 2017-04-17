import java.util.ArrayList;

/**
 * Created by hugoj on 3/26/2017.
 */
public class ProgramSectionError extends ProgramSection {

    public ProgramSectionError(String message) {
        super(message);
    }

    @Override
    String getSectionIdentifier() {
        return null;
    }

    @Override
    boolean containsComponentIdentifier(String identifier) {
        return false;
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

    @Override
    ArrayList<Reference> getAllReferences() {
        return null;
    }

    @Override
    ArrayList<Link> getAllLinks() {
        return null;
    }
}
