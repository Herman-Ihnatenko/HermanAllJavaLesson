package lesson_16;

public class DogApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Bin", 5);

        dog.info();

        dog.run();
        dog.run();
        dog.run();
        dog.run();

        dog.info();

       // dog.eat();
       // dog.info();
    }
}
