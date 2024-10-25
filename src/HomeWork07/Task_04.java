package HomeWork07;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        /*
        Task 4
Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7. Если число равно 1,
выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число от 1 до 7");
        int a = scanner.nextInt();
        scanner.nextLine();
        switch (a){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
               System.out.println("Выходной");
               break;
            default:
                System.out.println("Таких дней недели не придумали!");
        }
    }
}
