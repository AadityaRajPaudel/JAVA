
// a normal non-functional menu

import javax.swing.*;

public class MyMenuOne {
    JFrame f ;
    JMenuBar b ;
    JMenu file, edit, n ;
    JMenuItem pdf, save, exit ;

    public MyMenuOne(){
        f = new JFrame("MENU");
        f.setSize(500, 600);

        b = new JMenuBar();
        f.setJMenuBar(b); // add menu bar in frame

        file = new JMenu("File");
        b.add(file);
        
        n = new JMenu("New");
        file.add(n);

        edit = new JMenu("Edit");
        b.add(edit);

        pdf = new JMenuItem("PDF");
        n.add(pdf);

        save = new JMenuItem("Save");
        file.add(save);

        file.addSeparator(); // adds separator line

        exit = new JMenuItem("Exit");
        file.add(exit);

        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main (String [] args) {
        new MyMenuOne();
    }
}
