public class Employee {
    int id, mSal ;
    String name, post ;
    public Employee (String name, String post, int id, int mSal) {
        this.name = name ; this.post = post; this.id = id; this.mSal = mSal ;
    }
    public int getYearlySalary() {
        return (this.mSal*12) ;
    }
    public String toString() {
        String s = "\nName = "+this.name+", Post = "+this.post+", ID = "+this.id+", Salary = "+getYearlySalary();
        return s ;
    }
}

class Teacher extends Employee {
    int nSub ;
    public Teacher (String name, String post, int id, int mSal, int nSub) {
        super(name, post, id, mSal) ;
        this.nSub = nSub ;
    }
    public int getYearlySalary() {
        return super.getYearlySalary()+ nSub*1000 ; // note: 'super' here, not 'this'
    }
    public String toString(){
        String s = super.toString() + "nsub = "+this.nSub ; // to be noted 
        return s ;
    }
    public static void main (String [] arg) {
        Teacher t = new Teacher("Hari", "mgrq", 12, 100, 3) ;
        System.out.println(t.toString());
    }
}
