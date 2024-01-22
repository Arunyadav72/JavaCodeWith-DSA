public class Print_x_to_the_power_n{
/*
*Logic ::
      1. BASE CASE --> condition(n==0)
                          return 1;
      2. KAAM --> int pow = fun(x, n-1)
                  int Xpower = x*pow;
                  return Xpower;                     
*/
/*
*Stack tree Analysis...
base case n==0 -- return 1.
x = 2
n = 3 

Finale return 8 <------------- fun(2, 3)  2 * return(4) = 8
                |                  /
                |                 /
      return 4  <---------- fun(2, 2)    2 * return(2) = 4
                |               /
                |              /
      return 2  <------- fun(2, 1)   2 * return(1) = 2
                |             /
                |            /
      return 1  <----- fun(2, 0) ---> reached base case. return 1   

*/
//* 1. This taken O(n) time complexity.
//* 2. This is taken O(n) space complexity.

    //This Finction work on calculate x^n.
    public static int Find_power(int x, int n){
        //BASE CASE
        if(n==0){
            return 1;
        }

        //KAAM
        int power = Find_power(x, n-1); //Recursive call. power = 1, 2, 4;
        int FinalPower = x*power; // 2*1 = 2, 2*2 = 4, 2*4 = 8;

        return FinalPower;
    }

    public static void main(String args[]){
        int x = 2; //number .
        int n = 3; // number of power.

        System.out.println(x+" the power of "+n+" = "+Find_power(x, n)); //Invoked Method.

        x = 5;
        n = 2;
        System.out.println(x+" the power of "+n+" = "+Find_power(x, n)); //Invoked Method.
    }
}