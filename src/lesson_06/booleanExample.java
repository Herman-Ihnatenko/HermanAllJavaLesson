package lesson_06;

import java.util.Random;

public class booleanExample {
    public static void main(String[] args) {
        boolean boll = true;
        boll = false;

        int x = 10;
        int y = 10;

        boolean b1 = (x == y);
        System.out.println(x + "==" + y + "-> " + b1);
        b1 = x != y;
        System.out.println(x + "==" + y + "-> " + b1);
        b1 = x > y;
        System.out.println(b1);
        b1 = x >= y;
        System.out.println(b1);
        b1 = x < y;
        System.out.println(b1);
        b1 = x <= y;
        System.out.println("///"+b1);

        String str = "Pair is the best the";
        boolean contains = str.contains("Pair");
        System.out.println("str.contains(\"Pair\"): " + contains);


        int index = str.indexOf("the");
        System.out.println(index);
        contains = index != -1;
        System.out.println(contains);

        index = str.lastIndexOf("the");
        System.out.println(index);


        System.out.println("\n=====================");

        boolean b2 = !false;
        System.out.println(b2);
        b2 = !(4 == 5);
        System.out.println(b2);

        b2 = true & true;
        System.out.println(b2);
        b2 = (2 < 5) & (11 == 10);
        System.out.println(b2);

        int z = 50;
        boolean b3 = z > 0 & z < 100;
        System.out.println(b3);

        boolean b4 = true | false;
        b4 = false | false;
        System.out.println(b4);
        System.out.println(b4);

        Random random = new Random();
        int rand = random.nextInt(101);
        System.out.println(rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = isEven | (rand % 5 == 0);
        System.out.println(isGoodNumber);
        System.out.println(isEven);

        System.out.println("\n=====================");
        boolean b5 = true ^ false;
        System.out.println(b5);


        boolean b6 = false && true;
        System.out.println(b6);

        int a = 10;
        int b = 0;
        boolean b7 = (b != 0) && (a / b > 0);
        System.out.println(b7);

        boolean b8 = true || (a/b > 2);
        System.out.println(b8);

        System.out.println("\n=====================");

        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;

        System.out.println("\n=====================");

        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        System.out.println(aa | bb | cc < 100 & false ^ qq == 5);
        System.out.println(aa | bb | cc < 100 & false ^ false);
        System.out.println(aa | bb | cc < 100 & true);
        System.out.println(aa | bb | true & true);
        System.out.println(aa | bb | true);
        System.out.println(aa |true & true);
        System.out.println(aa |true);
        System.out.println(true);





        /*
() -> ! -> & -> ^ -> | -> && -> ||
 */
    }
}
