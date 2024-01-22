import java.util.*;
public class if_else_Calculater{
    //Sum and sub calculater
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num1, num2;
        char ch;
        
        System.out.print("enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("enter the second number : ");
        num2 = sc.nextInt();
        
        System.out.println("\nChoose one operation from followint list : ");
        System.out.println("Addition --> '+'");
        System.out.println("Subtraction --> '-'");
        System.out.println("choose operation : ");
        ch = sc.next().charAt(0);
        
        if(ch == '+'){
            System.out.println("Addition is : "+(num1 + num2));
        }
        else{
            System.out.println("Subtraction is : "+(num1 - num2));
        }
    }
}
