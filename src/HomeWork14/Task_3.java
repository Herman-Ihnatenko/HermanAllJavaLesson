package HomeWork14;

import java.util.Scanner;

/*
Task 3
Подсчет гласных и согласных

Напишите программу,
которая просит пользователя ввести слово и
подсчитывает количество гласных и согласных
букв в этом слове.
 */
public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int a = 0;

        for (int i = 0; i < string.length(); i++) {
                a++;
            }
            System.out.println(a);
        }
    }

