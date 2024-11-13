package HomeWork_17;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 07.11.2024
 */

public class ArrayApp {
    public static void main(String[] args) {

        int[] ints = {10, 20, 50, -25, 35, 45, 100, -1, 50};

        MagicArrayEncap magicArray = new MagicArrayEncap(ints);

        System.out.println(magicArray.toString());

        System.out.println(magicArray.indexOf(50));
        System.out.println("magicArray.indexOf(500): " + magicArray.indexOf(500));

        System.out.println("magicArray.removeByValue(20): " + magicArray.removeByValue(20));

        // Обновление значение по несуществующему индексу
        System.out.println(magicArray.set(100, 1000));

        System.out.println(magicArray.toString());

        System.out.println("magicArray.set(0, 1000): " + magicArray.set(0, 1000));

        System.out.println(magicArray.toString());

        System.out.println("\n =============lastIndexOf========");
        System.out.println("magicArray.lastIndexOf(50): "+magicArray.lastIndexOf(50));
        System.out.println("\n =============and========");
        //System.out.println(magicArray);
        System.out.println(Arrays.toString(magicArray.toArray()));

    }
}
