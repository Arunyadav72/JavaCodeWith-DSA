/*
Star Pattern... 

    *
   **
  ***
 ****
*****

*/
import java.util.*;
public class Star_Pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter number of line : ");
        n = sc.nextInt();
        
        //Print Pattern..
        for(int i=1; i<=n; i++){
            //print space.
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Print star.
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
