package HomeWork24.Task_02_2;

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
        PaymentSystem bank = new BankAccount("Bunk o liberty", 5000);
        System.out.println(bank.withdrawMoney(1000));
        System.out.println(bank);

        bank.withdrawMoney(1_000_000);

        System.out.println("\n=========================\n");
        PaymentSystem bank2 = new BankAccount("Bunk Alpha", 5000);
        bank2.transferMoney(14000, bank2);
        System.out.println(bank);
        System.out.println(bank2);
        System.out.println("\n=========================\n");

        PaymentSystem wallet = new BankAccount("Crypto Wallet", 3);
        wallet.transferMoney(1, bank);
        System.out.println("||"+bank);
        System.out.println(bank2);

        }
}
