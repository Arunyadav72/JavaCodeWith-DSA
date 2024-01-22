public class Check_IF_array_is_sorted_in_decreasing_Order_or_not{
    
    
    //This Function work on checking array is sorted in Decreasing order.
    public static boolean Is_sorted(int arr[], int i){
        //BASE CASE
        if(i==arr.length-1){
            return true;
        }
        
        //KAAM
        if(arr[i] > arr[i+1]){//if ith element is greater than ith+1 element then check forword. (Recursive call).
            return Is_sorted(arr, i+1);
        }
        else{ //if ith element is not greater than ith+1 element then return false. (main function).
            return false;
        }
        
    }
    
    
    public static void main(String args[]){
        int arr1[] = {5, 4, 3, 2, 1};
        int arr2[] = {1, 2, 3, 4, 5};
        
        //Invoked Method of array 1.
        System.out.println("Array 1 is sorted in decreasing order : "+Is_sorted(arr1, 0));
        
        //Invokd Method of array 2.
        System.out.println("Array 2 is sorted in decreasing order : "+Is_sorted(arr2, 0));

    }
}