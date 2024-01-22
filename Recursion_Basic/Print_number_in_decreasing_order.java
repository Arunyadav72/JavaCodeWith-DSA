public class Print_number_in_decreasing_order{
    /*
    Logic.
    1. if(n==1)
         print n
         return
    2. print n
       fun(n-1) //--> call recursive Method.
    
    n = 10
    output is ...
    10 9 8 7 6 5 4 3 2 1
    */
    
    //This Function work on Print number inndecreasing order. 
    public static void Print_number(int n){
        if(n==1){ // Base case.
            System.out.println(n);
            return;
        }
        
        System.out.print(n+" ");
        Print_number(n-1); //Recursive call
    }
    
    public static void main(String args[]){
        int n = 10;
        System.out.print("number is : ");
        Print_number(n); //Invoked Method.
    }
}