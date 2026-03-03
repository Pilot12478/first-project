package practice5.task6;

public class BotanicalGarden {
    private Plant plant;
    public void addPlant(Plant plant){
        this.plant =plant;
    }
    public void provideCare(){
        if(plant ==null){
            System.out.println("В ботаническом саду пока нет растений");
        }else {
            plant.plantCare();
        }
    }

    static void main() {
        Plant cactus = new Cactus();
        Plant orchid = new Orchid();
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        botanicalGarden.addPlant(orchid);
        botanicalGarden.provideCare();

    }
}
