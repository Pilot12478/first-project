package practiceProgrammingPrinciples.SRP;

public class OrderProcessor {
    public void processOrder(Order order) {
        System.out.println("Обрабатываем заказ " + order.getId());
    }

}
