public class Sorted_And_Rotated_Array_Search{

    //This Funtion Follow Divide and conqure search approach.
    //It is taken O(nlogn) time complexity.
    public static int Search(int arr[], int si, int ei, int tar){
        //BASE CASE
        if(si>ei){
            return -1; //target not found.
        }

        //KAAM
        int mid = si+(ei-si)/2;

        if(tar == arr[mid]){ //target index found.
            return mid;
        }

        //Checking target..
        if(arr[si] <= arr[mid]){ //Mid on Line 1. To Left Part.
            if(tar >= arr[si] && tar <= arr[mid]){
                return Search(arr, si, mid-1, tar); // Go to Left Part..
            }
            else{
                return Search(arr, mid+1, si, tar); //Go to right Part..
            }
        }
        else{//Mid on Line 2. To right part.
            if(tar >= arr[mid] && tar <= arr[ei]){
                return Search(arr, mid+1, ei, tar); //Go to right part.
            }
            else{
                return Search(arr, si, mid-1, tar); //Go to Left part.
            }
        }
    }


    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;

        //Invoked Method...
        System.out.println("Target index of "+target+" is : "+Search(arr, 0, arr.length-1, target));

        //Invoked Method..
        target = 0;
        System.out.println("Target index of "+target+" is : "+Search(arr, 0, arr.length-1, target));
    }
}