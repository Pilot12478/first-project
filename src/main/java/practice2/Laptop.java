package practice2;

public class Laptop {
    /*
    Создайте класс Laptop с полями brand и price. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
    выводящий информацию о ноутбуке и его цене. В main измените цену и выведите информацию.
     */
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.price = price;
        this.brand = brand;
    }

    int getPrice() {
        return this.price;
    }

    String getBrand() {
        return this.brand;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void printInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Цена: " + price + " руб");

    }

    static void main() {
        Laptop laptop = new Laptop("Samsung", 150000);
        laptop.setPrice(135000);
        laptop.printInfo();
    }
}
