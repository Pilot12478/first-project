package PracticePatterns.Transport;

public class Bicycle implements Transport{
    @Override
    public void move() {
        System.out.println("Велосипед едет скоростью 10 км/ч");
    }
}
