import java.util.ArrayList;

/**
 * Created by hugoj on 3/30/2017.
 */
public class Story extends Section {

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

    public String getStoryTitle(){
        return this.storyTitle;
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
}
