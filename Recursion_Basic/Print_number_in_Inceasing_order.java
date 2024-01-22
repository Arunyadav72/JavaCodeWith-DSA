public class Print_number_in_Inceasing_order{
    /*
    Logic :
    1. if(n==1) 
       print n
       return
    2. fun(n-1) //Recursive call
       print n
    
    n = 10
    output..
    1 2 3 4 5 6 7 8 9 10
    
    */
    //This Finction work on Print number is Increasing order.
    public static void Print_number(int n){
        if(n==1){ //Base case.
            System.out.print(n+" ");
            return;
        }
        Print_number(n-1); //Recursive call
        System.out.print(n+" ");
    }
    
    public static void main(String args[]){
        int n = 10;
        
        System.out.print("Number is ");
        Print_number(n);  //Invoked Method.
        System.out.println();
    }
}