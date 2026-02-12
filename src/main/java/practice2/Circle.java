package practice2;

public class Circle {
    /*
    Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер,
     методы calculateArea() и calculateCircumference().
    В main измените радиус, выведите площадь и длину окружности.
     */
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    int getRadius() {
        return this.radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    static void main() {
        Circle circle = new Circle(5);
        circle.setRadius(6);
        System.out.println("Плошадь окружности: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());
    }
}
