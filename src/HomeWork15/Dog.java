package HomeWork15;

public class Dog {
    String name;
    String color;
    int age;
    String bred;
    double weight;
    int medals;

    public Dog(String dogName, String color, String bred, int age, int medals, double weight){
        name = dogName;
        this.bred = bred;
        this.color = color;
        this.age = age;
        this.medals = medals;
        this.weight = weight;
    }


    public static void bark(){
        System.out.println("лаять");
    }
    public static void guard(){
        System.out.println("охранять");
    }
    public static void sleep(){
        System.out.println("спать");
    }
    public static void run(){
        System.out.println("бегать");
    }
    public static void jump(){
        System.out.println("прыгать");
    }
    public static void gnaw(){
        System.out.println("грызть");
    }
    public static void wagTheTail(){
        System.out.println("вилять хвостом");
    }
    public void info(){
        System.out.printf("Я собачка %s, мой возраст: %d, мой окрас: %s, моя порода: %s, мои медали: %d, мой вес: %.2f \n", name, age, color, bred, medals, weight);
    }

}
