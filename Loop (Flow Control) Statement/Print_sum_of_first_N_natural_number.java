import java.util.*;
public class Print_sum_of_first_N_natural_number{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=1, n, sum = 0;
        
        System.out.print("enter the n natural number : ");
        n = sc.nextInt();
        
        //This statement calculate sum N natural number.
        while(i <= n){
            sum+=i;
            i++;
        }
        
        System.out.println("Sum of N natural number : "+ sum);
    }
}