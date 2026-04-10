package practice8;

public class Pair<T, D> {
    /*
    Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
    Класс должен позволять получать и устанавливать каждый из этих объектов.
     */
    private T item1;
    private D item2;

    public void setItem1(T item) {
        this.item1 = item;
    }

    public void setItem2(D item) {
        this.item2 = item;
    }

    public T getItem1() {
        return this.item1;
    }

    public D getItem2() {
        return this.item2;
    }

    static void main() {
        Pair<String, Integer> pair = new Pair<>();
        pair.setItem1("строка");
        pair.setItem2(123);
        System.out.println(pair.getItem2());
        System.out.println(pair.getItem1());
    }

}
