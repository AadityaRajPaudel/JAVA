public class ExceptionHandling {
    public static void main (String [] args) {
        try {
            int n = Integer.parseInt("pants") ;
            System.out.println("This wont run if exception is found, else runs");
        }
        catch (NumberFormatException | NullPointerException nfe) { // '|' is either or for multiple exception 
            System.out.println("Can't be a string");
        }
        finally {
            System.out.println("Finally block always runs no matter what");
        }
    }
}
