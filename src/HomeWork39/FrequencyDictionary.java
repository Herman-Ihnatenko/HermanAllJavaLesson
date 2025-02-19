package HomeWork39;

import java.util.*;

public class FrequencyDictionary {
    public static Map<String, Integer> getFrequencyDictionary(String text) {
        String[] words = text.split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();


        for (String word : words) {
            word = word.toLowerCase();
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String text = "This is a test text. This text is just a test.";
        Map<String, Integer> frequencyMap = getFrequencyDictionary(text);
        System.out.println(frequencyMap);
    }
}