/*  Strings in JAVA are immutable.
    When a string is declared, a string object of the string's value will be created in string pool. At any instance when a new string variable is declared using same string value, that new variable will point to the pre-existing string object in the string pool unless specified specifically.
 */

public class ImmutableString {
    public static void main (String [] args) {

        String a = "Messi" ; // String pool contains 'Messi'
        String c = "Messi" ; // c points to same string pool object as pointed by a i.e. Messi
        String d = new String ("Messi") ; //creates new string object in string pool named Messi

        System.out.println(a == c); // == checks if both point to same string object in string pool
        System.out.println(c == d);

        System.out.println(a.equals(d)); // checks actual strings not address

    }
}
