package HomeWork08;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("введите число");

        int intput = scanner.nextInt();
        scanner.nextLine();

        if(intput < 0) {
            intput = intput * -1;
        }
        int number2 = intput;

        int sum = 0;
        while (intput > 0){
            int currentDigit = intput % 10;

            sum += currentDigit;
            System.out.println(currentDigit + " + ");
            intput = intput / 10;
            System.out.println(sum);
            System.out.println("======================\n");

            String numStr = "" + number2;
            //System.out.println(numStr + 2);
            numStr = String.valueOf(number2);

            int len = numStr.length();

            int sum2 = 0;

            while (len>0){
                int pow = (int) Math.pow(10, len -1);
                int digit = number2 / pow;
                sum2 += digit;
                System.out.print(digit + " + ");
                number2 = number2 % pow;
                len--;

            System.out.println(" = "+ sum2);
            }
        }
    }
}
