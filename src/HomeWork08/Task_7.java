package HomeWork08;

public class Task_7 {
    public static void main(String[] args) {
        /*
        Task 7
Дан массив целых чисел.
Поменять местами элементы с максимальным и минимальным значениями.
Пример:
{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
         */
        int[] array;
int[] numbers = new int[]{ 5, 6, -25, 0, 31, -15 };
//int length = numbers.length;
        //System.out.println("длина массива (количество ячеек / элементов)" +
               //" в массиве numbers : " + length);

        int k = 0;
        int min;
        int max;
        int mink = 0;
        int maxk = 0;
        min = numbers[0];
        max = numbers[0];
        while (k < numbers.length) {
            //System.out.println(numbers[k]);
            if (numbers[k] < min) {
                min = numbers[k];
                mink = k + 1;
            }

            if (numbers[k] > max) {
                max = numbers[k];
                maxk = k + 1;
            }
            k++;
        }
        //System.out.println(mink + " "+ min + " | " + maxk + " " + max);

        String arrayToString = "[";
        k = 0;
        while (k < numbers.length) {

            if(k != mink-1 & k != maxk-1){
                arrayToString += numbers[k]; // приклеиваем текущее значение из массива
            }else if(k == mink-1){
                arrayToString += max;
            }else if(k == maxk-1){
                arrayToString += min;
            }
            // Проверяем, является ли элемент последним в массиве
            if (k != numbers.length - 1) {
                arrayToString += ", ";
            } else {
                arrayToString += "]";
            }

            k++;
        }
        System.out.println("Было  [5, 6, -25, 0, 31, -15]");
        System.out.println("Стало "+arrayToString);

    }
}
