import java.io.* ;

public class readingFromFile {
    public static void main (String [] args) {
        try {
            FileInputStream fis = new FileInputStream ("02_Sample.txt") ;
            int i ;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }
            fis.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
