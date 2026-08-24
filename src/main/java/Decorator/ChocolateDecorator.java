package Decorator;

public class ChocolateDecorator extends CoffeDecorator{
    public ChocolateDecorator(Coffee coffeeDecorator) {
        super(coffeeDecorator);
    }
    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription()+", Chocolate";
    }

    @Override
    public double getPrice() {
        return coffeeDecorator.getPrice()+2;
    }
}
