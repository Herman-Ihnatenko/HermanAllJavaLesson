package HomeWork09;

import java.util.Scanner;
    /*
    Task 0
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.
Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
     */
public class Task_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.nextLine();
        mainString(string);
    }

    public static void mainString(String string){
        System.out.println(string.length());
    }
}
