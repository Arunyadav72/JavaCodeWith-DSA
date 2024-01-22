public class Max_subarray_Sum_II_Prefix_Force{
    /*
    Prefix Sum Force..
    1. It is taken O(n2) time complexity.
    2. Prefix Sum like a array. Prefix sum store ith element of sum.
    3. prefix --> 
                pre --> Pahale element ka sum
                fix --> fix element ka sum
    
    4. How to calculate currSum.
          currSum = prefix[end] - prefix[start-1];
    5. How to calculate prefix Sum.
           (i). prefix[0] = arr[0];
           (ii). prefix[i] = prefix[i-1] + arr[i];
    */
    
    public static int Max_subArray_Sum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        
        //Here calculate prefix array..
        int prefix[] = new int[arr.length]; //declare preifx array;
        
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        
        //Here claculate maxSum..
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                //Here calculate currSum..
                if(start == 0){
                    currSum = prefix[end];
                }
                else{
                    currSum = prefix[end]-prefix[start-1];
                }
                
                //Here check maxSum.
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        
        return maxSum;
    }
    public static void main(String agrs[]){
        int number[] = {2, 4, 6, 8, 10};
        
        //Invoked Max-subArray_Sum method
        System.out.println("Max subarray  Sum is : "+Max_subArray_Sum(number));
    }
}