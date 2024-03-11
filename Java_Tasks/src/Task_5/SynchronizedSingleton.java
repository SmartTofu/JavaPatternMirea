package Task_5;

public class SynchronizedSingleton {
    private static volatile  SynchronizedSingleton instance;
    private String value;

    private SynchronizedSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SynchronizedSingleton getInstance(String value) {
        if (instance == null)
            synchronized (SynchronizedSingleton.class) {
                if (instance == null)
                    instance = new SynchronizedSingleton(value);
            }
        return instance;
    }
}
