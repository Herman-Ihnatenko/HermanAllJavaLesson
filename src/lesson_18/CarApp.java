package lesson_18;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Car("BMW", 200);
        System.out.println("До создания второго авто");
        System.out.println(car.toString());
        Car VW = new Car("VW", 300);

        VW.setPower(330);

        System.out.println(car.toString());
        System.out.println(VW.toString());

        System.out.println("Static var: " + Car.totalCars);

       // System.out.println("static var: " + VW.totalCars);


    }
}
