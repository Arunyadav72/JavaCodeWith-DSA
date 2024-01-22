/*
*Question..
    Print all binary strings of size N without consecutive ones.
*solution..
    consecutive ones --> 1 ke baad 1 aana chahiye.
    example --> "010011", "01101001" 

    without consecutive ones --> 1 ke baad 1 nahi aana chahiye.
    example --> "010010"
                "10001001"
                "00000000"
                "010101"

*Possible Solutaion binary string..
  n   --->  binary string
  0   --->    ""
  1   --->    "0", "1"
  2   --->    "00", "01", "10"
  3   --->    "000", "001", "010", "100", "101"        
*/

public class Binary_String_Problem{
    //This Function work on calculate binary string.
    public static void Binary_String_Solution(int n, int Last_place, String binstr){
        //BASE CASE...
        if(n==0){
            System.out.println(binstr);
            return;
        }
        //KAAM.
        Binary_String_Solution(n-1, 0, binstr+"0");

        //*1. Yadi last place = 0. then the add 1
        if(Last_place == 0){
            Binary_String_Solution(n-1, 1, binstr+"1");
        }
    }

    public static void main(String args[]){
        //Invoked Method....
        System.out.println("Binary string is n = 3: ---> ");
        Binary_String_Solution(3, 0, "");

        System.out.println("\nBinary string is n = 2: ---> ");
        Binary_String_Solution(2, 0, "");
    }
}