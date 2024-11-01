package lesson_15;

import HomeWork15.Dog;

public class CatsMain {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        int catAge = cat.age;
        System.out.println("Возраст: " + catAge);

        System.out.println("\n =================== \n");

        Cat cat1 = new Cat("Max");
        cat1.sayMeow();
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println();
        cat1.info();

        System.out.println("\n =================== \n");
        Cat cat2 = new Cat("Diamond", "red");
        cat2.info();

        System.out.println("\n =================== \n");
        Cat cat3 = new Cat("Peter", "black", 8);
        cat3.info();

        System.out.println("\n =================== \n");
        Cat cat4 = cat3;
        cat4.info();
        cat3.info();

        cat3.age = 11;
        cat3.info();
        cat4.info();

        System.out.println();

        cat4.name = "Mary";
        cat4.info();
        cat3.info();

        System.out.println("\n =================== \n");
        cat4 = new Cat("Barsik","white", 1);

        cat4.info();
        cat3.info();
    }
}
