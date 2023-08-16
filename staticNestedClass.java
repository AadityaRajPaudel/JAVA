// Static nested class

public class staticNestedClass {
    static int value = 10 ;
    class Inner {
        void show (){
            System.out.println(value);
        }
    }
    public static void main (String [] args) {
        staticNestedClass.Inner obj = new staticNestedClass.Inner() ;
        obj.show();
    }
}

