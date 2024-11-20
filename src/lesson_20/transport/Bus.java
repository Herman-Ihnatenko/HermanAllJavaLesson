package lesson_20.transport;

public class Bus extends Vecicle {

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        super(year, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassengers(){
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: "+ this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                this.getModel(), countPassengers);
        return false;
    }

    public boolean dropPassengers(){
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Высадка пасажиров произошла успешно\n"+ getModel());
            return true;
        }
            System.out.println("В автобусе больше нет пассажиров\n"+ getModel());

        return false;
    }
    private String[] countries;
    public void goToRoute(){
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries);
        }
    }
}