
import java.awt.event.*;
import javax.swing.* ;

public class CircleArea implements ActionListener{

    JFrame f ;
    JButton b ;
    JTextField t1, t2 ;

    public CircleArea(){
        f = new JFrame("Circle Area Calculator");
        f.setSize(600, 500);

        b = new JButton("Click");
        b.setBounds(100, 400, 100, 50);

        t1 = new JTextField();
        t2 = new JTextField();
        t1.setBounds(100, 50, 100, 50);
        t2.setBounds(100, 150, 100, 50);
        t2.setEditable(false);

        f.setLayout(null);
        f.add(b);
        f.add(t1);
        f.add(t2);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b.addActionListener(this);
    }

    public static void main (String [] args) {
        new CircleArea();
    }

    public void actionPerformed(ActionEvent e) {
        String s = t1.getText();
        float f = Float.parseFloat(s);
        f = (3.14f * f * f) ;
        t2.setText(""+f);
    }
}
