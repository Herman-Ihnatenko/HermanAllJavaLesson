package HomeWork07;

import java.util.Random;

public class Task_02 {
    public static void main(String[] args) {
        /*Task 2
        Запишите в 4 переменные случайные числа от 0 до 100.
        Выведите все 4 числа на экран.
        Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
        Output:
        Максимальное число: 33
         */
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);
        System.out.println(a + " " + b + " " + c + " " + d);
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;
        System.out.println("Максимальное число: " + max);

    }
}
