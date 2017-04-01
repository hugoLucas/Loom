import java.util.ArrayList;

/**
 * Created by hugoj on 3/24/2017.
 */
public class Program extends ErrorObject{

    private ArrayList<ProgramSection> programSections;
    private ArrayList<String> identifierTable;

    public Program(String errorMessage){
        super(errorMessage, true);
    }

    public Program(){
        super();

        this.programSections = new ArrayList<>();
        this.identifierTable = new ArrayList<>();
    }

    public String addNewSection(ProgramSection section){
        ArrayList<String> identifiers = section.getAllIdentifiers();
        if(identifiers != null)
            for(String id : identifiers)
                if(identifierTable.contains(id))
                    return "DuplicateIdentifierException: " + section.toString();
                else
                    identifierTable.add(id);

        ArrayList<String> variables = section.getAllVariableAssignments();
        if(variables != null)
            for(String v: variables)
                if(!identifierTable.contains(v))
                    return "UndefinedIdentifierInAssignmentException: " + section.toString();

        ArrayList<String> sectionalReferences = section.getAllSectionalReferences();
        if(sectionalReferences != null)
            for(String s: sectionalReferences)
                if(!identifierTable.contains(s))
                    return "UndefinedIdentifierInDefinitionException: " + section.toString();

        this.programSections.add(section);
        return null;
    }

    public String returnErrorMessage(){
        return this.getErrorMessage();
    }
}
