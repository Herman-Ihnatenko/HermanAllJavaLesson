package HomeWork_23;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (isValidSizes()) {
            //TODO а можно ли мне создавать объект
            System.out.println("Invalid size");
        }



    }

    private boolean isValidSizes(){
        return a < b + c && b < a + c && c < a + b;
    }

    @Override
    public double area() {
        double p1 = perimeter() / 2;
        return Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
