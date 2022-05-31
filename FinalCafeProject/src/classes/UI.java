package classes;

import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.intellij.uiDesigner.core.*;

public class UI {
    public UI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - BottledDucks
        var panel1 = new JPanel();
        var label1 = new JLabel();
        OutputArea = new JTextPane();
        closeAccountInputIDButton = new JButton();
        displayAccountsInputNullButton = new JButton();
        transferFundsInputRecpientButton = new JButton();
        processLunchInputIDButton = new JButton();
        valuedGiftInputNullButton = new JButton();
        ProcessLunchInput = new JTextField();
        TransferFundsInput = new JTextField();
        DisplayAccountInput = new JTextField();
        CloseAccountInput = new JTextField();
        ValuedGiftInput = new JTextField();

        //======== panel1 ========
        {
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
            .border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder
            .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog",java.
            awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
            ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}})
            ;
            panel1.setLayout(new GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));

            //---- label1 ----
            label1.setText("Output:");
            panel1.add(label1, new GridConstraints(0, 0, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_FIXED,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- OutputArea ----
            OutputArea.setText("");
            panel1.add(Out  putArea, new GridConstraints(0, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                null, new Dimension(150, 50), null));

            //---- closeAccountInputIDButton ----
            closeAccountInputIDButton.setText("Close Account | Input: ID To Close");
            panel1.add(closeAccountInputIDButton, new GridConstraints(4, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- displayAccountsInputNullButton ----
            displayAccountsInputNullButton.setText("Display Accounts | Input: Null");
            panel1.add(displayAccountsInputNullButton, new GridConstraints(3, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- transferFundsInputRecpientButton ----
            transferFundsInputRecpientButton.setText("Transfer Funds | Input: Recpient ID, Reciver ID");
            panel1.add(transferFundsInputRecpientButton, new GridConstraints(2, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- processLunchInputIDButton ----
            processLunchInputIDButton.setText("Process Lunch | Input: ID, Price");
            panel1.add(processLunchInputIDButton, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- valuedGiftInputNullButton ----
            valuedGiftInputNullButton.setText("Valued Gift | Input: Null");
            panel1.add(valuedGiftInputNullButton, new GridConstraints(5, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- ProcessLunchInput ----
            ProcessLunchInput.setText("");
            panel1.add(ProcessLunchInput, new GridConstraints(1, 0, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- TransferFundsInput ----
            TransferFundsInput.setText("");
            panel1.add(TransferFundsInput, new GridConstraints(2, 0, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- DisplayAccountInput ----
            DisplayAccountInput.setText("");
            panel1.add(DisplayAccountInput, new GridConstraints(3, 0, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- CloseAccountInput ----
            CloseAccountInput.setText("");
            panel1.add(CloseAccountInput, new GridConstraints(4, 0, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));

            //---- ValuedGiftInput ----
            ValuedGiftInput.setText("");
            panel1.add(ValuedGiftInput, new GridConstraints(5, 0, 1, 1,
                GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_FIXED,
                null, null, null));
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - BottledDucks
    private JTextPane OutputArea;
    private JButton closeAccountInputIDButton;
    private JButton displayAccountsInputNullButton;
    private JButton transferFundsInputRecpientButton;
    private JButton processLunchInputIDButton;
    private JButton valuedGiftInputNullButton;
    private JTextField ProcessLunchInput;
    private JTextField TransferFundsInput;
    private JTextField DisplayAccountInput;
    private JTextField CloseAccountInput;
    private JTextField ValuedGiftInput;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
