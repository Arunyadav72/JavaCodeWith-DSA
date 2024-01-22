public class Check_IF_array_is_Sorted_or_not{
    
    //This Function work on checking array is sorted in Increasing order.
    public static boolean Is_sorted(int arr[], int i){
        if(i == arr.length-1){  //Base case.
            return true;
        }
        
        //Kaam.
        if(arr[i] > arr[i+1]){ // if ith element is greater than ith+1 element 
            return false;
        }
        
        return Is_sorted(arr, i+1);  //if ith element is less than ith+1 element then check forword.
        
    }
    
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        
        //Here, Invoked Method.
        if(Is_sorted(arr, 0) == true){
            System.out.println("Array is sorted! Increasing order.");
        }
        else{
            System.out.println("Array is not sorted! Increasing order.");
        }
    }
}

/*
    Logic:  
    1. if(i==arr.length-1)
           return true;
    
    2. condition
       if(arr[i] < arr[i+1])
           fun(arr, i+1); --> Recursive call.
       else 
           return false;
*/
    
// It is taken O(n) time complexity.
// It is taken O(n) space complexity.