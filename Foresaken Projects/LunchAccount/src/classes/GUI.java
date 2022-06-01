package classes;
import JFrame.*;

public class GUI{
    public GUI(){
        JFrame frame = new JFrame();
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        frame.add(panel, BorderLayout.CENTER);
        frame.set(setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE));
        frame.setTitle("Cafeteria");
        frame.pack();
        frame.setVisible(true);

    }
}