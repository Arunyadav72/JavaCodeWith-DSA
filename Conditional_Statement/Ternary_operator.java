/*
Syntax...
       variable = condition ? statement_1 : statement_2;
*/
public class Ternary_operator{
    
    public static void main(String args[]){
        int number = 4;
        
        //This is ternary operator statement.
        String type = (number%2==0)?"Even":"Odd";
        System.out.println(type);
    }
}
