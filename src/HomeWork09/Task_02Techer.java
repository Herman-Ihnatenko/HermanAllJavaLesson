package HomeWork09;

public class Task_02Techer {

    public static void main(String[] args) {
        int pow = -3;
        powTwo(pow);
    }


    public static void powTwo(int n){

        boolean isPositive = n >= 0;

        n = (isPositive) ? n : n * -1;

        //if (isPositive) {

        //} else {
        //    n = n * -1;
        //}

        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= 2;

        }
        System.out.print(result);

    }
}
