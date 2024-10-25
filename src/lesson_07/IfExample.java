package lesson_07;

import java.util.Random;
import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        int x = 15;

        if (x > 11) {
            System.out.println("Всем привет! ");
            System.out.println(x);

        } else if (x > 7){
            System.out.println("Not so, but? ");
            System.out.println(x);

        } else {
            System.out.println("Not so! ");
            System.out.println(x);
        }
            System.out.println("Programme");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число до 10");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("number");
        }else if (number == 10) {
            System.out.println("better");
        }else{
            System.out.println("no");
        }
        System.out.println("==============================");
        //Scanner scanner1 = new Scanner(System.in);
        System.out.println("ДЕНЬГИ");

        //scanner1.nextLine();

        Random random = new Random();
        int a = 100;
        //System.out.println(a);

        number = random.nextInt(5)+1;
        System.out.println(number);

        System.out.println("выбор случайного числа от 0 до 5: \n"+a);
        if (number == 5 ) {
            a = a + 20;
        }else if (number == 4) {
            a = a + 10;
        }else if (number == 3) {
            a = a + 0;
        }else if (number == 2 ) {
            a = a - 10;
        }else if (number == 1) {
            a = a - a;
        }else{
            System.out.println("no");

        }
        System.out.println(a);
        System.out.println("================================");

        int v1 = random.nextInt(51);
        int v2 = random.nextInt(51);
        int v3 = random.nextInt(51);

        System.out.println(v1 +" | "+ v2+" | "+v3);
        int min = v1;
        if (v2 < min){
            min = v2;
        }
        if (v3 < min) min = v3;

        System.out.println(min);

        System.out.println("================================");

    }
}
