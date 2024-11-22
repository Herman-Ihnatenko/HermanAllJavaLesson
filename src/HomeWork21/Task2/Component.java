package HomeWork21.Task2;

public class Component {

    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    @Override
    public String toString() {
        return "Component{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
