/*
Question 5..
    Write a java method to compute the sum of the digit in an integer.
*/
import java.util.*;
public class Question_5{
    
    //Calculate Sum of digit number.
    public static int Sum_of_digit(int n){
        int Sum = 0;
        
        while(n!= 0){
            int lastdigit = n%10;
            Sum = Sum+lastdigit;
            n/=10;
        }
        
        return Sum;
    }
    
    public static void main(String argsp[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        //Invoked Function.
        System.out.println(n+" sum of digit is : "+Sum_of_digit(n));
    }
}
