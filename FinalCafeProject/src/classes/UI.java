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
    public cafeteria Cafe = new cafeteria();
    public UI() {

        JFrame frame = new JFrame("Main");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        processLunchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int GivenID = (int)JOptionPane.showInputDialog(
                        new JFrame("Input"),
                        "Enter ID",
                        "Input",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );
                double GivenPrice = (double) JOptionPane.showInputDialog(
                        new JFrame("Input"),
                        "Enter the price",
                        "Input",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        ""
                );
                boolean TransactionValidity = Cafe.processLunch(GivenID,GivenPrice);
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
