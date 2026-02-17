package practice3;

public class MathConstants {
    /*Класс MathConstants
Создайте класс MathConstants с полями:
final double PI = 3.14159
final double E = 2.71828 Реализуйте статические методы calculateCircleArea(double r) — площадь круга
 и calculateCircumference(double r) — длина окружности.
 В main: вызовите методы с разными значениями радиуса.
     */
    static final double PI = 3.14159;
    static final double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    public static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

    static void main() {
        double r = 7655;
        double S = MathConstants.calculateCircleArea(r);
        double C = MathConstants.calculateCircumference(r);
        System.out.println("Площадь круга: " + S + "; " +
                "Длина окружности: " + C);
    }

}
