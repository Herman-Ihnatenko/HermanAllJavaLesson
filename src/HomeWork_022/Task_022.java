package HomeWork_022;

import java.util.Arrays;

public class Task_022 {
    public static void main(String[] args) {
        String[] strings = {"one", "twenty", "null"};
        String[] result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));

       // strings = new String[]{"one", "twenty",null, "null"};
        result = null;
        System.out.println("\n =================== testArray = null /============\n");

        strings = null;
        result = getArrayWithSmallestStrings(strings);
        System.out.println(Arrays.toString(result));


    }
    public static String[] getArrayWithSmallestStrings(String[] strings) {

        if(strings == null || strings.length == 0){
            return new String[0];

        }
        String smallestString = strings[0];
        String maximumString = strings[0];

        for (int i = 0; i < strings.length; i++) {

            System.out.println(strings[i] + ": ");

            if (strings[i].length() < smallestString.length()) {
                smallestString = strings[i];
            }

            if (strings[i].length() > maximumString.length()) {
                maximumString = strings[i];
            }
        }

        // Создаем новый массив, в который будут записаны две строки
        return new String[] {smallestString, maximumString};
    }
}
