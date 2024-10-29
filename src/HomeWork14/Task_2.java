package HomeWork14;

import java.util.Arrays;

/*
Task 2
Найти второе по величине число в массиве

Напишите метод,
который находит второе по величине число
в массиве целых чисел.
 */
public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 4, 5};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
