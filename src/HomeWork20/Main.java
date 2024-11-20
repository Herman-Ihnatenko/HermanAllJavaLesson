package HomeWork20;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(4, 5);
        rectangle.name = "1-RECTANGLE:";
        rectangle.displayInfo();
        rectangle.calculateArea();

        System.out.println("\n===================\n");

        Circle circle = new Circle();
        circle.setRadius(4);
        circle.name = "1-CIRCLE:";
        circle.displayInfo();
        circle.calculateArea();
    }
}
