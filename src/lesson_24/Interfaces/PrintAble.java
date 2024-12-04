package lesson_24.Interfaces;

public interface PrintAble {
    int CONST = 10;

    void print();

    default void defaultMethod(){
        System.out.println("default method from interface");

    }

    static void staticMethod(){
        System.out.println("Static method from interface");
    }

    private void privateMethod(){
        System.out.println("Private method from interface");
    }
}
