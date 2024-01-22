import java.util.*;
public class Decimal_to_binary{
    public static int decimal_to_binary(int n){
        int binary = 0;
        int pow = 0;
        
        while(n!=0){
            int remainder = n%2;
            binary = binary+(remainder*(int)Math.pow(10, pow));
            
            pow++;
            n/=2;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int dec_num;
        
        System.out.print("enter the decimal number : ");
        dec_num = sc.nextInt();
        
        //output
        System.out.println("binary from of "+dec_num+" : "+decimal_to_binary(dec_num));
    }
}