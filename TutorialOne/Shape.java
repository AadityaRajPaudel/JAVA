public class Shape {
    private int l, b, w, h ;
    
    public Shape (int l, int b, int w, int h) {
        this.l = l; this.b = b ; this.w = w; this.h = h ;
    }
    public Shape (int w, int h) {
        this(0, 0, w, h) ;
    }
    public Shape () {
        this(1, 1, 1, 1) ;
    }

    void display() {
        System.out.println("Length, breadth, height and width are: "+this.l+this.b+this.h+this.w);
    }

    public static void main (String [] args) {
        Shape s1 = new Shape() ;
        Shape s2 = new Shape(10, 20) ;
        Shape s3 = new Shape(11, 22, 33, 44) ;
        s1.display();
        s2.display();
        s3.display();
    }
}
