import java.util.*;
public class Search_matrix_element{
    
    
    //This Function work on search matrix element.
    public static boolean Search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){ //checkin search key.
                    System.out.print("Found at cell ("+ i +", "+ j + ") ");
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //declare 2D arrays.
        int matrix[][] = new int[3][3];
        
        //Input 2D arrays.
        System.out.println("enter your matrix element : ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                matrix[i][j] = sc.nextInt();  //Input line.
            }
        }
        
        //Output of 2D arrays.
        System.out.println("Your matrix element :: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Key is present : "+Search(matrix, 10)+" :: ");
    }
}