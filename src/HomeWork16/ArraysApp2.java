package HomeWork16;

public class ArraysApp2 {
    public static void main(String[] args) {

    MagicArray2 magicArray2 = new MagicArray2();

    System.out.println(magicArray2.toString());
    System.out.println("size: " + magicArray2.size());
    magicArray2.add(100);
    magicArray2.add(200);
    String info = magicArray2.toString();
    System.out.println(info);
    System.out.println("size: " + magicArray2.size());

    System.out.println("\n=====================\n");
    magicArray2.addAll(300, 400, 500, 600, 700, 800, 900, 1000, 1100, 2000);
    System.out.println(magicArray2.toString());

    System.out.println("\n=====================\n");
    System.out.println(magicArray2.remove(11));
    System.out.println(magicArray2.size());
    System.out.println(magicArray2.toString());
    }
}
