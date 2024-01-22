/*
Pirnt character Pattern..

A
BC
DEF
GHIJ
KLMNO

*/
import java.util.*;
public class Print_character_Pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter number of line : ");
        n =sc.nextInt();
        
        //Print Pattern...
        char ch = 'A';
        for(int i=1; i<=n; i++){
            //Print character..
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++; //increase character
            }
            System.out.println();
        }
    }
}