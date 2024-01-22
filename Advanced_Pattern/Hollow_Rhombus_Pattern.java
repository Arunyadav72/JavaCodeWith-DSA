/*
Print Pattern...
         **********
        *        *
       *        *
      *        *
     *        *
    *        *
   *        *
  *        *
 *        *
**********

*/
import java.util.*;
public class Hollow_Rhombus_Pattern{
    
    //Print Hollow Rhombus Pattern
    public static void Hollow_Rhombus(int n){
        //outer loop -- count line.
        for(int i=1; i<=n; i++){
            //Inner loop -- Print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Print * and space
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){ // Print *
                    System.out.print("*");
                }
                else{ //Print Space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String agrs[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number of line : ");
        n = sc.nextInt();
        
        //Invoked
        Hollow_Rhombus(n);
    }
}