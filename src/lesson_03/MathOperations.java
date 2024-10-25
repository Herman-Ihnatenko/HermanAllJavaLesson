package lesson_03;

public class MathOperations {
    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        result = 15 + 6 + var1;
        System.out.println("15 + 6 + var1 = " + result);

        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        result = var1 * var2;
        System.out.println(result);

        result = var1 / var2;
        System.out.println(result);

        int rest = var1 % var2;
        System.out.println(rest);
        System.out.println("Целочисленное деление 4 / 2: " + (4 / 2)); // 2
        System.out.println("Остаток от деление 4 % 2: " + (4 % 2)); // 0

        System.out.println("5 / 10 = " + (5 / 10)); //0
        System.out.println("5 % 10 = " + (5 % 10)); //5

        result = 2 + 10 / 2;
        System.out.println(result);

        result = (2 + 10) / 2;
        System.out.println(result);


        double x = 20.0d;
        double y = 7.0;

        double resultDouble = x/y;
        System.out.println(resultDouble);


        int a = 20;
        int b = 7;
        int res = 20/7;

        //System.out.println(res);

        System.out.printf("%d on %d = %d", a, b, res);


        /*
        %d
        %s
        %f
        %n
        \n
         */
    }
}











