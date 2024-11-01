package HomeWork15;

public class AnimalsAndMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", "чорный с белым", "обычная", 3, 2, 10);
        dog.info();
        System.out.println(" \nЯ могу: ");
        Dog.bark();
        Dog.guard();
        Dog.sleep();
        Dog.run();
        Dog.jump();
        Dog.gnaw();
        Dog.wagTheTail();

        System.out.println(" \n==========Second object==========\n");

        Hahn hahn = new Hahn("Петя","белый","Азиль",2, 0, 3);
        hahn.info();
        System.out.println(" \nЯ могу: ");
        Hahn.crow();
        Hahn.peck();
        Hahn.flyNotHigh();
        Hahn.jump();
        Hahn.eat();
        Hahn.trampleChickens();

        System.out.println(" \n==========Last object==========\n");

        Parrot parrot = new Parrot("Кеша","яркий","Какаду",4, 0, 2);
        parrot.info();
        System.out.println(" \nЯ могу: ");
        Parrot.speak();
        Parrot.clickBeak();
        Parrot.sleep();
        Parrot.bounce();
        Parrot.eat();
        Parrot.fly();
        Parrot.tease();
    }
}
