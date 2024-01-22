/*
Question..
    keep entering number till user enters a multiple of 10.
*/
import java.util.*;
public class break_Statement_2{

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        do{
            System.out.print("enter the number : ");
            n = sc.nextInt();
            
            System.out.println("Your number is : "+n);
            
            if(n % 10 ==0){
                break;
            }
        
        }while(true);
    }
}
