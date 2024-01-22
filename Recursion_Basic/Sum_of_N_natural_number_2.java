public class Sum_of_N_natural_number_2{
     /*
    Logic:
    1. if(n==1) return 1
    2. totalsum = n+fun(n-1)
       return totalsum.
    */
    
/* Call Stack Tree.
n = 5 
Finaly return 15    |            fun(5)
                    |            /
         return 115 |<---      5+fun(4)  = 5+return(10) = 15       | I
    ^               |           /                                  | N
  R |     return 10 |<---    4+fun(3) = 4+return(6) = 10           | V
  E |               |          /                                   | O 
  T |      return 6 |<---   3+fun(2) = 3+return(3) = 6             | K
  U |               |        /                                     | E
  R |      return 3 |<--- 2*fun(1) = 2+return(1) = 3               | D
  N |                reached Base case return 1.                   V
 
    
Output = 1+2+3+4+5 = 15      
 */
    
    //This Function work on calculate Sum of natural number.
    //*** It is taken O(n) time complexity.
    //*** It is taken O(n) Space Complexity.
    //*** Here, I am use extra variable.
    public static int Sum(int n){
        if(n==1){ //Base case.
            return 1;
        }
        int totalsum = n+Sum(n-1); //Here, Recursive call.
        return totalsum;
    }
    
    public static void main(String args[]){
        int n = 5;
        System.out.println("Sum of N natural number is : "+Sum(n)); //Here, Invoked Method.
    }
}