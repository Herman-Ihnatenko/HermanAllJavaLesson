package HomeWork22.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Обычный человек бежит: ");
        Human human = new Human();
        human.run();
        System.out.println("\n====================================\n");
        System.out.println("Любитель бежит: ");
        AmateurAthlete amateurAthlete = new AmateurAthlete();
        amateurAthlete.run();
        System.out.println("\n====================================\n");
        System.out.println("И профи: ");
        ProfessionalAthlete professionalAthlete = new ProfessionalAthlete();
        professionalAthlete.run();


    }
}
