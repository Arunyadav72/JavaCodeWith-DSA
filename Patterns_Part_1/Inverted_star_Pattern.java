/*
Inverted star Pattern...

*****
****
***
**
*

*/

import java.util.*;
public class Inverted_star_Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        int n;
        System.out.print("enter number of line : ");
        n = sc.nextInt();
        
        //Print Pattern...
        for(int i=1; i<=n; i++){
            //Print star..
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}