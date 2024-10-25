package HomeWork10;
/*
Task 2
Написать метод, принимающий на вход массив строк.
 Метод должен вернуть массив,
 состоящий из самой короткой и самой
 длинной строки изначального массива.


 */
public class Task_02 {
    public static void main(String[] args) {
        String[] strings = {"one", "twenty", "null"};
        String[] result = getShortestAndLongest(strings);
        System.out.println(result[0] + " | " + result[1]);
    }

    public static String[] getShortestAndLongest(String[] str){
        if (str == null || str.length == 0) {
            return new String[]{null, null};
        }
        String shortest = str[0];
        String longest = str[0];

        for (String string : str) {
            if (string.length() < shortest.length()) {
                shortest = string;
            }
            if (string.length() > longest.length()) {
                longest = string;
            }
        }

        return new String[]{shortest, longest};
    }
}
