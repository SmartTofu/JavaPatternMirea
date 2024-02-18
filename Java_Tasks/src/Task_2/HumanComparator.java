package Task_2;

import java.util.Comparator;

// Компаратор для человеков
class HumanComparator implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getAge() + o1.getWeight() - o2.getAge() - o2.getWeight();
    }
}
