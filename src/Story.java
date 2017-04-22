import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by hugoj on 3/30/2017.
 */
public class Story extends ProgramSection {

    private String storyTitle;
    private ArrayList<Sec> storySections;

    private boolean storyHasStart;
    private boolean storyHasEnd;

    public Story(){
        super();
        storySections = new ArrayList<>();
        storyHasStart = false;
        storyHasEnd = false;
    }

    public void addStoryTitle(String newTitle){
        this.storyTitle = newTitle;
    }

    public String getSectionIdentifier(){
        return this.storyTitle;
    }

    @Override
    boolean containsComponentIdentifier(String identifier) {
        return false;
    }

    public boolean addStorySection(Sec storySection){
        if(storySection.getSectionStart() && this.storyHasStart)
            return false;
        else if(storySection.getSectionEnd() && this.storyHasEnd)
            return false;

        if(!this.duplicateSection(storySection)) {
            if(storySection.getSectionStart())
                this.storyHasStart = true;
            else if(storySection.getSectionEnd())
                this.storyHasEnd = true;

            this.storySections.add(storySection);
            return true;
        }

        return false;
    }

    public boolean duplicateSection(Sec storySection){
        for(Sec s: this.storySections)
            if(s.equals(storySection))
                return true;
        return false;
    }

    public boolean isComplete(){
        return this.storyHasStart && this.storyTitle != null
                && this.storySections.size() > 0;
    }

    @Override
    public ArrayList<String> getAllIdentifiers() {
        return null;
    }

    @Override
    public ArrayList<String> getAllVariableAssignments() {
        return null;
    }

    @Override
    public ArrayList<String> getAllSectionalReferences() {
        return this.storySections.stream()
                .filter(s -> s.getSectionIdAsString() != null)
                .map(Sec::getSectionIdAsString)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Reference> getAllReferences() { return null; }

    @Override
    public ArrayList<Link> getAllLinks() {
        return null;
    }

    @Override
    public String toString(){
        return "STORY";
    }

    public String getStartIdentifier(){
        String startSection = null;
        for(Sec s: this.storySections)
            if(s.getSectionStart())
                startSection = s.getSectionIdAsString();

        return startSection;
    }

    public String getEndIdentifier(){
        String endSection = null;
        for(Sec s: this.storySections)
            if(s.getSectionStart())
                endSection = s.getSectionIdentifier();

        return endSection;
    }

}
