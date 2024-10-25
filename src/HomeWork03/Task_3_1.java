package HomeWork03;

public class Task_3_1 {
    public static void main(String[] args) {
        double cenaA = 1000;
        double cenaB = 500;
        double resultAB = cenaA + cenaB;
        double CenaABSoSkid = resultAB / 100 * 90;
        double skid = resultAB - CenaABSoSkid;

        System.out.println("Цена обоих товаров вместе со скидкой = " + CenaABSoSkid );
        System.out.println("Суммарная скидка = " + skid );
    }
}

