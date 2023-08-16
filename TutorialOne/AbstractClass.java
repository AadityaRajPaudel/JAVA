abstract class Dog {

    void bark() {
        System.out.println("Dog barked");
    }

    abstract void Sing() ;

}

class Retriever extends Dog {
    public void Sing() {
        System.out.println("Retriever can sing");
    }
}

public class AbstractClass{
    public static void main (String [] args){
        Retriever r = new Retriever();
        r.Sing();
        r.bark();
    }
    
}
