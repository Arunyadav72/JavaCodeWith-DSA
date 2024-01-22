import java.util.*;
//sqrt_n.....
//             Math.sqrt(n).. It is taken sqrt(n) < n-1 (Time complexity)

public class Check_Prime_number3_use_sqrt_n{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        boolean Isprime = true;
        
        if(n==2){
            Isprime = true;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                Isprime = false;
            }
        }
        
        //print statement...
        if(Isprime==true){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
}
