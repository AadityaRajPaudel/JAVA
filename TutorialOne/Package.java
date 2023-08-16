import myPackage.MyBox;
// Import is done of classes of the packages

public class Package {
    public static void main (String [] args) {
        MyBox m = new MyBox() ;
        m.display();
    }
}

/*
// Packages - Collection of related classes, sub-classes and interfaces. Types- User Defined and Built in pa0ckage
We dont need to import classes from one java file to another if the java files are in same parent Package, we can make instances directly using class names

ACCESS MODIFIERS

public, default- same, just declaration different -> public int a = 10(public); int a = 10; (default)
                can be accessed by classes in same or different packages

protected - can be accessed by classes of same package. If needed to be accessed by another class of   different package, use inheritance of that parent class in the different package

private - can only be accessed within that class where it is declared

Example program: https://youtu.be/H0OetoieSDQ

List of built in JAVA Packages that are frequently used:
    1.
    2.
 */