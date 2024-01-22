/*
Question 2..
    Write a method name isEven that accepts on int argument. The method should return true
    if the argument is even, or false otherwise. Also write a program to test your method.

*/
    
import java.util.*;
public class Question_2{

    //Check even  number.
    public static boolean isEven(int n){
        if(n%2== 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        //output
        if(isEven(n) == true){
            System.out.println(n+" is even number ");
        }
        else{
            System.out.println(n+" is not even number");
        }
    }
}