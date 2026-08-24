package PracticePatterns.OrderBuilder;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String>items;
    private double discount;
    private String paymentMethod;
    private Order(){
        items = new ArrayList<>();
        this.discount = 0.0;
        this.paymentMethod = "не выбран";
    }

    public List<String> getItems() {
        return items;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
    public static class OrderBuilder{
        private Order order;

        public OrderBuilder(){
            this.order = new Order();
        }

        public OrderBuilder addItem(String item){
            order.items.add(item);
            return this;
        }
        public OrderBuilder addPaymentMethod(String paymentMethod){
            if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
                throw new IllegalArgumentException("Способ оплаты не может быть пустым");
            }
            order.paymentMethod = paymentMethod;
            return this;
        }
        public OrderBuilder addDiscount(double discount){
            if (discount < 0 || discount > 100) {
                throw new IllegalArgumentException("Скидка должна быть от 0 до 100%");
            }
            order.discount = discount;
            return this;
        }
        public Order build(){
            if (order.items.isEmpty()) {
                throw new IllegalStateException("Заказ должен содержать хотя бы один товар");
            }
            if (order.paymentMethod.equals("Не выбран")) {
                throw new IllegalStateException("Не выбран способ оплаты");
            }
            return order;
        }
    }
}
