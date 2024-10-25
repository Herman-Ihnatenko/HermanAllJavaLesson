package Homework05;

import java.util.Scanner;

/*
Task 1
 Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
 Используя Scanner, сохраните имя в переменную типа String.
 Выведите на экран количество символов в имени пользователя.
 Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
 Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
 */
public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);

        int langName = name.length();
        System.out.println(langName);

        char nameStart = name.charAt(0);
        char nameEnd = name.charAt(langName-1);
        System.out.println(nameStart);
        System.out.println(nameEnd);

        int a1 = nameStart;
        int a2 = nameEnd;

        System.out.println(a1);
        System.out.println(a2);



    }
}
