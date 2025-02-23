package lesson_40;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(7, "red");


        System.out.println(map);

        Collection<String> values = map.values();
        System.out.println("map.values: " + values);

        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet: " + keys);

        for (Integer key : keys) {
            System.out.print(map.get(key) + " ; ");

        }
        System.out.println();

        keys.remove(17);
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);
        System.out.println("values: " + values);
        values.remove("green");
        map.remove(16);
        System.out.println(" \n ============= values.remove(\"green\") ==============");
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);
        System.out.println("values: " + values);
        System.out.println("\n================================");
        values.removeAll(List.of("red"));
        System.out.println("values: " + values);
        System.out.println("map: " + map);

        //System.out.println("\n================================");
        //keys.add(200);
        //System.out.println("keys: " + keys);
        //System.out.println("map: " + map);
        //System.out.println("values: " + values);

        System.out.println("\n=================");
        Set<Integer> newKeys = new HashSet<>(map.keySet());
        System.out.println("newKeys: " + newKeys);
        newKeys.remove(0);
        newKeys.remove(100);
        System.out.println("map: " + map);
        System.out.println("values: " + values);

        System.out.println("\n=================");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print("entry: " + entry + " -> ");
            System.out.print(entry.getKey() + " | ");
            System.out.println(entry.getValue() + " ; ");
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(100)) {
                entry.setValue("JAVA!");
            }
        }

        System.out.println();
        System.out.println("map: " + map);

        System.out.println("\n======== Put vs replace ==========\n");

        System.out.println(map.put(11, "orange"));
        System.out.println(map.put(11, "green"));

        System.out.println(map.replace(200, "red"));
        System.out.println(map.replace(15, "red"));
        System.out.println("map: " + map);

        System.out.println("\n==================\n");

        map.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));



    }
}
