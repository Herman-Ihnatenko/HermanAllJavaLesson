package lesson_10;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        int j =0;
        while (j <= 10){
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();


        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("\n====================== \n");

        //for (; ;){
        //    System.out.println("Hello World");
        //}

        int x = 5;
        for (x = 0; x >= 0; x = x + 10000_000){
            System.out.print(x + ", ");
        }

        for (String str = "Hello"; str.length() < 10; str += "$"){
            System.out.println(str);
        }

        System.out.println("\n====================== \n");

        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++){
            System.out.println(k + " : " + a + " : " + f);
        }

        System.out.println("\n====================== \n");

        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5];
        System.out.println("Длина массива: " + ints.length);

        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50;
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n"));
        }
        System.out.println("\n====================== \n");

        for (int i = 0; i < 7; i++) {

            if (i == 5) continue;

            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("\n======================");
        for (int i = 0; i < 7; i++) {

            if (i == 3) break;

            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("\n======================");

        j = 0;
        while (j < 7 ){

            if (j == 3){
                j++;
                continue;
            }

            System.out.print(j + "; ");
            j++;
        }
        System.out.println();
    }
}
