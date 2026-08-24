package HomeWorkPatterns.FactoryMethod.Transport;

public class Bicycle implements Transport{
    @Override
    public void move() {
        System.out.println("Велосипед движется со скоростью 10 км/ч");
    }
}
