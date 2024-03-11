package Task_5;

public class ClassicSingleton {
    private static ClassicSingleton instance;
    private String value;

    private ClassicSingleton(String value) {
        this.value = value;
    }

    public static ClassicSingleton getInstance(String value){
        if (instance == null) {
            instance = new ClassicSingleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
