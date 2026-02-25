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
    public static void ifElseTask2(Scanner scanner) {
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        int max = Math.max(num1, num2);
        System.out.println("Наибольшее число: " + max);

    }

    //Вывод оценки по шкале 1–5
    public static void ifElseTask3(Scanner scanner) {
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
    public static void ifElseTask4(Scanner scanner) {
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число нечетное");
    }

    //Определение размера скидки по возрасту
    public static void ifElseTask5(Scanner scanner) {
        System.out.println("Укажите Ваш возраст для расчета скидки: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Размер скидки 25 %");
        } else if (age >= 65) {
            System.out.println("Размер скидки 30 %");
        } else System.out.println("Без скидки");
    }

    //Оценка результата теста по баллам
    public static void ifElseTask6(Scanner scanner) {
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

    public static void switchTask1(Scanner scanner) {
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
    public static void switchTask2(Scanner scanner) {
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
    public static void switchTask3(Scanner scanner) {
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
    public static void switchTask4(Scanner scanner) {
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
    public static void switchTask5(Scanner scanner) {
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

    //Вывод чисел от 1 до 100, делящихся на 3
    public static void forTask1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }

    //Сумма чисел от 1 до n
    public static void forTask2(Scanner scanner) {
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //Таблица умножения для числа
    public static void forTask3(Scanner scanner) {
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            int res = i * num;
            System.out.println(i + "*" + num + "=" + res);
        }
    }

    //Проверка на простое число
    public static void forTask4(Scanner scanner) {
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;

                }
            }
        }
        if (isPrime == true) {
            System.out.println("Число простое");
        } else System.out.println("Число непростое");

    }

    // Вывод чисел от 1 до 10
    public static void forTask5() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }

    //Вычисление факториала с помощью while
    public static void whileTask1(Scanner scanner) {
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= num) {
            result = result * i;
            i++;

        }
        System.out.println("Факториал числа " + num + " = " + result);
    }

    //Вывод всех чётных чисел до заданного
    public static void whileTask2(Scanner scanner) {
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int i = 1;
        while (i <= num) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //Обратный отсчёт от введённого числа до 1
    public static void whileTask3(Scanner scanner) {
        System.out.println("Введите число");
        int num = scanner.nextInt();
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }

    //Запрос положительного числа
    public static void doWhileTask1(Scanner scanner) {
        System.out.println("Введите положительно число");
        int num = scanner.nextInt();
        if (num >= 0) {
            System.out.println("Введено положительное число");
        } else if (num < 0) {
            do {
                System.out.println("Введите положительное число");
                num = scanner.nextInt();
            } while (num < 0);
            System.out.println("Введено положительное число");
        }
    }

    //проверка пароля
    public static void doWhileTask2(Scanner scanner) {
        String password = "DerParol";
        System.out.println("Введите пароль:");
        String userPass = scanner.nextLine();
        if (userPass.equals(password)) {
            System.out.println("Вы успешно вошли в систему");
        } else if (!userPass.equals(password)) {
            do {
                System.out.println("Пароль не верный" + "\n");
                System.out.println("Введите пароль");
                userPass = scanner.nextLine();
            } while (!userPass.equals(password));
            System.out.println("Вы успешно вошли в систему");
        }
    }

    // Вывод чисел от 1 до 10 с использованием do-while
    public static void doWhileTask3() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    //Завершение программы по команде "exit"
    public static void doWhileTask4(Scanner scanner) {
        String command = "exit";
        String userCommand;
        int i = 0;
        do {
            System.out.println("Введите команду");
            userCommand = scanner.nextLine();
            i++;
        } while (!userCommand.equals(command));


    }

    //Подсчёт количества цифр в числе
    public static void doWhileTask5(Scanner scanner) {
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int count = 0;
        if (num == 0) {
            System.out.println("Количество цифр = 1");
        } else {
            do {
                num = num / 10;
                count++;
            } while (num > 0);
            System.out.println("Количество цифр = " + count);
        }
    }

    //Сумма чисел до первого отрицательного (использовать break)
    public static void breakTask1(Scanner scanner) {
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (true) {
            sum = sum + num;
            System.out.println("Сумма чисел = " + sum);
            System.out.println("Введите число: ");
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
        }
    }

    //Пропуск чисел, делящихся на 3 (использовать continue)
    public static void breakTask2() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else System.out.println(i);
        }
    }

    //Вывод только положительных чисел (использовать continue)
    public static void breakTask3(Scanner scanner) {
        int num;
        while (true) {
            System.out.println("Введите число: ");
            num = scanner.nextInt();
            if (num < 0) {
                continue;
            } else if (num > 0) {
                System.out.println(num);
            } else break;

        }
    }

    //Ввод строк до команды "stop" (использовать break)
    public static void breakTask4(Scanner scanner) {
        String command = "stop";
        String comm;
        while (true) {
            System.out.println("Введите команду: ");
            comm = scanner.nextLine();
            if (comm.equals(command)) {
                break;
            }
        }

    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        breakTask1(scanner);

    }

}


