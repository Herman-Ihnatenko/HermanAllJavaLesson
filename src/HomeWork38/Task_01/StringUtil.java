package HomeWork38.Task_01;
/*
Task 1
Напишите метод, принимающий строку и возвращающий Список ее слов без повторений, отсортированный в порядке увеличения длин слов.

Если строки имеют одинаковую длину - сортировать в естественном порядке

public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }
Copy
// Output:
[для, слов, строка, которые, Тестовая, удаления, повторяются]
 */
import java.util.*;

public class StringUtil {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(StringUtil.getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords(String input) {
        String[] words = input.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        List<String> sortedWords = new ArrayList<>(uniqueWords);
        Collections.sort(sortedWords, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(a.length(), b.length());
            }
        });

        return sortedWords;
    }
}