package HomeWork22.Task2;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {new Car(), new Bicycle(), new Motorcycle()};
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
}
