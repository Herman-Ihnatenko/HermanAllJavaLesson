package lesson_37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();

        System.out.println("strings.size() = " + strings.size());

        System.out.println("strings.isEmpty() = " + strings.isEmpty());

        strings.add("Java");
        System.out.println("strings.add(\"Python\") = " + strings.add("Python"));

        System.out.println(strings);

        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6);
        System.out.println("integers = " + integers);
        //integers.add(7);

        strings.addAll(List.of("JS", "Go Lang", "Ruby"));
        System.out.println(strings);

        System.out.println("\n=================\n");

        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5, 3 , 3));

        System.out.println("numbers: " + numbers);
        numbers.removeAll(List.of(3, 2, 1));

        System.out.println("numbers.removeAll(List.of(3, 2, 1)): " + numbers);

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);
        //colB.retainAll(colA);
        //System.out.println("colB.retainAll(colA): " + colB);

        System.out.println("colA.remove(100): " +colA.remove(100));
        System.out.println("colA.remove(20): " +colA.remove(20));
        System.out.println("colA: " + colA);

        colA.clear();
        System.out.println("colA.clear(): " + colA);


    }
}
