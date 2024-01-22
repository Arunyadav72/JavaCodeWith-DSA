/*
    Question 2.
    Print out the sum of number in the second row of the "nums" array.
    Example:
    input -> int [][] nums = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
    output -> 18

*/
    
public class Question_2{
    //This method calculate sum of 1 row.
    public static int Sum_of_Second_Row(int arr[][]){
        int sum = 0;
        for(int j=0; j<arr[0].length; j++){
            sum+=arr[1][j]; //Sum of row.
        }
        
        return sum; //return sum of 1st row.
    }
    
    
    public static void main(String args[]){
        int nums[][] = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};
        
        //Invoked Sum method.
        System.out.println("sum of 1 row data : "+Sum_of_Second_Row(nums));
    }
}