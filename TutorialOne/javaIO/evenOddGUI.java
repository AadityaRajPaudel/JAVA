
import javax.swing.* ;
import java.awt.event.* ;

public class evenOddGUI implements ActionListener{
    
    JFrame f ;
    JTextField t1, t2 ;
    JButton b ;

    public evenOddGUI() {
        
        f = new JFrame("Test") ;
        f.setSize(500, 600) ;

        t1 = new JTextField();
        t1.setBounds(100, 50, 350, 75);

        t2 = new JTextField();
        t2.setBounds(100, 250, 350, 75) ;

        b = new JButton("Check") ;
        b.setBounds(100, 350, 350, 75 );

        f.add(t1);
        f.add(t2);
        f.add(b);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null) ; // allows absolute positioning supressing default BorderLayout for frame layout manager, else setBounds will have no use if it is not null
        f.setVisible(true) ;
        t2.setEditable(false);

        b.addActionListener(this) ;
    }
    public void actionPerformed(ActionEvent e) {
        String text = t1.getText() ;
        int num = Integer.parseInt(text) ;
        if (num % 2 == 0) {
            t2.setText("Even") ;
        }
        else t2.setText("odd");
    }

    public static void main (String [] args) {
        new evenOddGUI() ;
    }
    
}
