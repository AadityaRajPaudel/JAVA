// Basic use of constructor to initialize Employee details and use toString() to override


public class Employee {
    int id ;
    String name ;
    String post ;
    int salary ;

    public Employee(String name, int id, String post, int salary) {
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
        this.post = post ;
    }

    @Override
    public String toString() {
        String s = "Name = "+this.name+" ID = "+this.id+" Salary = "+this.salary+" Post = "+this.post ;
        return s ;
    }

    public static void main (String [] args) {
        Employee e = new Employee("Messi", 10, "GOAT", 101010);
        System.out.println(e.toString());
    }
}
