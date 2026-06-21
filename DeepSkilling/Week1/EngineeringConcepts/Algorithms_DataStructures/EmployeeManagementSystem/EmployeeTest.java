public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeSystem system = new EmployeeSystem();

        system.add(new Employee(1, "John", "Manager", 50000));
        system.add(new Employee(2, "David", "Developer", 40000));
        system.add(new Employee(3, "Sara", "Tester", 30000));

        system.traverse();

        System.out.println("\nSearching ID 2:");
        Employee e = system.search(2);
        System.out.println(e.name);

        system.delete(2);

        System.out.println("\nAfter Deletion:");
        system.traverse();
    }
}