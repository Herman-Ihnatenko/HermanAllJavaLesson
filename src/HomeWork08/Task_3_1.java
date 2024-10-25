package HomeWork08;

public class Task_3_1 {
    public static void main(String[] args) {
        /*
Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
         */
        int a = 1;
        int b = 0;
        while (a <= 100 & b < 7){
            if (a % 5 == 0){
                System.out.print(a + " ");
                //System.out.print(b + " ");
            b++;
            }
            a++;
        }
    }
}
