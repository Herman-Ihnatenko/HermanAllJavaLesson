package HomeWork21;

public class Passenger2 {
    private static int counter;

    private final int id;
    private String name;

    public Passenger2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId2() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
