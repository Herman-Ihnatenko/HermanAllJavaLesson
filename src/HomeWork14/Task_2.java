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
        int[] arr = {3, 2, 5, 1, 89};
        System.out.println("Второй по величине элемент: " + max2(arr));
    }
    public static int max2(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        return max2;
    }
}
