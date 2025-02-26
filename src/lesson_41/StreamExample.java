package lesson_41;

import com.sun.source.tree.CatchTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        task8();
    }

    private static void task8() {

        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, cat2, cat3};

        List<Cat> longCats = Arrays.stream(cats)
                .filter(c -> Objects.nonNull(c))
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());

        System.out.println(longCats);

    }
    private static void task7() {

        List<Cat> cats = getListCats();
        Stream<String> catStream = cats.stream()
                .filter(c -> c.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(cat -> cat.getName());

        catStream.forEach(name -> System.out.println("name: " + name));
    }
    private static void task6() {
        List<Cat> cats = getListCats();

        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(names1);

        System.out.println("\n=====================");

        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println(names2);
    }
    private static void task5() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<String> fatCats = catStream
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(fatCats);
    }
    private static void task4() {
        List<Cat> cats = getListCats();

        Stream<String> nameStream = cats.stream()
                .map(Cat::getName);

        List<String> namesStream = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(cats);
    }
    private static void task3() {
        List<Cat> cats = getListCats();
        Stream<Cat> stream = cats.stream()
                .filter(c -> c.getName().length() > 4);

        List<Cat> longName = stream.collect(Collectors.toList());

        System.out.println(longName);



    }

    private static void task2() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());

        //List<Cat> fatCats2 = catStream.sorted().collect(Collectors.toList());

        System.out.println(fatCats);
        //System.out.println(fatCats2);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);

        List<Integer> result = new ArrayList<>();

        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }

        result.sort(Comparator.naturalOrder());
        System.out.println("result: " + result);

        List<Integer> integerList = integers.stream()
                .filter(num -> num > 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("integerList: " + integerList);

    }
}
