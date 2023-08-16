// Anonymus Class

interface Dog {
    void bark() ;
}

public class AnonymusClass{
    public static void main( String [] args) {
        Dog d = new Dog() {
            public void bark() {
                System.out.println("Vau vau");
            }
        };
        d.bark();

    }
}
