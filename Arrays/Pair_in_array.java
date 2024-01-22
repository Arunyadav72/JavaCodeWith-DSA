/*
    Array. {2, 4, 6, 8, 10}
    Pair..
    (2, 4)(2, 6)(2, 8)(2, 10)
    (4, 6)(4, 8)(4, 10)
    (6, 8)(6, 10)
    (8, 10)
    
    **
    1. It is taken O(n2) time complexity..
    2. It is continious.

*/
public class Pair_in_array{
    
    //This is Pair array method..
    public static void Print_Pair_Array(int arr[]){
        int curr;
        for(int i=0; i<arr.length; i++){
            curr = arr[i]; //2, 4, 6, 8, 10
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+ curr +", "+ arr[j] +") ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10};
        
        
        //Invoked Print_Pair_Array Method..
        Print_Pair_Array(number);
    }
}