package HomeWork15;

public class Hahn {
    String name;
    String color;
    int age;
    String bred;
    double weight;
    int medals;

    public Hahn(String hahnName, String color, String bred, int age, int medals, double weight){
        name = hahnName;
        this.bred = bred;
        this.color = color;
        this.age = age;
        this.medals = medals;
        this.weight = weight;
    }


    public static void crow(){
        System.out.println("кукарекать");
    }
    public static void peck(){
        System.out.println("клевать");
    }
    public static void flyNotHigh(){
        System.out.println("летать (не высоко)");
    }
    public static void jump(){
        System.out.println("прыгать");
    }
    public static void eat(){
        System.out.println("есть");
    }
    public static void trampleChickens(){
        System.out.println("охранять, быть главным среди курей, топтать кур");
    }
    public void info(){
        System.out.printf("Я петух %s, мой возраст: %d, мой окрас: %s, моя порода: %s, мои медали: %d, мой вес: %.2f \n", name, age, color, bred, medals, weight);
    }

}

