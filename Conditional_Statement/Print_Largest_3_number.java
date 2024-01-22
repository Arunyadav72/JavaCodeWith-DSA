import java.util.*;
public class Print_Largest_3_number{
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a, b, c;
        
        System.out.print("enter the first number : ");
        a = sc.nextInt();
        System.out.print("enter the second number : ");
        b = sc.nextInt();
        System.out.print("enter the third number : ");
        c = sc.nextInt();
        
        //Check Largest number.....
        if(a>=b && a>=c){
            System.out.println("Largest numbe is : "+a);
        }
        else if(b>=c){
            System.out.println("Largset number is : "+b);
        }
        else{
            System.out.println("Largest number is : "+c);
        }
    }
}
