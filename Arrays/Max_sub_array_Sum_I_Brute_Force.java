public class Max_sub_array_Sum_I_Brute_Force{
    
    //This is Find Max sub array Sum Method..
    public static void Max_subarray_Sum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        
        //Starting point..
        for(int i=0; i<arr.length; i++){
            int start = i;
            //ending point..
            for(int j = i; j<arr.length; j++){
                int end = j;
                
                //Here calculate currSum of jth time.
                currSum = 0; //jth time currSum is Zero.
                for(int k=start; k<=end; k++){
                    currSum+=arr[k];
                }
                
                //Here check Max Sum.
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        
        //Here output of Max subarray Sum..
        System.out.println("Max sub array Sum is : "+maxSum);
    }
    
    public static void main(String agrs[]){
        int number[] = {2, 4, 6, 8, 10};
        
        //Invoked Max_subarray_Sum method.
        Max_subarray_Sum(number);
    }
}