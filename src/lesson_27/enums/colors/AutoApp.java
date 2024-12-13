package lesson_27.enums.colors;

public class AutoApp {
    public static void main(String[] args) {

        Color color = Color.RED;

        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);

        System.out.println("\n==============\n");

        Color[] colors = Color.values();

        for (Color currenetColor : colors){
            System.out.println(currenetColor);
        }

        Color color1 = Color.valueOf("RED");
        System.out.println("color: "+color1);

        String name = Color.GREEN.name();
        System.out.println("name: "+name.toLowerCase());

        int ordinal = Color.BLUE.ordinal();
        System.out.println("ordinal = " + ordinal);
        System.out.println("\n==============\n");

        switch (auto.getColor()){
            case RED:
                System.out.println("Цвет красный!");
            case BLUE:
                System.out.println("Цвет синий!");
            case GREEN:
                System.out.println("Цвет зеленый!");
            default:
                System.out.println("NO CAR OF THOSE COLOR!");
        }
        System.out.println("\n==============\n");

        if (auto.getColor() == Color.BLUE) {
            System.out.println("The car is BLUE");
        } else {
            System.out.println("NO ONE!!!");
        }

    }
}
