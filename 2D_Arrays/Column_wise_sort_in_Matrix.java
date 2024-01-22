public class Column_wise_sort_in_Matrix{
    
    //This Function work on sort column wise in matrix.
    public static void Sorting(int matrix[][]){
        //Insertion sort.
        for(int i=0; i<matrix[0].length; i++){ //Column.
            for(int j=1; j<matrix.length; j++){
                int tem = matrix[j][i];
                int k = j-1;
                
                while(k>=0 && tem < matrix[k][i]){
                    matrix[k+1][i] = matrix[k][i];
                    k--;
                }
                matrix[k+1][i] = tem;
            }
        }
    }
    
    //This method Print matrix element.
    public static void Print_matrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int matrix[][] = {{2, 1, 3},
                          {8, 5, 3},
                          {1, 0, 2}};
        
        //Invoked Pirnt matrix method.
        System.out.println("Unsorted matrix ::: ");
        Print_matrix(matrix);
        
        //Invoked Sorting method.
        Sorting(matrix);
        
        
        //Invoked Print_matrix : 
        System.out.println("\ncolumn wise sort in matrix ::: ");
        Print_matrix(matrix);
    }
}