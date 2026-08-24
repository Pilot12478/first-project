package Prototype;

import java.util.Arrays;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int pages;
    private String[] genres;
    public Book(String title, String author,int pages, String[]genres){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public Book clone() {
       try {
           Book cloned = (Book)super.clone();
           cloned.genres = Arrays.copyOf(genres,genres.length);
           return cloned;
       }catch (CloneNotSupportedException e){
           throw new RuntimeException("Ошибка клонирования",e);
       }
    }

    static void main()  {

    }
}
