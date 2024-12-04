package HomeWork24.Task_02;

public class ElectronicWallet implements PaymentSystem{

    private double balance;

    public ElectronicWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств на счету.");
        }else{
            balance -= amount;
            System.out.println("Снято: " + amount + " долларов. Текущий баланс: " + balance + " долларов.");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Зачислено: " + amount + " долларов. Текущий баланс: " + balance + " долларов. ");
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
        return balance + " долларов";
    }
}
