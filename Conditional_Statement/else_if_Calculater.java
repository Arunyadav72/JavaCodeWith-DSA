import java.util.*;
public class else_if_Calculater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char ch;
        
        System.out.print("enter the first number : ");
        num1 = sc.nextInt();
        System.out.print("enter the second number : ");
        num2 = sc.nextInt();
        
        System.out.println("\nChoose one operation from the following list....");
        System.out.println("Addition --> +");
        System.out.println("Subtraction --> -");
        System.out.println("Multiply --> *");
        System.out.println("Divide --> /");
        System.out.println("Modular --> %");
        System.out.print("enter your choice : ");
        ch = sc.next().charAt(0);
        
        if(ch=='+'){
            System.out.println("Addition is : "+(num1+num2));
        }
        else if(ch == '-'){
            System.out.println("Subtractiob is : "+(num1-num2));
        }
        else if(ch == '*'){
            System.out.println("Multiply is : "+(num1*num2));
        }
        else if(ch == '/'){
            System.out.println("Divide is : "+(num1/num2));
        }
        else{
            System.out.println("Modular is : "+(num1%num2));
        }
        
    }
}
