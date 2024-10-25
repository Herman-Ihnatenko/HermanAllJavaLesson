package lesson_09;

public class TernaryOperator {
    public static void main(String[] args) {

        int x = 10;

        String result;

        if (x > 0) {
            result = "Больше нуля";

        }else{
            result = "меньше нуля";
        }
        System.out.println(result);

        String result2 = (x > 0) ? "больше нуля" : "меньше нуля";
        System.out.println(result2);
    }
}
