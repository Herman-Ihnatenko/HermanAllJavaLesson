package lesson_07;

public class BlockExample {
    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;
            System.out.println(x);
            System.out.println(y);
        }

    }
}
