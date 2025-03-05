package HomeWork42;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserApp {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User(1, "Peter"),
                new User(2, "John"),
                new User(3, "Max"),
                new User(4, "Hanna"),
                new User(1, "Hanna"),
                new User(5, "Marga")
        ));

        Optional<User> userOptional = findUserById(users, 1);
        System.out.println(userOptional);

        System.out.println("\n ===================");
        Optional<User> userOptional2 = findUserById2(users, 1);
        System.out.println(userOptional2);

        System.out.println(users);
    }

    private static Optional<User> findUserById2(List<User> users, int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .peek(System.out::println)
                .peek(user -> user.setName("Hello"))
                .findFirst();
    }

    private static Optional<User> findUserById(List<User> users, int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }



}
