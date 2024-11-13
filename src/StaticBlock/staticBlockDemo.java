package StaticBlock;

public class staticBlockDemo {

    static int counter = 5;
    static String[] colors = new String[counter];

    private String title;
    private int capacity = 10;

    static {
        System.out.println("Static block run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "yellow";
        colors[2] = "green";
        counter = 10;
    }

    static {
        System.out.println("Second static block run!");
        counter = 25;
    }

    {
        System.out.println("NON-static block run!");
        this.title = "Block Title";
        this.capacity = 50;
    }

    public staticBlockDemo(){
        System.out.println("Empty Constructor run");
    }

    public staticBlockDemo(String title) {
        System.out.println("Constructor run");
        this.title = title;
        this.capacity = 50;
    }

    public String toString(){
        return String.format("Title: %s, capacity: %d, " +
                "static-counter: %d", title, capacity, counter);
    }
}
