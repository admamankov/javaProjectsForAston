package secondModuleSecondTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {

        List<Student> students = initializeStudents(); // add 2 students with 5 rand books

        students.forEach(student -> {
            Optional<Integer> result = student.getBooks().stream()
                    .sorted(Comparator.comparingInt(Book::getPageCount))
                    .distinct() //  unique books
                    .filter(book -> book.getYear() > 2000)
                    .limit(3)
                    .map(Book::getYear)
                    .findFirst();

            String output = result.map(year -> "Publication year: " + year)
                    .orElse("No book found");
            System.out.println("Result for " + student.getName() + ": " + output);
        });
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


