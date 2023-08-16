
import java.awt.event.* ;
import java.awt.* ;


public class InOutMouse implements MouseListener, MouseMotionListener{
    Frame f ;
    TextField t1, t2 ;

    public InOutMouse() {
        f = new Frame("Mouse Check");
        f.setSize(500, 500);

        t1 = new TextField();
        t2 = new TextField();
        t1.setBounds(100, 100, 200, 50);
        t2.setBounds(100, 200, 200, 50);
        t1.setEditable(false);
        t2.setEditable(false);

        f.setLayout(null) ;
        f.add(t1);
        f.add(t2);
        f.setVisible(true);
        
        
        f.addMouseListener(this);
        f.addMouseMotionListener(this);

    }
    public static void main (String [] args) {
        new InOutMouse();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        String s ;
        s = "X: "+ e.getX() + " Y:"+e.getY();
        t1.setText(s);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
       
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
       
    }
    @Override
    public void mouseEntered(MouseEvent e) {
       t2.setText("Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
       t2.setText("Exited");
    }
}
