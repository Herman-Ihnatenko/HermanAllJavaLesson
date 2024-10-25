package HomeWork08;

public class Task_03 {
    public static void main(String[] args) {
        /*
        Task 3
Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
         */
        int a = 1;
        while (a <= 100){
            if (a % 5 == 0){
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
