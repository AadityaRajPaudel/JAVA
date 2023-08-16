// Buffering is much faster than file streams
import java.io.* ;


public class copyFileBuffering {
    public static void main (String [] args) {
        try {
            FileInputStream fis = new FileInputStream("02_Sample.txt"); // kun bata read garni
            FileOutputStream fos = new FileOutputStream("04_BufferCopy.txt"); // where to write
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int i;
            while ((i=bis.read())!= -1) {  // bis instead of fis
                bos.write((char)i); // bos instead of fos
            }
            bos.close();
            bis.close();
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
