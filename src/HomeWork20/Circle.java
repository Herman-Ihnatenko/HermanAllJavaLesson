package HomeWork20;

public class Circle extends Shape{
    private double radius;
    private double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        System.out.println(PI * radius * radius);

    }
}
