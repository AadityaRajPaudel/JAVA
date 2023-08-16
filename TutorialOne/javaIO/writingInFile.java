// Write á string in a file

import java.io.* ;

class writingInFile {
    public static void main (String [] args) {

        try {
            String msg = "This is a string" ;
            FileOutputStream fos = new FileOutputStream("02_Sample.txt") ; 
            byte [] b = msg.getBytes() ; 
            fos.write(b) ;
            
            fos.close() ;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

// FileOutputStream is used to write binary data to a file (text, audio, images, etc), can also use FileWriter that writes 2 charachers at a time, but not used
/*
    The getBytes() method is called on the msg string to convert it into a byte array b. This is necessary because the write() method of FileOutputStream requires a byte array as its input.
*/
