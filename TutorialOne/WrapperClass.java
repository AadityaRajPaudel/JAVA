public class WrapperClass {
    public static void main (String [] args) {
        
        // Autoboxing
        int a = 10 ;
        Integer i = a ;
        System.out.println(i.intValue()); // prints 10 

        // Unboxing
        Integer p = 10 ;
        int q = p.intValue() ;
        System.out.println(q); // prints 10

    }
}
