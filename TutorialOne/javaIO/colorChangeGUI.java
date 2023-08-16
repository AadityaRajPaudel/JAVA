import javax.swing.* ;

import java.awt.*;
import java.awt.event.* ;

public class colorChangeGUI implements ActionListener{
    
    JFrame f ;
    JTextField t ;
    JButton b ;

    public colorChangeGUI() {

        f = new JFrame("Color change Application") ;
        f.setSize(500, 600) ;

        t = new JTextField() ;
        t.setBounds(100, 150, 200, 60) ;

        b = new JButton ("Click to change!") ;
        b.setBounds(100, 250, 200, 60) ;

        f.add(t); f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null) ; // this has to be before setVisible else it will get overriden
        f.setVisible(true);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String text = t.getText();
        if ((text != null)) {
            t.setText(text.toUpperCase());
        }
        t.setBackground(Color.PINK); // background of text field
        t.setForeground(Color.BLUE); // color of text
    }

    public static void main(String [] args) {
        new colorChangeGUI();
    }
}
