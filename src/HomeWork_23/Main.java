package HomeWork_23;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5),
                          new Rectangle(4, 6),
                          new Triangle(3, 4, 5)
        };

        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
            totalPerimeter += shape.perimeter();
        }

        System.out.println("Общая площадь: " + totalArea);
        System.out.println("Общий периметр: " + totalPerimeter);
    }
}
