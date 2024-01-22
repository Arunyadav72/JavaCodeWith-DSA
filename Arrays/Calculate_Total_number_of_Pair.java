public class Calculate_Total_number_of_Pair{
    
    //This is calculate total number of pair method...
    public static void calculate_Total_pair(int arr[]){
        int total_pair = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i]; //2, 4, 6, 8 10
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+curr+", "+arr[j]+") ");
                
                total_pair++ ; // Calculate total number of pair.
            }
            System.out.println();
        }
        
        //Print Total number of pair.
        System.out.println("Total pair is : "+total_pair);
    }
    
    public static void main(String agrs[]){
        int number[] = {2, 4, 6, 8, 10};
        
        //Invoked calculate_Total_pair..
        calculate_Total_pair(number);
    }
}