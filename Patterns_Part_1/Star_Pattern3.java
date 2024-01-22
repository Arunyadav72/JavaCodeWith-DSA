/*
Print star Pattern

********
*      *
*      *
*      *
*      *
*      *
*      *
********

*/
import java.util.*;
public class Star_Pattern3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number of line : ");
        n = sc.nextInt();
        
        //Print Pattern..
        for(int i=1; i<=n; i++){
            //Print
            for(int j=1; j<=n; j++){
                if(i==1 || i==n){ // Print star first and last line.
                    System.out.print("*");
                }
                else if(j>1 && j<n){ //Print space.
                    System.out.print(" ");
                }
                else{ //Print star j==1 and j==n
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
