package HomeWork_23.Task_02;

public class MainGame {
    public static void main(String[] args) {
        GameCharacter[] characters = {
                new Warrior(),
                new Mage(),
                new Archar()
        };

        for (GameCharacter character : characters) {
            character.attack();
        }
    }
}
