import java.util.*;
public class Find_Binomial_coefficient_or_Combination{
    //it is calculate factorial number.
    public static int calculate_Factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
    
    //it is calculate binomial.
    public static int calculate_binomial(int n, int r){
        int Fact_n = calculate_Factorial(n);
        int Fact_r = calculate_Factorial(r);
        int Fact_nmr = calculate_Factorial(n-r);
        
        //calculate binomial coefficient / combination.
        int binomial = Fact_n/(Fact_r * Fact_nmr);
        
        return binomial;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner (System.in);
      int n, r;
      
      System.out.print("enter n number : ");
      n = sc.nextInt();
      System.out.print("enter r number : ");
      r = sc.nextInt();
      
      int Binomial = calculate_binomial(n, r);
      System.out.println("(n, r) : "+Binomial);
    }
}
