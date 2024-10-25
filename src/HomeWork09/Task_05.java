package HomeWork09;

import javax.swing.*;

/*
Написать метод, который принимает массив строк. Вывести на экран все символы самой длинной строки из массива.
Пример:
{ "One", "Two", "Twenty" } ->
T
w
e
n
t
y
 */
public class Task_05 {
    public static void main(String[] args) {
        String[] strings = { "One", "Two", "Twenty" };
        printArray(strings);
    }

    public static void printArray(String[] strings){
        System.out.print("{");
        int i = 0;
        int maxLen = 0;
        String maxAi = strings[0];

        while (i < strings.length){
            System.out.print(strings[i] + (i < strings.length -1 ? ", " : "}\n"));
            String ai = strings[i];
            int lenAi = ai.length();
            if (lenAi > maxLen) {
                maxLen = lenAi;
                maxAi = strings[i];
            }
            i++;
        }
        System.out.println("макс. длина элемента массива = "+maxLen);
        System.out.println("этот элемент: "+maxAi);

        i = 0;
        while (i < maxLen){
            char element = maxAi.charAt(i);
            System.out.println(element);
            i = i+1;
        }
    }
}
