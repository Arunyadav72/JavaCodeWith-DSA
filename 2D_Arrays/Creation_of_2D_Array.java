/*
2D Arrays..
Here....
    1. How to Create 2D Arrays.
    2. How to calculate 2D Arrays length;
       (i) row length
       (ii) column length
    3. How to Input in 2D Arrays.
    4. How to output in 2D Arrays.

*/
import java.util.*;
public class Creation_of_2D_Array{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       //create 2D Array(matrix).
       int matrix[][] = new int[3][3];
       
       //Calculate 2D(matrix) length...
       int n = matrix.length; // row length;
       int m = matrix[0].length; //column length;
       
       //Input 2D Array(matrix) element statement.
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               matrix[i][j] = sc.nextInt(); //Input line.
           }
       }
       
       //Output of 2D Arrays.
       for(int i=0; i<n; i++){
           for(int j=0; j<m; j++){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
       
    }
}