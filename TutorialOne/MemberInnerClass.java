// Nested Class - Static and Non-Static(Inner class)
// Member Inner class, Local Inner Class, Anonymus Class

class Outer {
    private int a = 10 ;
    class Inner {
        void disp(){
            System.out.println(a);
        }
    }
}

public class MemberInnerClass {
    public static void main (String [] args) {
        Outer out = new Outer() ;
        Outer.Inner in = out.new Inner();
        in.disp();
    }
}
