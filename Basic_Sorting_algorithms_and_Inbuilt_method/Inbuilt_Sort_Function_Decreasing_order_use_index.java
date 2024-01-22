/*
    Decreasing order...
    1. import java.util.Arrays; 
    2. import java.util.Collections;
    3. Arrays.sort(arr, start_index, end_index, Collections.reverseOrder());
    where---> 
         i. arr is array variable name.
         ii. Collections --> reverseOrder libaray package
         iii. reverseOrder --> This Function not use primitive datatyep. It is
                               use object data type. like Integer not int.
         iv. start_index --> kaha se sort karana hai.
         v. end_index --> kaha tak sort karana hai.
    
*/

import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_Sort_Function_Decreasing_order_use_index {

    public static void main(String args[]){
        Integer arr[] ={5, 4, 1, 3, 2, 6, 10,9};
        
        //Output of unsorted array element
        System.out.print("Unsorted array element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //This is decreasing order sort. it is Collections reverseOrder Function but use sort start and end index
        Arrays.sort(arr, 0, 7, Collections.reverseOrder());
        
        //output of Decreasing sorted order.
        System.out.print("Sorted element of index : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
