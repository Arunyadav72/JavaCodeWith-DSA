import java.util.*;
/*
Print Pattern....
    *
   * *
  *   *
 *     *
*********
*********
 *     *
  *   *
   * *
    *

*/
public class Diamond_Pattern_2{
    //Print pattern..
    public static void Diamond(int n){
        //outer loop -- 1st half -- count line.
        for(int i=1; i<=n; i++){
            //Inner loop -- Print space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Print * and space
            for(int j=1; j<=2*i-1; j++){
                if(i==1 || i==n || j==1 || j==2*i-1){ //Print *
                    System.out.print("*");
                }
                else{ //Print space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //outer loop -- 2nd half -- count line.
        for(int i=n; i>=1; i--){
            //Inner loop -- Pirnt space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Inner loop -- Pirnt * and space
            for(int j=1; j<=2*i-1; j++){
                if(i==1 || i==n || j==1 || j==2*i-1){ // Pirnt *
                    System.out.print("*");
                } 
                else{  //Print Space
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
        
        //Invoked
        Diamond(n);
    }
}