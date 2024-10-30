package HomeWork14;

/*
Task 1
Сумма четных чисел

Напишите метод,
который вычисляет сумму всех четных чисел в массиве.
 */
public class Task_1 {
    public static void main(String[] args) {
        int[] numbers = {1, -4, 2, 3, 4};
        System.out.println("Результат суммы четных чисел = " + sum(numbers));

    }
    public static int sum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        return sum;

    }
}
