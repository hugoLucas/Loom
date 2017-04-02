import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hugoj on 3/24/2017.
 */
public class Program extends ErrorObject{

    private HashMap<String, ProgramSection> programSectionMap;
    private ArrayList<String> identifierTable;

    public Program(String errorMessage){
        super(errorMessage, true);
    }

    public Program(){
        super();

        this.programSectionMap = new HashMap<>();
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

        this.programSectionMap.put(section.getSectionIdentifier(), section);
        return null;
    }

    public String verifyReferences(){
        for(ProgramSection sec: this.programSectionMap.values()){
            ArrayList<Reference> stmtReferences = sec.getAllReferences();
            if(stmtReferences != null)
                for(Reference ref: stmtReferences){
                    if(this.programSectionMap.containsKey(ref.getReferenceSource())){
                        ProgramSection section = this.programSectionMap.get(ref.getReferenceSource());
                        if(!section.containsComponentIdentifier(ref.getReferenceOption()))
                            return "InvalidReferenceException: " + ref.getLineNumber();
                    }else
                        return "InvalidReferenceException: " + ref.getLineNumber();
                }
        }
        return null;
    }

    public String returnErrorMessage(){
        return this.getErrorMessage();
    }
}
