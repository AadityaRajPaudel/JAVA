abstract class Athlete {
    String name ;
    String country ;
    abstract void showStats() ;

    public Athlete(String name, String country) {
        this.name = name ;
        this.country = country ;
    }
}

class Footballer extends Athlete {
    int goals ;
    public Footballer (String name, String country, int goals) {
        super(name, country);
        this.goals = goals ;
    }

    public void showStats() {
        System.out.println("Name = "+this.name+" Country = "+this.country+" Goals = "+this.goals );
    }
}

public class AbstractExample {
    public static void main (String [] args) {
        Footballer f = new Footballer("Messi", "Argentina", 963);
        f.showStats();
    }
}
