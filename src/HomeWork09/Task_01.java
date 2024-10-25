package HomeWork09;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        /*
        Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
Copy
Перегрузить метод, если в него приходит индекс,
то часть массива слева до этого индекса распечатывается в обычном порядке,
а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
Copy
Еще одна перегрузка: метод принимает массив и булевый флаг.
Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке
         */
        int[] array = new int[]{1, 4, 3, 6, 7};
        int[] array1 = new int[]{1, 4, 3, 6, 7};
        int[] array2 = new int[]{1, 4, 3, 6, 7};
        System.out.println("=========1=========");
        mainArray(array);

        System.out.println("=========2=========");
        System.out.println("введите с какого индекса менять порядок элементов: ");
        Scanner scanner1 = new Scanner(System.in);
        int index = scanner1.nextInt();
        scanner1.nextLine();
        mainArray1(array1, index);

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 2 целых числа и проверим их на равенство: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();
        boolean b1 = (x == y);
        System.out.println(x + " = " + y + " -> " + b1);
        int b = 0;
        if(b1 == true){
            b = 1;
        }
        System.out.println("=========3=========\n" + b1);
        mainArray2(array2, b);
    }

    public static void mainArray(int[] array) {
            System.out.print("обратный массив из ");
        int i = 0;
        System.out.println((array.length) + " элемeнтов:");
        while (i <= array.length-1){
            System.out.print(array[(array.length-1)-i]);
            i++;
        }
        System.out.print("\n");
    }

    public static void mainArray1(int[] array1, int index){
        System.out.print("обратный массив, начиная с индексов " + index + ": \n");
        int i = 0;
        while (i < index){
            System.out.print(array1[i]);
            i++;
        }
        int i1 = 0;
        while (i <= array1.length-1){
            System.out.print(array1[(array1.length-1)-i1]);
            i++;
            i1++;
        }
        System.out.print("\n");
    }

    public static void mainArray2(int[] array1, int bool){
        int i = 0;
        System.out.print("[");
        while (i < array1.length) {
            System.out.print(array1[i] + (i < array1.length - 1 ? ", " : "] -> "));
            i++;
        }

        i = 0;
        if(bool == 0){
            System.out.print("[");
            while (i < array1.length) {
                System.out.print(array1[i] + (i < array1.length - 1 ? ", " : "]"));
                i++;
            }
        }else{
            mainArray(array1);
        }
    }
}
