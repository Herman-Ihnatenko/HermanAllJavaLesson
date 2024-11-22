package lesson_21;

public class AutoMark {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "licenseNumber-74882652657");

        Autobus2 bus = new Autobus2(busDriver, 15);

        BusDriver peter = new BusDriver("Peter", "LN-75377987");

        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("\n=================\n");

        BusDriver marge =new BusDriver("Marge", "AE-6548745876");
        Autobus2 bus1 = new Autobus2(marge, 24);

        System.out.println(bus1.toString());

        bus1.installNewAutopilot("AP-gpt6");
        System.out.println(bus1.toString());
        marge.setName("Marge-Susana");
        System.out.println(bus1.toString());

        bus1 = null;
        System.out.println(marge.toString());
        bus.setDriver(marge);
        System.out.println(bus.toString());

        System.out.println("\n=================\n");

        Passenger passenger = new Passenger(80889, "kai");
        Passenger passenger1 = new Passenger(786797, "loid");

        bus.takePassenger(passenger);
        System.out.println(bus.getCountPassengers());

        bus.takePassenger(passenger1);
        System.out.println(bus.getCountPassengers());

        bus.takePassenger(passenger);
        System.out.println(bus.getCountPassengers());
    }
}
