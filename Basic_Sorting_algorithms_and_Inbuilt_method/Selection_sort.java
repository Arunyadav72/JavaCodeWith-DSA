/*
    Selection sort..
    1. It is taken O(n2) time complexity.
    2. Pick the smallest value (from unsorted part), and put it at the begining.
    3. arr[] = {5, 4, 1, 3, 2};
       sort : 1 2 3 4 5
    
    4. Logic:
      Outer loop --> (i=0 to n-1)
                     min = i; //pick small value index
      Inner loop --> (j=i+1 to n-1)
                      compare(arr[j] < arr[min]) //check small value index
     outer loop--> swaping
*/
    
public class Selection_sort{
    //This is selection sort method, print element in increasing order.
    public static void selection_sort(int arr[]){
        //outer loop
        for(int i=0; i<arr.length; i++){
            int min = i; // pick smallest value index.
            //Inner loop
            for(int j=i+1; j<arr.length; j++){
                //check smallest number index.
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //swaping 
            int tem = arr[i];
            arr[i] = arr[min];
            arr[min] = tem;
        }
    }
    
    //This method print array element.
    public static void Print_array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        
        System.out.println("Unsorted element : ");
        Print_array(arr);  //Invoked Method
        
        //Invoekd method
        selection_sort(arr);
        
        System.out.println("Sorted element : ");
        Print_array(arr); //Invoked Method.
        
    }
}