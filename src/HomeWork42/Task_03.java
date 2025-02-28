package HomeWork42;

import java.util.List;
import java.util.stream.Collectors;

/*
Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список,
оставив только чётные числа, затем каждое число умножить на 2,
и собрать результат в новый список
 */
public class Task_03 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 34, 67, 888, 4, 32);

        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
