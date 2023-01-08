

public abstract class BankAccount {
    private int accountNumber;
    protected double balance;


    private double interest;
    private int numberOfCards;
    private static int numberOfAccounts = 1;

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }


    public int getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public BankAccount() {
    accountNumber = numberOfAccounts++;
    }





}