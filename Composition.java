class Storage {
    private String capacity ;
    private boolean isSSD ;
    public Storage (String capacity, boolean isSSD) {
        this.capacity = capacity ;
        this.isSSD = isSSD ;
    }
    public String toString() {
        String s = "Capacity = "+ this.capacity + (isSSD?"It is ssd":"is sdd") ;
        return s ;
    }
}
class Computer {
    private String brand ;
    private Storage s ;
    public Computer (String brand, Storage s) {
        this.brand = brand ;
        this.s = s ; // normal construction like variables
    }
    public String toString(){
        String str = "brand ="+this.brand+ this.s ; // this.s is displayed as toString() of line 8 by default
        return str ;
    }
}



public class Composition {
    public static void main (String[] args) {
        Storage s = new Storage("32 gb", false) ;
        Computer c = new Computer("256 GB", s);
        System.out.println(s.toString());
        System.out.println(c.toString());
    }
}
