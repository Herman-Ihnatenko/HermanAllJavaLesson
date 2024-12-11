package lesson_10;

import java.util.Random;

public class MethodsWithReturn {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = a + b;
        int result = calculateSum(a, b);
        System.out.println("result: " + result);

        System.out.println(calculateSum(3, 7));

        double square = squareNumber(2.5);
        System.out.println("square: "+square);

        System.out.println(squareNumber(4.0));
        System.out.println(squareNumber(5));

        String res = concatString("Pair", 17);
        System.out.println("res: " + res);

        int[] ints = fillArray();
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + (i != ints.length - 1 ? ", " : "]\n"));
        }


    }

    public static int[] fillArray(){
        int[] result = new int[10];

        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt();
        }
        return result;
    }

    public static String concatString(String str, int x){
        String result = str + x + "!!!";
        return result;
    }

    public static double squareNumber(double number){
        return number * number;
    }

    public static int calculateSum(int a, int b){

        int sum = a + b;
        return sum;
    }

}
