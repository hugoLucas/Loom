import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Created by hugoj on 3/24/2017.
 */
public class Program extends ErrorObject{

    private HashMap<String, ProgramSection> programSectionMap;
    private ArrayList<String> identifierTable;

    private boolean STORY = false;

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

        if(section instanceof Story && !this.STORY)
            this.STORY = true;
        else if(section instanceof Story && this.STORY)
            return "MultipleStoryException";

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

    public ArrayList<Page> getAllPages(){
        return this.programSectionMap.values()
                .stream().filter(s -> s instanceof Page)
                .map(s -> (Page) s)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Link> getAllChapterLinks(){
        ArrayList<Link> chapterLinks = new ArrayList<>();
        this.programSectionMap.values().stream().filter(s -> s instanceof Chapter).forEach(s -> {
            ArrayList<Link> linkList = s.getAllLinks();
            if (linkList != null)
                chapterLinks.addAll(linkList);
        });
        return chapterLinks;
    }

    public ArrayList<Link> getAllSectionLinks(){
        ArrayList<Link> sectionLinks = new ArrayList<>();
        this.programSectionMap.values().stream().filter(s -> s instanceof Section).forEach(s -> {
            ArrayList<Link> linkList = s.getAllLinks();
            if (linkList != null)
                sectionLinks.addAll(linkList);
        });
        return sectionLinks;
    }

    public Story returnStorySection(){
        for (ProgramSection s : this.programSectionMap.values())
            if(s instanceof Story)
                return (Story) s;
        return null;
    }

    public ProgramSection getProgramSection(String identifier){
        return this.programSectionMap.get(identifier);
    }

    public String returnErrorMessage(){
        return this.getErrorMessage();
    }
}
