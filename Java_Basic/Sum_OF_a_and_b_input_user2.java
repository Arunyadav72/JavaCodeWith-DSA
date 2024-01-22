import java.util.*;
public class Sum_OF_a_and_b_input_user2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, sum; //declare variable.
        
        //Input line statement;
        System.out.print("enter first number = ");
        a = sc.nextInt();
        System.out.print("ente the second number : ");
        b = sc.nextInt();
        
        sum = a+b; //Addition statement.
        
        //output statement.
        System.out.println("Sum of 2 number = "+sum);
    }
}