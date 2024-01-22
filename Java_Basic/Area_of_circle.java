import java.util.*;
public class Area_of_circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad, area;
        
        System.out.print("Enter the radius number of circle  = ");
        rad =sc.nextFloat();
        
        //Calculate area of circle
        area = 3.14f*rad*rad;
        
        System.out.println("Area of circle = "+area);
    }
}