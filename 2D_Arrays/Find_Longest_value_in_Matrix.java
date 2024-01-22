public class Find_Longest_value_in_Matrix{
    
    //This is work on find longest number in matrix.
    public static void Longest(int matrix[][]){
        int max = Integer.MIN_VALUE;  // mins infinity value.
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                //check longest value.
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        
        //Print longest value.
        System.out.println("Logest value in matrix is : "+max);
    }
    
    //This method Print matrix element.
    public static void Print_matrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int matrix[][] = {{2, 5, 1},
                          {8, 6, 5},
                          {5, 10, 15}};  //Here declare matix element.
        
        
        //Invoked Pirnt matrix method.
        System.out.println("Your matrix element :::");
        Print_matrix(matrix);
        
        //Invoked Longest value in matrix method.
        Longest(matrix);
    }
}