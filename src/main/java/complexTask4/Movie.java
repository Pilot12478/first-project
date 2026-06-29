package complexTask4;

import java.util.Objects;

public class Movie {
    private  String title;
    private String shortDescription;

    public Movie(String title, String shortDescription) {
        this.title = title;
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title) && Objects.equals(shortDescription, movie.shortDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, shortDescription);
    }
}
