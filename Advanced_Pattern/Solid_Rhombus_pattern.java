/*
Print pattern....
         **********
        **********
       **********
      **********
     **********
    **********
   **********
  **********
 **********
**********
*/
import java.util.*;
public class Solid_Rhombus_pattern{
    
    //Print Solid Rhombus Pattern..
    public static void Solid_Rhombus(int n){
        //outer loop -- count line.
        for(int i=1; i<=n; i++){
            //Inner loop -- print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Print *
            for(int j=1; j<=n; j++){
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
        Solid_Rhombus(n);
    }
}