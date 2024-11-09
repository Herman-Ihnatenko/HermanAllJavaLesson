package HomeWork_17.EmployeeApp;

public class Employee {
    private String name;
    private int age;
    private double pay;

    public Employee(String name, int age, double pay) {
        this.name = name;
        this.age = age;
        this.pay = pay;
    }

    public String info(){
        return String.format("Person %s, Age: %d, Pay: %.2f", name, age, pay);
    }
}

