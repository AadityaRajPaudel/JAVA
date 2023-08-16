/*
 Interface- Outline of a class that  contains abstract methods. Methods are public and abstract, variables should be static and final, methods and variables are public by default 
 */

interface WaterBottle {
    String color = "Blue" ;
    public void fill() ;
}


public class Interface implements WaterBottle{
    public static void main (String [] args) {
        Interface in = new Interface() ;
        in.fill() ;
    }
    @Override
    public void fill() { // point to be noted, use public keyword here
        System.out.println("Bottle is filled");
    }
}
/* MULTIPLE INHERITANCE USING INTERFACE

 interface WaterBottle {
    String color = "Blue" ;
    public void fillWater() ;
}
interface DrinkBottle {
    String color = "Green";
    public void fillDrink() ;
}

public class Interface implements WaterBottle, DrinkBottle{

    public static void main (String [] args) {
        Interface in = new Interface() ;
        in.fillWater() ;
        in.fillDrink();
    }

    @Override
    public void fillWater() { // point to be noted, use public keyword here
        System.out.println("Bottle is filled");
    }
    
    public void fillDrink() { // point to be noted, use public keyword here
        System.out.println("Drink is filled");
    }
}

 */
