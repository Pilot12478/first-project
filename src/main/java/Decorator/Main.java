package Decorator;

public class Main {
    static void main() {
        Coffee coffee = new BlackCoffee();
        System.out.println(coffee.getDescription());
        CoffeDecorator coffeDecorator= new MilcDecorator(coffee);
        System.out.println(coffeDecorator.getDescription());
        CoffeDecorator coffeDecorator1 = new ChocolateDecorator(coffeDecorator);
        System.out.println(coffeDecorator1.getDescription());
        /*
        соответственно вместо того, чтобы создавать класс с кучей флагов
        или много классов с различными комбинациями, мы просто сделали классы декораторы
        и в клиентском классе мы можем их комбинировать как хотим
         */


    }

}
