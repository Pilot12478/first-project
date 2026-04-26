package practise9;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {
    /*
    Фильтрация строк по длине больше 5
     */
    public static List<String> keepStringsMoreThanFiveCharacters(List<String> list) {
        return list.stream().filter(str -> str.length() > 5).toList();
    }

    /*
    Фильтрация чисел, кратных 5
     */
    public static List<Integer> filterMultiplesOfFive(List<Integer> list) {
        return list.stream().filter(a -> a % 5 == 0).toList();
    }
    /*
    Преобразование строк в их длины
     */

    public static List<Integer> mapStringsToLengths(List<String> list) {
        return list.stream().map(String::length).toList();
    }

    /*
    Создание списка квадратов чисел
     */
    public static List<Integer> squaresList(List<Integer> list) {
        return list.stream().map(num -> num * num).toList();
    }

    /*
    Удаление дубликатов из списка
     */
    public static <T> List<T> removeDuplicates(List<T> list) {
        return list.stream().distinct().toList();

    }

    /*
    Поиск максимального элемента
     */
    public static Integer max(List<Integer> list) {
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        return max.orElse(null);
    }

    /*
Поиск минимального элемента
 */
    public static Integer min(List<Integer> list) {
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        return min.orElse(null);
    }

    /*
    Сумма всех элементов списка
     */
    public static Integer sum(List<Integer> list) {
        return list.stream().mapToInt(n -> n).sum();
    }

    /*
    Поиск первого элемента, начинающегося на "Б"
     */
    public static String searchElementsThatStartsWithB(List<String> list) {
        return list.stream().filter(s -> s.startsWith("Б")).findFirst().orElse(null);
    }

    /*
    Проверка наличия хотя бы одного элемента по условию
     */
    public static boolean hasAny(List<Integer> list) {
        return list.stream().anyMatch(n -> n % 2 == 0);
    }

    /*
    Группировка строк по первой букве
     */
    public static Map<Character, List<String>> gropingByFirstLetter(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
    }

    /*
    Группировка чисел по чётности
     */
    public static Map<String, List<Integer>> groupingByParity(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Четные" : "Нечетные"));
    }

    /*
    Поиск среднего значения чисел
     */
    public static Double getAverage(List<Integer> list) {
        OptionalDouble avr = list.stream().mapToInt(n -> n).average();
        if (avr.isPresent()) {
            return avr.getAsDouble();
        } else return null;

    }

    static void main() {
        List<String> str = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "grape", "pineapple", "test"));
        System.out.println("Cписок строк длиной больше 5 символов: " + keepStringsMoreThanFiveCharacters(str));
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 7, 20, 3, 4, 35));
        System.out.println("Список чисел кратных 5: " + filterMultiplesOfFive(nums));
        System.out.println("Список длинн строк переданного списка: " + mapStringsToLengths(str));
        System.out.println("Список квадратов чисел переданного списка: " + squaresList(nums));

        List<String> str2 = new ArrayList<>(Arrays.asList("apple", "banana", "pineapple", "grape", "pineapple", "apple"));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 5, 5, 20, 3, 4, 35, 35));
        System.out.println("Список строк без дупликатов: " + removeDuplicates(str2));
        System.out.println("Список чисел без дупликатов: " + removeDuplicates(nums2));
        System.out.println("Максимальное число: " + max(nums));
        System.out.println("Минимальное число: " + min(nums));
        System.out.println("Сумма чисел: " + sum(nums));
        List<String> str3 = new ArrayList<>(Arrays.asList("Блок", "Пушкин", "Достоевский", "Клуни", "Калинкин", "Борисов"));
        System.out.println("Первый элемент начинающийся на Б: " + searchElementsThatStartsWithB(str3));
        System.out.println("Есть ли четный элемент: " + hasAny(nums2));
        System.out.println("Результат группировки по первой букве строки: " + gropingByFirstLetter(str3));
        System.out.println("Результат группировки по четности: " + groupingByParity(nums2));
        System.out.println("Среднее значение: " + getAverage(nums2));


    }
}
