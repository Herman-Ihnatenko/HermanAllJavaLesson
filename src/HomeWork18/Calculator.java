package HomeWork18;
//Класс "Калькулятор"
//Создайте класс Calculator, который будет предоставлять
//базовые арифметические операции: сложение, вычитание, умножение и деление

//Класс должен содержать:
//Статические методы для каждой математической операции,
//принимающие два аргумента и возвращающие результат операции.

public class Calculator {
     public static double sum(double a, double b){
        return a+b;
    }

     public static double diff(double a, double b){
        return a-b;
    }

     public static double multiplication(double a, double b){
        return a*b;
    }

     public static double division(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(30, 60));
        System.out.println("Difference: " + Calculator.diff(30, 60));
        System.out.println("Multiplication: " + Calculator.multiplication(30, 60));
        System.out.println("Division: " + Calculator.division(30, 60));
    }
}
