package Adapter;

public class MySql implements Database{
    @Override
    public void select() {
        System.out.println("Прочитать объект mysql");
    }

    @Override
    public void insert() {
        System.out.println("Добавить объект mysql");
    }

    @Override
    public void delete() {
        System.out.println("Удалить объект mysql");

    }

    @Override
    public void update() {
        System.out.println("Изменить объект mysql");

    }
}
