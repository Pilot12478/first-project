package practice3;

public class Library {
    /*
    Создайте класс Library с полями:
private String bookTitle
protected String author
int year (default-доступ)
public String category Реализуйте геттеры и сеттеры для всех полей.
В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.
     */
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getCategory() {
        return this.category;
    }

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setCategory(String category){
        this.category = category;
    }
}
