package lesson_22.animal;

public class Animal extends Object{

    public void voice(){
        System.out.println("Animal say something");
    }

    @Override
    public String toString() {
        return "Animal to String";
    }

}
