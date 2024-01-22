public class N_Queen_Allway_Place_Nqueen_on_Nrow_Apply_attack_Rule{

    //This Function work on checking Queens rule.
    public static boolean Issafe(char board[][], int row, int col){
        //Checking vertically..
        for(int i=row-1; i>=0; i--){//Here, row, one by one decreasing, and column temporary.
            if(board[i][col] == 'Q'){
                return false; // if ith and jth palce par Q exist then place not safe..
            }
        }

        //checking Right up diagonal
        for(int i=row-1, j=col+1; i>=0 && j<=board.length-1; i--, j++){ //Here, row and column one by one decreasing.
            if(board[i][j] == 'Q'){
                return false;// if ith and jth palce par Q exist then place not safe..
            }
        }

        //checking Left up diagonal..
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){//Here, row Decreasing, but column Increasing.
            if(board[i][j] == 'Q'){
                return false;// if ith and jth palce par Q exist then place not safe..
            }
        }

        return true; // if ith and jth palce par Q not exist then place safe..
    }

    //This Function work on seating Nqueen on Nrow..
    public static void Nqueen(char board[][], int row){
        //base case.
        if(row == board.length){
            Print_chess_board(board); //Invoked Print chess board.
            return;
        }
        //kaam.
        //column
        for(int j=0; j<board.length; j++){
            if(Issafe(board, row, j)){ //checking safe is place.
                board[row][j] = 'Q';//seating queens.
                Nqueen(board, row+1); //Recursive call.
                board[row][j] = 'X'; //backtracking step..
            }
        }
    }

    //This Function work on Print chess board.
    public static void Print_chess_board(char board[][]){
        System.out.println("----------- chess board -----------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                board[i][j] = 'X';
            }
        }

        //Invoked Nqueen Method....
        Nqueen(board, 0);
    }
}