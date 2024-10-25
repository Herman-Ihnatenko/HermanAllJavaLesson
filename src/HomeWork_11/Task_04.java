package HomeWork_11;
/*
Task 4 * (Опционально)
Написать метод, который удаляет все вхождения заданного числа из массива и возвращает новый массив без этого числа.
 */
public class Task_04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = del(a, 3);
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
    public static int[] del(int[] a, int b){
        int[] c = new int[a.length];
        int i = 0;
        for (int j = 0; j < a.length; j++){
            if (a[j] != b){
                c[i++] = a[j];
            }
        }
        return c;
    }
}
