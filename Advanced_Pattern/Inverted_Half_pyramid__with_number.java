/*
Print Pattern....
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/
import java.util.*;
public class Inverted_Half_pyramid__with_number{
    
    //Print Half pyramid with number..
    public static void Half_pyramid_with_number(int n){
        //outer loop -- count line
        for(int i=1; i<=n; i++){
            //Inner loop -- Print
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        //Invoked 
        Half_pyramid_with_number(n);
    }
}