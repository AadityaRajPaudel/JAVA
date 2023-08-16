import java.awt.event.* ;
import javax.swing.JOptionPane;

public class OptionPane {

    public static void main (String []args) {
        // JOptionPane.showMessageDialog(null, "Message", "Title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showInputDialog(null, "Enter the name:");
        // JOptionPane.showConfirmDialog(null, "Enter the name:", "Title", JOptionPane.YES_NO_OPTION);
    }
}
