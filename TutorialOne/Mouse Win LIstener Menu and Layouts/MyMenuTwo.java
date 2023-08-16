
import java.awt.event.*;
import javax.swing.* ;

// menu bar + functional
public class MyMenuTwo implements ActionListener{ 
    JFrame f ;
    JMenuBar b ;
    JMenu menu ;
    JMenuItem selectAll, cut, copy, paste, exit ;
    JTextField t ;

    public MyMenuTwo(){
        f = new JFrame("MenuMenu");
        f.setSize(500, 600);

        t = new JTextField();
        t.setBounds(100, 100, 200, 50);

        b = new JMenuBar();
        f.setJMenuBar(b);
        menu = new JMenu("Menu");
        b.add(menu);

        selectAll = new JMenuItem("Select All");
        menu.add(selectAll);
        cut = new JMenuItem("Cut");
        menu.add(cut);
        copy = new JMenuItem("Copy");
        menu.add(copy);
        paste = new JMenuItem("Paste");
        menu.add(paste);
        menu.addSeparator();
        exit = new JMenuItem("Exit");
        menu.add(exit);

        f.setLayout(null);
        f.add(t);
        f.setVisible(true);

        selectAll.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);

    }
    public static void main (String [] args){
        new MyMenuTwo();
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectAll) {
            t.selectAll();
        }
        else if (e.getSource() == cut) t.cut();
        else if (e.getSource() == copy) t.copy();
        else if (e.getSource() == paste) t.paste();
        else {System.exit(0);}
    }
}
