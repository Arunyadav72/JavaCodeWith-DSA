//Check Palindrome number..
import java.util.*;
public class Question_3{
    public static void Palindrome_number(int n){
        int reverse = 0;
        int palindrome = n;
        
        while(n!=0){
            int lastdigit = n%10;
            reverse = (reverse*10)+lastdigit;
            n/=10;
        }
        
        //Check
        if(reverse == palindrome){
            System.out.println(reverse+" is palindrome number");
        }
        else{
            System.out.println(reverse+" is not palindrome number");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("enter the number : ");
        n = sc.nextInt();
        
        //Invoked
        Palindrome_number(n);
    }
}
