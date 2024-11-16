package lesson_19;

public class LessonApp {
    public static void main(String[] args) {

        ConstantDemo demo = new ConstantDemo(10);
        System.out.println(demo.getX());

        ConstantDemo demo2 = new ConstantDemo(20);
        System.out.println(demo2.getX());

        System.out.println(ConstantDemo.COUNTRY);

    }
}
