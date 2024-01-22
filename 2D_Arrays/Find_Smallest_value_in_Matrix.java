public class Find_Smallest_value_in_Matrix{
    
    //This Function work on find smallest value in matrix.
    public static void Smallest(int arr[][]){
        int Min = Integer.MAX_VALUE;   //plus infinity value.
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                
                //checking smallest value.
                if(Min > arr[i][j]){
                    Min = arr[i][j];
                }
            }
        }
        
        //Print Min value.
        System.out.println("Smallest value in matrix is : "+Min);
    }
    
    //This method print matrix element.
    public static void Print_matrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int matrix[][] = {{2, 5, 10},
                          {8, 6, 5},
                          {1, 5, 10}};
        
        //Invoked Print method.
        System.out.println("Your matrix :::");
        Print_matrix(matrix);
        
        //Invoked Smallest method
        Smallest(matrix);
    }
}