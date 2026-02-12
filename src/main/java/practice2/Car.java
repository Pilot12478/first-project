package practice2;

public class Car {
    /*
    Создайте класс Car с полями brand (строка) и year (целое число).
    Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей, метод print(), выводящий информацию о марке и годе выпуска.
    В main создайте объект, установите значения через конструктор, измените год через сеттер, выведите информацию.
     */
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setYear(int year) {
        this.year = year;
    }

    void print() {
        System.out.println("Бренд: " + this.brand + "," + " год " + this.year);
    }

    static void main() {
        Car car1 = new Car("Honda", 2002);
        car1.setYear(2025);
        car1.print();
    }
}
