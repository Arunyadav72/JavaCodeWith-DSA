/*
    Kadanes algorithms..
    -----------------------> 
    Kadanes algorithms say that if the value of currSum is less than Zero the currSum is equal to zero.
    if maxSum is less than currSum, then maxSum should be currSum.
    2. if currSum < 0 hota hai. tab currSum = 0;
*/
    
//This is Find Max subarray Sum.
//This is called Kadanes algorithms.
    
public class Max_subarray_Sum_III_kadanes_algorithms{

    public static int Max_subArray_Sum_kadanes_algorithms(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i=0; i<arr.length; i++){
            //Here calculate currSum..
            currSum+=arr[i];
            
            //Here check currSum is less than Zero.
            if(currSum < 0){ 
                currSum = 0;
            }
            
            //Here check MaxSum..
            if(maxSum < currSum){
                maxSum = currSum;
            }
        }
        
        return maxSum; //return maxSum of subarray.
    }
    public static void main(String args[]){
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
       
        
        //Invoked Max subarray Sum kadanes algorithms
        System.out.println("Max subArray Sum is : "+Max_subArray_Sum_kadanes_algorithms(number));
    }
}