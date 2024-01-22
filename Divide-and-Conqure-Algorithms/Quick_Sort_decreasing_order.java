public class Quick_Sort_decreasing_order{

    //This Funtion Follow Pivot and Partition rule.
    public static void quick_sort(int arr[], int si, int ei){
        //BASE CASE..
        if(si>=ei){
            return;
        }

        //KAAM..
        int pivot_Index = Partition(arr, si, ei); //actual time pivot index.
        quick_sort(arr, si, pivot_Index-1); //Left part.
        quick_sort(arr, pivot_Index+1, ei); //right part.
    }
    public static int Partition(int arr[], int si, int ei){ //sorted pivot rotated order.
        int pivot = arr[ei]; // Find pivot.
        int i = si-1; // to make place for else smallest than pivot.

        //Rotated si to ei index.
        for(int j=si; j<ei; j++){
            if(arr[j] >= pivot){ //checking arr element big pivot.
                //swap
                i++;
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

        return i; //return actual time pivot index.
    }

    //This Function work on Print array element.
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