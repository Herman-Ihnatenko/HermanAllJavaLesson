package HomeWork24.Task_02_2;

public interface PaymentSystem {

    boolean transferMoney(double amount, PaymentSystem reciple);

    boolean withdrawMoney(double amount);
    void depositTransfer(double amount);
    double checkBalance();

    String getCurrency();
    String getTitle();


}
