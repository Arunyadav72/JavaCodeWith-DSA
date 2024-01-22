public class Find_Factorial_OF_N_2{
    
    // This Function work on Calculate Factorial number.
    public static int Fact(int n){
        if(n==0){ //Base case.
            return 1;
        }
        int Fnm1 = Fact(n-1); //Recursive call
        int Total_Fact = n*Fnm1;
        
        return Total_Fact;
    }
    
    public static void main(String args[]){
        int n = 5;
        
        System.out.println("Fatorial number is : "+Fact(n)); //Here, Invoked Method.
    }
}

/* Call Stack Tree.
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
    |       return 1 |<- 1*fun(0)    reached Base case return. 1*return(1) = 1.
    
    
 Output = 1*2*3*4*5 = 120
 */
    // It is taken O(n) Space complexity.
    // It i taken O(n) time complexity.
    // Here, I am use extra variable.