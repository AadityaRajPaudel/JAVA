// to ask confirmation while closing
import java.awt.event.*;
import javax.swing.*;

public class OptionPaneClosing implements WindowListener{
    JFrame f ;
    public OptionPaneClosing(){
        f = new JFrame ("Closer");
        f.setSize(400, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(this);
    }

    public static void main (String [] args) {
        new OptionPaneClosing();
    }

    public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(f, "Confirm Exit?", "Title", JOptionPane.YES_NO_OPTION);
        if (choice == 0) {
            System.exit(0);
        }else {

        }
        

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
    }

    

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
    }
}
