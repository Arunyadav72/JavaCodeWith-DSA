public class Check_IF_array_is_Sorted_or_not_1{
    
    //This Function work on checking array is sorted in Increasing order.
    public static boolean Is_sorted(int arr[], int i){
        //BASE CASE.
        if(i==arr.length-1){
            return true;
        }
        
        //KAAM
        if(arr[i] < arr[i+1]){ //if ith element is less than ith+1 element then check forword. (Recursive call).
            return Is_sorted(arr, i+1);
        }
        else{//if ith element is not less than ith+1 element then return main function.
            return false;
        }
        
    }
    
    public static void main(String args[]){
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 34, 4, 5};
        
        //Invoked Method of 1st array.
        System.out.println("Array 1 is sorted in Increasing order : "+Is_sorted(arr1, 0));
        
        //Invoked Method of 2nd array.
        System.out.println("Array 2 is sorted in Increasing order : "+Is_sorted(arr2, 0));
        
    }
}

/*
    Logic: 
         1. BASE CASE --> condition(i==arr.length) 
                          return true;
         2. KAAM --> condition(arr[i] < arr[i+1])
                          return  Is_sorted(arr, i+1) --> Recursive call.(Checking again).
                     else
                         return false
*/  
    
/*Checking Increasing order.
    STACK TREE --> 
    arr1[5] = {1, 2, 3, 4, 5}                                                   arr2[5] = {1, 2, 34, 4, 5}
    n = 5                                                                       n = 5
                           
                fun(0) --> condition(arr[0] < arr[1])                                            fun(0) --> condition(arr[0] < arr[1])
                   /                                                                                 /
                  /                                                                                 /   
                 /                                                                                 /
            fun(1)  --> condition(arr[1] < arr[2])                                            fun(1)  --> condition(arr[1] < arr[2])
               /                                                                                 /
              /                                                                                 /
             /                                                                                 /
        fun(2)  --> condition(arr[2] < arr[3])                                            fun(2)  --> condition(arr[2] < arr[3])  ---> False.
           /                                                                                           return flase.
          /
         /
    fun(3)  --> condition(arr[3] < arr[4])
       /
      /
     / 
fun(4) -->   reached BASE CASE --> return true. 
    
*/    
    
/*
    
    * It is taken O(n) time complexity.
    * It is taken O(n) space complexity.
    
*/