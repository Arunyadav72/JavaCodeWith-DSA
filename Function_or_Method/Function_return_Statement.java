import java.util.*;
public class Function_return_Statement{
    //This is Function return Statement.
    public static int Calculate_Sum(int a, int b, int c){
        int sum = a+b+c;
        
        return sum; //This is return Statement.
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num1, num2, num3;
        
        System.out.print("enter First number : ");
        num1 = sc.nextInt();
        System.out.print("enter Second number : ");
        num2 = sc.nextInt();
        System.out.print("enter Third number : ");
        num3 = sc.nextInt();
        
        int Sum = Calculate_Sum(num1, num2, num3);//Invoked Calculate_Sum Function / Method.
        
        System.out.println("Sum = "+Sum);
    }
}
