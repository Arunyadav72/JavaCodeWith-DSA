public class Question_1{
/*
*Question...
    For a given integer array of size N. You have to find the all Occurrences(indices) of given
    element(key) and print them. Use a recursive function to solve this problem.
    Sample input : arr[] =  {3, 2, 4, 5, 6, 2, 7, 2, 2}, key=2
    Sample output: 1 5 7 8
*/

    //This Function work on Find All Occurrence..
    public static void Find_All_Occurrence(int arr[], int i, int key){
        //BASE CASE
        if(i==arr.length){
            return;
        }

        //KAAM.
        //*1. Found key statement..
        if(key == arr[i]){
            System.out.print(i+" ");
            Find_All_Occurrence(arr, i+1, key);
        }
        //*2. key not found statement...
        else{ 
            Find_All_Occurrence(arr, i+1, key);
        }
    }

    public static void main(String args[]){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        //Invoked Method...
        System.out.print("All Occurrence is : ");
        Find_All_Occurrence(arr, 0, key);
        System.out.println();
    }
}