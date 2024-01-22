/*
Call by value.. *** Java always calls by value.

*  In this statement call by value (not pass original value call to Function),
   only pass copy value in the Function.

*  Passes value always change calling Funtion, but not change main Function.
 
*/

public class Call_by_value{
    // Swaping code Function --> exchange value.
    public static void Swap_value(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        
        //Print value..
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
    
    public static void main(String args[]){
        int a =5;
        int b = 10;
        
        //Invoked Swap_value Function.
        System.out.println("Swap Value....");
        Swap_value(a, b);
        
        System.out.println("\nAfter swaping value in main Function...");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}