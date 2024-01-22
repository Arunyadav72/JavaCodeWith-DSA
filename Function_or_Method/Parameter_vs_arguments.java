/*
Parameter...
1.Formal parameter
2.actual parameter

1.Formal parameter..
                             Formal parameter. 
                            <--------------->
public static void Parameter(int , int , int){
     //do something
}

2.actual parameter..

When Invoked Function / Method. Then the pass argument in Function. The called actual parameter. and called arguments.
    
          actual parameter
         <-------->
Parameter(a, b, c);

*/
import java.util.*;
public class Parameter_vs_arguments{
    //This Function work on calculate Two number subtraction.
    public static int calculate_sub(int a, int b){
        int sub = a-b;
        
        return sub; //return statement.
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num1, num2;
        
        System.out.print("enter First number : ");
        num1 = sc.nextInt();
        System.out.print("enter Second number : ");
        num2 = sc.nextInt();
        
        //Invoked calculate_sub Function.
        int Sub = calculate_sub(num1, num2);
        
        //Print Sub value.
        System.out.println("Subtraction is : "+Sub);
    }
}
