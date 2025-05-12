package secondModuleSecondTask;

import java.util.Objects;

public class Book {
    private String title;
    private int pagesCount;
    private int year;

    public Book(String title, int pagesCount, int year) {
        this.title = title;
        this.pagesCount = pagesCount;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pagesCount;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesCount == book.pagesCount &&
                year == book.year &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pagesCount, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagesCount=" + pagesCount +
                ", year=" + year +
                '}';
    }
}
