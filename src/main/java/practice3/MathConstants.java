package practice3;

public class MathConstants {
    /*Класс MathConstants
Создайте класс MathConstants с полями:
final double PI = 3.14159
final double E = 2.71828 Реализуйте статические методы calculateCircleArea(double r) — площадь круга
 и calculateCircumference(double r) — длина окружности.
 В main: вызовите методы с разными значениями радиуса.
     */
    final double PI = 3.14159;
    final double E = 2.71828;

    static double calculateCircleArea(double r) {
        MathConstants mathConstants = new MathConstants();
        return 2 * mathConstants.PI * r * r;
    }

    static double calculateCircumference(double r) {
        MathConstants mathConstants = new MathConstants();
        return 2 * mathConstants.PI * r;
    }

    static void main() {
        double r = 7655;
        double S = MathConstants.calculateCircleArea(r);
        double C = MathConstants.calculateCircumference(r);
        System.out.println("Площадь круга: " + S + "\n" +
                "Длина окружноыти: " + C);
    }

}
