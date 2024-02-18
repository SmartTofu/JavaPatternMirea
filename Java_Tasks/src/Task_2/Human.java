package Task_2;

import java.time.LocalDate;

public class Human {
    // Объявление полей класса Human
    int age;
    String firstname;
    String lastName;
    LocalDate birthDate;
    int weight;

    // Геттеры
    public int getAge() { return age; }

    public String getFirstname() { return firstname; }

    public String getLastName() { return lastName; }

    public LocalDate getBirthDate() { return birthDate; }

    public int getWeight() { return weight; }

    // Параметризированный конструктор
    public Human(int age, String firstname, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstname = firstname;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }
}
