package lesson_26;

import lists.MyArrayList;
import lists.MyList;

public class MethodApp {
    public static void main(String[] args) {
        Integer[] integers= {1, 2, 3,4 ,5, 6};
        String[] strings = {"a", "b","c","d","e"};
        Double[] doubles = {1.0, 2.0, 3.0,4.0 ,5.0, 6.0};

        String str = UtilsGeneric.printArray(integers);
        System.out.println(str);

        String str2 = UtilsGeneric.printArray(strings);
        System.out.println(str2);

        String str3 = UtilsGeneric.printArray(doubles);
        System.out.println(str3);

        System.out.println("\n=============\n");
        UtilsGeneric.swap(doubles, 0, 3);
        System.out.println(UtilsGeneric.printArray(doubles));

        double sum = UtilsGeneric.sum(doubles);
        System.out.println(sum);

        sum = UtilsGeneric.sum(doubles);
        System.out.println(sum);

        System.out.println("\n=============\n");

        MyList<Integer> integerMyList = new MyArrayList<>();
        integerMyList.addAll(1, 2, 3, 4, 5);
        double sumInt = UtilsGeneric.listSum(integerMyList);
        System.out.println(sumInt);
        MyList<String> stringMyList = new MyArrayList<>();
        //Ошибка компиляции
        //sumInt = UtilsGeneric.listSum(stringMyList);

        UtilsGeneric.addNumbers(integerMyList);
        System.out.println(integerMyList);
    }
}
