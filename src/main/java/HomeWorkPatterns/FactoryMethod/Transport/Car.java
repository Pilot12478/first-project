package HomeWorkPatterns.FactoryMethod.Transport;

public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("Автомобиль двигается со скоростью 60 км/ч");
    }
}
