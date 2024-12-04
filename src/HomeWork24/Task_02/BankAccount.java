package HomeWork24.Task_02;

public class BankAccount implements PaymentSystem{

    public double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств на счете.");
        }else{
            balance -= amount;
            System.out.println("Снято: " + amount + " евро. Текущий баланс: " + balance + " евро.");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Зачислено: " + amount + " евро. Текущий баланс: " + balance + " евро. ");
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return balance + " евро";
    }
}
