package lesson_26;

import lists.MyList;

public class UtilsGeneric {

    public static <T> String printArray(T[] array){
        if (array == null || array.length == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(i < array.length - 1 ? ", " : "]");
        }
        return sb.toString();
    }
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Number> int sum(T[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.intValue();
        }
        return sum;
    }

    public static <T extends Number> int sumInt(T[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.intValue();
        }
        return sum;
    }

    public static double listSum(MyList<? extends Number> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) sum += list.get(i).doubleValue();
        return sum;
    }

    public static void addNumbers(MyList<? super Integer> list){

        for (int i = 0; i < 5; i++) list.add(i);
    }
}
