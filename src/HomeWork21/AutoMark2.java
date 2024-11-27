package HomeWork21;



public class AutoMark2 {
    public static void main(String[] args) {

        BusDriver2 busDriver = new BusDriver2("John", "licenseNumber-74882652657");

        Autobus2 bus = new Autobus2(busDriver, 15);

        BusDriver2 peter = new BusDriver2("Peter", "LN-75377987");

        bus.setDriver(peter);

        System.out.println(bus.toString());
        System.out.println(busDriver.toString());

        System.out.println("\n=================\n");


        BusDriver2 marge =new BusDriver2("Marge", "AE-6548745876");
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

        Passenger2 passenger = new Passenger2(80889, "kai");
        Passenger2 passenger1 = new Passenger2(786797, "loid");

        bus.takePassenger2(passenger);
        System.out.println(bus.getCountPassengers());

        bus.takePassenger2(passenger1);
        System.out.println(bus.getCountPassengers());

        bus.takePassenger2(passenger);
        System.out.println(bus.getCountPassengers());
    }
}
