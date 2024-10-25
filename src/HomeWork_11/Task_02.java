package HomeWork_11;
/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */
public class Task_02 {
    public static void main(String[] args) {
        double[] a = {1, 2, 6, 4, 5.4 };
        System.out.println(srAr(a));
    }
    public static double srAr (double[] a){
        double c = 0;
        for (int i = 0; i < a.length; i++){
            c = c + a[i];
        }
        return c / a.length;
    }
}
