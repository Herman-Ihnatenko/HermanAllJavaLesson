package HomeWork24.Task_02_2;

public class BankAccount extends VisaMemeber implements PaymentSystem{

    public BankAccount(String title, double balance) {
        super(title, balance, "Eur");
    }

    @Override
    public String toString() {
        return "BankAccount: {" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                ", currency: " + this.getCurrency() +
                '}';
    }

    @Override
    public boolean transferMoney(double amount, PaymentSystem reciple) {
        if (amount > balance) {
            System.out.println(amount + " | " + balance);
            return false;
        }

        if (reciple.getCurrency().equals("EUR")) {
            balance -= amount;
            reciple.depositTransfer(amount);
            System.out.println("Выполнено: " + amount + " | " + title
                    + reciple.getTitle());
            return true;

        }else if (reciple.getCurrency().equals("BTS")) {
            double amountBTC = amount / getCourseBTC();
            balance -= amount;
            reciple.depositTransfer(amountBTC);

            System.out.println("Выполнено2: " + amount +
                    " | " + amountBTC + " | " + title
                    + reciple.getTitle());
            return true;
        }
        System.out.println("???");
        return false;


    }

    @Override
    public boolean withdrawMoney(double amount) {
        if (amount > balance){
            System.out.println(amount);
            return false;
        }

        balance -= amount;
        System.out.println(amount + " | " + this.getCurrency() + " | " + title);
        return false;
    }

    @Override
    public void depositTransfer(double amount) {
        System.out.println(title + " зачесляем на счет: " + amount + this.getCurrency());
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
