package Task_5;

public class BillPughSingleton {
    private String value;

    private BillPughSingleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private static class SingletonHolder {
        private static BillPughSingleton instance;
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public static BillPughSingleton getInstance(String value) {
        if (SingletonHolder.instance == null) {
            synchronized (BillPughSingleton.class) {
                if (SingletonHolder.instance == null) {
                    SingletonHolder.instance = new BillPughSingleton(value);
                }
            }
        }
        return SingletonHolder.instance;
    }
}
