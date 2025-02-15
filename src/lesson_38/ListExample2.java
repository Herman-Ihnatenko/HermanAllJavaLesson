package lesson_38;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 10, 100, -5, 0, 100, 11, 54));

        System.out.println("list.indexOf(100): " + list.indexOf(100));
        System.out.println("list.indexOf(100): " + list.lastIndexOf(100));
        System.out.println("list.indexOf(-10000): " + list.indexOf(-10000));
        System.out.println("list.indexOf(\"String\"): " + list.indexOf("String"));

        list.sort((i1, i2) -> Integer.compare(i2, i1));

        System.out.println(list);

        list.sort(Integer::compare);

        list.sort(Comparator.naturalOrder());

        System.out.println(list);

        List<Integer> sublist = list.subList(1, 5);
        System.out.println("list.subList(1, 5): " + sublist);



    }
}
