package lesson_27;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class forEachExample {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
        }

        for (String str : list){
            System.out.println(str);
        }

        System.out.println("\n=================\n");
        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1,2,3,4,5,6,7);

        for(Integer element : integers){
            System.out.println(element + 100);
        }
    }
}
