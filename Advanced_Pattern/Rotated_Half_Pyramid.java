/*
Print pattern..

    *
   **
  ***
 ****
*****

*/
import java.util.*;
public class Rotated_Half_Pyramid{
    //Pirnt Half Pyramid.
    public static void Half_Pyramid(int n){
        //outer loop -- count line.
        for(int i=1; i<= n; i++){
            //Inner loop -- print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Print *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the numebr : ");
        n = sc.nextInt();
        
        //Invoked 
        Half_Pyramid(n);
    }
}