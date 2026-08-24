package PracticePatterns.Transport;

public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("Автомобиль едет со скоростью 60 км/ч");
    }
}
