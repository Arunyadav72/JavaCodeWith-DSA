/*
    Decreasing order...
    1. import java.util.Arrays; 
    2. import java.util.Collections;
    3. Arrays.sort(arr, Collections.reverseOrder());
    where---> 
         i. arr is array variable name.
         ii. Collections --> reverseOrder libaray package
         iii. reverseOrder --> This Function not use primitive datatyep. It is
                               use object data type. like Integer not int.
    
*/

import java.util.Arrays;  //--> Libaray package
import java.util.Collections; //--> Libaray package
public class Inbuilt_Sort_Function_Decreasing_order {

    public static void main(String args[]){
        Integer arr[] = {5, 4, 1, 3, 2};
        
        //output of Unsorted order
        System.out.print("Unsorted array element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
         
        //This is decreasing order sort. It is use Collecttion reverseOrder Function.
        Arrays.sort(arr, Collections.reverseOrder());
        
        //Output of Deccreasing sorted order.
        System.out.print("Sorted array element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
