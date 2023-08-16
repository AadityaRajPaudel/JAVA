class Example {
    static int a = 19 ;

    static class Inside {
        void show(){
            System.out.println(a);
        }
    }
}

public class StaticNestedClass {
    public static void main(String [] args) {
        Example.Inside in = new Example.Inside(); // this is the only different line compared to Member inner class and Static inner class
        in.show();
    }
}
