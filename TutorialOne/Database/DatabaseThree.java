import java.sql.*;

public class DatabaseThree {
    public static void main (String [] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/dbname";
        String uname = "root";
        String pw = "abc@1234";

        Class.forName("com.mysql.jdbc.Driver");
        Connection cn = DriverManager.getConnection(url, uname, pw);
        Statement stmt = cn.createStatement();
        String q = "SELECT * from Employee where Salary>25000";
        ResultSet rs = stmt.executeQuery(q);
        while (rs.next()) {
            //sysout + rs.getString(1)...
        }
        String q2 = "update student set marks = '100' where id = '2'";
        int i = stmt.executeUpdate(q2);
        //display "records added = i";
        cn.close();
    }
}
