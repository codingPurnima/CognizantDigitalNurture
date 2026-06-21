import java.util.List;

record Person(String name, int age) {}

public class Records {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Rahul", 20),
                new Person("Amit", 17)
        );

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
