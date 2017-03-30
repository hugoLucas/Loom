import java.util.ArrayList;
import java.util.HashMap;

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
}
