package practice4;

import java.util.Scanner;

public class Tasks {
    /*
    Задачи на if-else
     */
//Определение знака числа
    public static void ifElseTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            if (number > 0) {
                System.out.println("Число положительное");
            } else if (number < 0) {
                System.out.println("Число отрицательное");
            } else System.out.println("Число равно 0");
        } else System.out.println("Ошибка, введено не число");
    }

    //Поиск наибольшего из двух чисел
    public static void ifElseTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        double max = Math.max(num1, num2);
        if (max == (int) max) {
            System.out.println("Наибольшее число: " + (int) max);
        } else System.out.println("Наибольшее число: " + max);

    }

    //Вывод оценки по шкале 1–5
    public static void ifElseTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            switch (num) {
                case 1, 2:
                    System.out.println("Неудовлетворительно");
                    break;
                case 3:
                    System.out.println("Удовлетворительно");
                    break;
                case 4:
                    System.out.println("Хорошо");
                    break;
                case 5:
                    System.out.println("Отлично");
                    break;
                default:
                    System.out.println("Ошибка, введено некорректное значение");
            }
        } else System.out.println("Ошибка, введено не число");
    }

    //Проверка на чётность
    public static void ifElseTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число нечетное");
    }

    //Определение размера скидки по возрасту
    public static void ifElseTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите Ваш возраст для расчета скидки: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Размер скидки 25 %");
        } else if (age >= 65) {
            System.out.println("Размер скидки 30 %");
        } else System.out.println("Без скидки");
    }

    //Оценка результата теста по баллам
    public static void ifElseTask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество баллов: ");
        int point = scanner.nextInt();
        if (point >= 90) {
            System.out.println("отлично");
        } else if (point >= 75) {
            System.out.println("хорошо");
        } else if (point >= 60) {
            System.out.println("удовлетворительно");
        } else System.out.println("неудовлетворительно");

    }
    // Вывод дня недели по номеру

    public static void switchTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Введено некорректное значение");
        }

    }

    //Стоимость билета по дню недели
    public static void switchTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели в формате числа от 1 до 7: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Стоимость билета 300 рублей");
                break;
            case 6, 7:
                System.out.println("Стоимость билета 450 рублей");
                break;
            default:
                System.out.println("Введено некорректное значение");
        }
    }

    //Перевод числовых оценок в буквенные (A–F)
    public static void switchTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество баллов");
        int num = scanner.nextInt();
        if (num >= 0 && num < 100) {
            if (num >= 90) {
                System.out.println("оценка: А");
            } else if (num >= 80) {
                System.out.println("оценка: B");
            } else if (num >= 70) {
                System.out.println("оценка: C");
            } else if (num >= 60) {
                System.out.println("оценка: D");
            } else System.out.println("оценка: F");
        } else System.out.println("Ошибка, введено некорректное значение");

    }

    //Обработка текстовых команд
    public static void switchTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");
        String command = scanner.nextLine();
        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            default:
                System.out.println("Введена некорректная команда");
                break;
        }
    }

    //Простой калькулятор с использованием switch
    public static void switchTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.println("Введите операцию с введенными числами + - * /");
        String emptyString = scanner.nextLine();
        String operation = scanner.nextLine();
        switch (operation) {
            case "+":
                double res = num1 + num2;
                System.out.println("Результат операции: " + res);
                break;
            case "-":
                double res1 = num1 - num2;
                System.out.println("Результат операции: " + res1);
                break;
            case "*":
                double res2 = num1 * num2;
                System.out.println("Результат операции: " + res2);
                break;
            case "/":
                if (num2 != 0) {
                    double res3 = num1 / num2;
                    System.out.println("Результат операции: " + res3);
                    break;
                } else System.out.println("Делить на 0 нельзя");
        }

    }

    static void main() {
        Tasks.switchTask5();
    }
}
