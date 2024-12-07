package HomeWork24.Task_02_2;

public class PtcWallet extends VisaMemeber{
    public PtcWallet(String title, double balance) {
        super(title, balance, "BTC");
    }

    @Override
    public String toString() {
        return "BankAccount: {" +
                "title='" + title + '\'' +
                ", balance=" + balance +
                ", currency: " + getCurrency() +
                '}';
    }

    @Override
    public boolean transferMoney(double amount, PaymentSystem reciplent) {
            if (amount > balance) {
                System.out.println(amount + " | " + balance);
                return false;
            }

            if (reciplent.getCurrency().equals("BTC")){
                balance -= amount;
                reciplent.depositTransfer(amount);
            }
            return true;
    }
}
