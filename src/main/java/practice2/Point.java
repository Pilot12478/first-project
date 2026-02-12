package practice2;

public class Point {
    /*
    Создайте класс Point с координатами x и y.
    Реализуйте конструктор, геттеры, сеттер только для x, и метод print(),
     выводящий координаты. В main измените x, выведите новые координаты.
     */
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    void setX(int x) {
        this.x = x;
    }

    void print() {
        System.out.println("Координата 1: " + this.x);
        System.out.println("Координата 2: " + this.y);
    }

    static void main() {
        Point point = new Point(5, 6);
        point.setX(6);
        point.print();
    }
}
