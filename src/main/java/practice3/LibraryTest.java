package practice3;

public class LibraryTest {
    static void main() {
        Library library = new Library();
        library.category = "+21";
        library.year = 12;
        library.author = "Тест";
        library.getBookTitle();
        library.getAuthor();
        library.getCategory();
        library.getYear();

        /*
        поскольку поле bookTitle имеет модификатор доступа Private,
        к нему можно обращаться только внутри класса
        Для дотупа к этому элементу необходимо вызвать геттер
         */
    }
}
