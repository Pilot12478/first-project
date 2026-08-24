package Decorator;

public class MilcDecorator extends CoffeDecorator{
    public MilcDecorator(Coffee coffeeDecorator) {
        super(coffeeDecorator);
    }
    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription() +", Milk";
    }

    @Override
    public double getPrice() {
        return coffeeDecorator.getPrice() +0.50;
    }
}
