package lesson_20.transport;

public class Train extends Vecicle{

    private int capacity;
    private int countPassenger;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int countWagons, int wagonCapacity){
        super(year, model);
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calculateCapacity();
    }

    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }
}
