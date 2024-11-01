package lesson_15;

public class Cat {

    String name;
    String color;
    int age;

    public Cat(String catName){
        name = catName;
    }

    public Cat(){

    }

    public Cat(String catName, String color){
        name = catName;
        this.color = color;
    }
    public Cat(String name, String color, int age){
        this(name, color);
        this.age = age;
    }

    public void sleep(){
        System.out.println("Я сплю!");
    }

    public void run(){
        System.out.println("Я бегу");
    }

    public void sayMeow(){
        System.out.println("Meow");
    }

    public void info(){
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", name, age, color);

    }

}
