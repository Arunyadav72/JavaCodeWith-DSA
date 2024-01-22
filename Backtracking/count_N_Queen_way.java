public class count_N_Queen_way{

    //This Function work checking queen move.
    public static boolean Issafe(char board[][], int row, int col){
        //vertical checking..
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false; // ith and jth placing is not safe.
            }
        }

        //chekcing left up diagonal
        for(int i=row-1, j=col-1; i>=0&&j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false; //ith and jth placing is not safe.
            }
        }

        //checking right up diagonal..
        for(int i=row-1, j=col+1; i>=0 && j<=board.length-1; i--, j++){
            if(board[i][j] == 'Q'){
                return false; //ith and jth placing is not safe.
            }
        }

        return true; //ith and jth placing is safe.
    }

    //This Function work on count number of way place Nqueen on Nrow..
    public static void Nqueen(char board[][], int row){
        //base case.
        if(row == board.length){
            count++; //It is count Nqueen possiable  solution..
            return;
        }
        //kaam.
        //column;
        for(int j=0; j<board.length; j++){
            if(Issafe(board, row, j)){//checking queen move is safe.
                board[row][j] = 'Q';//seating queen.
                Nqueen(board, row+1);//Recursive call.
                board[row][j] ='X';//backtracking step.
            }
        }
    }

    static int count = 0;
    public static void main(String args[]){
        int n = 4;
        char board[][] = new char[n][n];

        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }


        //Invoked Method..
        Nqueen(board, 0);
        System.out.println("Total way to solve NQueen : "+count);
    }
}