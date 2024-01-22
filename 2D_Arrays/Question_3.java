/*
    Question 3.
    Write a program to find Transpose of a matrix.
    what is Transpose?
    Transpose of a matrix is the process of swapping the row, columns. Fora 2X3 matrix.

*/
    
public class Question_3{
    //This method print matrix element.
    public static void Print_matrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //This Method convert matrix to transpose matrix.
    public static void Transpose_Matrix(int arr[][], int trans[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                trans[j][i] = arr[i][j]; //transpose statement.
            }
        }
        
        //Invoked Print Mathod.
        System.out.println("Transpose Matrix ::: ");
        Print_matrix(trans);
    }
    
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 5},
                         {6, 7, 8, 9}}; 
        
        //Invoked print matrix Method.
        System.out.println("Matrix element ::: ");
        Print_matrix(matrix);
        
        //Invoked Transpose matirx.
        Transpose_Matrix(matrix, new int[matrix[0].length][matrix.length]);
    }
}