package Task_4;

public class Tester {

    public static void main(String[] args) {
        ExecutorServiceImplementation executor = new ExecutorServiceImplementation(2);

        executor.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("Task_1 thread was interrupted");
            }
            System.out.println("Task 1 executed by " + Thread.currentThread().getName());
        });

        executor.submit(() -> System.out.println("Task 2 executed by "
                + Thread.currentThread().getName()));

        executor.shutDown();
    }
}
