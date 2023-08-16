import java.util.Scanner; // we can then use the Scanner class to create a scanner object

public class Firstt {
   
        public static void main (String [] args) {

            //Basics of variables and datatypes

            System.out.println("Hello world!!") ; // println hits enter after string is printed
            System.out.print("\"This is a quote\"");
            int x ; //declaration
            x = 123 ; // assignment
            int y = 123 ; // initialization
            System.out.println("My number is: "+ x);
            long l  = 98472348234987L ; // uses L in last
            float f = 4.2f ;
            double d = 4.3242334234 ;
            boolean z = true ; // or false
            char symbol = '@' ;
            String str = "Your name" ; // S capital for reference datatype
            System.out.println(z);

            //swap strings
            String x1 = "Water" ;
            String y1  = "Cool" ;
            String temp = null ;
            temp = x1 ;
            x1 = y1 ;
            y1 = temp ;

            // accept user input
            Scanner scanner = new Scanner(System.in) ;
            System.out.println("What is your name?");
            String name = scanner.nextLine() ;

            System.out.print("Your name is: "+name);
        }
    
}
