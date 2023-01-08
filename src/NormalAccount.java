public class NormalAccount extends BankAccount {
    private static String accountType = "Normal";
    private double gift = 5000;

    public NormalAccount (double balance){
        super();
        this.setBalance(balance+500);
        this.setInterest(2);
        gift-=500;
    }

    public double getGift(){
        System.out.println("Amount remaining from offer: " + gift);
        return gift;
    }
@Override
    public String toString(){
        return "Account Type: "+ accountType+ ", Account Number: " + this.getAccountNumber() + ", Balance: " + this.getBalance() +", Interest: " + this.getInterest();
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
