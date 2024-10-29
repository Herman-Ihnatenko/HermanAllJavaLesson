package HomeWork14;

import java.util.Arrays;

/*
Task 1
Сумма четных чисел

Напишите метод,
который вычисляет сумму всех четных чисел в массиве.
 */
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(sum());

    }
    public static int sum() {
        int[] numbers = {-8, 1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) sum = sum;

            else {
                sum = sum + numbers[i];

            }
        }
        return sum;

    }
}
