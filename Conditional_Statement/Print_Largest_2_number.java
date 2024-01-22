import java.util.*;
public class Print_Largest_2_number{
    public static void main(String ags[]){
        Scanner sc = new Scanner (System.in);
        int a, b;
        
        System.out.print("enter the first number : ");
        a = sc.nextInt();
        System.out.print("enter the second number : ");
        b = sc.nextInt();
        
        //Check Largest number.....
        if(a>=b){
            System.out.println("A is largest of b");
        }
        else{
            System.out.println("B is largest of a");
        }
    }
}
