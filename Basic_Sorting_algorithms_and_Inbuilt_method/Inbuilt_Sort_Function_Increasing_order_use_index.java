/*
    Inbuilt sort function..
    1. it is taken O(nlogn) time complexity
    2. import java.util.Arrays; ---> It is sorting libaray package.
    
    3. Arrays.sort(array_variable_name, start_index, end_index);   ---> it is inbuilt method.
       --->
          This is Inbuilt Function use only increasing order but you want to
          define where are sorting index. (I means --> Tum kis index se kis index tak sorting karna chahate ho).
     
    4. it is use to only increasing order.
*/

import java.util.Arrays;  //---> It is sorting libaray package.
public class Inbuilt_Sort_Function_Increasing_order_use_index {
    
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        
        System.out.print("Unsorted element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //This is inbuilt sort method. it is use to starting and ending index.
        Arrays.sort(arr, 0, 3);
        
        System.out.print("Sorted element(0, 3 index) : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
