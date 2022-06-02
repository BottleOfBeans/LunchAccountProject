package classes;

import classes.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    private JButton valuedGiftButton;
    private JButton processLunchButton;
    private JButton closeAccountsButton;
    private JButton displayAccountsButton;
    private JButton transferFundsButton;
    private JTextPane OutputArea;
    public JPanel mainPanel;
    public cafeteria Cafe = new cafeteria();
    public UI() {
        processLunchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String GivenID = (String)JOptionPane.showInputDialog(
                        new JFrame("Input"),
                        "Enter ID",
                        "Input",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );
                String GivenPrice = (String) JOptionPane.showInputDialog(
                        new JFrame("Input"),
                        "Enter the price",
                        "Input",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );

                int GivenIDPRIME = Integer.parseInt(GivenID);
                double GivenPricePRIME = Double.parseDouble(GivenPrice);
                boolean TransactionValidity = Cafe.processLunch(GivenIDPRIME,GivenPricePRIME);

                OutputArea.setText("Transaction Attempted: "+ TransactionValidity);
            }

        });
        transferFundsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        displayAccountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String GivenID = (String)JOptionPane.showInputDialog(
                        new JFrame("Input"),
                        "Enter ID",
                        "Input",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );

                int GivenIDPRIME = Integer.parseInt(GivenID);
                String OutputInformation = Cafe.displayAccount(GivenIDPRIME);
                OutputArea.setText(OutputInformation);
            }
        });
        closeAccountsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        valuedGiftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
