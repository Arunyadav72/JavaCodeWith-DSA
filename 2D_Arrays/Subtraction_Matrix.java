import java.util.*;
public class Subtraction_Matrix{
    
    
    //This Method print matrix element..
    public static void print_Matrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    //This Method Subtraction two Matrix.
    public static void Sub_Matrix(int matrix1[][], int matrix2[][], int sub_Matrix[][]){
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                sub_Matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        //Invoked Print Matrix;
        System.out.println("Subtractio Matrix ::: ");
        print_Matrix(sub_Matrix);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int row, col;
        
        System.out.print("enetr the row size : ");
        row = sc.nextInt();
        System.out.print("enter the col size : ");
        col = sc.nextInt();
        
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        
        //Input Matrix element.
        System.out.println("enter the first matrix element ::: ");
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[0].length; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("enter the second matrix element ::: ");
        for(int i=0; i<matrix2.length; i++){
            for(int j=0; j<matrix2[0].length; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        //Invoked subtraction matrix.
        Sub_Matrix(matrix1, matrix2, new int[row][col]);
        
    }
}