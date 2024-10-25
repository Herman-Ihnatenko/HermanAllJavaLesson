package HomeWork08;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String string = scanner.nextLine();
       System.out.println("введите hello");
       while (string != "hello"){
           if(string != "hello"){
                System.out.println("введите hello");
           }
       }
        System.out.println("Спасибо! Вы выполнили команду");

    }
}
