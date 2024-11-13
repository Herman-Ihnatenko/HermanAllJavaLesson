package StaticBlock;

import java.util.Arrays;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(staticBlockDemo.counter);
        System.out.println(Arrays.toString(staticBlockDemo.colors));

        staticBlockDemo demo = new staticBlockDemo("Title");
        //System.out.println(demo.toString());

        staticBlockDemo demo1 = new staticBlockDemo("TestBlock");
        System.out.println(demo1.toString());
        staticBlockDemo demo2 = new staticBlockDemo();
        System.out.println(demo.toString());
    }
}
