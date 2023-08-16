import java.io.* ;


public class displayUserData {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("05_UserData.txt") ;
        DataInputStream dis = new DataInputStream(fis);

        while (dis.available() > 0) {
            String name = dis.readUTF() ;
            String address = dis.readUTF();
            int salary = dis.readInt();

            if (address.equalsIgnoreCase("argentina")) {
                System.out.println("Name = "+name+" Address = "+address+" Salary = "+salary);
            }
        }
        dis.close() ;
        fis.close() ;
    }
}
