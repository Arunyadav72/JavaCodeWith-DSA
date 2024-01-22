/*
    Inbuilt sort function..
    1. it is taken O(nlogn) time complexity
    2. import java.util.Arrays; ---> It is sorting libaray package.
    3. Arrays.sort(argument);   ---> it is inbuilt method.
       (i). where --> argument --> array variable name
       (ii). it is use to only increasing order.
*/

import java.util.Arrays; //It is sorting libaray package.
public class Inbuilt_Sort_Function_Increasing_order{
    
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        
        System.out.print("Unsorted element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        Arrays.sort(arr); //It is use to inbuilt sort function.
        
        System.out.print("Sorted element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}