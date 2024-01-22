public class Find_Factorial_OF_N{
    
    // This Function work on calculate Factorial number.
    public static int Fact(int n){
        if(n==0){ //Base Case.
            return 1;
        }
        return n*Fact(n-1); //Recursive call
    }
    
    
    public static void main(String args[]){
        int n = 5;
        
        System.out.println("Factorial numbe is : "+Fact(n)); //Here, Invoked Method.
    }
}

    /*
    Logic:
    1. if(n==0)
        return 1
    2. return n*fun(n-1)
    
    */
/*  Call stack tree..
n = 5 
Finaly return 120   |            fun(5)
                    |            /
         return 120 |<---      5*fun(4)  = 5*return(24) = 120      | I
    ^               |           /                                  | N
  R |     return 24 |<---    4*fun(3) = 4*return(6) = 24           | V
  E |               |          /                                   | O 
  T |      return 6 |<---   3*fun(2) = 3*return(2) = 6             | K
  U |               |       /                                      | E
  R |      return 2 |<--- 2*fun(1) = 2*return(1) = 2               | D
  N |               |      /                                       V
    |       return 1 |<- 1*fun(0)    reached Base case return 1.
    
Output = 1*2*3*4*5 = 120    
 */
    
    // It is taken O(n) time complexity.
    // It is taken O(n) time complexity.
    // Here, I am not use any extra variable.