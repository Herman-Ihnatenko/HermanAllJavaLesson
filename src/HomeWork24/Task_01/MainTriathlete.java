package HomeWork24.Task_01;

/*Task 1
Создайте интерфейсы Swimmer и Runner с методами swim() и run() соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */

public class MainTriathlete {
    public static void main(String[] args) {
        Runner runner = new Triathlete();
        runner.run();

        Swimmer swimmer = new Triathlete();
        swimmer.swim();
    }
}
