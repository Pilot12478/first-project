package practice2;

public class Product {
    /*
    Создайте класс Product с полями name и price. Реализуйте конструктор, геттеры,
    сеттер для цены, метод applyDiscount(discount) для применения скидки, и метод printInfo(),
     выводящий информацию о товаре и цене. В main измените цену, примените скидку и выведите цену.
     */
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    int getPrice() {
        return this.price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int applyDiscount(int discount) {
        return this.price * (100 - discount) / 100;
    }

    static void main() {
        Product product = new Product("Пылесос", 15000);
        product.setPrice(20000);
        System.out.println("Цена с учетом скидки: " + product.applyDiscount(10) + " руб");
    }
}
