import java.util.*;
public class Check_Prime_in_Range{
    //Check Prime number
    public static boolean Isprime(int n){
        if(n==2){
            return true; // It is return prime statement.
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false; // It is not return prime statement.
            }
        }
        return true;//It is return prime statement.
    }
    
    //Prime of Range n>=2.
    public static void Prime_in_Range(int n){
        System.out.print("Prime number : ");
        for(int i=2; i<=n; i++){
            if(Isprime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the numebr in range : ");
        n = sc.nextInt();
        
        //Invoked Function of Range.
        Prime_in_Range(n);
    }
}