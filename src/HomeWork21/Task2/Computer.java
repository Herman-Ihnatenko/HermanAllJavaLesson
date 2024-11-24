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

    public Computer() {
        this.memory = new Memory("Corsair", "792858-hdu-ci-38");
        this.processor = new Processor("Intel", "i38-4843K");
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }


    @Override
    public String toString() {
        return "Computer with " + processor +
                ", " + memory +
                ", " + storage;
    }
}
