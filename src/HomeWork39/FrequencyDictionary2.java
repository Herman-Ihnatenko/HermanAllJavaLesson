package HomeWork39;
/*
Task2 (*Опционально):
Напишите метод, возвращающий частотный словарь вхождения символов в строку
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyDictionary2 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("===============");
        Map<String, Integer> frequencyMap2 = frequencyDictionary2(text);
        frequencyMap2.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("===============");
        Map<String, Integer> frequencyMap3 = frequencyDictionary3(text);
        frequencyMap3.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("===============");
        Map<String, Integer> frequencyMap4 = frequencyDictionary4(text);
        frequencyMap4.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("===============");
        Map<String, Integer> frequencyMap5 = frequencyDictionary5(text);
        frequencyMap5.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("===============");
        Map<String, Integer> frequencyMap6 = frequencyDictionary6(text);
        frequencyMap6.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();
        }

    public static Map<String, Integer> frequencyDictionary(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }

    public static Map<String, Integer> frequencyDictionary2(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        return frequencyMap;
    }


    public static Map<String, Integer> frequencyDictionary3(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.computeIfPresent(word, (key, oldValue) -> oldValue + 1);
            frequencyMap.computeIfAbsent(word, key -> 1);
        }

        return frequencyMap;
    }

    public static Map<String, Integer> frequencyDictionary4(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.compute(word, (key, oldValue) -> oldValue == null ? 1 : null);
        }


        return frequencyMap;
    }

    public static Map<String, Integer> frequencyDictionary5(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);
        }


        return frequencyMap;
    }

    public static Map<String, Integer> frequencyDictionary6(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.merge(word, 1, Integer::sum);
        }


        return frequencyMap;
    }

    private static Map<Character, Integer> frequencyCharsDictionary(String text) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();

        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }

}
