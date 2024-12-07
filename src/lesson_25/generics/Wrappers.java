package lesson_25.generics;

public class Wrappers {
    public static void main(String[] args) {

        Integer wrapperInt = 5;
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;
        System.out.println(primitiveInt);

        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        System.out.println(Integer.MIN_VALUE);

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
        System.out.println(127 + ".equals(" + 127 + "):"+a.equals(b));

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d);
        System.out.println(128 + ".equals(" + 128 + "):"+a.equals(b));

        Integer c1 = -128;
        Integer d1 = -128;
        System.out.println(c1 == d1);

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);

        System.out.println("\n===========\n");

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf("127");
        System.out.println(e == f);

        Double db1 = Double.valueOf("154.5");
        System.out.println(db1 + 1);

        int intParse = Integer.parseInt("300") + 1;
        System.out.println(intParse);
        double d2 = Double.parseDouble("344.56");
        System.out.println(d2 + 200);

        //System.out.println(Integer.parseInt("Rrrr"));
        //System.out.println(Integer.valueOf("Rrrr"));
        String strNumber = db1.toString();
        System.out.println(strNumber + 10);

        Double dbl2 = Double.valueOf(125.67);
        double dPrimitive = dbl2.doubleValue();

        Integer integer = 31844;
        System.out.println(integer.doubleValue());

        short sh = integer.shortValue();
        System.out.println(sh);

        double sum = add(1455343, 344.67);
        System.out.println(sum);
    }

    public static double add(Number number1, Number number2) {
        double d1 = number1.doubleValue();
        double d2 = number2.doubleValue();
        return d1 + d2;
    }

}
