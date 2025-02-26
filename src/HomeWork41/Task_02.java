package HomeWork41;

import java.util.List;
import java.util.stream.Collectors;

public class Task_02 {
    public static void main(String[] args) {
        List<String> strings = List.of("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "awx", "yz", "ade");
        String prefix = "a";
        System.out.println(new Task_02().filterAndSortStrings(strings, prefix));
    }

    public List<String> filterAndSortStrings(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .sorted()
                .collect(Collectors.toList());
    }
}
