package practice5.task8;

public class Museum {
    private Exhibit exhibit;
    public void addExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
    }
    public void manageExhibit(){
        if(exhibit ==null){
            System.out.println("В музее пока пусто");
        }else {
            exhibit.showDescription();
            exhibit.service();
        }
    }

    static void main() {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Museum museum = new Museum();
        museum.addExhibit(sculpture);
        museum.manageExhibit();
    }
}
