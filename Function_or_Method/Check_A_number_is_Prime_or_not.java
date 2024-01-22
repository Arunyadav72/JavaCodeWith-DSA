import java.util.*;
public class Check_A_number_is_Prime_or_not{
    //only n>=2
    public static boolean IsPrime(int n){
        boolean isprime = true;
        if(n==2){
            return true;
        }
        
        for(int i=2; i<n; i++){
            if(n%i == 0){//compeletely divide
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        //output 
        System.out.println(n+" is prime number : "+IsPrime(n));
    }
}