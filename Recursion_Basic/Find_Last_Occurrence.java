public class Find_Last_Occurrence{
    
    //This function work on find Last occurrence(index) key in array.
    //This function go arr.length-1 to -1.
    public static int check_Occurrence(int arr[], int i, int key){
        //BASE CASE
        if(i==-1){    
            return -1;   //key not Found Statement.
        }
        
        //KAAM
        if(key == arr[i]){ //key Found Statement.
            return i;
        }
        
        return check_Occurrence(arr, i-1, key);  //Recursive call.
    }
    
    
    public static void main(String args[]){
        int array[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;
        
        //Invoked Method..    (key Found Statement)...
        System.out.println("Last Occurrence of "+key+" is : "+check_Occurrence(array, array.length-1, key));
        
        key = 3;
        //Invoked Method...
        System.out.println("Last Occurrence of "+key+" is : "+check_Occurrence(array, array.length-1, key));
        
        //Invoked Method.... (key not Found Statement)...
        key = 12;
        System.out.println("Last Occurrence of "+key+" is : "+check_Occurrence(array, array.length-1, key));
        
    }
}
/*
    Logic:
         i = arr.length-1
    
         1. BASE CASE --> condition(i == -1)
                               return -1;
    
         2. KAAM --> conditon(key == arr[i])
                              return i;
                     else  
                         return fun(arr, i-1, key) ;     //--> Recursive call.
    
    
    It is taken O(n) time complexity.
    it is taken O(n) space complexity. 
    
*/