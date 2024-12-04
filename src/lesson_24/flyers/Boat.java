package lesson_24.flyers;

public class Boat extends Transport implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Boat swimming");
    }

    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Boat take passengers");
        capacity++;
    }
}
