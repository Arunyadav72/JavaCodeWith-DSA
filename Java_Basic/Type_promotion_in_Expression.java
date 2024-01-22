public class Type_promotion_in_Expression{
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        
        /*
        point....
            1. Java automatically promotes each 'byte, short, char' operand(+,-,*,/) to 'int' evaluating expression.
            char a = 'a';
            short b = 50;
            int c = a+b; 
            2. short and char data type variable use + operand. so, short, char data type convert int.
        */
        int c = b-a;
        
        System.out.println("Value of c = "+c);
        
        /*
        point...
           1. If one operand is 'long, float, or double' the whole expression is promoted to ' long, float, double' respectively.
           2. any long date type value store  long date type.
        */
        
        int x = 10;
        float d = 20.25f;
        long e = 25;
        double f = 30.0;
        
        double ans = x+d+e+f;
        
        System.out.println("value of ans = "+ans);
        
    }
}
