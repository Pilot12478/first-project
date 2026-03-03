package practice5.task3;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void getDescription() {
        System.out.println("Темература горячего блюда в градусах " + this.temperature);
    }
}
