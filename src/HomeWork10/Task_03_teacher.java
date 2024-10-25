package HomeWork10;

import java.util.Arrays;

public class Task_03_teacher {
    public static void main(String[] args) {
        int[] array = {0, 13, -25, 11, 31, 55, 67, 98, 11, 5, 100003};
        int[] primeArray = getArrayOnlyWithPrime(array);
        System.out.println(Arrays.toString(primeArray));
    }

    public static int[] getArrayOnlyWithPrime(int[] numbers){

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(isPrime(numbers[i])) {
                count++;
            }
        }
        if(count == 0) return new int[0];

        int[] result = new int[count];

        for (int i = 0, idxPrime = 0; i < numbers.length; i++){
            if(isPrime(numbers[i])){
                result[idxPrime] = numbers[i];
                idxPrime++;
            }
        }
        return result;
    }

    private static boolean isPrime(int number) {
        if(number <= 1) return false;
        System.out.println("Проверяем: "+number);
        for (int i = 2; i < Math.sqrt(number); i++) {
            System.out.print(i + ", ");
            if (number % i == 0) return false;
        }
        System.out.println();
        return true;
    }

}
