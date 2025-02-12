package HomeWork37.Task2;
/*
Task 2
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

   В первом методе - получение всех значений элементов списка по его индексу
   Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
   Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
   Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
   Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Benchmark {

    private static final int NUM_ELEMENTS = 5000;
    private static final int NUM_INSERTIONS = 2000;
    private static final int NUM_DELETIONS = 1000;
    private static final int MAX_VALUE = 10000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        Random random = new Random();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            int value = random.nextInt(1000);
            arrayList.add(value);
            linkedList.add(value);
        }


        long arrayListGetTime = getElements(arrayList);
        long linkedListGetTime = getElements(linkedList);

        long arrayListInsertTime = insertElements(arrayList);
        long linkedListInsertTime = insertElements(linkedList);

        long arrayListDeleteIndexTime = deleteElementsByIndex(arrayList);
        long linkedListDeleteIndexTime = deleteElementsByIndex(linkedList);

        long arrayListDeleteValueTime = deleteElementsByValue(arrayList);
        long linkedListDeleteValueTime = deleteElementsByValue(linkedList);


        System.out.println("ArrayList:");
        System.out.println("  Get elements: " + arrayListGetTime + " ms");
        System.out.println("  Insert elements: " + arrayListInsertTime + " ms");
        System.out.println("  Delete elements by index: " + arrayListDeleteIndexTime + " ms");
        System.out.println("  Delete elements by value: " + arrayListDeleteValueTime + " ms");

        System.out.println("LinkedList:");
        System.out.println("  Get elements: " + linkedListGetTime + " ms");
        System.out.println("  Insert elements: " + linkedListInsertTime + " ms");
        System.out.println("  Delete elements by index: " + linkedListDeleteIndexTime + " ms");
        System.out.println("  Delete elements by value: " + linkedListDeleteValueTime + " ms");


        long arrayListSequentialTime = executeSequentially(arrayList);
        long linkedListSequentialTime = executeSequentially(linkedList);

        System.out.println("Sequential execution time:");
        System.out.println("  ArrayList: " + arrayListSequentialTime + " ms");
        System.out.println("  LinkedList: " + linkedListSequentialTime + " ms");
    }

    private static long getElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long insertElements(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < NUM_INSERTIONS; i++) {
            int index = random.nextInt(list.size());
            list.add(index, random.nextInt(MAX_VALUE));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long deleteElementsByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < NUM_DELETIONS; i++) {
            int index = random.nextInt(list.size());
            list.remove(index);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long deleteElementsByValue(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < NUM_DELETIONS; i++) {
            int value = random.nextInt(MAX_VALUE);
            while (list.contains(value)) {
                list.remove((Integer) value);
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long executeSequentially(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        List<Integer> tempList = new ArrayList<>(list);
        getElements(tempList);
        tempList = new ArrayList<>(list);
        insertElements(tempList);
        tempList = new ArrayList<>(list);
        deleteElementsByIndex(tempList);
        tempList = new ArrayList<>(list);
        deleteElementsByValue(tempList);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}