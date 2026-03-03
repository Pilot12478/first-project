package practice5.task3;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void getDescription() {
        System.out.println("Напиток объемом " + this.volume + " мл");
    }
}
