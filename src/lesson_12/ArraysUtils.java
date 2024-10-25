package lesson_12;

import java.util.Arrays;

public class ArraysUtils {
    public static void main(String[] args) {

        int[] numbers = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77};

        int index = linerSearch(numbers, 50);
        System.out.println(index);
        if (index >= 0) {
            System.out.println("есть в массиве");
        }

        if (index == -1) {
            System.out.println("не найдено в массиве");
        }

        int minIdx = minIndex(numbers);
        System.out.println(minIdx);
        System.out.println("===========================");
        System.out.println(Arrays.toString(numbers));
        sortSelection(numbers);
        System.out.println(Arrays.toString(numbers));

        int idxBinary = binarySearch(numbers, 80);
        System.out.println(idxBinary);
    }


    public static int linerSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int minIndex(int[] arr){
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static int minIndex(int[] arr, int startIndex){
        int min = arr[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static void sortSelection(int[] array){

        for (int i = 0; i < array.length; i++) {
            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }
    }

    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        int mind;

        int counter = 0;

        while (start <= end){
            counter++;

            mind = start + (end - start);

            if (array[mind] == target) {
                System.out.println(counter + " :шаги");
                return mind;
            }

            if(array[mind] > target) {
                end = mind - 1;
            }else{
                start = mind + 1;
            }
        }
        System.out.println("значение не найдено" + target);
        return -1;

    }

}
