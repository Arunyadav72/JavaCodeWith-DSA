/*
Star Pattern...

*****
 ****
  ***
   **
    *

*/
import java.util.*;
public class Star_Pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter number of line : ");
        n = sc.nextInt();
        
        //Print Pattern...
        for(int i=1; i<=n; i++){
            //Print space.
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            //Print Star.
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}