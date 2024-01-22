public class Find_First_Occurence{
    
    //This function work on find First occurrence(index) key in array.
    public static int check_Occurrence(int arr[], int i, int key){
        //BASE CASE
        if(i==arr.length){
            return -1;   //key not found in array.
        }
        
        //KAAM.
        if(key == arr[i]){ // key Found statement (first occurrence)
            return i;
        }
        
        return check_Occurrence(arr, i+1, key);  // Recursive call.
    }
    
    public static void main(String args[]){
        int array[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        
        //Invoked Method...      (key Found Statement)....
        System.out.println("First Occurrence of "+key+" is : "+check_Occurrence(array, 0, key));
        
        key = 3;
        //Invoked Method...
        System.out.println("First Occurrence of "+key+" is : "+check_Occurrence(array, 0, key));
        
        //Invoked Method...     (Key not Found Statement)....
        key = 12;
        System.out.println("First Occurrence of "+key+" is : "+check_Occurrence(array, 0, key));
        
    }
}
/*
    
   Logic:
          1. BASE CASE --> condition(i==arr.length)
                           return -1;  //--> not Found statement.
          2. condition(key==arr[i])   //--> Found statement.
                        return i;
                   else  
                       return Recursive call

    
    It is taken O(n) time complexity.
    It is taken O(n) space complexity.
    
*/