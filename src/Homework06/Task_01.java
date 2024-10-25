package Homework06;

public class Task_01 {
    /*
    Task 1
Дан текст Programming is fun.

Напишите программу, которая проверяет,
содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
     */
    public static void main(String[] args) {
        String str1 = new String("Programming is fun");
        boolean b1 = str1.contains("fun");
        System.out.println(b1);

    }
}
