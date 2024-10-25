package lesson_03;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable;

        myFirstVariable = 1;

        int mySecondVariable = 25;

        System.out.println(mySecondVariable);

        // Ctrl + Alt + L

        mySecondVariable = 50;

        System.out.println("Variable2: " + mySecondVariable);

        byte byteVariable = 125;

        System.out.println(byteVariable);
//

        //Ctrl + D // double
        //Ctrl + Y // delete
        //Shift + Alt + стрелочки

        byteVariable = - 100;
        System.out.println(byteVariable);

        short shortVariable;
        shortVariable = 31000;
        System.out.println(shortVariable);

        long longVariable = 2_100_000_000_000_000_000L;
        System.out.println(longVariable);

        double doubleVar = 10.5421;
        System.out.println(doubleVar);

        float floatVar = 11.65f;
        System.out.println(floatVar);
    }
}


















