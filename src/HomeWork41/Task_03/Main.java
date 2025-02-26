package HomeWork41.Task_03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 30, "Berlin"),
                new Person("Alice", 25, "Berlin"),
                new Person("Bob", 40, "London"),
                new Person("Charlie", 35, "Berlin")
        );

        int age = 25;
        String city = "Berlin";

        List<Person> filteredPeople = filterPeople(people, age, city);
        System.out.println(filteredPeople);
    }

    public static List<Person> filterPeople(List<Person> people, int age, String city) {
        return people.stream()
                .filter(p -> p.getAge() > age)
                .filter(p -> p.getCity().equals(city))
                .collect(Collectors.toList());
    }
}
