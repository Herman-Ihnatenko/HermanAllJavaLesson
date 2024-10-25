package Homework06;

import java.util.Random;
import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        /*
        Task 2
Создайте две переменные типа int.
В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:
равны ли переменные,
не равны ли они,
больше ли a, чем b,
и меньше ли b, чем a.
Выведите результат на экран.
*/

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите случайное число от 0 до 50: ");
        int a = scanner.nextInt();
        System.out.println("введите случайное число от 0 до 100: ");
        int b = scanner.nextInt();
         */

        Random random = new Random();
        int a = random.nextInt(51);
        System.out.println("выбор случайного числа от 0 до 50: \n"+a);

        Random random1 = new Random();
        int b = random1.nextInt(101);
        System.out.println("выбор случайного числа от 0 до 100: \n"+b);

        b = random.nextInt(51)-20;
        System.out.println("9 "+ b);

        boolean bool1 = (a == b);
        System.out.println("равны ли переменные: "+bool1);
        boolean bool2 = (a != b);
        System.out.println("не равны ли: "+bool2);
        boolean bool3 = (a > b);
        System.out.println("больше ли a, чем b: "+bool3);
        boolean bool4 = (b < a);
        System.out.println("меньше ли b, чем a: "+bool4);

    }
}
