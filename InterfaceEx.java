interface Test {
    int num = 10; // static and final, data members and methods are public by default
    public void disp() ; //cannot have constructors
}

class Two implements Test {
    public static void main (String [] args) {
        Two t = new Two() ;
        t.disp();
    }
    @Override
    public void disp() {
        System.out.println(num);
    }
}