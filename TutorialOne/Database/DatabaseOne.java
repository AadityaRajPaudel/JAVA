/*
 SQL commands

    select * form student
    select * from student where id = "2"
    select name from student
    select count(roll) from student
    select avg(marks) from student
    select distinct(name) from student

    delete from student where id = "2"
    insert into student values (1, "Name", "Faculty", 98)
    create table student (roll int, name varchar(20), faculty varchar(20), marks int)
    update student set marks = "99" where id = "1"

    for anythng except in select, int i = stmt.executeUpdate(q); is used to count the numebr of rows affected

 */
import java.sql.*; 

public class DatabaseOne {

    public static void main (String [] args) {

        String url = "jdbc:mysql://localhost:3306/aaditya";
        String uname = "root";
        String pw = "pw@123";

        
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection(url, uname, pw);
                Statement stmt = cn.createStatement();
                String q = "select * from student";
                ResultSet rs = stmt.executeQuery(q);
                while(rs.next()) {
                System.out.println("Name = "+rs.getString(2)+" Roll = "+rs.getInt(1)+" Faculty = "+rs.getString(3)+" Marks = "+ rs.getInt(4));
                }
            cn.close();
            }catch (SQLException e) { System.out.println(e.getMessage());}
            catch (ClassNotFoundException e) {System.out.println(e.getMessage());}
        

    }
}