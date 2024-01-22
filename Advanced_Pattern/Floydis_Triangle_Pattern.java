/*
Print Pattern ...
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
import java.util.*;
public class Floydis_Triangle_Pattern{
    
    public static void Floydis_Triangle(int n){
        int count_num = 1;
        //outer loop count line
        for(int i=1; i<=n ; i++){
            //Inner loop -- Print count_num
            for(int j=1; j<=i; j++){
                System.out.print(count_num+" ");
                count_num++;
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
        Floydis_Triangle(n);
    }
}
