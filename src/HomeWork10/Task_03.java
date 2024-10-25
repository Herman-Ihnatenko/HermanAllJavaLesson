package HomeWork10;

import java.util.ArrayList;
import java.util.List;

/*
Task 3
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив,
 состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5}
-> выход {13, 11, 31, 11, 5}
 */
public class Task_03 {
        public static void main(String[] args) {
            int[] numbers = {0, 13, -25, 11, 31, 55, 98, 11, 5};
            int[] primes = getPrimeNumbers(numbers);

            for (int prime : primes) {
                System.out.print(prime + " ");
            }
        }

    public static int[] getPrimeNumbers(int[] numbers) {
        List<Integer> name = new ArrayList<>();

            for (int number : numbers) {
                    if (isPrime(number)) {
                            name.add(number);
                        }
                }

            int[] primeArray = new int[name.size()];
            for (int i = 0; i < name.size(); i++) {
                    primeArray[i] = name.get(i);
                }

            return primeArray;
        }

            public static boolean isPrime(int number) {
            if (number <= 1) {
                    return false;
                }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                            return false;
                        }
                }
            return true;
        }
    }