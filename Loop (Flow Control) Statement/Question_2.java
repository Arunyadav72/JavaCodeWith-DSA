/*
Question...
Write a program that reads a set of integer, and prints the sum of the even and odd integers.
*/

import java.util.*;
public class Question_2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        int evenSum =0, oddSum = 0;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        int i=1;
        while(i<=n){
            if(i%2 == 0){ // Sum of even number.
                evenSum +=i;
            }
            else{ // Sum of odd number.
                oddSum+=i;
            }
            i++;
        }
        
        System.out.println("Sum of Even number is : "+evenSum);
        System.out.println("Sum of odd number is : "+oddSum);
        
        
    }
}
