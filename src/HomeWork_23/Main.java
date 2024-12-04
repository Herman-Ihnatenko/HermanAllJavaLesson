package HomeWork_23;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5),
                          new Rectangle(4, 6),
                          new Triangle(3, 4, 5)
        };

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].area();
            totalPerimeter += shapes[i].perimeter();
        }

        System.out.println("Общая площадь: " + totalArea);
        System.out.println("Общий периметр: " + totalPerimeter);

        System.out.println("\n========================\n");

        //TriangleSingle triangleSingle = TriangleSingle.getInstance();
        //TriangleSingle triangleSingle2 = TriangleSingle.getInstance();

        //System.out.println(triangleSingle);

    }

}
