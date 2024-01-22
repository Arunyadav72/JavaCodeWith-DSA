/*
Logic: 1. base case--> if(n==1 || n==0)
                          return n.
       
       2.  kaam--> 
            fibnm1 = f(n-1)  --> Recursive call.
            fibnm2 = f(n-2)  --> Recursive call.
            FibN = fibnm1 + fibnm2;
            return FibN;
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

//it is taken O(2^n) time complexity.
//it is taken O(n) space complexity.
//Here, I am use extra variable.

public class Print_Nth_Fibonacci_number_1{
    
    //This Function work on calculate Nth Fibonacci number.
    public static int Fibonacci(int n){
        if(n==1 || n==0){ //Base case.
            return n;
        }
        
        //Kaam
        int fibnm1 = Fibonacci(n-1);  //Recursive call --> f(n-1)
        int fibnm2 = Fibonacci(n-2); // Recursive call --? f(n-2)
        int FibN = fibnm1 + fibnm2;
        
        return FibN;
    }
    
    public static void main(String args[]){
        int n = 5;
        System.out.println("Nth Fibonacci number is : "+Fibonacci(n)); //Invoked Method.
    }
}