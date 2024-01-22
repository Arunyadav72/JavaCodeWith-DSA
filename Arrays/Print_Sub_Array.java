/*
    1. Sub array is continuous part of array.
    2. It is taken O(n3) time complexity.
Print Sub Array...
    
    1.                 
         [2]
         [2, 4]
         [2, 4, 6]
         [2, 4, 6, 8]
         [2, 4, 6, 8, 10]     
        
    2.
        [4]
        [4, 6]
        [4, 6, 8]
        [4, 6, 8, 10]
        
    3.    
        [6]
        [6, 8]
        [6, 8, 10]
        
    4
        [8]
        [8, 10]
        
    5.
        [10]
                       
*/
    
public class Print_Sub_Array{
    
    //This is Print Sub Array Mehtod.
    public static void Print_sub_array(int arr[]){
        //Starting point..
        for(int i=0; i<arr.length; i++){
            int start = i;
            //ending point..
            for(int j=i; j<arr.length; j++){
                int end = j;
                //print point.. sub array
                for(int k =start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};
        
        //Invoked Print_sub_array method.
        Print_sub_array(arr);
    }
}