package lesson_28;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;



public class PersonTest {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";

    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet() {
        String validEmail = "valid@test.com";

        person.setEmail(validEmail);

        assertEquals(validEmail, person.getEmail());
        assertNotEquals(startEmail, person.getEmail());
    }

    /*
    1. Берем невалидный email
    2. Устанавливаем его сеттером персону
    3. Ожидаемый результат: invalidEmail установлен не будет
    4.
     */

    // testmail.net
    // test@@mail.net

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    void testInvalidEmailSet(String invalidEmail) {
        person.setEmail(invalidEmail);
        assertNotEquals(invalidEmail, person.getEmail());
        assertEquals(startEmail, person.getEmail());
    }

    static Stream<String> invalidEmailData() {
        return Stream.of(
                "testmail.net",
                "test@@mail.net",
                "test@mai@l.net",
                "test@mailnet",
                "test@mail.net.",
                "test@mailne.t",
                "test@ mail.net",
                "test@ma!il.net",
                "t#est@mail.net",
                "1test@mail.net",
                "_test@mail.net",
                ".test@mail.net",
                "test+1@mail.net"
        );
    }
//////////////////////////////////////////////////HOMEWORK TASK 2///////////////////////////////////////////////////////////////////////////////////
    @Test
    void testValidPasswordSet() {
        String validPassword = "qwerty1Q$";

        person.setPassword(validPassword);

        assertEquals(validPassword, person.getPassword());
    }



    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testInvalidPasswordSet(String invalidPassword) {

        person.setPassword(invalidPassword);

        assertEquals(startPassword, person.getPassword());
        assertNotEquals(invalidPassword, person.getPassword());
    }


    static Stream<String> invalidPasswordData() {
        return Stream.of(
                "Vallied1234",
                "voi$",
                "qwe$",
                "Q$",
                "qwQ$",
                "q",
                "$",
                "",
                "job87"
        );

    }
}
