package lesson_26;

import java.util.Map;

public class GenExample <K, V>{
    private K key;
    private V value;

    public GenExample(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenExample{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }


    public static void main(String[] args) {
        GenExample<Integer, String> genExample=
                new GenExample<>(100, "String");
        System.out.println(genExample);
    }


}
