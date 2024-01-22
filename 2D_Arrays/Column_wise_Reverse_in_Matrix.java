public class Column_wise_Reverse_in_Matrix{
    
    //This method reverse column wise matrix element.
    public static void Reverse_matrix(int arr[][]){
        for(int col = 0; col<arr[0].length; col++){ //column
            int srow = 0;
            int endrow = arr.length-1;
            
            while(srow < endrow){ //Reverse line statement.
                //swaping.
                int tem = arr[srow][col];
                arr[srow][col] = arr[endrow][col];
                arr[endrow][col] = tem;
                
                srow++;
                endrow--;
            }
        }
    }
    
    //This method print matrix element.
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
        
        //Invoked print matrix method.
        System.out.println("Non reverse matrix :::");
        Print_matrix(matrix);
        
        //Invoked reverse matrix method.
        Reverse_matrix(matrix);
        
        //Invoked print matrix method
        System.out.println("Reverse matrix ::: ");
        Print_matrix(matrix);
        
    }
}