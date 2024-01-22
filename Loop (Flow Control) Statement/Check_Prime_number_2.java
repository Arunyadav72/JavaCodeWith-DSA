import java.util.*;
public class Check_Prime_number_2{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        boolean isPrime = true;
        
        if(n==2){
            isPrime = true;
        }
        
        for(int i=2; i<n; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        
        if(isPrime == true){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
}