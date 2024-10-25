package HomeWork08;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        int b = a / 10;
        int sum = 0;
        while(b > 1){
            int ost = a % 10;
            sum = ost+sum;
        System.out.println(b);
        System.out.println("=========================");
        System.out.println(sum);
            b = b / 10;
        }
    }
}
