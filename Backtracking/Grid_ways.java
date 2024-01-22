public class Grid_ways{
    /*
    *Question.
        Find number of ways to reach from (0, 0) to (n-1, m-1) in a NxM Grid. 
        Allowed moves- right or down.
    */
    
    //! It  is taken O(2^n+m) time complexity.
    //This Function work on calculate Total number of ways in Grid.
    public static int Grid_Ways(int row, int col, int n, int m){
        //base case.
        if(row==n-1 && col==m-1){//I am stand target.
            return 1;
        }
        else if(row==n || col == m){ //I am stand any way.
            return 0;
        }
            
        //kaam.
        int right_way = Grid_Ways(row, col+1, n, m);// it is right way move.
        int down_way = Grid_Ways(row+1, col, n, m);// it is down way move

        int Total_Ways = right_way+down_way; //Total number of way to reach (0, 0)-(n-1, m-1).

        return Total_Ways;
    }


    public static void main(String args[]){
        int n = 2, m = 3; //It is represent nXm matrix.
        
        //Invoked Method..
        System.out.println("Total number of ways : "+Grid_Ways(0, 0, n, m));
        System.out.println("Total number of ways : "+Grid_Ways(0, 0, 3, 3));// It is represent 2X3 matrix.
        System.out.println("Total number of ways : "+Grid_Ways(0, 0, 5, 5));// It is represent 5X5 matrix.
    }
}