package HomeWork16;

public class Task_01 {
    int[] array;
    int cursor3;

    public Task_01() {
        array = new int[10];

    }
    public static int indexOf(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }

    public static int VarIndexOf(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (i == key) return array[i];
        }
        return -1;
    }


    void add(int value){
        if (cursor3 == array.length - 1){
            expandArray();
        }
        array[cursor3] = value;
        cursor3++;
    }

    void expandArray(){
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor3; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Массив расширен");

    }

    void addAll(int... values){
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }
        int remove(int index) {
            if (index < 0 || index >= cursor3) {
                return Integer.MIN_VALUE;
            }
            int value = array[index];
            for (int i = index; i < cursor3-1; i++) {
                array[i] = array[i+1];
            }
            cursor3--;
            return value;
        }


        int size(){
            return cursor3;
    }
    public String toString() {
        if (cursor3 == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor3; i++) {
            result = result + array[i] + ((i < cursor3 - 1) ? ", " : "]");
        }
        return result;
    }

    int remove2(int key) {
        for (int i = 0; i <= cursor3-1; i++) {
            if (array[i] == key) {
                array[i] = 0;
            }
            System.out.print(array[i] + " | ");
        }
        return 1;
    }
}
