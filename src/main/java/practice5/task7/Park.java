package practice5.task7;

public class Park {
    private Attraction attraction;
    public void setAttraction(Attraction attraction){
        this.attraction = attraction;
    }
    public void manageAttraction(){
        if(attraction == null){
            System.out.println("В парке аттракционов сейчас нет аттракционов");
        }else {
            attraction.description();
            attraction.service();
        }
    }

    static void main() {
        Attraction rollerCoaster = new RollerСoaster();
        Attraction carousel = new Сarousel();
        Park park = new Park();
        park.setAttraction(carousel);
        park.manageAttraction();
    }
}
