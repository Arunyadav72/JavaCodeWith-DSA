public class Check_Prime_number_in_Matrix{
    
    //This method check prime number.
    public static boolean check_Isprime(int n){
        if(n==2){
            return true; //Its prime number.
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false; //Its not prime.
            }
        }
        
        return true; //It is prime.
    }
   
    //This method send matrix element one by one for check Isprime Method.
    public static void Send_matrix_element(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(check_Isprime(matrix[i][j]) == true){ //Send one element for check Isprime method.
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
   
    public static void main(String args[]){
        int matrix[][] = {{10, 11, 15},
                          {19, 18, 20},
                          {23, 25, 27}};
        
        //Invoked Method.
        System.out.print("Prime number is : ");
        Send_matrix_element(matrix);
    }
}