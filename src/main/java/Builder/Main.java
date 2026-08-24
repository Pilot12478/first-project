package Builder;

public class Main {
    static void main() {
        Pizza simplePizza = new Pizza.Builder("Medium","Thin").build();
        System.out.println(simplePizza);

        Pizza pizzaWithMushrooms = new Pizza.Builder("Medium","Thin").mushrooms().sauce("red hot").build();
        System.out.println(pizzaWithMushrooms);
    }
}
