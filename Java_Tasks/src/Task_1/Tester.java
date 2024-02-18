package Task_1;

public class Tester {
    public static void main(String[] args) {
        // инициализация строкового массива
        String[] strings = {"aaaaaaa", "abababab", "abcabc"};
        // объявление объекта
        MaxUniqueString consumer = new MaxUniqueString();
        // Вызов метода accept
        consumer.accept(strings);
    }
}

