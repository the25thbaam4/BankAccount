public abstract class BankAccount {

    private int accountNumber;
    protected double balance;
    private String accountHolder;

    public BankAccount(){
    }

    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber =accountNumber;
        this.accountHolder = accountHolder;
        balance = 0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance(){
        return this.balance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
    public abstract void transfer(double amount, int accountNumber);
    public abstract void payFee(double amount);
    public abstract void recieveInterest (double amount);


}