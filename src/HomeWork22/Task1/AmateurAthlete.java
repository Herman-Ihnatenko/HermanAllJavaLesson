package HomeWork22.Task1;


public class AmateurAthlete extends Human {
    @Override
    public void run(){
        System.out.println(15+" км./ч.");
        printRestTime();
    }

    protected void printRestTime() {
        System.out.println("нужно 10 минут отдыха");
    }
}
