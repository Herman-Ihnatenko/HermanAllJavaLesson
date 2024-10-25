package lesson_08;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array;
        String[] strings;

        //int array1[]; // <-- не рекомендуется

        array = new int[4];
        strings = new String[10];

        int[] array2 = new int[8];

        int value = array2[0];
        System.out.println(value);
        System.out.println(strings[2]);
        boolean[] bools = new boolean[4];
        System.out.println(bools[3]);
        System.out.println("\n//////////////////////////////\n");

        int[] numbers = new int[] {45, 56, -16, 45, 0, 159, 1444};
        int length = numbers.length;
        System.out.println(length);

        int[] ints = {-10, 54, 32323, 444};
        System.out.println(numbers[0]);
        System.out.println(ints[2]);
        System.out.println(strings[9]);

        System.out.println(ints);
        System.out.println("\n//////////////////////////////\n");

        int i = 0;
        while (i < ints.length){
            System.out.print(ints[i] + ", ");
            i++;
        }
        System.out.println("\n//////////////////////////////\n");
        String arrayToString = "[";
        i = 0;
        while (i < numbers.length){
            arrayToString += numbers[i];
            if (i != numbers.length - 1) {
                arrayToString += ", ";
            }else{
                arrayToString += "]";
            }
            i++;
        }
            System.out.println(arrayToString);
        Random random = new Random();

        int k = 0;
        System.out.print("[");
        while (k < numbers.length){
            numbers[k] = random.nextInt(100);
            System.out.println(numbers[k] + ",");
            k++;

        }
        System.out.println("]");
        i = 0;
        int min = numbers[0];
        while (i < numbers.length){
            if (numbers[i] < min){
                min = numbers[i];
            }
            i++;
        }
        System.out.println(min);
    }
}
