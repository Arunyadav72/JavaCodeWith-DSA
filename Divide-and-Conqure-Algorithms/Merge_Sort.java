public class Merge_Sort{
/* 
*Note:
    1. This Function work on sort Increasing order..
    2. It is taken O(nlogn) time complexity.
    3. It is taken O(n) space complexity.
    4. Merge sort called as Depth first sort.

*Logic:
    1. BASE CASE--> condition(si>=ei)--> return;
    2. KAAM.
       1. Mergesort(arr, si, mid); --> Divide left part.
       2. Mergesort9arr, mid+1, ei); --> Divide right part.

    3. Merge(arr, si, ei, mid); --> add element in sorted order.    

* Apporach:
        1. Divide --> mid
        2. Merge_sort(left)
           Merge_sort(right)

        3. Merge   
*/  
    
    //This Function Follow Divide and conqure rule.
    public static void Merge_sort(int arr[], int si, int ei){
        //BASE CASE..
        if(si >= ei){
            return;
        }

        //KAAM..
        int mid = si+(ei-si)/2;     //Calculate array of mid.
        Merge_sort(arr, si, mid);    //--> divide Left part.
        Merge_sort(arr, mid+1, ei); //--> divide right part.
        Merge(arr, si, ei, mid); //Invoked Merge Method.
    }
    //This Function Merge element. add sorted order.
    public static void Merge(int arr[], int si, int ei, int mid){
        int tem[] = new int[ei-si+1];
        int i = si;  // Iterater for left part.
        int j = mid+1; // Iterator for right part.
        int k = 0;  // Iterator for tem array.

        //Merge left and right part.
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){ //checking smallest
                tem[k] = arr[i];
                i++;
            }
            else{
                tem[k] = arr[j];
                j++;
            }
            k++;
        }

        //Merge left part of Remaining(bacha hua) element.
        while(i<=mid){
            tem[k++] = arr[i++];
        }

        //Merge right part of Remaining(bacha hua) element.
        while(j<=ei){
            tem[k++] = arr[j++];
        }

        //copy tem array to original array.
        for(k=0, i=si; k<tem.length; k++, i++){
            arr[i] = tem[k];
        }

    }

    //This Funtion work on Print Array element....
    public static void Print_Array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.print("Unsorted element : ");
        Print_Array(arr);

        Merge_sort(arr, 0, arr.length-1);  //Invoked Merge sort Method..

        System.out.print("Sorted element : ");
        Print_Array(arr);
    }
}