package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("your name: ");

        String name = scanner.nextLine();
        System.out.println(name);

        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(age);

        int Long = scanner.nextInt();
        scanner.nextLine();
        System.out.println(Long);

        double doubleVar = scanner.nextDouble();
        System.out.println(doubleVar);


    }
}
