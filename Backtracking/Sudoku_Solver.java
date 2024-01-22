public class Sudoku_Solver{

    //This Function work on checking digit ith and jth Place is Safe.
    public static boolean Issafe(int sudoku[][], int row, int col, int digit){
        //*Checking column.
        for(int i=0; i<=8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
        

        //*Checking row
        for(int j=0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }
        
        //*Checking 3X3 Grid.
        //it is calculate start row and column.
        int srow = (row/3)*3;
        int scol = (col/3)*3;
        //It is calculate end row and column.
        int erow = (row/3)+3;
        int ecol = (col/3)+3;

        for(int i=srow; i<erow; i++){
            for(int j=scol; j<ecol; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    //This Function work on sudoku solver statement.
    public static boolean sudoku_solver(int sudoku[][], int row, int col){
        //base 
        if(row==9){// I means, I will traverse all sudoku.
            return true;
        }

        //kaam
        //*This statement follow --> Here row =0, but one by one column Increase
        int nextrow = row, nextcol = col+1;
        if(col+1 == 9){//If column reached max length then the digit place for next row.
            nextrow = row+1;
            nextcol = 0;
        }

        //*This statement follow --> If sudoku ith and jth value non Zero.
        if(sudoku[row][col] != 0){
            return sudoku_solver(sudoku, nextrow, nextcol);
            
        }

        //*This statement follow --> ith and jth place value(1, 2,---,9).
        for(int digit=1; digit<=9; digit++){
            if(Issafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudoku_solver(sudoku, nextrow, nextcol)){
                    return true;  //It is represent solution exist.
                }
                sudoku[row][col] = 0; //backtrack step.
            }

        }
        return false; //It is represent solution not exist.
    }

    //This Function work on Print sudoku element.
    public static void Print_sudoku(int sudoku[][]){
        System.out.println("Solver Sudoku...");
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                          {4, 9, 0, 1, 5, 7, 0, 0, 2},
                          {0, 0, 3, 0, 0, 4, 1, 9, 0},
                          {1, 8, 5, 0, 6, 0, 0, 2, 0},
                          {0, 0, 0, 0, 2, 0, 0, 6, 0},
                          {9, 6, 0, 4, 0, 5, 3, 0, 0},
                          {0, 3, 0, 0, 7, 2, 0, 0, 4},
                          {0, 4, 9, 0, 3, 0, 0, 5, 7},
                          {8, 2, 7, 0, 0, 9, 0, 1, 3}}; //sudoku is represent always 9X9 matrix.

        
        if(sudoku_solver(sudoku, 0, 0)){
            System.out.println("Solution exist.");
            Print_sudoku(sudoku);
        }                  
        else{
            System.out.println("Solution does not exist.");
        }
    }
}