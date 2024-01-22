/*
    Bubble Sort...
    1. It is taken O(n2) time complexity.
    2. Large element come to the end of array by swapping with adjecent element.
    
    3. arr[] = [5, 4, 1, 3, 2}
       sort : 1 2 3 4 5
*/
    
public class Bubble_Sort{
    //This is Bubble Sort mathod. in increasing order.
    public static void bubble_Sort(int arr[]){
        //Outer loop.
        for(int i=0; i<arr.length-1; i++){
            //Inner loop.
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //swaping.
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
    }
    
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        
        System.out.println("unsorted element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        //Invoked bubble_Sort Method.
        bubble_Sort(arr);
        
        System.out.println("Sorted element : ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}