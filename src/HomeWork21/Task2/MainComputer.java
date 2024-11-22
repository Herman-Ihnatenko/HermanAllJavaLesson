package HomeWork21.Task2;

public class MainComputer {
    public static void main(String[] args) {

        Processor processor = new Processor("Intel", "i38-4843K");
        Memory memory = new Memory("Corsair", "792858-hdu-ci-38");
        System.out.println("\n===================\n");
        Computer computer = new Computer(processor, memory);
        System.out.println(computer);
    }
}
