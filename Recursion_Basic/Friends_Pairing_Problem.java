/*
*Question..
    Given n friends, each one can remain Single or can be paired up with some other friend. 
    Each friend can be paired only once. Find out the Total number of ways in which friends
    can remain Single or can be Paired up.
*Solution...
      n=1 =(single) -> ways = 1
      n=2 = ab --> single(a, b), pair(ab) -- ways = 2
      
*Logic::
      1. BASE CASE--> condition(n==1 || n==2)
                        return n;
      2. KAAM.
            1. Single choice...
                fnm1 = fun(n-1); ---> Recursive call.
            2. Pair choice...
                fnm2 = fun(n-2); ---> Recursive call.
            3. Totalways = fnm1+((n-1)*fmn2); ------> totalways = Single + pair.
                return Totalways.    

*Stack Tree Analysis....
n = 5
Final return Tways = 26      <--                fun(5) --> Main Function..
                             |                     /\
                             |                    /  \
                             |                   /    \
                             |                  /      \
Tways= return(10)+((5-1)*(4))=26<--     fun1(4)     fun2(3)
                             |              /\            /\
                             |             /  \          /  \
                             |            /    \        /    \
                             |           /      \ fun1(2)  fun2(1)  ----> Reached BASE CASE...
                             |          /        \ 
Tways= return(4)+((4-1)*(2))=10<--  fun1(3)  fun2(2) ----> Reached BASE CASE...
                             |          /\
                             |         /  \
                             |        /    \ 
                             |       /      \
Tways= return(2)+((3-1)*(1))=4<-- fun1(2)    fun2(1)  ----> Reached BASE CASE...

*/    
public class Friends_Pairing_Problem{
    
    //This Function Work on calculate Friends Pairing Problem.
    public static int Pairing_Solution(int n){
        //BASE CASE...
        if(n==1 || n==2){
            return n;
        }

        //KAAM
        //*1. Single choice.
        int fnm1 = Pairing_Solution(n-1);  // --> Recursive call.
        //*2. Pair choice
        int fnm2 = Pairing_Solution(n-2); // --> Recursive call.

        //int Pairways = (n-1)*fnm2;
        int Totalways = fnm1+((n-1)*fnm2); // totalways = single + pair.

        return Totalways;
    }

    public static void main(String args[]){
        System.out.println("Total ways : "+ Pairing_Solution(3));
        System.out.println("Total ways : "+ Pairing_Solution(4));
        System.out.println("Total ways : "+ Pairing_Solution(5));
        System.out.println("Total ways : "+ Pairing_Solution(6  ));

    }
}