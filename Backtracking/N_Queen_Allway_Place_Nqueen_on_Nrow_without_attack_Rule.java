public class N_Queen_Allway_Place_Nqueen_on_Nrow_without_attack_Rule{
    
    //This Funtion work on seating Nqueen on Nrow.
    public static void N_Queen(char board[][], int row){
        //BASE CASE..
        if(row == board.length){
            Print_board(board); //Print chess board.
            return;
        }

        //KAAM..
        //column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q'; //--> seating queen.
            N_Queen(board, row+1); //--> Recursive call.
            board[row][j] = 'X'; //backtraking step.
        }
    }

    //This Finction work on Print chess board.
    public static void Print_board(char board[][]){
        System.out.println("-------- chess board --------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 2;
        char board[][] = new char[n][n]; // 2x2.

        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }

        //Invoked Nqueen Method...
        N_Queen(board, 0);
    }
}