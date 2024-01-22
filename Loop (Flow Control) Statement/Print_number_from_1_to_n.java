import java.util.*;
public class Print_number_from_1_to_n{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the n number : ");
        n = sc.nextInt();
       
        int i=1;
        while(i <= n){
            System.out.print(" "+ i);
            i++;
        }
        System.out.println();
    }
}