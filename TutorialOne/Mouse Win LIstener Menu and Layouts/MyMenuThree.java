
// 2020 fall 2a, menu pop up and display which item is selected
import java.awt.event.*;
import javax.swing.*;

public class MyMenuThree implements MouseListener, ActionListener{
    JFrame f ;
    JTextField t ;
    // JMenuBar b;
    JMenu menu ;
    JMenuItem itemOne, itemTwo ;

    public MyMenuThree() {
        f = new JFrame ("MenuThree");
        f.setSize(500, 600);

        t = new JTextField() ;
        t.setBounds(100, 100, 200, 50);

        // b = new JMenuBar();
        // f.setJMenuBar(b);
        menu = new JMenu("Menu");
        f.add(menu);

        itemOne = new JMenuItem("Item One");
        menu.add(itemOne);
        itemTwo = new JMenuItem("Item Two");
        menu.add(itemTwo);
        f.setLayout(null);
        f.setVisible(true);

        f.addMouseListener(this);

        itemOne.addActionListener(this);
        itemTwo.addActionListener(this);
    }
    public static void main (String [] args) {
        new MyMenuThree();
    }
    public void actionPerformed(ActionEvent e ){
        // if (e.getSource() == itemOne) t.setText("Item one Selected");
        // else if (e.getSource() == itemTwo) t.setText("Item two Selected");
        String s = e.getActionCommand() ;
        t.setText("Item Selected: "+s);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // menu.show(f, e.getX(), e.getY()); this shows error but is correct
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
