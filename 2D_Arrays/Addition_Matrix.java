import java.util.*;
public class Addition_Matrix{
    
    public static void Print_matrix(int arr1[][], int arr2[][], int add[][]){
        
        System.out.println("\nMatrix1\t\t\t Matrix2\t\t\t Add Matrix");
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("\t\t\t");
            for(int j=0; j<arr2[0].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.print("\t\t\t");
            for(int j=0; j<add[0].length; j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //This method calculate addition matrix.
    public static void Add_matrix(int arr1[][], int arr2[][]){
        int addMatrix[][] = new int[arr1.length][arr1[0].length];
        
        //Calculate Addition matrix.
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                addMatrix[i][j] = arr1[i][j] + arr2[i][j];  //Here add matrix.
            }
        }
        
        //Invoked Print matrix.
        Print_matrix(arr1, arr2, addMatrix);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row, col;
        
        System.out.print("enter your matrix row(n) size : ");
        row = sc.nextInt();
        System.out.print("enter your matrix column(m) size : ");
        col = sc.nextInt();
        
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        
        //Input matrix element 
        System.out.print("enter your first matrix element :: ");
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("enter your second matrix element :: ");
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[0].length; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        //Invoked Add Matrix.
        Add_matrix(matrix1, matrix2);
  
    }
}