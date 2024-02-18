package Task_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) {
        // Объявление списка
        List<Human> humanList = new ArrayList<>();

        // Инициальзация объектов
        humanList.add(new Human(23, "Alex", "Pirs",
                LocalDate.of(2001, 5, 23), 88));
        humanList.add(new Human(34, "Denchik", "Pirs",
                LocalDate.of(2001, 5, 23), 75));
        humanList.add(new Human(45, "Oleg", "Pirs",
                LocalDate.of(2001, 5, 23), 60));
        humanList.add(new Human(56, "Mike", "Pirs",
                LocalDate.of(2001, 5, 23), 63));
        humanList.add(new Human(67, "Kirill", "Pirs",
                LocalDate.of(2001, 5, 23), 60));
        humanList.add(new Human(78, "Kolyan", "Pirs",
                LocalDate.of(2001, 5, 23), 55));

        // Приводим список к стриму
        Stream<Human> stream = humanList.stream();
        // Выполняем алгоритм в соответствии с заданием
        String answer = stream.sorted(new HumanComparator()).filter(human -> human.
                        getWeight() % 5 == 0).limit(4).map(human -> human.firstname).
                collect(Collectors.joining(" "));
        // Выводим полученный результат
        System.out.println(answer);
    }

}
