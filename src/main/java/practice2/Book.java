package practice2;

public class Book {
    /*
    Создайте класс Book с полями title и author.
    Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(), выводящий название и автора книги.
     В main создайте книгу, измените автора и выведите информацию.
     */
    String title;
    String author;

    Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void printInfo() {
        System.out.println("Название книги: " + this.title);
        System.out.println("Автор: " + this.author);
    }

    static void main() {
        Book book1 = new Book("Война и мир", "Достоевский Ф.М.");
        book1.setAuthor("Толстой Л.Н.");
        book1.printInfo();
    }
}
