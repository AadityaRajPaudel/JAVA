// Local Inner Class

class Outer {
    private int a = 10 ;
    void disp() {
        class Inner {
            void show() {
                System.out.println(a);
            }
        }
        Inner in = new Inner();
        in.show();
    }
}

public class LocalInnerClass {
    public static void main (String [] args) {
        Outer out = new Outer();
        out.disp();
    }
}
