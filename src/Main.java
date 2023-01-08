import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //  new BankAccountGui();

        ArrayList <BankAccount> arrayList = new ArrayList<>();

        NormalAccount pa = new NormalAccount(122);
        System.out.println(pa);
        PremiumAccount pa1 = new PremiumAccount(1020);
        System.out.println(pa1);

        pa1.transfer(250, pa);

        arrayList.add(pa1);
        System.out.println(arrayList.get(0));
    }

}