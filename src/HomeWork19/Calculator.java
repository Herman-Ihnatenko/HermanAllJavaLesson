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

    public static String longOfCircle(double r){
         String result = String.valueOf(2 * 3.14 * r);
         return result;
    }

    public static String squareOfCircle(double r){
        String result1 = String.valueOf(3.14 * r * r);
        System.out.printf("square of circle is: %.2f\n", 3.14 * r * r);
        return result1;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(3, 6));
        System.out.println("Difference: " + Calculator.diff(3, 6));
        System.out.println("Multiplication: " + Calculator.multiplication(3, 6));
        System.out.println("Division: " + Calculator.division(3, 6));
        System.out.println("Long of circle is: "+ Calculator.longOfCircle(6));
        squareOfCircle(6);
    }
}
