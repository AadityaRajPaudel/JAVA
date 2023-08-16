// get 10 array elements from user and delete x'th position 

// import java.util.Arrays;
// import java.util.Scanner ;

// public class arrayRemoval {
//     public static void main (String [] args) {
//         Scanner scan = new Scanner(System.in) ;
//         int [] array = new int [10] ; // important

//         int i ;
//         for (i = 0; i < 10; i++) {
//             System.out.println("Enter element "+ i);
//             array[i] = scan.nextInt();
//         }

//         System.out.println("Enter position to remove: ");
//         int x = scan.nextInt() ;

//         int [] cpy = new int [10] ;
//         cpy = remove (array, x) ;
//         System.out.println(Arrays.toString(cpy));
//     }
//     public static int [] remove (int [] array, int x) {
//         if (array == null || x < 0 || x > array.length) {
//             System.out.println("Cannot remove");
//             return array ;
//         }
//         int [] copy = new int [9] ;
//         for (int i = 0, j = 0; i < 10; i++) {
//             if (i == x) {
//                 continue ;
//             }
//             copy[j] = array[i] ;
//             j++ ;
//         }
//         return copy ;

//     }
// }

import java.util.Scanner ;

class arrayRemoval {
    public static void main (String [] args) {
        int [] array = new int [10] ;
        Scanner scan = new Scanner (System.in) ;
        for (int i = 0; i < 10; i++ ) {
            array[i] = scan.nextInt() ;
        }
        System.out.println("Enter position to remove: ");
        int x = scan.nextInt() ;
        remove (array, x) ;
    }
    public static void remove(int [] array, int x){
        if (array == null || x < 1 || x > 9) {
            System.out.println("Cannot remove");
        }
        else {
            int [] cpy = new int [9] ;
            for (int i = 0, j = 0; i<10; i++) {
                if (i == x) {
                    
                    continue ;
                }
                cpy[j] = array [i] ;
                j++ ;
            }
            for (int i = 0; i < 9; i++) {
                System.out.println(" "+cpy[i]+ " ");
            }
        }
    }
}