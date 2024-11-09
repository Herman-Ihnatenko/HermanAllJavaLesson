package lesson_17;

public class MagicArray {
    int[] array;
    int cursor;

    public MagicArray(){
        array = new int[10];
    }

    public MagicArray(int[] ints){

        if (ints != null) {
            this.array = new int[ints.length * 2];
            addAll(ints);
        }else{
            this.array = new int[10];
        }
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

    int get(int index){
        if (index >= 0 && index < cursor){
            return array[index];
        }
        return Integer.MIN_VALUE;//TODO отправить обработку некоретного индекса
    }
    int indexOf(int value){
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    int lastIndexOf(int value){
        //Todo homework
        return -1;
    }

    int[] toArray(){
        //Todo Homework2
        return null;
    }

    boolean removeByValue(int value){
        int index = indexOf(value);

        if (index == -1)return false;

        remove(index);
        return true;
    }

    int set(int index, int newValue){
        if (index < 0 || index >= cursor){
            return Integer.MIN_VALUE;
            //Todo поправить обработкую нет валидности индекса
        }

        int oldValue = array[index];
        array[index] = newValue;
        return oldValue;
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
// 10. Поиск посленего вхождения по значению lastIndexOf -- HW