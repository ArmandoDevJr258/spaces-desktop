
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main{
    public static void main(String[] args) {
        
        //imports
        JFrame frame = new JFrame();
        JPanel pnl = new JPanel();
        JButton btn = new JButton();
        JLabel lbl =new JLabel();


        //main code
        frame.setBounds(0,0,600,500);
        frame.add(pnl);
        pnl.setLayout(null);
        pnl.setBackground(Color.CYAN);


    }
}