package PracticePatterns.OrderBuilder;

public class Shop {
    public Order.OrderBuilder createOrder() {
        return new Order.OrderBuilder();
    }


}
