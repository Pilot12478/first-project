package practice8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;
import java.util.regex.Pattern;

public class HomeWork123 {
    /*
    Условие задачи:
Напишите программу, которая пытается открыть файл с именем "data.txt".
Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".
     */
    public static void openFile(String file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
/*
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
 Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
 */
    public static void devide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        } else System.out.println(num1 / num2);
    }
/*
Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
 */
    public static void ageCheck(int age) throws AgeException {
        if (age < 0 || age > 150) {
            throw new AgeException();
        } else System.out.println("Проверка пройдена");
    }
    /*
    Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет,
    является ли строка правильным электронным адресом.
    Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.
     */
    public static void emailCheck(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        if(!pattern.matcher(email).matches()){
            throw new EmailException();
        }else System.out.println("Валидация пройдена");
    }
    /*
    Условие задачи: Напишите дженерик метод printArray, который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
     */
    public static <T>void printArray(T[]array){
        int i =0;
        while (i<array.length){
            System.out.println(array[i]);
            i++;
        }
    }

    static void main() {
        HomeWork123.openFile("data.txt");
        try {
            HomeWork123.devide(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя");
        }
        try {
            HomeWork123.ageCheck(150);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
        HomeWork123.emailCheck("123@mail.ru");

        String[] str = {"apple","melon","cherry"};
        HomeWork123.printArray(str);
    }
}
