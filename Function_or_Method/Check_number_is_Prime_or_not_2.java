import java.util.*;
public class Check_number_is_Prime_or_not_2{
    //Only n>=2
    public static boolean Isprime(int n){
        int i=2;
        for( ; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        
        //output
        System.out.println(n+" is prime number : "+Isprime(n));
    }
}

