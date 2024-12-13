package HomeWork27.Task_02;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("t@esttest.net.de", "pP8437!Phcs");
        Person person2 = new Person("t@esttest.net.de", "pP47!s");
        Person person3 = new Person("test.net.de", "pP47!s");
        Person person4 = new Person("t@esttestnetde", "pP8437!Phcs");
        System.err.println("Только этот регистр работает, потому что в нем есть все критерие, которые были заданы: "+person);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


    }
}
