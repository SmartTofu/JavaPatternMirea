package Task_3;

public class Tester {
    public static void main(String[] args) {
        SemaphoreList<Integer> list = new SemaphoreList<>();
        SynchronizedSet<Integer> set = new SynchronizedSet<>();

        Thread one = new Thread(()->{
            for (Integer i = 0; i < 3; i++) {
                list.add(i);
                set.add(i);
            }
        });
        Thread two = new Thread(()->{
            for (Integer i = 3; i < 6; i++) {
                list.add(i);
                set.add(i);
            }
        });

        one.start();
        two.start();

        System.out.println("List:");
        list.forEach(System.out::println);
        System.out.println("Set:");
        set.forEach(System.out::println);
    }
}
