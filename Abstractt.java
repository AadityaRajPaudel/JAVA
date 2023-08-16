abstract class Athlete {
    String name, country ;
    public Athlete (String name, String country) {
        this.name = name; this.country = country ;
    }
    abstract void disp() ;
}
class Cricketer extends Athlete {
    int runs ;
    public Cricketer (String name, String country, int runs) {
        super(name, country) ;
        this.runs = runs ;
    }
    public void disp() {
        System.out.println("Name = "+this.name+" Country = "+this.country+" Runs = "+this.runs);
    }
}
class Abstractt {
    public static void main (String [] args) {
        Cricketer c = new Cricketer("Rohit", "India", 1678);
        c.disp();
    }
}