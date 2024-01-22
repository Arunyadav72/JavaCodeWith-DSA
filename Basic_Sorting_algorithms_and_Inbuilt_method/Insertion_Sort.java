/*
    Insertion sort..
    1. It is taken O(n2) time complexity
    2. Pick the element (from unsorted part), and place in the right position index in the sorted part.
    3. arr[] = {5, 4 1, 3, 2};
       sort : 1 2 3 4 5
    4.
    Unsorted               pick                       Sorted
    [5, 4, 1, 3, 2]         4                         [4, 5, 1, 3, 2]
    [4, 5, 1, 3, 2]         1                         [1, 4, 5, 3, 2]
    [1, 4, 5, 3, 2]         3                         [1, 3, 4, 5, 2]
    [1, 3, 4, 5, 2]         2                         [1, 2, 3, 4, 5]
                                                      ----------------> Final sorted
    5. Logic:
       outer loop--> (i=1 to n-1)
                  int tem = arr[i] //pick
                  int j = i-1;
       Inner loop --> (j>=0 && tem < arr[j])  //check currect position
                      arr[j+1] = arr[j] //shift currect postion
                      j--
       outer loop-->
       Insert currect position
       arr[j+1] = tem
                       
*/
    
public class Insertion_Sort{
    
    //This is Insertion sort method.
    public static void insertion_sort(int arr[]){
        //outer loop.
        for(int i=1; i<arr.length; i++){
            int tem = arr[i]; //pick element from unsorted part.
            int j = i-1;
            
            //Inner loop
            while(j>=0 && tem < arr[j]){ //Checking currect position index.
                arr[j+1] = arr[j];
                j--;
            }
            //Insertion currect position index.
            arr[j+1] = tem;
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
        
        System.out.print("Unsorted element : ");
        Print_array(arr); //Invoked method.
        
        insertion_sort(arr); //Invoked method.
        
        System.out.print("Sorted array : ");
        Print_array(arr); //Invoked method.
        
        
    }
}