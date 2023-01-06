public class Account extends BankAccount{
    private double fee = -9.90;
    private double interest = 0.01;
//%9s      %9s     %9s     %9s\n"
    public Account (int accountNumber, String accountHolder, double balance){
        super(accountNumber,accountHolder, balance);

    }
    @Override
    public void withdraw(double amount) {
        if (balance > 0 | balance > amount){
            balance -= amount;
        }
        else {
            System.out.println("insufficient funds");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0){
            System.out.println("Negative amounts can not be deposited!");
        }
        else {
            balance += amount;

        }

    }

    @Override
    public void transfer(double amount, int accountNumber) {

    }

    @Override
    public void payFee(double amount) {

    }

    @Override
    public void recieveInterest(double amount) {

    }
}
