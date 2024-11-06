package HomeWork16;

public class MagicArray2 {
    int[] array2;
    int cursor2;

    public MagicArray2(){
        array2 = new int[10];
    }

    void add(int value ){
        if (cursor2 == array2.length - 1){
            expandArray();
        }
    array2[cursor2] = value;
    cursor2++;
    }

    void expandArray() {
        System.out.println("Расширяем массив. cursor: " + cursor2);
        int[] newArray = new int[array2.length * 2];
        for (int i = 0; i < cursor2; i++) {
            newArray[i] = array2[i];
        }
        array2 = newArray;
        System.out.println("Расширения массива завершено.");
    }
    void addAll(int... values){
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }
    int remove(int index) {
        if (index < 0 || index >= cursor2) {
            return Integer.MIN_VALUE; // Todo переписать потом

        }
        int value = array2[index];
        for (int i = index; i < cursor2-1; i++) {
            array2[i] = array2[i+1];
        }
        cursor2--;
        return value;
    }
    int size() {
        return cursor2;
    }

    public String toString() {
        if (cursor2 == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor2; i++) {
            result = result + array2[i] + ((i < cursor2 - 1) ? ", " : "]");
        }
        return result;
    }
}
