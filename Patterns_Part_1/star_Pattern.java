/*
Star pattern.....

*
**
***
****
*****

*/

import java.util.*;
public class star_Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number of line : ");
        n = sc.nextInt();
        
        //Print Pattern..
        for(int i=1; i<=n; i++){
            //print star...
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}