class Employee {
    String name ; int id ; int monthlySalary ;

    public Employee (String name, int id, int monthlySalary) {
        this.name = name; this.id = id ; this.monthlySalary = monthlySalary ;
    }

    public int getYearlySalary() {
        return (this.monthlySalary * 12) ;
    }

    public String toString() {
        String s = "Name = "+this.name+" ID = "+this.id+ " Monthly Salary = "+this.monthlySalary + " Yearly Salary = "+ getYearlySalary() ;
        return s ;
    }
}

class Teacher extends Employee {
    int nSub ;

    public Teacher(String name, int id, int monthlySalary, int nSub) {
        super(name, id, monthlySalary) ;
        this.nSub = nSub ;
    }

    public int getYearlySalary () {
        return (super.getYearlySalary() + nSub*1000) ; // super is used to call parent class constructor or method whenever needed
    }

    public String toString() {
        String s = super.toString() + " Nsub = "+this.nSub ; // point to be noted01215
        return s ;
    }

    
}
public class EmployeeTeacher {
    public static void main (String [] args) {
        Employee e = new Employee("Messi", 10, 11000) ;
        Teacher t = new Teacher("Ronaldo", 7, 20000, 5);
        System.out.println(e.toString());
        System.out.println(t.toString());
    }
}
