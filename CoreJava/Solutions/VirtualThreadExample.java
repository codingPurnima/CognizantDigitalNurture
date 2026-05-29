public class VirtualThreadExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread: "
                                + Thread.currentThread());

            });
        }

        try {

            Thread.sleep(1000);

        }
        catch(Exception e) {

            System.out.println(e);

        }
    }
}