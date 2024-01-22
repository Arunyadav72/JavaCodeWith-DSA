import java.util.*;
public class Switch_Calculater{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        char ch;
        
        System.out.print("enter the first number : ");
        a = sc.nextInt();
        System.out.print("enter the second number : ");
        b = sc.nextInt();
        
        System.out.println("\nChoose one operation from following list.....");
        System.out.println("Addition -->    +");
        System.out.println("Subtraction --> -");
        System.out.println("Multiply -->    *");
        System.out.println("Divide -->      /");
        System.out.println("Modular -->     %");
        
        System.out.print("\nenter your choice operation : ");
        ch = sc.next().charAt(0);
        
        switch(ch){
            case '+':
                System.out.println("Addition is : "+ (a+b));
                break;
                
            case '-':
                System.out.println("Subtraction is : "+ (a-b));
                break;
                
            case '*':
                System.out.println("Multiply is : "+ (a*b));
                break;
                
            case '/':
                System.out.println("Divide is : "+ (a/b));
                break;
                
            case '%':
                System.out.println("Modular is : "+ (a%b));
                break;
                
            default:
                System.out.println("choice list wrong");
        }
    }
}
