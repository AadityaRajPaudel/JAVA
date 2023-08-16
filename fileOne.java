// write a string in a file
import java.io.* ;

public class fileOne {
    public static void main (String [] args) {
        String s = "Hello this is me" ;
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            byte [] b = s.getBytes() ;
            fos.write(b) ;
            fos.close() ;
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
