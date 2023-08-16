import java.awt.event.* ;
import javax.swing.* ;
import java.awt.*;


public class colorChangeTwo implements ActionListener {

    JFrame f ;
    JButton b1, b2, b3 ;

    public colorChangeTwo() {
        f = new JFrame("Color changer") ;
        f.setSize(500, 600) ;

        b1 = new JButton("Pink") ;
        b1.setBounds(100, 150, 70, 50);
        b2 = new JButton("Blue") ;
        b2.setBounds(100, 250, 70, 50);
        b3 = new JButton("Red") ;
        b3.setBounds(100, 350, 70, 50);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout( new FlowLayout()); // aligns buttons horizontally
        f.setVisible(true) ;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        b1.setActionCommand("one") ;
        b2.setActionCommand("two") ;
        b3.setActionCommand("three") ;
    }

    public static void main(String [] args) {
        new colorChangeTwo();
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getActionCommand().equals("one")) {
            f.getContentPane().setBackground(Color.PINK); // f.setBackground(Color.PINK) for aws
        }
        else if (e.getSource() == b2) {
            f.getContentPane().setBackground(Color.BLUE);
        }
        else {
            f.getContentPane().setBackground(Color.RED);
        }
    }


}
