import java.sql.* ;
// 2022 fall 6b
public class DatabaseTwo {
   public static void main (String [] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/dbname";
        String uname = "root";
        String pw = "abc@123";

        Class.forName ("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection(url, uname, pw);
        Statement stmt = cn.createStatement();
        String q1 = "Select count(roll) from student";
        ResultSet rs = stmt.executeQuery(q1);
        rs.next();
        System.out.println("Count = "+rs.getInt(1));

        String q2 = "Select count(roll) from student";
        ResultSet rs2 = stmt.executeQuery(q2);
        rs2.next();
        System.out.println("Count = "+rs2.getInt(1));

        cn.close();
        
   } 
}
