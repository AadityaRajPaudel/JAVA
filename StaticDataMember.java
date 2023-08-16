class Student {
    private String name ;
    private int roll ;
    static String college = "NCIT" ;

    public Student (String name, int roll) {
        this.name = name ; this.roll = roll ;
    }

    public void display() {
        System.out.println("Name = "+this.name+ "\nRoll = "+this.roll+ "\nCollege = "+this.college);
    }
}

public class StaticDataMember {
    public static void main (String [] args) {

        Student s1 = new Student("Abc", 21) ;
        s1.college = "NEC" ;
        s1.display();
}   
}
