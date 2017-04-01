import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Created by hugoj on 3/29/2017.
 */
public class Section extends ProgramSection {

    private String sectionTitle;
    private String sectionIdentifier;
    private HashMap<String, String> sectionIdentifierToComponentIdMap;

    private String sectionStartChapter;
    private String sectionEndChapter;
    private ArrayList<String> sectionChapterNames;

    private ArrayList<Link> sectionLinks;

    public Section(){
        this.sectionIdentifierToComponentIdMap = new HashMap<>();
        this.sectionChapterNames = new ArrayList<>();
        this.sectionLinks = new ArrayList<>();
    }

    public boolean addVariableAssignment(String variableName, String componentId){
        if(this.sectionIdentifierToComponentIdMap.containsKey(variableName) || this.sectionIdentifier.equals(componentId)
                || this.sectionIdentifierToComponentIdMap.values().contains(componentId))
            return false;
        else {
            this.sectionIdentifierToComponentIdMap.put(variableName, componentId);
            return true;
        }
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public String getSectionIdentifier() {
        return sectionIdentifier;
    }

    public void setSectionIdentifier(String sectionIdentifier) {
        this.sectionIdentifier = sectionIdentifier;
    }

    public boolean definesAsPageOrVariable(String name){
        return this.sectionIdentifierToComponentIdMap.containsValue(name) || this.sectionStartChapter.equals(name)
                || this.sectionEndChapter.equals(name) || this.sectionChapterNames.contains(name);
    }

    public boolean addChapterToSection(String chapterName, boolean start, boolean end){
        if(start)
            if(this.sectionStartChapter == null)
                this.sectionStartChapter = chapterName;
            else
                return false;
        else if(end)
            if(this.sectionEndChapter == null )
                this.sectionEndChapter = chapterName;
            else
                return false;

        if(this.sectionStartChapter != null && this.sectionStartChapter != null)
            if(this.sectionStartChapter.equals(this.sectionEndChapter))
                return false;
        else
            if(!sectionChapterNames.contains(chapterName))
                this.sectionChapterNames.add(chapterName);
            else
                return false;

        return equivalentChapter();
    }

    public boolean equivalentChapter(){
        for(String s: this.sectionChapterNames){
            if(!s.startsWith("$")) {
                String candidateKey = this.keyFromValue(s);
                if (candidateKey != null)
                    if (this.sectionChapterNames.contains(candidateKey))
                        return false;
                    else if(this.sectionStartChapter.equals(candidateKey))
                        return false;
                    else if(this.sectionEndChapter.equals(candidateKey))
                        return false;
            }
        }

        if(this.sectionStartChapter != null) {
            if (this.sectionStartChapter.startsWith("$")) {
                String candidateKey = this.keyFromValue(this.sectionStartChapter);
                if (candidateKey != null && this.sectionEndChapter != null)
                    if (this.sectionEndChapter.equals(candidateKey))
                        return false;
            } else {
                String candidateKey = this.sectionIdentifierToComponentIdMap.get(this.sectionStartChapter);
                if (candidateKey != null && this.sectionEndChapter != null)
                    if (this.sectionEndChapter.equals(candidateKey))
                        return false;
            }
        }
        return true;
    }

    public boolean addLink(Link l){
        if(! l.getLinkChapterSource().equals(l.getLinkChapterTarget())) {
            this.sectionLinks.add(l);
            return true;
        }
        return false;
    }

    public String keyFromValue(String value){
        for(String key: this.sectionIdentifierToComponentIdMap.keySet())
            if(value.equals(this.sectionIdentifierToComponentIdMap.get(key)))
                return key;
        return null;
    }

    public boolean isComplete(){
        boolean hasTitleAndIdentifier = this.sectionTitle != null && this.sectionIdentifier != null;
        boolean hasEndAndStart = this.sectionStartChapter != null && this.sectionEndChapter != null;
        boolean hasChapters = this.sectionChapterNames.size() > 0;
        boolean hasLinks = this.sectionLinks != null;

        return hasTitleAndIdentifier && hasEndAndStart && hasChapters && hasLinks;
    }

    @Override
    public ArrayList<String> getAllIdentifiers() {
        ArrayList<String> identifierList = new ArrayList<>(1);
        identifierList.add(this.sectionIdentifier);
        return identifierList;
    }

    @Override
    public ArrayList<String> getAllVariableAssignments() {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(this.sectionIdentifierToComponentIdMap.values());
        return list;
    }

    @Override
    public ArrayList<String> getAllSectionalReferences() {
        ArrayList<String> list = this.sectionChapterNames.stream()
                .filter(s -> s.startsWith("$"))
                .collect(Collectors.toCollection(ArrayList::new));
        if(sectionEndChapter.startsWith("$"))
            list.add(sectionEndChapter);
        if(sectionStartChapter.startsWith("$"))
            list.add(sectionStartChapter);
        return list;
    }

    @Override
    public String toString(){
        return "Section";
    }
}
