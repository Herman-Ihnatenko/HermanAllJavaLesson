package HomeWork04;

public class Task_04 {
    public static void main(String[] args) {
        /*
        Task 4 * (Опционально)
Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных функций), и выведите результат.
Пример программы:

public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'a';
        char ch3 = 'n';
        char ch4 = 'n';
        char ch5 = 'a';

        // Ваш код
    }
}
Copy
Output:

HANNA
Copy
Пояснение
Переменные ch1, ch2, ch3, ch4 и ch5 должны быть преобразованы из нижнего регистра в верхний с использованием только арифметических операций.
Вывод результата должен быть в виде строки с именем в верхнем регистре.
         */
//Мое имя по буквам:
        char ch1 = 'h';
        char ch2 = 'e';
        char ch3 = 'r';
        char ch4 = 'm';
        char ch5 = 'a';
        char ch6 = 'n';
// 97 - 65 = 32 ( нахожу цифровые коды для больших букв моего имени ):
        int a1 = ch1 - 32;
        int a2 = ch2 - 32;
        int a3 = ch3 - 32;
        int a4 = ch4 - 32;
        int a5 = ch5 - 32;
        int a6 = ch6 - 32;
        System.out.println("letter: "+ a1);
        System.out.println("letter: "+ a2);
        System.out.println("letter: "+ a3);
        System.out.println("letter: " + a4);
        System.out.println("letter: " + a5);
        System.out.println("letter: " + a6);
// Перевожу цифровые коды в буквы верхнего регистра:
        char a12 = (char)a1;
        char a22 = (char)a2;
        char a32 = (char)a3;
        char a42 = (char)a4;
        char a52 = (char)a5;
        char a62 = (char)a6;
        System.out.println(a12);
        System.out.println(a22);
        System.out.println(a32);
        System.out.println(a42);
        System.out.println(a52);
        System.out.println(a62);
//Мое имя буквами верхнего регистра в одной строке:
        String str = (char)a1 + "" +(char)a2 + "" +(char)a3 + "" +(char)a4 + "" +(char)a5 + "" +(char)a6;
//Или так:
        String str1 = a12 + "" +a22 + "" +a32 + "" +a42 + "" +a52 + "" +a62;
        System.out.println(str);
        System.out.println(str1);
        System.out.println("" + a12 + a22 + a32 + a42 + a52 + a62);
//Todo




    }
}
