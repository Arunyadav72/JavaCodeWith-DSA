import java.util.*;
public class Find_Factorial_number{
    
    public static int calculate_factorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial*=i; //calculate factorial.
        }
        
        return factorial;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the factorial number : ");
        n = sc.nextInt();
        
        //Invoked calculate_factorial Function.
        int Fact = calculate_factorial(n);
        
        //print Fact number.
        System.out.println("Factorial  number of "+n+" is : "+Fact);
    }
}
