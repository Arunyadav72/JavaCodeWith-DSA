import java.util.*;
/*
Print Pattern ....
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/
public class Zero_one_Triangle{
    //Print Zero one Pattern
    public static void Zero_one_Pattern(int n){
        //outer loop -- count line
        for(int i=1; i<=n; i++){
            //Inner loop -- print
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){ //even number -- Print 1
                    System.out.print("1 ");
                }
                else{ // odd number -- Print 1
                    System.out.print("0 ");
                }
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
       Zero_one_Pattern(n);
    }
}