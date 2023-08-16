import java.util.Scanner;

public class ArrayDeletion {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in) ;
        int [] array = new int [10] ; // imp -> syntax
        int x ;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter element "+(i+1));
            array[i] = scan.nextInt();
        }

        System.out.println("Enter position to remove starting from 0 to 9: ");
        x = scan.nextInt() ;

        remove(array, x);
    }

    public static void remove(int [] array, int x) { // imp -> static
        if (array == null || x<0 || x >9) {
            System.out.println("Cannot delete");
            System.exit(1); // imp
        }
        int [] arr = new int [9] ;
        for (int i= 0, j=0; i<10; i++) {
            if (i==x) {
                j++;
                continue ;
            }
            arr[j] = array[i] ;
            j++;
        }
        disp(arr);
    }
    public static void disp(int [] arr){
        for (int i = 0; i < 9; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
