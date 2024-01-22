import java.util.*;
public class Function_2{
    
    //This is Function / Method line code. and not return any statement.
    //This Function work on calculate two number sum.
    public static void Calculate_Sum(){
        Scanner sc =  new Scanner (System.in);
        int num1, num2, sum;
        
        System.out.print("enter the first number : ");
        num1 = sc.nextInt();
        
        System.out.print("enter the second number : ");
        num2 = sc.nextInt();
        
        //Calculate sum...
        sum = num1+num2;
        
        //Print sum..
        System.out.println("Sum = "+sum);
                
    }
    public static void main(String args[]){
        //Invoked Calculate_Sum Function.
        Calculate_Sum();
    }
}
