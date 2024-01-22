public class Find_subset_of_Array{

    //This Function work on calculate Array subset...
    public static void Find_Subset(int arr[], int i, String ans){
        //BASE CASE
        if(i == arr.length){
            if(ans.length() == 0){ //If subset is empty..
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        //KAAM. Recursive call....
        //* Yes choice..
        Find_Subset(arr, i+1, ans+arr[i]);

        //*No chocie..
        Find_Subset(arr, i+1, ans); //backtracking step..
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3};

        //Invoked Method...
        System.out.println("Subset is ---> ");
        Find_Subset(arr, 0, "");
    }
}