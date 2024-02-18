package Task_1;

import java.util.function.Consumer;

// Класс имплементирует функциональный интерфейс Consumer для работы со строками
public class MaxUniqueString implements Consumer<String[]> {

    // Инициализируем метод для подсчета уникальных символов
    private int countUniqueCharacters(String str) {
        return (int) str.chars().distinct().count();
    }

    // Переопределям метод accept интерфейса Consumer
    @Override
    public void accept(String[] strings) {
        String answer = "";
        int counter = 0;

        /* Рассматриваем каждую строку в массиве и
         *  в случае увеличения числа символов в новой строке
         *  изменяем значения счетчика и строки-ответа */
        for (String str : strings) {
            int uniqueChars = countUniqueCharacters(str);
            if (uniqueChars > counter) {
                counter = uniqueChars;
                answer = str;
            }
        }

        // Выводим ответ
        System.out.println(answer);
    }
}

