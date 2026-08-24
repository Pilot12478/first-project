package HomeWorkPatterns.Builder.OrderBuilder;

public class Shop {
    public Order.OrderBuilder createOrder(){
        return new Order.OrderBuilder();
    }

    static void main() {
        Shop shop = new Shop();
        Order order =shop.createOrder().addItem("Футболка").applyDiscount(0.1).choosePaymentMethod("Наличные").build();
        System.out.println(order);
    }
}
