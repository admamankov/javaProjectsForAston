package secondModuleSecondTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {

        List<Student> students = initializeStudents(); // add 2 students with 5 rand books

        students.stream()
        .peek(System.out::println)
        .flatMap(student -> student.getBooks().stream())
        .sorted(Comparator.comparingInt(Book::getPageCount))
        .distinct()
        .filter(book -> book.getYear() > 2000)
        .limit(3)
        .map(Book::getYear)
        .findFirst()
        .ifPresentOrElse(
            year -> System.out.println("Publication year: " + year),
            () -> System.out.println("No book found")
        );
    }


    private static List<Student> initializeStudents() {
        List<Book> booksForStudent1 = new ArrayList<>();
        booksForStudent1.add(new Book("Book1", 100, 2001));
        booksForStudent1.add(new Book("Book2", 200, 2002));
        booksForStudent1.add(new Book("Book3", 150, 2003));
        booksForStudent1.add(new Book("Book4", 300, 2004));
        booksForStudent1.add(new Book("Book5", 250, 2005));

        List<Book> booksForStudent2 = new ArrayList<>();
        booksForStudent2.add(new Book("Book6", 120, 1999));
        booksForStudent2.add(new Book("Book7", 180, 2000));
        booksForStudent2.add(new Book("Book8", 220, 2001));
        booksForStudent2.add(new Book("Book9", 280, 2002));
        booksForStudent2.add(new Book("Book10", 320, 2003));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", booksForStudent1));
        students.add(new Student("Bob", booksForStudent2));

        return students;
    }
}


