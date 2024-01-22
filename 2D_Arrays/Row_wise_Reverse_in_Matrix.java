public class Row_wise_Reverse_in_Matrix{
    
    //This Method Reverse row wise matrix element.
    public static void Reverse_matrix(int arr[][]){
        
        for(int i=0; i<arr.length; i++){ //row
            int scol = 0;
            int endcol = arr[0].length-1;
            
            while(scol < endcol){ //Reverse line statement.
                //swaping.
                int tem = arr[i][scol];
                arr[i][scol] = arr[i][endcol];
                arr[i][endcol] = tem;
                
                scol++;
                endcol--;
            }
        }
    }    
    
    //This Method print matrix element.
    public static void Print_matrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int matrix[][] = {{2, 1, 3},
                          {8, 5, 3},
                          {1, 0, 3}};
        
        //Invoked print matrix.
        System.out.println("Non reverse matrix ::: ");
        Print_matrix(matrix);
        
        //Invoked Reverse matrix.
        Reverse_matrix(matrix);
        
        //Invoked print_matrix.
        System.out.println("Reverse matrix ::: ");
        Print_matrix(matrix);
    }
}