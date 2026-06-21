public class TaskTest {
    public static void main(String[] args) {

        TaskList list = new TaskList();

        list.add(new Task(1, "Study Java", "Pending"));
        list.add(new Task(2, "Do Assignment", "In Progress"));
        list.add(new Task(3, "Submit Work", "Pending"));

        System.out.println("All Tasks:");
        list.traverse();

        System.out.println("\nSearch Task 2:");
        Task t = list.search(2);
        System.out.println(t.taskName);

        list.delete(2);

        System.out.println("\nAfter Deletion:");
        list.traverse();
    }
}