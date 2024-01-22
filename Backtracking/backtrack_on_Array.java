public class backtrack_on_Array{
/*
* This is array backtracking.
*It is taken O(n) time complexity.
*It is taken O(n) space complexity.
*/    

    //This Function work on assign value call time and change retur time..
    public static void Change_Arr(int arr[], int i, int val){
        //BASE CASE..
        if(i == arr.length){
            System.out.print("Call time assign value : ");
            Printarray(arr); //Invoked Print array method.
            return;
        }

        //KAAM..
        arr[i] = val;//assign value when reached base case..
        Change_Arr(arr, i+1, val+1); //Recursive call..
        arr[i] = arr[i]-2; //*Here backtracking step..
    }

    //This Function work on Print array element...
    public static void Printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int arr[] = new int[5];

        //Invoked Change Array Mehtod..
        Change_Arr(arr, 0, 1);

        //Invoked Print Array Method..
        System.out.print("Return time change value : ");
        Printarray(arr);
    }
}