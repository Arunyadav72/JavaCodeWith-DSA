/*
Question..
    Write a java method to compute the average of three number.
*/
import java.util.*;
public class Question_1{

    public static double Average(double a, double b, double c){
        double average = (a+b+c)/3;
        
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        double a, b, c;
        
        System.out.print("enter the 1st number : ");
        a = sc.nextDouble();
        System.out.print("enter the 2nd number : ");
        b = sc.nextDouble();
        System.out.print("enter the 3rd number : ");
        c = sc.nextDouble();
        
        //output
        System.out.println("Average number is : "+Average(a, b, c));
    }
}
