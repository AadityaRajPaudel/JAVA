
import java.awt.event.*;

import javax.swing.* ;

public class addSubtractGUI implements ActionListener {

    JFrame f ;
    JTextField t1, t2, t ;
    JButton ad, sub ;

    public addSubtractGUI(){
        f = new JFrame("Color change Application") ;
        f.setSize(500, 600) ;

        t1 = new JTextField() ;
        t1.setBounds(100, 60, 200, 60) ;
        t2 = new JTextField() ;
        t2.setBounds(100, 150, 200, 60) ;
        t = new JTextField() ;
        t.setBounds(100, 250, 200, 60) ;

        ad = new JButton ("Add") ;
        ad.setBounds(100, 350, 80, 60) ;
        sub = new JButton ("Subtract") ;
        sub.setBounds(100, 450, 80, 60) ;

        f.add(t1); f.add(t2); f.add(ad); f.add(sub); f.add(t);
        t.setEditable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ad.addActionListener(this);
        sub.addActionListener(this);

    }

    public static void main(String [] args) {
        new addSubtractGUI();
    }
    public void actionPerformed(ActionEvent e) {
        String first = t1.getText();
        String second = t2.getText();
        int n1 = Integer.parseInt(first);
        int n2 = Integer.parseInt(second);
        int result = 0 ;
        if (e.getSource() == ad) { // imp -> syntax
            result = n1 + n2 ;
        }
        else { result = n1-n2 ; }
        t.setText(""+result); // imp -> format i.e use of ""
    }
}
