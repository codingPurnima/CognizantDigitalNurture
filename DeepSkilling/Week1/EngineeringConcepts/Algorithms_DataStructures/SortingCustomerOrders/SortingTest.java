public class SortingTest {
    public static void main(String[] args) {

        Order[] orders = {
                new Order(1, "Amit", 5000),
                new Order(2, "Rahul", 2000),
                new Order(3, "Sneha", 8000)
        };

        System.out.println("Bubble Sort:");
        Sorting.bubbleSort(orders);
        for (Order o : orders) {
            System.out.println(o.totalPrice);
        }

        System.out.println("\nQuick Sort:");
        Sorting.quickSort(orders, 0, orders.length - 1);
        for (Order o : orders) {
            System.out.println(o.totalPrice);
        }
    }
}