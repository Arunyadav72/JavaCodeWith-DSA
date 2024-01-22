/*
Spiral matrix ....
   ------------->
   | ---------> |
   | | ---->  | |
   | <--------| |
   <------------|

1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16  (nXn = 4X4) --> even

print spiral matrix element .....
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

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
         print bottom.
    (iv) Inner loop --> (endrow-1 to srow+10
         print left.
       
*/
public class Spiral_Matrix_nXn{
    
    //This Method Print Spiral Matrix element.
    public static void Print_Spiral(int matrix[][]){
        int srow = 0;
        int endrow = matrix.length-1;
        int scol = 0;
        int endcol = matrix[0].length-1;
        
        while(srow <= endrow && scol<=endcol){
            //Print top boundry. print column value.
            for(int j=scol; j<=endcol; j++){
                System.out.print(matrix[srow][j]+" ");
            }
            
            //Print right boundry. print row value.
            for(int i=srow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            
            //Print bottom boundry. Print column value.
            for(int j=endcol-1; j>=scol; j--){
                System.out.print(matrix[endrow][j]+" ");
            }
            
            //Print left boundry. Print row value.
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
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        
        //Invoked Print Spiral Matrix.
        System.out.println("Your spiral matrix element :: ");
        Print_Spiral(matrix);
    }
}