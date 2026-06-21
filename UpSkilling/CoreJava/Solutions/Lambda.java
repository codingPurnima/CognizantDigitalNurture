import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        List<String> list= Arrays.asList("Car", "Truck",  "Bus", "Rickshaw", "Jeep", "Aeroplane");

        Collections.sort(list, (a,b)-> a.compareTo(b));
        System.out.println(list);
    }
}
