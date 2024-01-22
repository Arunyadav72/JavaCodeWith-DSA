/*
Sorted Matrix-->
1  2  3  4
5  6  7  8 
9  10 11 12
13 14 15 16        note point... 1. key greater than matrix element To srow++
                                 2. key less than matrix element To endcol--

note -->
1. Search for a key in row wise and column wise sorted matrix
2. Search in sorted matrix is called stairase search.

Logic:   
--------> key = 13

1.  srow = 0, endcol = n-1, endrow = n-1, scol = 0;
2. Loop --> while(srow <= endrow && scol<=endcol)
    (i) if(key == arr[srow][endcol]) --> return true;
    (ii). if(key > arr[srow][endcol]) --> srow++;
    (iii). if(key < arr[srow][endcol]) --> endcol--;

*/
import java.util.*;
public class Search_in_Sorted_Matrix{
    //This method search key of sorted matrix.
    public static boolean Stairase_Search(int arr[][], int key){
        int srow, endrow, scol, endcol;
        srow = 0;
        endrow = arr.length-1;
        scol = 0;
        endcol = arr[0].length-1;
        
        while(srow<=endrow && scol<=endcol){
            //Found key statement.
            if(key == arr[srow][endcol]){ 
                System.out.print(" ["+srow+" "+endcol+"] -> ");
                return true;
            }
            
            //go to bottom part.
            if(key > arr[srow][endcol]){
                srow++;
            }
            else{ //key < arr[srow][endcol] --> go to left part.
                endcol--;
            }
        }
        return false ; // key not found.
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        int key;
        System.out.print("enter the key : ");
        key = sc.nextInt();
        
        //Invoked Stairase Search Method.
        System.out.println("Found key index :: "+Stairase_Search(matrix, key));
    }
}