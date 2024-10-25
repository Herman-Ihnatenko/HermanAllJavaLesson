package lesson_08;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10){
            System.out.println(x);
            x++;
        }

        System.out.println(x);
        System.out.println("//////////////////////////////\n");
        int j = 100;
        while (j > 89){
            System.out.println(j);
            j--;
        }
        System.out.println(j);
        System.out.println("//////////////////////////////\n");

        int sum = 0;
        int i = 1;
        while (i <= 100){
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
        System.out.println("//////////////////////////////\n");

        //i = 1;
        //while (i <= 5){
        //    System.out.println(i);
        //}

        i = 1;
        while (i <= 21){
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println("\n//////////////////////////////\n");

        String hello ="Hello, Java";
        i = 0;
        while (i < hello.length()){
            char c = hello.charAt(i);
            System.out.println(c + " | " + (int) c);
            i++;
        }
        System.out.println("//////////////////////////////\n");

    }
}
