import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {

        try {

            ExecutorService ex =
                    Executors.newFixedThreadPool(2);

            Callable<Integer> task =
                    () -> 10 + 20;

            Future<Integer> result =
                    ex.submit(task);

            System.out.println(
                    "Result: "
                            + result.get());

            ex.shutdown();

        }
        catch(Exception e) {

            System.out.println(e);

        }
    }
}