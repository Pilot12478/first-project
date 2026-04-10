package practice8;

public class Box<T> {
    /*
    Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
    Класс должен позволять получать и устанавливать каждый из этих объектов.
     */
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    static void main() {
        Box<String> box = new Box<>();
        box.setItem("Apple");
        System.out.println(box.getItem());
        Box<Integer> box1 = new Box<>();
        box1.setItem(1);
        System.out.println(box1.getItem());
    }
}
