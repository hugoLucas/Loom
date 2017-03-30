import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hugoj on 3/28/2017.
 */
public class Chapter extends ProgramSection {

    private String chapterTitle;
    private String chapterComponentId;

    private HashMap<String, String> chapterIdentifierToComponentIdMap;
    private ArrayList<String> chapterPagesNames;


    private ArrayList<Link> chapterLinks;

    public Chapter(){
        super();
        this.chapterIdentifierToComponentIdMap = new HashMap<>();
        this.chapterPagesNames = new ArrayList<>();
        this.chapterLinks = new ArrayList<>();
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getChapterComponentId() {
        return chapterComponentId;
    }

    public void setChapterComponentId(String chapterComponentId) {
        this.chapterComponentId = chapterComponentId;
    }

    public boolean addVariableAssignment(String variableName, String componentId){
        if(this.chapterIdentifierToComponentIdMap.containsKey(variableName) || this.chapterComponentId.equals(componentId))
            return false;
        else {
            this.chapterIdentifierToComponentIdMap.put(variableName, componentId);
            return true;
        }
    }

    public int addPage(String pg){
        for(String p: this.chapterPagesNames)
            if(p.equals(pg))
                return -1;

        if(pg.equals(this.chapterComponentId))
            return -2;
        else if(chapterIdentifierToComponentIdMap.values().contains(pg))
            return -3;

        this.chapterPagesNames.add(pg);
        return 0;
    }

    public boolean addLink(Link link){
        for(Link l : this.chapterLinks)
            if(l.getLinkReference().equalTo(link.getLinkReference()))
                return false;

        for(Link l: this.chapterLinks){
            String compIdOrRef = l.getLinkReference().getReferenceSource();
            if(compIdOrRef.startsWith("$")){
                if(this.chapterIdentifierToComponentIdMap.containsValue(compIdOrRef)){
                    String var = this.getKeyFromValue(compIdOrRef);
                    if(var != null)
                        if(link.getLinkReference().getReferenceSource().equals(var))
                            return false;
                }
            }else{
                String var = this.chapterIdentifierToComponentIdMap.get(compIdOrRef);
                if(var != null)
                    if(link.getLinkReference().getReferenceSource().equals(var))
                        return false;
            }
        }

        this.chapterLinks.add(link);
        return true;
    }

    public boolean inDefinedAsPage(String name){
        return this.chapterPagesNames.contains(name);
    }

    public boolean isValidVariableName(String name){
        return this.inDefinedAsPage(name) &&
                this.chapterIdentifierToComponentIdMap.containsKey(name);
    }

    public boolean isComplete(){
        boolean hasName = this.chapterTitle != null;
        boolean hasId = this.chapterComponentId != null;
        boolean hasPages = this.chapterPagesNames.size() != 0;
        boolean hasLinks = this.chapterLinks.size() != 0;

        return hasName && hasId && hasPages && hasLinks;
    }

    public String getKeyFromValue(String value){
        for(String key: this.chapterIdentifierToComponentIdMap.keySet())
            if(this.chapterIdentifierToComponentIdMap.get(key).equals(value))
                return key;
        return null;
    }
}
