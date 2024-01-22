/*
Print Half character Pattern...

ABCD
EFG
HI
J

*/
import java.util.*;
public class Print_Half_character_Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        int n;
        System.out.print("enter number of line : ");
        n= sc.nextInt();
        
        
        //Print Pattern..
        char ch = 'A';
        for(int i=1; i<=n; i++){
            //Print character..
            for(int j=n; j>=i; j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}