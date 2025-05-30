package lesson_37;

import java.util.ArrayList;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list = new ArrayList<>(50);
        list = new ArrayList<>(50);

        list = new ArrayList<>();
        list = new ArrayList<>(List.of(1, 10, 5, 0, 25, -100));

        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        list.add(3, 500);
        System.out.println("list: " + list);

        Integer value = list.get(5);
        System.out.println("value: " + value);

        System.out.println(list.remove(5));
        System.out.println("list: " + list);

        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println("list: " + list);

    }
}
