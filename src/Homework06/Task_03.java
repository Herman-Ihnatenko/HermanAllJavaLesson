package Homework06;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        /*
        Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:

Число: 6 четное: true;  Число: 3 четное: false;
 кратно 3: true;  кратно 3: true;
 четное и кратное 3: true; четное и кратное 3: false
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean bool1 = a % 2 == 0;
        boolean bool2 = a % 3 == 0;
        boolean bool3 = a % 3 == 0 && a % 2 == 0;
        System.out.println("Число: " + a + " четное: " +bool1 + ";"
                + " кратно 3: " + bool2 + ";"
                + " четное и кратное 3: " + bool3);

    }
}
