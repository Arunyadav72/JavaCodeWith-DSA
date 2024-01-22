/*
Question2.......
    In a program, input the side of square. you have to outputthe area of the square.
    (Hint: area of square is(side * side).
*/
import java.util.*;
public class Question2{

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float side, area;
        
        //input side of square.
        System.out.print("Enter the side of square = ");
        side = sc.nextFloat();
        
        // calculate area of square
        area = side*side;
        
        //Output area of square
        System.out.println("Area of Square = "+ area);
    }
}
