package HomeWork36.Task_01;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {


        Sportsman[] sportsmen = new Sportsman[5];
        sportsmen[0] = new Sportsman("Felix", 35, 160);
        sportsmen[1] = new Sportsman("Tammo", 35, 190);
        sportsmen[2] = new Sportsman("Felix", 25, 190);
        sportsmen[3] = new Sportsman("Paul", 20, 200);
        sportsmen[4] = new Sportsman("Mark", 30, 210);

        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("=======================\n");
        Arrays.sort(sportsmen, (c1, c2) -> c1.getScore() - c2.getScore());
        System.out.println(Arrays.toString(sportsmen));

        System.out.println("=======================\n");
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return s1.getAge() - s2.getAge();
            }
        });
        System.out.println(Arrays.toString(sportsmen));

    }
}
