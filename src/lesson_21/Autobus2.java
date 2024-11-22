package lesson_21;


public class Autobus2 {

    private static int counter;

    private final int id;

    private BusDriver driver;
    private AutoPilot autoPilot;

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;

    public Autobus2(BusDriver busDriver, int capacity) {
        this.id = counter++;
        this.driver = busDriver;
        this.capacity = capacity;
        this.autoPilot = new AutoPilot("AP-v001");
        this.autoPilot.setAutobus(this);
        this.passengers = new Passenger[capacity];
    }

    public boolean takePassenger(Passenger passenger){
        if (countPassengers < capacity) {
            if (isPassengerInBus(passenger)){
                System.out.printf("Пассажир id: %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }

            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир id: %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;
        }

        System.out.printf("В автобусе id: %d свободных мест нет\n", this.id);
        return false;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                return true;
            }
        }

        return false;
    }

    public void updateAutoPilotVersion(String softwareVersion){
        this.autoPilot.setSoftwareVersion(softwareVersion);
    }

    public void installNewAutopilot(String softwareVersion){
        this.autoPilot = new AutoPilot(softwareVersion);
        this.autoPilot.setAutobus(this);
    }

    public Autobus2(int id, BusDriver driver, int capacity, Passenger[] passengers) {
        this.id = id;
        this.driver = driver;
        this.capacity = capacity;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "id=" + id + ", capacity=" + capacity +
                ", driver=" + driver.toString() +
                ", autopilot=" + autoPilot.toString() +
                '}';
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
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
