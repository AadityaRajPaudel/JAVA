import java.io.* ;

public class copyFileContents {
    public static void main(String [] args) {
        try {
            FileInputStream fis = new FileInputStream("02_Sample.txt") ;
            FileOutputStream fos = new FileOutputStream("03_Copy.txt", true);
            int i;
            while ((i = fis.read()) != -1) {
                fos.write((char)i);
            }
            fos.close();
            fis.close();
        }catch(IOException e) {
            System.out.println(e.getMessage()) ;
        }
    }
}
