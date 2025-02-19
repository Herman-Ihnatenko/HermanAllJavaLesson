package lesson_39;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> oldTable = new Hashtable<>();

        Map<String, String> phoneBook = new HashMap<>();

        System.out.println(phoneBook.put("Hanna", "+49-11111111111"));

        phoneBook.put("Max", "+49-22222222222");
        phoneBook.put("John", "+49-33333333333");

        System.out.println("phoneBook: " + phoneBook);

        String oldValue = phoneBook.put("John", "+49-44444444444");
        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook);

        Map<String, String> book2 = new HashMap<>();
        book2.put("Sebastian", "+49-55555555555");
        book2.put("Michael", "+49-66666666666");
        System.out.println("book2: " + book2);

        phoneBook.putAll(book2);
        System.out.println("phoneBook.putAll(book2): " + phoneBook);

        phoneBook.put("Test", "+49-66666666666");
        System.out.println(phoneBook);

        System.out.println("phoneBook.containsKey(\"Michael\"): " + phoneBook.containsKey("Michael"));
        System.out.println("phoneBook.containsKey(\"123\"): " + phoneBook.containsKey("123"));
        System.out.println("phoneBook.containsValue(\"+49-66666666666\"): " + phoneBook.containsValue("+49-66666666666"));
        System.out.println("phoneBook.containsValue(\"+30-00000\"): " + phoneBook.containsValue("+438-00000"));

        String value = phoneBook.get("Michael");
        System.out.println("phoneBook.get(\"Michael\"): " + value);
        System.out.println(phoneBook.get("KEY"));

        String val2 = phoneBook.getOrDefault("Michael", "Default value");
        System.out.println("phoneBook.getOrDefault(\"Michael\", \"Default value\"): " + val2);

        val2 = phoneBook.getOrDefault("KEY", "Default value");
        System.out.println("phoneBook.getOrDefault(\"KEY\", \"Default value\"): " + val2);

        System.out.println("Objects.hashCode(null): " + Objects.hashCode(null));

        Map<Integer, String> test1 = new HashMap<>();
        test1 = new HashMap<>(32);
        test1 = new HashMap<>(32, 0.90f);
        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");
        test1 = new HashMap<>(otherMap);
        System.out.println("test1: " + test1);

        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Test"));
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Test"));

        System.out.println("phoneBook.size(): " + phoneBook.size());
        System.out.println("phoneBook.isEmpty(): " + phoneBook.isEmpty());
    }
}
