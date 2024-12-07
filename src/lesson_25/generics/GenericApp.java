package lesson_25.generics;

import lesson_18.Car;

public class GenericApp {
    public static void main(String[] args) {


        //GenericBox<Car> boxCar = new GenericBox<>();
        GenericBox <String> box = new GenericBox<>("Hello");

        String strValue = box.getValue();
        System.out.println(strValue.length());
        System.out.println(box.getValue().toUpperCase());

        box.setValue("Test");
        System.out.println(box);

        System.out.println("\n==================\n");
        //GenericBox<int> boxInt = new GenericBox<>();
    }
}
