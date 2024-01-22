public class Print_Nth_Fibonacci_number{
/*
Logic: 1. base case--> if(n==1 || n==0)
                          return n.
       
       2.  kaam--> fun(n-1)+fun(n-2) Recursive call.
    
*/
    
/*
    stack tree.
    Base case n==1|| n==0
                  
                  
Finally return 5  |<----              f(5)                         |     ^
                  |                     /\                         | I   |
                  |                    /  \                        | N   |
                  |                   /    \                       | V   | R
   return 3+2=5   |<----           f(4)   f(3)                     | O   | E
                  |                 /        \                     | K   | T
                  |                /\        /\                    | E   | U
                  |               /  \      /  \                   | D   | R
                  |              /    \    /    \                  |     | N
    return 2+1=3  |<----      f(3)   f(2)f(2)  f(1)                |     |
                  |            /       \    \                      |     |
                  |           /\       /\    \                     |     |
                  |          /  \     /  \    \                    |     |
                  |         /    \   /    \    \                   |     |
     return 1+1=2 |<---- f(2)   f(1)f(1) f(0)   \                  |     |
                  |        /                   /\                  |     |
                  |       /\                  /  \                 V     |
                  |      /  \                /    \      
     return 1+0=1 |<-- f(1) f(0)            f(1)   f(0)
           
*/    
    
//*** it is taken O(2^n) time complexity.
//*** it is taken O(n) space complexity.
//*** Here, I am not use extra variable.
    
    //This Function work on calculate Fibonacci number.
    public static int Fibonacci(int n){
        if(n==1 || n==0){ //Base case.
            return n;
        }
        
        //Kaam
        return Fibonacci(n-1)+Fibonacci(n-2);  //Recursive call
    }
    
    public static void main(String args[]){
        int n = 7; 
        
        System.out.println("Nth Fibonacci number is : "+Fibonacci(n));  //Invoked Method.
    }
}