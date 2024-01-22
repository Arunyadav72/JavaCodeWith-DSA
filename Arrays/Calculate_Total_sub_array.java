public class Calculate_Total_sub_array{
    
    //This is calculate total sub array and print subarray method..
    public static int calculate_Total_sub_Array(int arr[]){
        int total_sub = 0;
        //starting point..
        for(int start = 0; start<arr.length; start++){
            //ending point..
            for(int end = start; end<arr.length; end++){
                total_sub++;  //Calculate total sub array..
                
                //print sub array..
                for(int i=start; i<=end; i++){
                    //Print subarray.
                    System.out.print(arr[i]+" ");
                }
               
                System.out.println();
            }
            System.out.println();
        }
        
        return total_sub;
    }
    public static void main(String args[]){
        int number[] = {2, 4, 6, 8, 10};
       
        //Invoked calculate_Total_sub_Array method..
        System.out.println("Total sub array is : "+calculate_Total_sub_Array(number));
    }
}