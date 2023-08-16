// A simple Student class to take input through constructor and display the details

public class StudentBasic {

    private String name ;
    static String college = "NCIT" ;
    private int roll ;

    public StudentBasic(String name, int roll) {
        this.name = name ; this.roll = roll ;
    }

    public void display() {
        System.out.println("Name = "+this.name + "Roll = "+this.roll+ "College = "+this.college);
    }
    public static void main (String [] args) {
        StudentBasic s = new StudentBasic("Aaditya", 3) ;
        s.display();
        StudentBasic ss = new StudentBasic("Messi", 10) ;
        ss.college = "NEC" ;
        ss.display();
    }
}
