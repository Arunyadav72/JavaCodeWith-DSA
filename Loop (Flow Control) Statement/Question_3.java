/*
Question..
Write a program to find the factorial of any number entered by the user.

*/

import java.util.*;
public class Question_3{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        int fact = 1;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            fact*=i;  //calculate factorial number.
        }
        
        System.out.println("Factorial number is : "+fact);
    }   
}
