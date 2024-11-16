package lesson_19;

public class ConstantDemo {

    public static final double PI = 3.141519; // Являеся константой
    public static final int[] ints = new int[10]; //Не является константой
    public static final String COUNTRY = "Germany";
    private static final String[] colors = {"red", "blue", "yellow"};// Не может быть константой

    private final int x; // Не константа.

    public ConstantDemo(int x) {
        this.x = x;
        colors[1] = "green";
    }

    public int getX() {
        return x;
    }

    public void showCountry(){
        System.out.println("My country is: " + COUNTRY);
    }
}
