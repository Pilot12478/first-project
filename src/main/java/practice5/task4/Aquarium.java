package practice5.task4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    public void showBehavior() {
        if (seaCreature == null) {
            System.out.println("В аквариум не добавлено животное");
        } else {
            seaCreature.move();
        }
    }

    static void main() {
        SeaCreature shark = new Shark();
        SeaCreature starFish = new StarFish();
        Aquarium aquarium = new Aquarium();
        aquarium.addSeaCreature(starFish);
        aquarium.showBehavior();
    }
}
