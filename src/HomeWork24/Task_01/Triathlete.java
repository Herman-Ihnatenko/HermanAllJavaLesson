package HomeWork24.Task_01;

public class Triathlete implements Swimmer, Runner{
    @Override
    public void run() {
        System.out.println("Бегун бежит!");
    }

    @Override
    public void swim() {
        System.out.println("Плавец плывет!");
    }



}
