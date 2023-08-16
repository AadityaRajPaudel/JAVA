/*
 Composition -> Has-a rule
 */

class Storage {
    boolean isSSD ;
    int gb ;

    public Storage (boolean isSSD, int gb) {
        this.isSSD = isSSD; this.gb = gb ;
    }

    public String toString() {
        String s = " Capacity = "+this.gb+" gb , "+ (isSSD?"SSD":"SDD");
        return s ;
    }

}

class Computer {
    String brand ;
    int price ;
    Storage s ;

    public Computer (String brand, int price, Storage s) {
        this.brand = brand ; this.price = price ; this.s = s ;
    }

    public String toString () {
        String s = "Brand = "+this.brand+" Price = "+this.price+ this.s; // point to remember, this.s calls Storage constructors toString() by default
        return s ;
    }
}

public class Composition {
    public static void main(String [] args) {
        Storage s = new Storage(true, 2) ;
        Computer c = new Computer ("HP", 999, s) ;
        System.out.println(c.toString());
    }
}
