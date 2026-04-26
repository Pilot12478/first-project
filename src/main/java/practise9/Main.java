package practise9;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    static void main() {
        /*
        Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает результат операции.
        Реализуйте его с помощью лямбда-выражений: сложение, вычитание, умножение, деление.
         */
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation sum = (a, b) -> a + b;
        MathOperation division = (a, b) -> a / b;
        System.out.println("Результат умножения: " + multiplication.operation(4, 5));
        System.out.println("Результат деления: " + division.operation(10, 5));
        System.out.println("Результат сложения: " + sum.operation(21, 5));
        System.out.println("Результат вычитания: " + subtraction.operation(23, 5));

        /*
        Задача: Напишите лямбду, которая проверяет, является ли число чётным.
         */
        Predicate<Integer> parity = (a) -> a % 2 == 0;
        System.out.println("Проверка четности: " + parity.test(6));
        /*
        Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
         */
        Function<String, Integer> length = String::length;
        System.out.println("Длина строки: " + length.apply("length"));
        /*
        Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
         */
        Consumer<String> print = System.out::println;
        print.accept("Print String");
    }

}
