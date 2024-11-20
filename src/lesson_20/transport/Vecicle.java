package lesson_20.transport;

public class Vecicle {
    private String model;
    private int year;

    public Vecicle(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public Vecicle(){
        this.model = "Default";
        this.year = 2000;
    }

    public void start(){
        System.out.println(model + " начинает движение");
    }

    public void stop(){
        System.out.println(model + " останвливается");
    }

    public String toString(){
        return model + ", год выпуска: " + year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
