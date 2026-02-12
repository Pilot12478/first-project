package practice2;

public class Rectangle {
    /*
    Создайте класс Rectangle с полями width и height. Реализуйте конструктор, геттеры для ширины и высоты,
     сеттер только для ширины и метод calculateArea() для расчёта площади.
     В main создайте прямоугольник, измените ширину и выведите площадь.
     */
    int height;
    int width;

    Rectangle(int height, int width) {
        this.width = width;
        this.height = height;
    }

    int getHeight() {
        return this.height;
    }

    int getWidth() {
        return this.width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int calculateArea() {
        return this.width * this.height;
    }

    static void main() {
        Rectangle rectangle1 = new Rectangle(5, 6);
        rectangle1.setWidth(7);
        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
    }
}
