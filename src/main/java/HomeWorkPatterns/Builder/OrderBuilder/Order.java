package HomeWorkPatterns.Builder.OrderBuilder;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private double discount;
    private String paymentMethod;

    private Order(OrderBuilder orderBuilder) {
        items = List.copyOf(orderBuilder.items);
        discount = orderBuilder.discount;
        paymentMethod = orderBuilder.paymentMethod;
    }

    public List<String> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public double getDiscount() {
        return discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public static class OrderBuilder {
        private List<String> items;
        private double discount;
        private String paymentMethod;

        public OrderBuilder() {
            items = new ArrayList<>();
            discount = 0.0;
            paymentMethod = "не выбрано";

        }

        public OrderBuilder addItem(String item) {
            items.add(item);
            return this;
        }

        public OrderBuilder applyDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public OrderBuilder choosePaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
