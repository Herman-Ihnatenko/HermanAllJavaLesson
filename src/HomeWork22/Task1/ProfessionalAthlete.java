package HomeWork22.Task1;

public class ProfessionalAthlete extends Human{
    @Override
    public void run(){
        System.out.println(25+" км./ч.");
        printRestTime();
    }

    protected void printRestTime() {
        System.out.println("нужно 5 минут отдыха");
    }



}
