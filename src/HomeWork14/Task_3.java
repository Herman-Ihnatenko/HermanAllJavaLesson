package HomeWork14;

import java.util.Arrays;
import java.util.Optional;
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

        Scanner inp = new Scanner(System.in);
        System.out.println("введите слово: ");
        String word = inp.nextLine();
        System.out.println(Arrays.toString(countVowelsAndConstants(word)));


        }
    public static int[] countVowelsAndConstants(String word) {
        int vowelCount = 0;
        int consonantCount = 0;

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    vowelCount++;
                    break;
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'w':
                case 'x':
                case 'z':
                    consonantCount++;
                    break;
                default:
                    System.out.println();
            }
        }
        return new int[]{vowelCount, consonantCount};
    }
}



