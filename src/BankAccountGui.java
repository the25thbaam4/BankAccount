import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BankAccountGui extends Account implements ActionListener {

    JFrame frame;
    JTextArea inputAmount;
    JTextArea inputAccountNumber;
    JButton button;
    JButton button2;
    public BankAccountGui (){
        super();

         frame = new JFrame();
         inputAmount = new JTextArea(1,1);
         inputAccountNumber = new JTextArea(1,1);
        button = new JButton("Withdraw");
         button2 = new JButton("Deposit");
        JButton button3 = new JButton("Transfer");
        JButton button4 = new JButton("Display Balance");
        JButton button5 = new JButton("pay fee");
        JButton button6 = new JButton("Add Interest");

        button.addActionListener(this);


        JLabel label = new JLabel("Number of clicks: 0");
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(6,3, 2,4));
        panel.add(inputAmount);
        panel.add(inputAccountNumber);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(label);



        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bank Account");
        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    button.addActionListener(withdraw(12));
    button2.addActionListener(deposit(500));
    }
}
