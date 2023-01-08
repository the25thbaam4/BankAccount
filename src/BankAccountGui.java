import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class BankAccountGui implements ActionListener {

    JFrame frame;
    JTextArea inputAmount;

    JTextArea inputAccountNumber;
    JButton withdrawButton;
    JButton depositButton;
    JButton transferButton;
    JButton displayButton;
    JButton payFeeButton;
    JButton interestButton;

    private final int[] accountNumber = new int[10];

    private double balance = 0;
    private final double interest = 1.99;
    private final double fee = 2.99;


    public BankAccountGui (){
        super();

         frame = new JFrame();
         inputAmount = new JTextArea("Enter Amount",1,1 );
         inputAccountNumber = new JTextArea("Enter Account Nr.",1,1);

        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");
        transferButton = new JButton("Transfer");
        displayButton = new JButton("Display Balance");
        payFeeButton = new JButton("pay fee");
        interestButton = new JButton("Add Interest");

        JLabel label = new JLabel();
        JPanel panel = new JPanel();





        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(6,3, 2,4));
        panel.add(inputAmount);
        panel.add(inputAccountNumber);

        panel.add(withdrawButton);
        panel.add(depositButton);
        panel.add(transferButton);
        panel.add(displayButton);
        panel.add(payFeeButton);
        panel.add(interestButton);
        panel.add(label);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bank Account");
        frame.pack();
        frame.setVisible(true);







        withdrawButton.addActionListener(e -> {
          String str =  inputAmount.getText();
           int input = Integer.parseInt(str);
                    if (balance > 0 && balance > input) {
                        balance -= input;
                        System.out.printf("new balance after withdrawal  %.2f \n",balance);
                    } else {
                        System.out.println("insufficient funds");
                    }

                }
                );
        depositButton.addActionListener(e -> {
            String str =  inputAmount.getText();
            int input = Integer.parseInt(str);
            if (input < 0) {
                System.out.println("Negative amounts can not be deposited!");
            } else {
                balance += input;
                System.out.printf("\nNew balance after deposit %.2f \n",balance);
            }
        });

        transferButton.addActionListener(e -> {

        });

        interestButton.addActionListener(e -> {
                    balance += interest;
                    System.out.println("Balance after receiving interest " + balance);
                });

        payFeeButton.addActionListener(e -> {
            balance -= fee;
            System.out.println("Balance after paying fee " + balance);
        });


        displayButton.addActionListener(e -> System.out.println("Current Balance " +balance));


    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
