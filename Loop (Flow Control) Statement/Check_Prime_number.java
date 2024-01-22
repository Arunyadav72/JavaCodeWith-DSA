import java.util.*;
public class Check_Prime_number{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n, i=2;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        if(n==1){
            System.out.println(n +" is prime number");
        }
        else{
            for(i=2; i<n; i++){
                if(n%i == 0){
                    System.out.println(n+" is not prime number");
                    break;
                }
            }
            if(i==n){
                System.out.println(n+" is prime number");
            }
        }
    }
}
