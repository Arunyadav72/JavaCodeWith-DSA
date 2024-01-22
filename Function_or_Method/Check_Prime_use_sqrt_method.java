import java.util.*;
public class Check_Prime_use_sqrt_method{
    //Only n>=2
    public static boolean Isprime(int n){
        if(n==2){
            return true;
        }
        /*
        Math.sqrt method is root of n.
        It is taken Half time.
        */
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        //output
        System.out.println(n+" is prime number : "+Isprime(n));
    }
}