import java.util.*;
public class Print_sum_of_Nth_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=1, n;
        
        System.out.print("enter the Nth number : ");
        n = sc.nextInt();
        
        int sum = 0;
        
        while(i<=n){
            sum = sum+i;
            i++;
        }
        
        System.out.println("Sum of Nth number : "+ sum);
    }
}
