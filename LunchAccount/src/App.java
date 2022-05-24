import classes.lunchAccount;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        lunchAccount Josh = new lunchAccount(100, 13482, true);
        lunchAccount Will = new lunchAccount(100,13157,true);

        MainMenu();

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

    public static void MainMenu(){

        //Setting it all up
        JFrame frame = new JFrame("Demo program for JFrame");
        frame.setLayout(null);
       
        //Adding text feild
        JTextField textFieldUserName = new JTextField(50);
        frame.add(textFieldUserName);

        //Adding a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuFile.add(menuItemExit);
        menuBar.add(menuFile);

        // adds menu bar to the frame
        frame.setJMenuBar(menuBar);

        //Setting the close operation
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //What to do on exits
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Turning it on
        frame.setSize(300, 200);
        frame.setVisible(true);

        //Setting Window Settings
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocation(100, 100);

        //Pass an object
        frame.setBounds(new java.awt.Rectangle(100, 100, 300, 400));
        frame.pack();

        //Virus mode enable.
        frame.setAlwaysOnTop(true);

    }


}

