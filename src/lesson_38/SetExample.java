package lesson_38;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set = new HashSet<>(20);
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 6, 5, 3, 0));

        System.out.println("set: " + set);

        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println("startValues: " + startValues);

        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("set: " + integers);

        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        System.out.println("integers.add(100): " + integers.add(100));
        System.out.println(integers);
        System.out.println("integers.add(100): " + integers.add(100));
        System.out.println(integers);

        System.out.println("====================");
        System.out.println("integers.remove(100)"+integers.remove(100));
        System.out.println(integers);

        System.out.println(integers.contains(100));
        System.out.println(integers.contains(32));

        for(Integer value : integers) {
            System.out.print(value + ", ");
        }
        System.out.println();

        System.out.println("\n====================\n");
        System.out.println(startValues);
        List<Integer> resultList = getUniqueList(startValues); // <Integer>
        System.out.println(resultList);

        System.out.println("\n====================\n");

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("sortedSet: " + sortedSet);

        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);
        System.out.println(treeSet);

        System.out.println("treeSet.first(): " + treeSet.first());

        System.out.println("treeSet.last(): " + treeSet.last());

        SortedSet<Integer> headSet = treeSet.headSet(8);
        System.out.println("headSet: " + headSet);

        SortedSet<Integer> tailSet = treeSet.tailSet(8);
        System.out.println("tailSet: " + tailSet);

        test();





    }

    private static void test() {
        String testStr = "Тестовая строка, со словами!";
        String newStr = testStr.replaceAll("[^a-zA-Z0-9a-яA-Я ]", "");
        System.out.println(newStr);

        String[] words = newStr.split(" ");
        System.out.println(Arrays.toString(words));

        List<String> list = Arrays.asList(words);
        System.out.println(list);
    }

    private static <T> List<T> getUniqueList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }
}
