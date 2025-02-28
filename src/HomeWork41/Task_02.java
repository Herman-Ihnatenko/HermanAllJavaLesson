package HomeWork41;

import java.io.FilterOutputStream;
import java.util.List;
import java.util.stream.Collectors;

public class Task_02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Abc", "def", "ahi", "akl", "mno", "pqr", "stu", "Awx", "yz", "Ade");
        System.out.println(filterAndSortStrings(strings));
    }

    public static List<String> filterAndSortStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());
    }
}
