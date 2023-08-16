// get user data like nme, id, salary and write in a file, prompt user to exit after each user entry

import java.util.* ;
import java.io.* ;

public class writingUserData {
    public static void main (String [] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("05_UserData.txt") ;
        DataOutputStream dos = new DataOutputStream(fos) ;

        int i = 0 ;
        Scanner scan = new Scanner(System.in) ;

        while (true) {
            System.out.println("Enter name: ");
            String name = scan.next() ;
            System.out.println("Enter address: ");
            String address = scan.next() ;
            System.out.println("Enter salary: ");
            int salary = scan.nextInt() ;

            dos.writeUTF(name) ;
            dos.writeUTF(address) ;
            dos.writeInt(salary) ;

            i++ ;
            System.out.println("Enter n to exit else enter any key to continue: ");
            String n = scan.next() ;
            if (n.toLowerCase().startsWith("n")) {
                System.out.println("Records added: "+i);
                break ;
            }
            System.out.println("Records added: "+i);
        }
    }
}
