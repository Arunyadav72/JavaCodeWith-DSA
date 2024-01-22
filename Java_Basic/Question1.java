/*
Question 1....
             In a program, input 3 number: A, B, C: You to output the average of these 3 number.
             (Hint: Average of N number is sum of these number divided by N).

*/
import java.util.*;
public class Question1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c, average;
        
        //Inout statement Line.
        System.out.print("Enter the first number = ");
        a = sc.nextInt();
        System.out.print("Enter the second number = ");
        b = sc.nextInt();
        System.out.print("Ente the third number = ");
        c = sc.nextInt();
        
        int sum = a+b+c;
        average = sum/3;
        
        System.out.println("Average number is = "+average);
    }
}
