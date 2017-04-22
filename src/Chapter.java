import java.sql.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Created by hugoj on 3/28/2017.
 */
public class Chapter extends ProgramSection {

    private String chapterTitle;
    private String chapterComponentId;

    private HashMap<String, String> chapterIdentifierToComponentIdMap;
    private ArrayList<String> chapterPagesNames;
    private String chapterStartPage;
    private String chapterEndPage;

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

    public String getSectionIdentifier() {
        return chapterComponentId;
    }

    @Override
    boolean containsComponentIdentifier(String identifier) {
        return this.chapterComponentId.equals(identifier);
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

    public int addPage(Pg page){
        String pg = page.returnPgTarget();

        for(String p: this.chapterPagesNames)
            if(p.equals(pg))
                return -1;

        if(pg.equals(this.chapterComponentId))
            return -2;
        else if(chapterIdentifierToComponentIdMap.values().contains(pg))
            return -3;

        String timeIdent = page.returnPgTimeIdent();
        if(timeIdent != null) {
            if (timeIdent.equals("START"))
                if (this.chapterStartPage == null) {
                    this.chapterStartPage = pg;
                    return 0;
                }
                else
                    return -4;
            if (timeIdent.equals("END"))
                if (this.chapterEndPage == null) {
                    this.chapterEndPage = pg;
                    return 0;
                }
                else
                    return -4;
        }

        if(this.chapterStartPage != null){
            if(this.chapterStartPage.equals(pg))
                return -1;
            if(this.chapterEndPage != null ){
                if(this.chapterEndPage.equals(pg))
                    return -1;
                if(chapterStartPage.equals(chapterEndPage))
                    return -4;
            }
        }


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
        return this.chapterPagesNames.contains(name) || this.chapterEndPage.equals(name) ||
                this.chapterStartPage.equals(name);
    }

    public boolean isValidVariableName(String name){
        return this.inDefinedAsPage(name) &&
                this.chapterIdentifierToComponentIdMap.containsKey(name);
    }

    public boolean isComplete(){
        boolean hasName = this.chapterTitle != null;
        boolean hasId = this.chapterComponentId != null;
        boolean hasLinks = this.chapterLinks.size() != 0;
        boolean hasStartAndEnd = this.chapterStartPage != null && this.chapterEndPage != null;

        return hasName && hasId && hasLinks && hasStartAndEnd;
    }

    public String getKeyFromValue(String value){
        for(String key: this.chapterIdentifierToComponentIdMap.keySet())
            if(this.chapterIdentifierToComponentIdMap.get(key).equals(value))
                return key;
        return null;
    }

    @Override
    public ArrayList<String> getAllIdentifiers() {
        ArrayList<String> identifierList = new ArrayList<>(1);
        identifierList.add(this.chapterComponentId);
        return identifierList;
    }

    @Override
    public ArrayList<String> getAllVariableAssignments() {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(this.chapterIdentifierToComponentIdMap.values());
        return list;
    }

    @Override
    public ArrayList<String> getAllSectionalReferences() {
        ArrayList<String> list = this.chapterPagesNames.stream()
                .filter(s -> s.startsWith("$"))
                .collect(Collectors.toCollection(ArrayList::new));
        if(this.chapterStartPage.startsWith("$"))
            list.add(this.chapterStartPage);
        if(this.chapterEndPage.startsWith("$"))
            list.add(this.chapterEndPage);

        return list;
    }

    @Override
    public ArrayList<Reference> getAllReferences() {
        ArrayList<Reference> refList = new ArrayList<>();
        for(Link l : this.chapterLinks){
            if(l.getLinkReference().getReferenceSource().startsWith("$"))
               refList.add(l.getLinkReference());
            else {
                String componentId = this.chapterIdentifierToComponentIdMap
                        .get(l.getLinkReference().getReferenceSource());
                Reference newRef = new Reference(componentId,
                        l.getLinkReference().getReferenceOption(), true,
                        l.getLinkReference().getLineNumber());
                refList.add(newRef);
            }
        }

        return refList;
    }

    @Override
    public ArrayList<Link> getAllLinks() {
        ArrayList<Reference> refList = this.getAllReferences();
        ArrayList<Link> linkList = new ArrayList<>(this.chapterLinks.size());

        for(int i = 0; i < refList.size(); i ++){
            Reference linkRef = refList.get(i);

            String linkId = null;
            if(this.chapterLinks.get(i).hasLinkVariableReference())
                linkId = this.chapterIdentifierToComponentIdMap.get(this.chapterLinks.get(i).getLinkVariableReference());
            else
                linkId = this.chapterLinks.get(i).getLinkCompIdReferenceAsString();

            linkList.add(new Link(linkRef, linkId, this.chapterLinks.get(i).getLinkLineNumber()));
        }

        return linkList;
    }

    public String getChapterStartPage(){
        return this.chapterIdentifierToComponentIdMap.get(this.chapterStartPage);
    }

    public String getChapterEndPage(){
        return this.chapterIdentifierToComponentIdMap.get(this.chapterEndPage);
    }

    @Override
    public String toString(){
        return "Chapter";
    }
}
