package lesson_04;

public class Casting {
    public static void main(String[] args) {

        byte byteVar = 123;
        int intVal;
        intVal = byteVar;

        double doubleVar = intVal;

        System.out.println(intVal);
        System.out.println(doubleVar);

        double test = 9_000_000_000_000_000_000_000_000_000.00;

        double double1 = 42.9;
        int int1 = (int) double1;

        System.out.println(double1);
        System.out.println(int1);


    }
}

