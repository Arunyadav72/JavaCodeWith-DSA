import java.util.*;
public class Area_of_square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float side, area;
        
        System.out.print("Enter the side number of square = ");
        side =sc.nextFloat();
        
        //Caculate area of square
        area = side*side;
        
        System.out.println("Area of square = "+area);
    }
}