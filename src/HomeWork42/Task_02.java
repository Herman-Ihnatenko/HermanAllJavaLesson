package HomeWork42;

import java.util.List;

/*
Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
 */
public class Task_02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Abc", "yz", "Ade43");
        System.out.println(findShortestString(strings));
    }

    public static String findShortestString(List<String> strings) {
        return strings.stream().min((s1, s2) -> s1.length() - s2.length()).get();
    }
}
