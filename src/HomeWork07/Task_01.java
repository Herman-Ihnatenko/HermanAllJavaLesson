package HomeWork07;

import java.util.Scanner;

/*
Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
 */
public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Число будет один");
        }else if (number == 2) {
            System.out.println("Число будет два");
        }else if (number == 3) {
            System.out.println("Число будет три");
        }else{
            System.out.println("Вы ввели число вне интервала от 1 до 3 ");
        }
    }
}
