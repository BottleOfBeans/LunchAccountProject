import classes.lunchAccount;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        lunchAccount Josh = new lunchAccount(100, 13482, true);
        lunchAccount Will = new lunchAccount(100,13157,true);

        Will.Display();
        Josh.Display();
        Will.lendMoney(100, Josh);
        Josh.Display();
        Will.Display();
        
        
    }

    public class SwingJFrameDemo extends javax.swing.JFrame {
        public SwingJFrameDemo() {
            super("Demo program for JFrame");
        }
    }

    public static void MM(){
        JFrame frame = new JFrame("Demo program for JFrame");
        frame.setLayout(new GridLayout());
        JTextField textFieldUserName = new JTextField(50);
        frame.add(textFieldUserName);
    }


}

