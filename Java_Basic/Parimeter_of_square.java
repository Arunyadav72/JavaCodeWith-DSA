import java.util.*;
public class Parimeter_of_square{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float side, parimeter;
        
        System.out.print("Enter the side number of square : ");
        side = sc.nextFloat();
        
        //Caculate parimeter of square.
        parimeter = 4*side;
        
        System.out.println("Parimeter of square = "+parimeter);
    }
}
