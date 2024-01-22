import java.util.*;
public class Print_Smallest_3_number{
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        
        System.out.print("enter the first number : ");
        a = sc.nextInt();
        System.out.print("enter the second number : ");
        b = sc.nextInt();
        System.out.print("enter the third number : ");
        c = sc.nextInt();
        
        //Check Smallest number....
        if(a<=b && a<=c){
            System.out.println("Smallest number is : "+a);
        }
        else if(b<=c){
            System.out.println("Smallest number is : "+b);
        }
        else{
            System.out.println("Smallest number is : "+c);
        }
    }
}