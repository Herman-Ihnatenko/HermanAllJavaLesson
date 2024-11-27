package HomeWork21;



public class Autobus2 {

    private static int counter;

    private final int id;

    private BusDriver2 driver;
    private AutoPilot2 autoPilot2;

    private final int capacity;
    private int countPassengers;

    private final Passenger2[] passengers;

    public Autobus2(BusDriver2 busDriver, int capacity) {
        this.id = counter++;
        this.driver = busDriver;
        this.capacity = capacity;
        this.autoPilot2 = new AutoPilot2("AP-v001");
        this.autoPilot2.setAutobus(this);
        this.passengers = new Passenger2[capacity];
    }

    public boolean takePassenger2(Passenger2 passenger2){
        if (countPassengers < capacity) {
            if (isPassengerInBus(passenger2)){
                System.out.printf("Пассажир id: %d уже в автобусе с id %d\n", passenger2.getId2(), this.id);
                return false;
            }

            passengers[countPassengers] = passenger2;
            countPassengers++;
            System.out.printf("Пассажир id: %d завершил посадку в автобус с id %d\n", passenger2.getId2(), this.id);
            return true;
        }

        System.out.printf("В автобусе id: %d свободных мест нет\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger2 passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId2() == passenger.getId2()) {
                return true;
            }
        }

        return false;
    }

    public void updateAutoPilotVersion(String softwareVersion){
        this.autoPilot2.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion){
        this.autoPilot2 = new AutoPilot2(softwareVersion);
        this.autoPilot2.setAutobus(this);
    }

    public Autobus2(int id, BusDriver2 driver, int capacity, Passenger2[] passengers) {
        this.id = id;
        this.driver = driver;
        this.capacity = capacity;
        this.passengers = passengers;
    }


    ////////////////////////////////////////////////////////////


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("Autobus: {");
        sb.append("id: ").append(id).append(", ");
        sb.append("capacity: ").append(capacity).append(", ");
        sb.append("driver: ").append(driver.toString()).append(", ");
        sb.append("autoPilot2: ").append(autoPilot2.toString()).append(", ");
        sb.append("}");
        return sb.toString();

    }

    public BusDriver2 getDriver() {
        return driver;
    }

    public void setDriver(BusDriver2 driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


}
