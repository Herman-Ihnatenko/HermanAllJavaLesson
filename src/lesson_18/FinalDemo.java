package lesson_18;

public class FinalDemo {

    private final int capacity = 10;
    private final int[] ints = new int[capacity];

    public FinalDemo(int capacity) {
        //this.capacity = capacity;
        //this.ints = new int[2];
        ints[0] = 100;
        ints[0] = 200;
        ints[5] = 300;
    }

    //private void finalTest(final int x){
    // x = 100;
    // Реализация невозможна (тип - final)
    //}

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }
}
