package lesson_43;

public class EmailValidateException extends Exception{

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "EmailValidateException | " + super.getMessage();
    }


}
