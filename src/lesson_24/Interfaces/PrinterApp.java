package lesson_24.Interfaces;

public class PrinterApp {
    public static void main(String[] args) {
        PrintAble book = new Book("Философия Java", "Б. Эккель");
        book.print();
        System.out.println(book.toString());

        book.defaultMethod();
        PrintAble.staticMethod();
        System.out.println("\n==============\n");
        PrintAble journal = new Journal("Cosmopolitan", 154);
        journal.print();
        journal.defaultMethod();
        System.out.println("\n==============\n");
        ColorPrintable colorPrintable = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in DOP",
                20
        );

        colorPrintable.print();
        colorPrintable.colorPrint();
        colorPrintable.defaultMethod();
    }


}
