/*
Print Pattern.....
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
*/
import java.util.*;
public class Hollow_Diamond_Pattern{
    //Print Hollow Diamond Pattern...
   
    public static void Hollow_Diamond(int n){
        //outer loop -- 1st half -- count line
        for(int i=1; i<=n; i++){
            //Inner loop -- Print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Pirnt * and space
            for(int j=1; j<=2*i-1; j++){
                if(i==1 || j==1 || j==2*i-1){  //Print *
                    System.out.print("*");
                }
                else{   //Print space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //outer loop -- 2nd half -- count line
        for(int i=n; i>=1; i--){
            //Inner loop -- Print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Print * and space
            for(int j=1; j<=2*i-1; j++){
                if(i==1 || j==1 || j==2*i-1){ //Print *
                    System.out.print("*");
                }
                else{ //print space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the number of line : ");
        n = sc.nextInt();
        
        //invoked
        Hollow_Diamond(n);
    }
}