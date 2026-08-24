package Decorator;

public class BlackCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "черный кофе";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}
