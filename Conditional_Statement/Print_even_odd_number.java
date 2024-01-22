import java.util.*;
public class Print_even_odd_number{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int number;
        
        System.out.print("enter the number : ");
        number = sc.nextInt();
        
        //check even and odd number....
        if(number % 2 == 0){
            System.out.println(number+" is even number");
        }
        else{
            System.out.println(number+" is odd number");
        }
    }
}