package HomeWork10;

import java.util.Arrays;

/*
Task 1
Написать метод со следующим функционалом:
На вход метод принимает массив целых чисел и число -
длину нового массива. Метод должен создать и распечатать
массив заданной в параметрах длинны.
 В начало массива должны быть скопированы элементы из
 входящего массива:
{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3)
-> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5)
 -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи -
написать собственную реализацию этого метода
 */
public class Task_01 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        copyOfArray(array, 3);
        System.out.println();
        copyOfArray(new int[]{0, 1, 2}, 5);
    }

    public static void copyOfArray(int[] original, int newLength) {
        int[] newArray = new int[newLength];

        for (int i = 0; i < original.length && i < newArray.length; i++) {
            newArray[i] = original[i];
        }

        System.out.println(Arrays.toString(newArray));
    }
}
