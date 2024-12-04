package lesson_24.Interfaces;

public class Book implements PrintAble{
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book: %s (%s)\n", title, author);
    }

    public void uniqueMethod(){
        System.out.printf("uniqueMethod");
    }
}
