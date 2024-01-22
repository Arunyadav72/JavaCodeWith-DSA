import java.util.*;
public class Check_nth_Prime_number{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        System.out.print("enter the nth number : ");
        n = sc.nextInt();
        
        
        for(int i=1; i<=n; i++){
            boolean IsPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                //check prime statement.
                if(i%j ==0){
                    IsPrime = false;
                }
            }
            
            //Print statement.
            if(IsPrime == true){
                System.out.println(i+" is prime number");
            }
            else{
                System.out.println(i+" is not prime number");
            }
        }
    }
}