package HomeWork21.Task2;

/*
Task 2
Компьютер и компоненты

Создайте базовый класс Component с полями brand (бренд) и model (модель).
Создайте производные классы: Processor, Memory, Storage от класса Component.
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
Реализуйте отношения между Computer и компонентами.
Компоненты Processor и Memory не могу существовать без компьютера.
*/

public class Computer {

    private Processor processor;
    private Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer with " + processor +
                ", " + memory +
                ", " + storage;
    }
}
