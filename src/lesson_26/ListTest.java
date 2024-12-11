package lesson_26;

import lists.MyArrayList;
import lists.MyList;

import java.util.Arrays;

public class ListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayGen = new MyArrayList<>();
        arrayGen.add(1);

        MyArrayList arrayGen1 = new MyArrayList<>();
        arrayGen1.add(7634653);

        MyArrayList<Integer> numbers = new MyArrayList<>();
        numbers.addAll(1, 2, 3, 4, 5,6);
        System.out.println(numbers);
        System.out.println("numbers.indexOf(5): "+numbers.indexOf(5));
        System.out.println(numbers.remove(0));
        System.out.println(numbers);
        System.out.println(numbers.remove(Integer.valueOf(2)));
        System.out.println(numbers);

        numbers.add(100);
        System.out.println(numbers);

        System.out.println("\n==========\n");
        MyList<String> strings = new MyArrayList<>();
        strings.add("Java");
        strings.addAll("Python", "C+", "Kotlin", "Scala");
        System.out.println(strings);

        System.out.println(strings.remove(2));
        System.out.println(strings.remove("Go"));
        System.out.println(strings.remove("Scala"));
        System.out.println(strings);
        System.out.println("\n==========\n");

        numbers.addAll(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println(numbers);

        Integer[] array = numbers.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("\n==========\n");

        MyList<String> strings1 = new MyArrayList<>();
        strings1.add("Pair");
        String value = strings1.get(0);
        System.out.println(value.toUpperCase());

        String[] arrayStr = strings1.toArray();
        System.out.println(arrayStr);
        Integer i1 = numbers.get(0);
        System.out.println(i1);

        MyList<Double> doubles = new MyArrayList<>();
        Double[] doubles1 = doubles.toArray();
        System.out.println(Arrays.toString(arrayStr));
    }

   //public static void test(MyList<String> list){

   //}
}
