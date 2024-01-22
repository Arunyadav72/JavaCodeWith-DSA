import java.util.*;
public class How_To_Output_Array{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int marks[] = new int[100];  //Here declare Array
        
        //Input Array
        System.out.print("enter the phy marks : ");
        marks[0] = sc.nextInt();
        System.out.print("enter the chem marks : ");
        marks[1] = sc.nextInt();
        System.out.print("enter th math marks : ");
        marks[2] = sc.nextInt();
        
        //Here output Array
        System.out.println("phy marks : "+marks[0]);
        System.out.println("chem marks : "+marks[1]);
        System.out.println("math marks : "+marks[2]);
    }
}