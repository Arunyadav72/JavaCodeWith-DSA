import java.util.*;
public class Find_Product_of_a_and_b{
    
    //Multiply Product value. Function / Method.
    public static int Multiply(int a, int b){
        int product = a*b;
        
        return product;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a, b;
        
        System.out.print("enter First product value : ");
        a = sc.nextInt();
        System.out.print("enter Second product value : ");
        b = sc.nextInt();
        
        //Invoked Multiply Product Function.
        int prod = Multiply(a, b);
        
        //Print product value:
        System.out.println("Product of "+a+" & "+b+" = "+prod);
    }
}
