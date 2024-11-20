package HomeWork20.Task_02;

public class CountryMain {
    public static void main(String[] args) {

        Germany germany = new Germany();
        germany.name = "Germany";
        System.out.println(germany.toString());
        germany.population(83_862_255);
        System.out.println(germany.population);

        System.out.println("\n========================\n");

        England england = new England();
        england.name = "England";
        System.out.println(england.toString());
        System.out.println(england.language("english"));


    }
}
