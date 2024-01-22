import java.util.*;
/*
Print pattern....
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/
public class Butterfly_Pattern{
    //Print Butterfly Pattern..
    public static void butterfly(int n){
        //outer loop -- 1st half -- count line.
        for(int i=1; i<=n; i++){
            //Inner loop -- Print *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Inner loop -- Print Space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //Inner loop -- Print *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //outer loop -- 2nd half -- count line.
        for(int i=n; i>=1; i--){
            //Inner loop -- Print *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Inner loop -- Print space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //Inner loop -- Print *
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the number of line : ");
        n =sc.nextInt();
        
        //Invoked 
        butterfly(n);
    }
}
