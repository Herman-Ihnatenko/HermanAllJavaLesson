package HomeWork07;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        /*Task 3 (Повышенной сложности, опционально)
        Программа предлагает пользователю ввести четырехзначное число.
        Ввод осуществляется только в формате строки (String).
                Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
                Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
        Примеры:

        Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
                Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
         */
        Scanner scanner = new Scanner(System.in);
        String abcd = scanner.nextLine();
        //int lengthAbcd = abcd.length();
        //System.out.println();

        if(abcd.length() != 4) {
            System.out.println("Ошибка! Вы ввели не четырехзначное число. ");
        }else{
            int a = abcd.charAt(0);
            int b = abcd.charAt(1);
            int c = abcd.charAt(2);
            int d = abcd.charAt(3);
            System.out.println(a + " " + b + " " + c + " " + d);

            int a1 = Integer.parseInt(a+"");
            int b1 = Integer.parseInt(b+"");
            int c1 = Integer.parseInt(c+"");
            int d1 = Integer.parseInt(d+"");
            System.out.println(a1+b1);
            System.out.println(c1+d1);
            int ab = a1 + b1;
            int cd = c1 + d1;

            if(ab == cd) {
                System.out.println(abcd + " число счастливое");
            }else{
                System.out.println(abcd + " число НЕ счастливое");
            }

        }
    }
}
