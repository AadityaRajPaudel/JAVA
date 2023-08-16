import java.awt.event.* ;

import javax.swing.* ;
import java.awt.*;


public class textChangeGUI implements ActionListener{ // if this extends JFrame, all f's should be removed
    JFrame f ;
    JTextField t ;
    JButton b ;
    public textChangeGUI() {
        f = new JFrame("Text change");
        f.setSize(600, 400) ;
        t = new JTextField() ;
        b = new JButton("Click");
        t.setBounds(100, 50, 60, 50);
        b.setBounds(100, 200, 50, 50);
        f.add(t) ; f.add(b) ;
        // f.pack() ; this limits size to fit
        f.setLayout(null) ;
        f.setVisible(true) ;

        
        b.addActionListener(this);
    }

    
    public void actionPerformed (ActionEvent e) {
        Font f = new Font("Arial", Font.BOLD, 20);
        t.setFont(f) ;
        t.setForeground(Color.RED);
    }
    public static void main(String [] args) {
        new textChangeGUI();
    }
}
