package Homework05;
/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
 */
public class Task_02_22 {
    public static void main(String[] args) {
        String a1 = "Java";
        String a2 = "is";
        String a3 = "a";
        String a4 = "powerful";
        String a5 = "language";
        String a_ = " ";

        String a12345 = a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5;
        System.out.println(a12345);
        String a22 = a1.concat(a_).concat(a2).concat(a_).concat(a3).concat(a_).concat(a4).concat(a_).concat(a5);
        System.out.println(a22);
        int a22Long = a22.length();
        System.out.println(a22Long);

/*
Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
*/

        String a6 = "super";
        String replace = a22.replace(a4, a6);
        System.out.println(replace);

        String str1 = "age";
        System.out.println(a22.regionMatches(a22Long, str1, 0, 3));

        boolean isContains = a6.contains("age");
        System.out.println(isContains);
    }
}


