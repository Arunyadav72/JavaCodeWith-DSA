/*
Print Half Pyramid in number...

1
12
123
1234
12345

*/

import java.util.*;
public class Print_Half_Pyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("enter number of line : ");
        n = sc.nextInt();
        
        //Print Pattern..
        for(int i=1; i<=n; i++){
            //print number...
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
