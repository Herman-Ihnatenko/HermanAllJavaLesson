package lesson_14;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args){


        int[] array = {3, 2, 1, 0};

        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int index = Arrays.binarySearch(array, 3);
        System.out.println(index);

        int[] test = {0, 1, 3, 2};
        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println(isArraysEquals);

        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println(mismatchIndex);

        int[][] arrayD = new int[6][5];
        System.out.println(Arrays.deepToString(arrayD));

        int[][] arrayC = new int[6][5];
        arrayC[2][3] = 1;
        System.out.println(Arrays.deepToString(arrayC));
        System.out.println(Arrays.deepEquals(arrayC, arrayD));

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC[i].length; j++) {
                System.out.print(arrayC[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("\n=======================\n");
        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));

        int[] copyOfTest2 = Arrays.copyOf(test, 2);
        System.out.println(Arrays.toString(copyOfTest2));

        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 1, 4, 1000);
        System.out.println(Arrays.toString(arr));

        Random random = new Random();
        Arrays.fill(arr, random.nextInt(1001));
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {0, 1, 2, 3, 4};


        int[] copy = new int[10];
        System.arraycopy(arr1, 1, copy, 3, 2);
        System.out.println(Arrays.toString(copy));



    }
}
