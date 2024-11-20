package lesson_20.transport;

import javax.swing.text.InternationalFormatter;
import java.util.Arrays;

public class transportApp {
    public static void main(String[] args) {
    Bus bus = new Bus("Bus-X1", 2020, 10);

        System.out.println(bus.toString());

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): "+bus.getModel());
        System.out.println("bus.getCapacity(): "+bus.getCapacity());

        System.out.println("\n=====================\n");

        Train train = new Train("Train-M1", 2024, 4, 15);
        System.out.println(train.toString());
        System.out.println(train.getModel());
        System.out.println(train.getYear());

        System.out.println("train.getCapacity(): "+train.getCapacity());
        train.setCountWagons(6);
        System.out.println("train.getCapacity(): "+train.getCapacity());
        train.setCountWagons(1);
        System.out.println("train.getCapacity(): "+train.getCapacity());

        System.out.println("\n=====================\n");

        Bus bus1 = new Bus("Bus-B2", 2024, 3);
        System.out.printf("1, =======================");
        System.out.println(bus1.takePassengers());
        System.out.printf("2, =======================");
        System.out.println(bus1.takePassengers());
        System.out.printf("3, =======================");
        System.out.println(bus1.takePassengers());
        System.out.printf("4, =======================");
        System.out.println(bus1.takePassengers());

        System.out.println(bus1.getCountPassengers());

        System.out.println("\n==========================\n");
        System.out.printf("1, =======================");
        System.out.println(bus1.dropPassengers());
        System.out.println(bus1.getCountPassengers());
        System.out.printf("2, =======================");
        System.out.println(bus1.dropPassengers());
        System.out.println(bus1.getCountPassengers());
        System.out.printf("3, =======================");
        System.out.println(bus1.dropPassengers());
        System.out.println(bus1.getCountPassengers());
        System.out.printf("4, =======================");
        System.out.println(bus1.dropPassengers());
        System.out.println(bus1.getCountPassengers());
        System.out.println("\n==========================\n");

    }

}
