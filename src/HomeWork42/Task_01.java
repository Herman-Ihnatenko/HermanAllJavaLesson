package HomeWork42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */
public class Task_01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 29, 38, 41, 56, 60, 35, 74, 55, 23, 132, 122, 4, 6);

        List<Integer> result = list.stream()
                .filter(num -> num > 10)
                .sorted((a, b) -> Integer.compare(a % 10, b % 10))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
