/*
Print Pattern...
**********
*        *
*        *
*        *
**********
*/
import java.util.*;
public class Hollow_rectangle_Pattern{
    //Hollow Rectangle
    public static void Hollow_Pattern(int row, int col){
        //outer loop -- row
        for(int i=1; i<=row; i++){
            //inner loop -- column
            for(int j=1; j<=col; j++){
                //cell(i, j)
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int row, col;
        
        System.out.print("enter the row number : ");
        row = sc.nextInt();
        System.out.print("enter the col number : ");
        col = sc.nextInt();
        
        //Invoked Hollow Pattern.
        Hollow_Pattern(row, col);
    }
}