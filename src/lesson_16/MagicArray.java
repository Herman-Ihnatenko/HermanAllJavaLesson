package lesson_16;

public class MagicArray {
    int[] array;
    int cursor;

    public MagicArray(){
        array = new int[10];
    }

    void add(int value){
        if (cursor == array.length -1) {
            expandArray();
        }

        array[cursor] = value;
        cursor++;

    }

    void expandArray() {
        System.out.println("Расширяем массив. cursor: " + cursor);
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Расширения массива завершено.");

    }

    void addAll(int... values){
        // System.out.println("Мы пртняли несколько int-ов. А именно: " + values.length);
        // System.out.println(values[0]);
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    int remove(int index){
        if (index < 0 || index >= cursor) {
            return Integer.MIN_VALUE; // Todo переписать потом

        }
        int value = array[index];
        for (int i = index; i < cursor-1; i++) {
            array[i] = array[i+1];
        }
        cursor--;

        return value;
    }
    int size() {
        return cursor;
    }

    public String toString(){
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor -1) ? ", " : "]");
        }
        return result;
    }
}
