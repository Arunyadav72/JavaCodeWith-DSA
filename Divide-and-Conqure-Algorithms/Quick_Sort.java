public class Quick_Sort{
/*
*Apporach:
    * Here, pivot=(last index)--> jis element ke around ham arr ko rotate karte hai.
    1. BASE CASE --> condition(si>=ei)
                       return;
    2. KAAM.
           1. pivotIndex = partition(arr, si, ei);
           2. quicksort(arr, si, pivotIndex-1); --> left part.
              quicksort(arr, si, pivotIndex+1); --> right part. 

    3. partition(arr, si, ei)-->
        pivot = arr[ei];
        loop(j=si to ei){
            condition(arr[j] <= pivot)
            i++;
            swap;
        }        
        swap
        return i; --> return actual pivot wtih pivot rotated.

*Note point:
    *This is Increasing order sort.
    1. It is taken O(nlogn) time complexity.
    2. It is taken O(1) space complexity.
    3. Worst case time complexity O(n^2).
*/
    //This Function Follow Pivot and Partition rule.
    public static void quick_sort(int arr[], int si, int ei){
        //BASE CASE..
        if(si>=ei){
            return;
        }

        //KAAM..
        int pivot_index = Partition(arr, si, ei); //actual time pivot index.
        quick_sort(arr, si, pivot_index-1); //Left part.
        quick_sort(arr, pivot_index+1, ei); //right part.
    }
    public static int Partition(int arr[], int si, int ei){ //Divide rule.
        int pivot = arr[ei]; //find pivot si to ei index.
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){ //
                i++;
                //swap.
                int tem = arr[j];
                arr[j] = arr[i];
                arr[i] = tem;
            }
        }
        //swap
        i++;
        int tem = pivot;
        arr[ei] = arr[i];
        arr[i] = tem;

        return i; //return the true index for pivot index.
    }

    //This Function work print Array element...
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

        quick_sort(arr, 0, arr.length-1); // Invoked Method.

        System.out.print("Sorted element : ");
        Print_Array(arr);
    }
}