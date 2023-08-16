class Shape {
    private int l, b, w, h ;

    public Shape (int l, int b, int w, int h ) {
        this.l = l ;
        this.b = b ;
        this.w = w ;
        this.h = h ;
    }
    public Shape (int w, int h) {
        this (0, 0, w, h) ;
    }
    public Shape () {
        this (0, 0, 0, 0) ;
    }
    public String display() {
        String data ;
        data = "Length = "+this.l+ "\nBreadth: "+this.b+ "\nW = "+this.w+"\nH = "+this.h ;
        return data ;
    }
}

public class Constructors {
    public static void main (String [] args) {
    Shape s1 = new Shape(10, 20, 30, 40) ;
    Shape s2 = new Shape() ;
    Shape s3 = new Shape(22, 33) ;
    System.out.println(s1.display()) ;
    System.out.println(s2.display()) ;
    System.out.println(s3.display()) ;
    }
}
