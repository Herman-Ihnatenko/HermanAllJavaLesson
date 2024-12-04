package HomeWork_23;

public class TriangleSingle{
    private double a;
    private double b;
    private double c;

    private static TriangleSingle instance;

    private TriangleSingle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static TriangleSingle getInstance(double a, double b, double c){
        if (isValidSizes(a, b, c)) {
            return new TriangleSingle(a, b, c);
        }else{
            System.out.println("Invalid sides");
            return null;
        }
    }
    private static boolean isValidSizes(double a, double b, double c){
        return a < b + c && b < a + c && c < a + b;
    }

}
