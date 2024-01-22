public class Merge_sort_decreasing{
    /*
    *Divide -->
                1. divide left part
                2. divide right part

    *Conqure --> 
               Merge karana (add sorted element).          
    */      
           
    //This Function Function Follow Divide and conqure rule.
    public static void Merge_sort(int arr[], int si, int ei){
        //BASE CASE
        if(si>=ei){
            return;
        }

        //KAAM.
        int mid = si+(ei-si)/2;
        Merge_sort(arr, si, mid); //Divide left part.
        Merge_sort(arr, mid+1, ei); //Divide right part.
        Merge(arr, si, ei, mid); // Invoked Merge Method.
    }
    public static void Merge(int arr[], int si, int ei, int mid){ //add sorted element...
        int tem[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i] > arr[j]){
                tem[k] = arr[i];
                i++;
            }
            else{
                tem[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            tem[k++] = arr[i++];
        }
        
        while(j<=ei){
            tem[k++] = arr[j++];
        }

        //copy tem to original array.
        for(k=0, i=si; k<tem.length; k++, i++){
            arr[i] = tem[k];
        }
    }


    //This Function work on Print array element...
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

        Merge_sort(arr, 0, arr.length-1); // Invoked Method.

        System.out.print("Sorted element : ");
        Print_Array(arr);

    }
}