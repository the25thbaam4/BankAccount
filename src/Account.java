import java.awt.event.ActionListener;

public class Account extends BankAccount{
    private double fee = -9.90;
    private double interest = 0.01;
//%9s      %9s     %9s     %9s\n"

    public Account (){

    }

    public Account (int accountNumber, String accountHolder, double balance){
        super(accountNumber,accountHolder, balance);

    }
    @Override
    public ActionListener withdraw(double amount) {
        if (balance > 0 | balance > amount){
            balance -= amount;
            System.out.println(balance);
        }
        else {
            System.out.println("insufficient funds");
        }
        return null;
    }

    @Override
    public ActionListener deposit(double amount) {
        if (amount < 0){
            System.out.println("Negative amounts can not be deposited!");
        }
        else {
            balance += amount;
            System.out.println(balance);
        }

        return null;
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
