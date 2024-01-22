import java.util.*;
public class continue_Statement_2{
    /*
    Question...
          Display all number entered by user Multiple of 10.
    */
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        
        do{
            System.out.print("enter the number : ");
            n =sc.nextInt();
            
            if(n % 10 ==0){
                continue;
            }
            System.out.println("number was : "+n);
        }while(true);
    }
}
