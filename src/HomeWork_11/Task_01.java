package HomeWork_11;
/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.
 */
public class Task_01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(sum(a));
    }
    public static int sum(int[] a){
        int c = 0;
        for (int i = 0; i < a.length; i++){
            c = c + a[i];
        }
        return c;
    }
}
