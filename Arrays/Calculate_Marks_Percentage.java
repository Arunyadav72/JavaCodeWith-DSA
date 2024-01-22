import java.util.*;
public class Calculate_Marks_Percentage{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int marks[] = new int[3];  //Declare Array
        
        //Input Array
        System.out.print("enter the phy marks : ");
        marks[0] = sc.nextInt();
        System.out.print("enter the chem marks : ");
        marks[1] = sc.nextInt();
        System.out.print("enter the math marks : ");
        marks[2] = sc.nextInt();
        
        //output marks
        System.out.println("\nPhy marks : "+marks[0]);
        System.out.println("Chem marks : "+marks[1]);
        System.out.println("Math marks : "+marks[2]);
        
        //Calculate Percentage.
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("\nPercentage is : "+percentage+"%");
    }
}