package practice7;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class CollectionPractice {
    /*
    Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
     */
    public static void arrayListTask1() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        array.add(45);
        System.out.println(array);
    }

    /*
    Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
     */
    public static void arrayListTask3() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("dwedwedwe", "dsd", "d", "dfsfdsfsdfdsfsdfsd", "dv"));
        String maxLong = array.getFirst();
        for (String element : array) {
            if (element.length() > maxLong.length()) {
                maxLong = element;
            }
        }
        System.out.println(maxLong);

    }

    /*
    Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
     */
    public static void linkedList2() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

    /*
    Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
     */
    public static void linkedList4() {
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, 12, 32, 4, 65, 53, 54);
        int sum = 0;
        for (int element : list) {
            sum = sum + element;
        }
        System.out.println("Суммы элементов списка = " + sum);
    }

    /*
    Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
     */
    public static Set<String> uniqueStrings(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }
    /*
    Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет,
     содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
     */

    public static void containsName(String name) {
        Set<String> set = new HashSet<>(Arrays.asList("Артем", "Иван", "Дарья", "Боб"));
        if (set.contains(name)) {
            System.out.println("Имя " + name + " найдено!");
        } else System.out.println("Имя " + name + " не найдено!");
    }

    /*
    Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
     */
    public static void linkedHashSetTask1() {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("Артем", "Иван", "Дарья", "Боб"));
        System.out.println(set);
    }

    /*
    Найдите ближайшее большее и меньшее число к заданному в TreeSet.
     */
    public static void treeSet3(int num) {
        TreeSet<Integer> set = new TreeSet<>();
        Collections.addAll(set, 2, 5, 6, 4, 3, 24, 654, 32, 123, 423);
        System.out.println(set.lower(num));
        System.out.println(set.higher(num));
    }

    /*
    Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
     */
    public static void hashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иван", 13);
        map.put("Федор", 23);
        map.put("Мария", 33);
        map.put("Валерия", 17);
        map.put("Сергей", 18);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Имя " + key + " , " + "Возраст " + value);
        }

    }

    /*
    Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
     */
    public static void printUnderAge() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Иван", 13);
        map.put("Федор", 23);
        map.put("Мария", 33);
        map.put("Валерия", 17);
        map.put("Сергей", 18);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value < 18) {
                System.out.println("Имя " + key + " , " + "Возраст " + value);
            }
        }

    }

    /*
    Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
     */
    public static void linkedHashMap1() {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Иван", 13);
        map.put("Федор", 23);
        map.put("Мария", 33);
        map.put("Валерия", 17);
        map.put("Сергей", 18);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Имя " + key + " , " + "Возраст " + value);
        }

    }

    /*
    Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
     */
    public static void treeMap1() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Иван", 132);
        map.put("Федор", 231);
        map.put("Мария", 332);
        map.put("Валерия", 172);
        map.put("Сергей", 182);
        System.out.println(map);
    }

    /*
    Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
     */
    public static void priorityQueue() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    /*
Создайте ArrayDeque, добавьте 5 элементов и выведите их.
     */
    public static void arrayDeque1() {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);


    }

    static void main() {
        CollectionPractice.arrayDeque1();
    }
}
