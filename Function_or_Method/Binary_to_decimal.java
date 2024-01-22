import java.util.*;
public class Binary_to_decimal{
    //Convert binary to decimal.
    public static int binary_to_decimal(int n){
        int pow = 0;
        int decimal = 0;
        
        while(n!=0){
            int lastdigit = n%10;
            decimal = decimal+(lastdigit*(int)Math.pow(2, pow));
            
            pow++;
            n/=10;
        }
        
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int bin_num;
        
        System.out.print("enter the binary number : ");
        bin_num = sc.nextInt();
        
        
        //output
        System.out.println("decimal of "+bin_num+" : "+binary_to_decimal(bin_num));
    }
}
