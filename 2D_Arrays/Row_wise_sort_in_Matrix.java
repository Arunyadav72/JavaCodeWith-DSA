public class Row_wise_sort_in_Matrix{
    
    //This Function work on row wise sort increasing order int matrix.
    public static void Sorting(int matrix[][]){
        
        //Insertion sort.
        for(int i=0; i<matrix.length; i++){ //row
            for(int j=1; j<matrix[0].length; j++){
                int tem = matrix[i][j];
                int k = j-1;
                
                while(k>=0 && tem < matrix[i][k]){
                    matrix[i][k+1] = matrix[i][k];
                    k--;
                }
                matrix[i][k+1] = tem;
            }
        }
    }
    
    //This method print matrix element.
    public static void Print_matrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[]){
        int matrix[][] = {{2, 1, 3},
                          {8, 5, 3},
                          {1, 0, 2}};
        
        //Invoked print matrix method.
        System.out.println("Unsort matrix element ::::");
        Print_matrix(matrix);
        
        //Invoked sorting method.
        Sorting(matrix);
        
        //Invoked Print_matrix method.
        System.out.println("\nRow wise sort matrix element ::::");
        Print_matrix(matrix);
    }
}