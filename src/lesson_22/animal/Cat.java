package lesson_22.animal;

public class Cat extends Animal{

    @Override
    public void voice() {
        System.out.println("Cat say MEOW");;
    }

    public void eat(){
        System.out.println("Cat is eating");
    }

    public void eat(String food){
        System.out.println("Cat is eating "+ food);
    }
}
