/*
Question 4..
    Read and code exercise --> Mathod of Math class in java.
    1. Math.max()    ---> It is return the Largest of two value.
    2. Math.min()    ---> It is return the Smallest of two value.
    3. Math.sqrt()   ---> It is used to return the square root of a number. It is taken one value.
    4. Math.pow()    ---> It is returns the value of first arguments raised to the power to second arguments.
    5. Math.abs()    ---> This method returns the absalute value of the arguments.
                            1. If we provide possitive or negative number, this method return Possitive number.
                            2. If provide Nan value, return Nan value.
                            3. If argumeants infinity, return positive infinity. 
    6. Math.avg()
    
*/
import java.util.*;
public class Question_4{
    
    //check maximum number.
    public static int Max_Method(int a, int b){
        int max = Math.max(a, b);
        return max;
    }
    
    //check minimum number.
    public static int Min_Method(int a, int b){
        int min = Math.min(a,b);
        return min;
    }
    
    //Sqrt(root) Method
    public static float Sqrt_Method(int n){
        float sqrt = (float)Math.sqrt(n);
        return sqrt;
    }
    
    //power Method
    public static float Power_Method(int n){
        float pow = (float)Math.pow(n, 3);
        return pow;
    }
    
    //abs Method.
    public static void abs_Method(int a, int b){
        
        System.out.println(a+" value of a : "+Math.abs(a));
        System.out.println(b+" value of b : "+Math.abs(b));
        System.out.println("value is : "+Math.abs(7.0/0));
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.print("enter the 1st number : ");
        a = sc.nextInt();
        System.out.print("enter the 2nd number : ");
        b = sc.nextInt();
        
        //output of max Method.
        System.out.println("\n"+a+" and "+b+" of Maximum is : "+Max_Method(a, b));
        //output of min Method.
        System.out.println(a+" and "+b+" of Minimum is : "+Min_Method(a, b));
        //output of sqrt Method.
        System.out.println("root of "+a+" is "+Sqrt_Method(a));
        //output of power Method.
        System.out.println(b+" power of 3 is : "+Power_Method(b));
        //output of abs Method.
        abs_Method(a, -b);
        
    }
}
