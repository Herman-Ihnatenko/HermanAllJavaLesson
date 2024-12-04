package HomeWork24.Task_02;
/*Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.
 */
public class BankApp {
    public static void main(String[] args) {
        PaymentSystem bankAccount = new BankAccount(1000.0);
        System.out.println("Первоначально на счету было: " + bankAccount);
        bankAccount.depositTransfer(200.0);
        bankAccount.withdrawMoney(50.0);
        System.out.println("Баланс банкового счета: " + bankAccount.checkBalance() + " евро.");

        System.out.println("\n=========================\n");

        PaymentSystem electronicWallet = new ElectronicWallet(500.0);
        System.out.println("Первоначально на счету было: " + electronicWallet);
        electronicWallet.depositTransfer(100.0);
        electronicWallet.withdrawMoney(600.0);
        System.out.println("Баланс електронного кошелька: " + electronicWallet.checkBalance() + " долларов.");
    }
}
