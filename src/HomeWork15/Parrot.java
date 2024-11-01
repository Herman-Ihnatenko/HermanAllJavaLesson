package HomeWork15;

public class Parrot {
    String name;
    String color;
    int age;
    String bred;
    double weight;
    int medals;

    public Parrot(String parrotName, String color, String bred, int age, int medals, double weight){
        name = parrotName;
        this.bred = bred;
        this.color = color;
        this.age = age;
        this.medals = medals;
        this.weight = weight;
    }


    public static void speak(){
        System.out.println("разговаривать");
    }
    public static void clickBeak(){
        System.out.println("щелкать клювом");
    }
    public static void sleep(){
        System.out.println("спать");
    }
    public static void bounce(){
        System.out.println("подпрыгивать");
    }
    public static void eat(){
        System.out.println("есть");
    }
    public static void fly(){
        System.out.println("летать");
    }
    public static void tease(){
        System.out.println("дразнить");
    }

    public void info(){
        System.out.printf("Я попугай %s, мой возраст: %d, мой окрас: %s, моя порода: %s, мои медали: %d, мой вес: %.2f \n", name, age, color, bred, medals, weight);
    }

}

