public class Find_Last_Occurrence_1{

    //This function work on find Last occurrence(index) key in array.
    //This Function go zero to arr.length
    public static int check_Occurrence(int arr[], int i, int key){
        //BASE CASE.
        if(i==arr.length){
            return -1;   //key not Found statement.
        }
        
        //KAAM.
        int isFound = check_Occurrence(arr, i+1, key);   // key Found statement.
        if(isFound == -1 && key == arr[i]){
            return i;
        }
        
        return isFound;    
        
    }
    
    public static void main(String args[]){
        int array[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        
        //Invoked Method..    (key Found Statement)...
        System.out.println("Last Occurrence of "+key+" is : "+check_Occurrence(array, 0, key));
        
        key = 3;
        //Invoked Method...
        System.out.println("Last Occurrence of "+key+" is : "+check_Occurrence(array, 0, key));
        
        //Invoked Method.... (key not Found Statement)...
        key = 12;
        System.out.println("Last Occurrence of "+key+" is : "+check_Occurrence(array, 0, key));
        
    }
}
/*
    Logic:
         i = 0
    
         1. BASE CASE --> condition(i == arr.length)
                               return -1;
    
         2. KAAM --> conditon(key == arr[i])
                              return i;
                     else  
                         return fun(arr, i+1, key) ;      //--> Recursive call.
    
    
    It is taken O(n) time complexity.
    it is taken O(n) space complexity. 
    
*/