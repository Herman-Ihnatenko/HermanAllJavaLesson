package HomeWork08;

import java.util.Random;

/*Task 6
    Создать массив целых чисел произвольной длины от 5 до 15.
    Заполнить массив случайными значениями от -50 до 50.
    Вывести на экран:
    Минимальное значение в массиве
    Максимальное значение в массиве
    Среднее арифметическое всех значений в массиве
     */
public class Task_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int len = random.nextInt(11) + 5;
        int[] array = new int[len];

        int i = 0;
        System.out.print("[");
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50;
            System.out.print(array[i] + ((i < array.length -1) ? ", " : "]\n"));
            i++;

        }
 //    int k = 0;
 //    int min;
 //    int max;
 //    int sr = 0;
 //    min = array[0];
 //    max = array[0];

 //    while (k < array.length) {
 //        array[k] = random.nextInt(101)-50;
 //        System.out.println(array[k]);
 //        if (array[k] < min) {
 //            min = array[k];
 //        }

 //        if (array[k] > max) {
 //            max = array[k];
 //        }
 //        sr = sr + array[k];
 //        k++;
 //    }
 //    sr = sr / k;
 //    System.out.println("минимум: " + min);
 //    System.out.println("max: " + max);
 //    System.out.println( "Среднее арифметическое: "+sr);
    }
}
