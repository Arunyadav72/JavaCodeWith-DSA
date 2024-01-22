/*
    Calculate total number pair farmula..
    
    total = (n*(n-1))/2
    
    where..
    n = array of length.
      
*/
public class Calculate_Total_number_of_Pair_use_Farmula{
    
    //This is Print pair method...
    public static void Print_Pair(int arr[]){
        int curr;
        for(int i=0; i<arr.length; i++){
            curr = arr[i]; //2, 4, 6, 8, 10
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+curr+", "+arr[j]+") ");
            }
            System.out.println();
        }
    }
    
    //This is calculate total number of pair...
    public static int Total_Pair(int n){
        int total_pair = 0;
        
        total_pair = (n*(n-1))/2; //use farmula..
        
        return total_pair;
    }
    
    public static void main(String agrs[]){
        int number[] = {2, 4, 6, 8, 10, 12, 13, 14, 15};
        
        //Invoked Print Pair method..
        Print_Pair(number);
        //Invoked Total_pair method
        System.out.println("Total pair is : "+Total_Pair(number.length));
    }
}