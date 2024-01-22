public class Optimized_grid_ways_Trick{ 
    /*
    !This optimized code based on Permutation rule.
    */
    //!It is taken O(n) time complexity.
    //*It is Linear time complexity.

    //This Function work on calculate Factorial  number.
    public static int Factorial(int n){
        int Fact = 1;
        for(int i=1; i<=n; i++){
            Fact*=i;
        }
        return Fact;
    }

    //This Function work on calculate total number of ways to reach (0, 0) to (n-1, m-1);
    public static int Grid_Ways(int n, int m){
        int fnm = Factorial(n-1+m-1);
        int fn = Factorial(n-1);
        int fm = Factorial(m-1);

        //*It is calculate permutation rule but It is Total number of ways.
        int Total_Ways = (fnm / (fn*fm));
        return Total_Ways;
    }

    public static void main(String args[]){
        int n=2, m=3; //it is represent nXm matrix.

        //Invoked Method..
        System.out.println("Total number of ways : "+Grid_Ways(n, m)); //It is represent 2X3 matrix.
        System.out.println("Total number of ways : "+Grid_Ways(3, 3)); //It is represent 3X3 matrix.
        System.out.println("Total number of ways : "+Grid_Ways(5, 5)); //It is represent 5X5 matrix.

    }
}