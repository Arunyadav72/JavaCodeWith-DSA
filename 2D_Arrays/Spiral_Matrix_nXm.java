/*
Spiral matrix ....
       ------------->
       | ---------> |
       | | ---->  | |
       | <--------| |
       <------------|
    
    1  2  3  4  5
    6  7  8  9  10
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25  (nXm = 5X5)--> Odd
    
    print spiral matrix element....
    1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
    
    Kaam kya hai--->
    1. print matrix top border
    2. print matrix right border
    3. print matrix bottom border
    4. print matrix left border
    
    Logic:
    1. Outer loop --> while (srow<=endrow && scol<=endcol)
        srow++
        scol++
        endrow--
        endcol--
    2. (i) Inner loop --> (scol to endcol)
          print top.
       (ii) Inner loop --> (srow+1 to endrow)
            print right.
       (iii) Inner loop --> (endcol-1 to scol)
             if(srow==endrow)--> break;
             print bottom.
        (iv) Inner loop --> (endrow-1 to srow+10
             print left.
           
    
*/

public class Spiral_Matrix_nXm{

    //This method Print spiral matrix.
    public static void Print_Spiral(int matrix[][]){
        int srow = 0;
        int endrow = matrix.length-1;
        int scol = 0;
        int endcol = matrix[0].length-1;
        
        while(srow <= endrow && scol <= endcol){
            //Pirnt Top.
            for(int j=scol; j<=endcol; j++){
                System.out.print(matrix[srow][j]+" ");
            }
            
            //Print right.
            for(int i=srow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            
            //print bottom.
            for(int j=endcol-1; j>=scol; j--){
                if(srow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            
            //print left.
            for(int i=endrow-1; i>=srow+1; i--){
                System.out.print(matrix[i][scol]+" ");
            }
            
            srow++;
            scol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9, 10},
                          {11, 12, 13, 14, 15},
                          {16, 17, 18, 19, 20},
                          {21, 22, 23, 24, 25}};
        
        //Invoked Print spiral matrix.
        System.out.println("Spiral matrix element :::");
        Print_Spiral(matrix);
        
    }
}