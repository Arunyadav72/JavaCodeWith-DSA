/*
    Question...
    use the following sorting algorithms to sort an array in descending order.
    a. Bubble sort
    b. Selction sort
    c. Insertion sort
    d. Counting sort
    
    You can use this as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]
    
*/
    
public class Question{
    //This is bubble sort method.
    public static void Bubble_Sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){ //Checking
                    //swaping
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
    }
    
    //This is Selection sort method.
    public static void Selection_Sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int max = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] > arr[max]){ //checking max.
                    max = j;
                }
            }
            //swaping
            int tem = arr[i];
            arr[i] = arr[max];
            arr[max] = tem;
        }
    }
    
    //This is Insertion sort method.
    public static void Insertion_Sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int tem = arr[i];
            int j = i-1;
            
            while(j>=0 && tem > arr[j]){
                arr[j+1] = arr[j+1];
                j--;
            }
            arr[j+1] = tem;
        }
    }
    
    //This is Print array element method.
    public static void Print_array(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        
        //Invoked Print Method.
        System.out.print("Unsorted array : ");
        Print_array(arr);
        
        //Invoked Bubble sort Method.
        System.out.print("Bubble sort : ");
        Bubble_Sort(arr);
        Print_array(arr);
        //Invoked Selection sort Method.
        System.out.print("Selection sort : ");
        Selection_Sort(arr);
        Print_array(arr);
        
        //Invoked Insertion sort Method.
        System.out.print("Insertion sort : ");
        Insertion_Sort(arr);
        Print_array(arr);
    }
}