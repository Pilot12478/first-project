package Decorator;

public abstract class CoffeDecorator implements Coffee{
    protected Coffee coffeeDecorator;
    public CoffeDecorator(Coffee coffeeDecorator){
        this.coffeeDecorator =coffeeDecorator;
    }
    @Override
    public String getDescription() {
        return coffeeDecorator.getDescription();
    }

    @Override
    public double getPrice() {
        return coffeeDecorator.getPrice();
    }
}
