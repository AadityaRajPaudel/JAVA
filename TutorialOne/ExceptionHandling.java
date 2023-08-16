import java.util.Scanner ;
/*
 Exceptions - They are the events that occur during program execution that disrupts the normal flow of program. 
 Throwable (Superclass of exceptions and errors)
 
 Types of exceptions: Checked(Compile time) and Unchecked(Runtime) Exceptions
 Checked exception: IO, SQL, ClassNotFound
 Unchecked: NumberFormatException, ArithmeticException, NullPointerException, InputMismatchException,   IndexOutOfBoundsException (Array, String), 
 Errors: OutOfMemoryError, VirtualMachineError, StackOverflowError

 try, catch, finally, throw(to explicitly throw an exception eg. Custom Exception), throws
 */



public class ExceptionHandling {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in) ;
        try {
            int a = 5/0 ; // AE
            String s = "Tree" ;

            int b = Integer.parseInt(s) ; // NFE

            int c = scan.nextInt() ; // if anything except int given, IME is thrown

            int [] arr = {1, 2, 3} ;
            System.out.println(arr[3]); // AIOBE

        } catch (ArithmeticException ae) {
            ae.getMessage();
        } catch (NumberFormatException nfe) {
            nfe.getMessage();
        }
    }    
}
