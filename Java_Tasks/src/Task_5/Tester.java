package Task_5;

public class Tester {
    public static void main(String[] args) {
        ClassicSingleton firstObject = ClassicSingleton.getInstance("someInfo:1");
        ClassicSingleton secondObject = ClassicSingleton.getInstance("someInfo:2");
        System.out.println(secondObject.getValue());

        BillPughSingleton thirdObject = BillPughSingleton.getInstance("someInfo:3");
        BillPughSingleton fourthObject = BillPughSingleton.getInstance("someInfo:4");
        System.out.println(fourthObject.getValue());

        SynchronizedSingleton fifthObject = SynchronizedSingleton.getInstance("someInfo:5");
        SynchronizedSingleton sixthObject = SynchronizedSingleton.getInstance("someInfo:6");
        System.out.println(sixthObject.getValue());
    }
}
