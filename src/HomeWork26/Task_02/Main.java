package HomeWork26.Task_02;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Bob");
        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);
        MyArrayList.printTwoLists(names, scores);

        System.out.println("\n===================================\n");

        NumericPair<Integer> intPair= new NumericPair<>(1, 2);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());

    }
}
