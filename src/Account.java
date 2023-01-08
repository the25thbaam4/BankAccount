import java.awt.event.ActionListener;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private final double fee = 9.90;
    private final double interest = 0.5;
    Scanner sc = new Scanner(System.in);

//%9s      %9s     %9s     %9s\n"

    public Account() {

    }

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;

    }

    public void withdraw(double amount) {
       amount = sc.nextDouble();
        if (balance > 0 && balance > amount) {
            balance -= amount - fee;
            System.out.printf("new balance after withdrawal  %.2f \n",balance);
        } else {
            System.out.println("insufficient funds");
        }

    }


    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("\nNegative amounts can not be deposited!");
        } else {
            balance += amount + interest;

            System.out.printf("\nNew balance after deposit %.2f \n",balance);
        }


    }


    public void transfer(double amount, Account account) {
        if (this.balance < amount){
            System.out.println("Insufficient funds!");
        }
        else {
           this.balance -=amount;
           account.balance += amount;
            System.out.printf("Account %s transferred $ to %.2f \n ", this.accountHolder,this.balance);
        }

    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}