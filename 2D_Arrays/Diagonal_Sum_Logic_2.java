/*
Diagonal Sum

1 2 3                           1  2  3  4
4 5 6                           5  6  7  8
7 8 9  (3X3) = odd              9  10 11 12
                                13 14 15 16 (4X4) = even   **Here--> primary diagonal = 1+6+11+16, secondry diagonal = 4+7+10+13
**what is diagonal----> 
\1
 \5
  \9 --> primary diagonal = 1+5+9 = 15

  /3
 /5
/7 --> secondry diagonal = 3+7 = 10  

diagonal sum = primary diagonal + secondry diagonal
diagonal sum =        15        +     10
diagonal sum =  25

***Note--> 
      1. if primary diagonal and secondry diagonal value is equal(5). Then the the called Overlaping condition.
      2. 5 value is comman of primary and secondry then the not and seondry sum.

Logic----> 1 It is taken O(n) time complexity.
1. Loop --> (i=0 to n-1)
    (i). P_sum+=arr[i][i]
    (ii). if(i != arr.length-1-i) 
             S_sum+=[i][arr.length-1-i]

2. diagonal sum  = primary diagonal + secondry diagonal
*/
public class Diagonal_Sum_Logic_2{
    
    //This method calculate diagonal sum.
    public static int Diagonal_Sum(int arr[][]){
        int P_sum = 0;
        int S_sum = 0;
        int diagonal_Sum = 0;
        
        for(int i=0; i<arr.length; i++){
            //Primary diagonal sum.
            P_sum+=arr[i][i];
            
            //Secondry diagonal sum.
            if(i != arr.length-1-i){
                S_sum+=arr[i][arr.length-1-i];
            }
        }
        //Print primary and secondry diagonal
        System.out.println("Primary diagonal : "+P_sum);
        System.out.println("Secondry diagonal : "+S_sum);
        
        //here diagonal sum.
        diagonal_Sum = P_sum+S_sum;
        return diagonal_Sum;
    }
    
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};  // 3X3 --> odd.
        
        int matrix1[][] = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12},
                           {13, 14, 15, 16}}; // 4X4 --> even.
        
        //Invoked Diagonal_Sum Method.
        System.out.println("diagonal sum of (3X3) : "+Diagonal_Sum(matrix));
        System.out.println();
        System.out.println("diagonal sum of (4X4) : "+Diagonal_Sum(matrix1));
    }
}