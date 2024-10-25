package HomeWork08;

public class Task_01 {
    public static void main(String[] args) {
        /*
        Task 1
Найдите произведение всех чисел от 1 до 10 включительно.
Результат выведите на экран
         */
        int a = 1;
        int b = 1;
        while (a < 11){
            b = a * b;
            System.out.println(b);
            a++;
        }
    }
}
