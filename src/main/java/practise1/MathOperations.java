package practise1;

public class MathOperations {
    static void main() {
        int sum = add(5, 6);
        System.out.println("Результат сложения двух чисед: " + sum);
        int sub = substract(5, 6);
        System.out.println("Результат вычитания двух чисел: " + sub);
        int mul = multiply(5, 6);
        System.out.println("Произведение двух чисел: " + mul);
        double dev = devide(5, 6);
        System.out.println("Результат деления двух чисел: " + dev);
        int max = findMax(-1, 0);
        System.out.println("Наибольшее число: " + max);
        int dif = difference(-3, 34);
        System.out.println("Разности двух чисел: " + dif);
        int S = squareArea(5);
        System.out.println("Площаль квадрата: " + S);
        int P = squarePerimeter(5);
        System.out.println("Периметр квадрата: " + P);
        double min = convertSecondsToMinutes(400);
        System.out.println("Количество минут: " + min);
        double speed = averageSpeed(32, 7898);
        System.out.println("Средняя скорость: " + speed);
        double hyp = findHypotenuse(132, 32);
        System.out.println("Гипотенуза: " + hyp);
        double ss = circleCircumference(897.32);
        System.out.println("Длина окружности: " + ss);
        double ui = calculatePercentage(323, 31);
        System.out.println("Процент от общего: " + ui);
        double f = celsiusToFahrenheit(32.33333);
        System.out.println("Перевод в Фаренгейты: " + f);
        double c = fahrenheitToCelsius(32.33333);
        System.out.println("Перевод в Цельсий: " + c);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int substract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double devide(int x, int y) {
        return (double) x / y;
    }

    static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    static int difference(int a, int b) {
        return Math.abs(a - b);
    }

    static int squareArea(int side) {
        return side * side;
    }

    static int squarePerimeter(int side) {
        return side * 4;
    }

    static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    static double findHypotenuse(double a, double b) {
        return Math.hypot(a, b);
    }

    static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    static double celsiusToFahrenheit(double c) {
        return c * ((double) 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * ((double) 5 / 9);
    }
}
