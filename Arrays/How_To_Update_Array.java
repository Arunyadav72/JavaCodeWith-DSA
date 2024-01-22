import java.util.*;
public class How_To_Update_Array{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3]; //Here declare Array
        
        //Input Array
        System.out.print("enter the phy marks : ");  //Physics marks
        marks[0] = sc.nextInt();
        System.out.print("enter the chem marks : "); //Chemestry marks
        marks[1] = sc.nextInt();
        System.out.print("enter the math marks : "); //Math marks
        marks[2] = sc.nextInt();
        
        //output Array.
        System.out.println("\nphy marks : "+marks[0]);
        System.out.println("chem marks : "+marks[1]);
        System.out.println("math marks : "+marks[2]);
        
        //Here Update Array.
        marks[2] = 100;
        System.out.println("Math marks : "+marks[2]);
        
        
        //Here Update Array.
        marks[2] = 50;
        System.out.println("Math marks : "+marks[2]);
    }
}
