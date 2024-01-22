import java.util.*;
/*
Print Pattern....
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

*/
public class Diamond_Pattern{
    //Print Diamond Pattern...
    public static void Diamond(int n){
        //outer loop -- 1half -- count line.
        for(int i=1; i<=n; i++){
            //Inner loop -- Print Space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Print *
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //outer loop -- 2nd half -- count line
        for(int i=n; i>=1; i--){
            //Inner loop -- Print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Print *
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number of line : ");
        n = sc.nextInt();
        
        //Invoked
        Diamond(n);
    }
}