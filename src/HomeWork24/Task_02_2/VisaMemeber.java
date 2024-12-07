package HomeWork24.Task_02_2;

public abstract class VisaMemeber implements PaymentSystem{
    private final String currency;

    private double courseBTC;
    protected String title;
    protected double balance;

    public VisaMemeber(String title, double balance, String currency) {
        this.title = title;
        this.balance = balance;
        this.currency = currency;
        setActualBTCCourse(currency);
    }

    public void setActualBTCCourse(String currency){
        this.courseBTC = 100_000;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCourseBTC() {
        return courseBTC;
    }

    public void setCourseBTC(double courseBTC) {
        this.courseBTC = courseBTC;
    }

    public String getCurrency() {
        return currency;
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
