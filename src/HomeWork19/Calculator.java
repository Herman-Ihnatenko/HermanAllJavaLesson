package HomeWork19;
//Task 1
//Дополните Класс "Калькулятор" из предыдущего домашнего задания
//Класс Calculator, который будет предоставлять

//- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
//- Вычисление длины окружности и площади круга по ее радиусу
//Класс должен содержать:
//- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
//- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
//- Константу (число Пи)

public class Calculator {

     public static final double PI = 3.14;

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

    public static double longOfCircle(double r){
         return 2 * PI * r;
    }

    public static double squareOfCircle(double r){

        return PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(3, 6));
        System.out.println("Difference: " + Calculator.diff(3, 6));
        System.out.println("Multiplication: " + Calculator.multiplication(3, 6));
        System.out.println("Division: " + Calculator.division(3, 6));
        System.out.println("Long of circle is: "+ Calculator.longOfCircle(10.6));
        System.out.println(squareOfCircle(10.6));
       // System.out.println(Math.PI);
    }
}
