import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mouse", "Electronics"),
                new Product(3, "Shoes", "Fashion")
        };

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Mouse");
        System.out.println("Linear Search: " + (result1 != null ? result1.productName : "Not Found"));

        // Sort for binary search
        Arrays.sort(products, (a, b) -> a.productName.compareTo(b.productName));

        Product result2 = SearchAlgorithms.binarySearch(products, "Mouse");
        System.out.println("Binary Search: " + (result2 != null ? result2.productName : "Not Found"));
    }
}