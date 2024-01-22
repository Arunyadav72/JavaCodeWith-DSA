    /*
    Question 1.
    Print the number of 7's that are in the 2d array.
    Example: 
        input[][] array = {{4, 7, 8}, {8, 8, 7}};
        output = 2
    */
    
public class Question_1{
    //This method check same number of element times.
    public static int Solution(int arr[][], int key){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                //checking key times.
                if(key == arr[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
   
    public static void main(String args[]){
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};
        
        int key = 7;
        
        //Invoked Solution Method.
        System.out.println(key+" is present "+Solution(matrix, key)+" times in array");
    }
}