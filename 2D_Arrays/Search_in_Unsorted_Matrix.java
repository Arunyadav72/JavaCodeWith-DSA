import java.util.*;
public class Search_in_Unsorted_Matrix{
    
    //This method Find key index in matrix.
    public static boolean Search_Matrix(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                    System.out.print("["+i+" "+j+"] --> ");
                    return true; //if key found.
                }
            }
        }
        return false;  //if key not found.
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int matrix[][] = {{12, 3, 14, 2},
                          {15, 12, 10, 11},
                          {34, 35, 23, 22},
                          {19, 15, 17, 21}};
        int key;
        System.out.print("enter the key : ");
        key = sc.nextInt();
        
        //Invoked Search Matrix.
        System.out.println("Found key index : "+Search_Matrix(matrix, key));
    }
}