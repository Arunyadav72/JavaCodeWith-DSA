import java.util.*;
public class Area_of_rectangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float length, width, area;
        
        System.out.print("Enter the length number of rectangle = ");
        length = sc.nextFloat();
        System.out.print("Enter the width number of rectangle = ");
        width = sc.nextFloat();
        
        //Calculate area of rectangle.
        area = length*width;
        
        System.out.println("Area of rectangle = "+area);
    }
}