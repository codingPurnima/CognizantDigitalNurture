import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {

        Book[] books = {
                new Book(1, "Java", "James Gosling"),
                new Book(2, "Python", "Guido"),
                new Book(3, "C++", "Bjarne")
        };

        // Linear search
        Book b1 = BookSearch.linear(books, "Python");
        System.out.println("Linear: " + (b1 != null ? b1.title : "Not Found"));

        // Sort for binary search
        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title));

        Book b2 = BookSearch.binary(books, "Python");
        System.out.println("Binary: " + (b2 != null ? b2.title : "Not Found"));
    }
}