



public class PremiumAccount extends BankAccount {

    private static final String accountType = "Premium";
    private double premiumGift = 10000;

    public PremiumAccount (double balance){
       super();
        this.setBalance(balance+1000);
        this.setInterest(5);
        premiumGift-=1000;
    }


    public double getPremiumGift() {
        System.out.println("Amount of premium offer remaining: ");
        return premiumGift;
    }


    @Override
    public String toString(){
        return "Account Type: " + accountType + ", Account Nr.: " + this.getAccountNumber() + ", Balance: " + this.getBalance() + ", Interest Rate %" +getInterest();
    }
    public void transfer(double amount, BankAccount account) {
        if (this.getBalance() < amount){
            System.out.println("Insufficient funds!");
        }
        else {
            this.balance = balance - amount;
            account.balance += amount;
            System.out.println("This Account: "+ getAccountNumber() +" has transferred " + amount + " Account Nr. " + account.getAccountNumber());
            System.out.println("Balance after Transfer "+ getBalance() + "\nCurrent Balance after Receiving: "+ account.getBalance());
        }

    }

}
