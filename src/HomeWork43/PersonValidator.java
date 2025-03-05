package HomeWork43;

/**
 * @author Sergey Bugaenko
 * {@code @date} 04.03.2025
 */

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {
        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        // 2. Точка после собаки
        if (email.indexOf('.', indexAt + 2) == -1) throw new EmailValidateException(". after @ error");

        // 3. После последней точки должно быть минимум 2 символа
        if (email.lastIndexOf('.') >= email.length() - 2) throw new EmailValidateException("last . error");


        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (!(Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '_'
                    || ch == '-'
                    || ch == '.'
                    || ch == '@')) { // Символ НЕ подходит
                throw new EmailValidateException("illegal symbol");
            }
        }

        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt == 0) throw new EmailValidateException("@ should not be first");

        if (!Character.isAlphabetic(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

    }

    public static void validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.length() < 8) {
            throw new PasswordValidateException("Password should be at least 8 characters");
        }

        String symbols = "!%$@&*()[]";

        // альтернативный способ объявления пременных
        boolean[] result = new boolean[4]; // false, false

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) result[0] = true;
            if (Character.isUpperCase(ch)) result[1] = true;
            if (Character.isLowerCase(ch)) result[2] = true;
            if (symbols.indexOf(ch) >= 0) result[3] = true;
        }

        if (!result[0] && !result[1] && !result[2] && !result[3]) {
            throw new PasswordValidateException("Password should contain at least one digit, one upper case letter, one lower case letter and one special symbol");
        }
    }


}
