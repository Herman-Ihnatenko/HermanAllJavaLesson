package lesson_41;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {
    public static void main(String[] args) {

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str + "!!!");
            }
        };

        Consumer<String> printConsumer = str -> System.out.println(str + "!!!");
        printConsumer.accept("Hello World");
        printConsumer.accept("Java");

        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        Predicate<String> examplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                return false;
            }
        };

        Predicate<String> isShort = str -> str.length() < 3;
        boolean result1 = isShort.test("Java");
        System.out.println("isShort.test(\"Java\"): " + result1);
        System.out.println("isShort.test(\"JS\"): " + isShort.test("JS"));

        System.out.println("\n====================");
        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 0, 34, -45, 11, 45, 10, -50));
        List<Integer> res = filterListByPredicate(list, i -> i < 0);
        System.out.println("filterListByPredicate(list, i -> i < 0): " + res);

        res = filterListByPredicate(list, i -> i > 5 && i % 2 == 0);
        System.out.println("filterListByPredicate(list, i -> i % 2 == 0): " + res);

        System.out.println("\n====================");

        Predicate<String> isLengthGreaterThan4 = str -> str.length() > 4;
        Predicate<String> isContainsJava = str -> str.contains("Java");

        String test = "Java";

        Predicate<String> combinedPredicate = isLengthGreaterThan4.and(isContainsJava);
        System.out.println(combinedPredicate.test(test));
        Predicate<String> combinedPredicate2 = isContainsJava.negate();
        combinedPredicate2.test("Java");

        System.out.println("\n====================");

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        Function<String, Integer> function = str -> str.length();

        int len = function.apply("hello, World!");
        System.out.println(len);

        //Function<String, Integer> function2 = str -> str.length();
        Function<String, Integer> function2 = String::length;

    }

    public static List<Integer> filterListByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return result;
    }
}
