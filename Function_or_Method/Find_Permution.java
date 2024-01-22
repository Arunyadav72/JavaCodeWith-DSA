import java.util.*;
public class Find_Permution{
    //It is Calculate Factorial number.
    public static int calculate_Factorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial*=i;
        }
        return factorial;
    }
    
    //It is calculate permution.
    public static int calculate_Permution(int n, int r){
        int Fact_n = calculate_Factorial(n);
        int Fact_nmr = calculate_Factorial(n-r);
        
        int p = Fact_n/Fact_nmr;
        return p;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n, r;
       
       System.out.print("enter n number : ");
       n = sc.nextInt();
       System.out.print("enter r number : ");
       r = sc.nextInt();
       
       //output of permution.
       int permution = calculate_Permution(n, r);
       System.out.println("P(n, r) : "+permution);
    }
}
