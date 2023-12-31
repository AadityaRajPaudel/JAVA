// class SemesterException extends Exception {
//     public SemesterException(String msg) {
//         super(msg);
//     }
// }

// class Student {
//     int sem ;
//     String name ;
//     public Student (String name, int sem) throws SemesterException{
//         if (sem < 1 || sem > 8) {
//             throw new SemesterException("Invalid sem") ;
//         }
//         this.name = name ;
//         this.sem = sem ;
//     }
// }


// public class ownException {
//     public static void main (String [] args) {
//         try {
//             Student s = new Student("Ram", -2) ;
//         }
//         catch (SemesterException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

class SemesterException extends Exception {
    public SemesterException (String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int sem ;
    public Student (String name, int sem) throws SemesterException {
        if (sem < 1 || sem > 8) {
            throw new SemesterException("Invalid sem") ;
        }
        this.name = name ;
        this.sem = sem ;
    }
}
class ownException {
    public static void main (String [] args) {
        try {
        Student s = new Student("Abc", 12) ;
        }
        catch (SemesterException e) {
            System.out.println(e.getMessage());;
        }
    }
}