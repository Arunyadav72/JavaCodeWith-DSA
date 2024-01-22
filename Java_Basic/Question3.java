import java.util.*;
public class Question3{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float pen, pencil, eraser, total_cast;
        
        System.out.print("enter the pen cast = ");
        pen = sc.nextFloat();
        System.out.print("enter the pencil cast = ");
        pencil = sc.nextFloat();
        System.out.print("enter the eraser cast = ");
        eraser = sc.nextFloat();
        
        //Calculate total cast without gst.
        total_cast = pen+pencil+eraser;
        System.out.println("Total cast bill = "+total_cast);
        
        //Calculate total cast with 18% gst.
        float new_Total_cast = total_cast+(total_cast*0.18f);
        System.out.println("Total cast bill with 18% gst = "+new_Total_cast);
    }       
}
