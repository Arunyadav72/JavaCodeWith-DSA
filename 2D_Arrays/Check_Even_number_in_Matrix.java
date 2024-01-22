public class Check_Even_number_in_Matrix{
    
    //This method check even number.
    public static boolean check_Iseven(int n){
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //This method send matrix element one by one for check Iseven mathod.
    public static void Send_Matrix_element(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(check_Iseven(matrix[i][j]) == true){ //send matrix element for check Iseven mathod.
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int matrix[][] = {{2, 1, 3},
                          {8, 5, 3},
                          {1, 0, 3}};
        
        //Invoked Method.
        System.out.print("Even number : ");
        Send_Matrix_element(matrix);
    }
}