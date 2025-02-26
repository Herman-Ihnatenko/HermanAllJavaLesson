package HomeWork41;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100
Для фильтрации используйте Stream API
 */
public class Task_01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        System.out.println(filter(numbers));
    }

    public static List<Integer> filter(List<Integer> list) {

        return list.stream()
                .filter(num -> num % 2 == 0 && num > 10 && num < 100)
                .collect(Collectors.toList());
    }
}
