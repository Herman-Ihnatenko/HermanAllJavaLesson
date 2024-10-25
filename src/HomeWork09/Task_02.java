package HomeWork09;

import java.util.Scanner;
/*
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)
класс Math для нахождения степени числа использовать нельзя ;)
 */
public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        number(a);
    }

    public static void number(int x){
        System.out.println(x);
        int i = 1;
        long result = 1;
        while (i <= x){
            result = 2*result;
            i++;
        }
        System.out.println("2 в степени "+x+" = "+result);
    }
}
