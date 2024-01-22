/*
Function / Method..

      Parameter Syntax...
                                      Parameter..
                                    <---------------------------------->
            returnType Function_name(Type parameter 1, Type parameter 2){
                     Function body;
                     return statement;
            }
            

*/
import java.util.*;
public class Function_with_Parameter{
    //This Function work on calculate sum.
    public static void Calculate_Sum(int a, int b){
        int sum = a+b;
        
        //print sum.
        System.out.println("Sum = "+sum);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a, b;
        
        System.out.print("enter First number : ");
        a = sc.nextInt();
        System.out.print("enter Second number : ");
        b = sc.nextInt();
        
        //Invoked Calculate_Sum Function.
        Calculate_Sum(a, b);
    }
}