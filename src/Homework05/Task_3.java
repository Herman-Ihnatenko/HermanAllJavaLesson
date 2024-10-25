package Homework05;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
/*
Task 3* (Опционально)
Попросите пользователя ввести строку чётной длины с клавиатуры.
Распечатайте два средних символа строки.
Например:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
 */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);

        int langName = name.length();
        System.out.println(langName);

        int sre1 = langName/2;
        int sre2 = sre1 + 1;
        System.out.println(sre1);
        System.out.println(sre2);

        char nameStart = name.charAt(sre1-1);
        char nameEnd = name.charAt(sre2-1);
        System.out.println(nameStart);
        System.out.println(nameEnd);




    }
}
